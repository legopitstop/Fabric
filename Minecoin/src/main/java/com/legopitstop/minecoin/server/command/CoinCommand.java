package com.legopitstop.minecoin.server.command;

import com.legopitstop.minecoin.registry.ModItems;
import com.legopitstop.minecoin.util.EntityDataSaver;
import com.legopitstop.minecoin.util.MinecoinData;
import com.legopitstop.minecoin.util.MinecoinUtils;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.entity.EntityData;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import static net.minecraft.server.command.CommandManager.literal;
import static net.minecraft.server.command.CommandManager.argument;

public class CoinCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess) {
        Random rand = new Random();
        dispatcher.register(literal("coin")
                        .requires(source -> source.hasPermissionLevel(2))

                .then(literal("get")
                        .then(argument("targets", EntityArgumentType.player())
                                .executes(context -> CoinCommand.executeGet(context.getSource(), EntityArgumentType.getPlayer(context, "targets")))
                        )
                )

                .then(literal("set")
                        .then(argument("targets", EntityArgumentType.players())
                                .then(argument("amount", IntegerArgumentType.integer())
                                        .executes(context -> CoinCommand.executeSet(context.getSource(), EntityArgumentType.getPlayers(context, "targets"), IntegerArgumentType.getInteger(context, "amount")))
                                )
                        )
                )

                .then(literal("add")
                        .then(argument("targets", EntityArgumentType.players())
                                .then(argument("amount", IntegerArgumentType.integer())
                                        .executes(context -> CoinCommand.executeAdd(context.getSource(), EntityArgumentType.getPlayers(context, "targets"), IntegerArgumentType.getInteger(context, "amount")))
                                )
                                .executes(context -> CoinCommand.executeAdd(context.getSource(), EntityArgumentType.getPlayers(context, "targets"), 1))
                        )
                )

                .then(literal("remove")
                        .then(argument("targets", EntityArgumentType.players())
                                .then(argument("amount", IntegerArgumentType.integer())
                                        .executes(context -> CoinCommand.executeRemove(context.getSource(), EntityArgumentType.getPlayers(context, "targets"), IntegerArgumentType.getInteger(context, "amount")))
                                )
                                .executes(context -> CoinCommand.executeRemove(context.getSource(), EntityArgumentType.getPlayers(context, "targets"), 1))
                        )
                )

                .then(literal("withdraw")
                        .then(argument("target", EntityArgumentType.player())
                                .then(argument("amount", IntegerArgumentType.integer())
                                        .executes(context -> CoinCommand.executeWithdraw(context.getSource(), EntityArgumentType.getPlayer(context, "target"), IntegerArgumentType.getInteger(context, "amount")))
                                )
                                .executes(context -> CoinCommand.executeWithdraw(context.getSource(), EntityArgumentType.getPlayer(context, "target"), 1))
                        )
                )

                .then(literal("deposit")
                        .then(argument("target", EntityArgumentType.player())
                                .then(argument("amount", IntegerArgumentType.integer())
                                        .executes(context -> CoinCommand.executeDeposit(context.getSource(), EntityArgumentType.getPlayer(context, "target"), IntegerArgumentType.getInteger(context, "amount")))
                                )
                                .then(literal("*")
                                        .executes(context -> CoinCommand.executeDepositAll(context.getSource(), EntityArgumentType.getPlayer(context, "target")))

                                )
                                .executes(context -> CoinCommand.executeDeposit(context.getSource(), EntityArgumentType.getPlayer(context, "target"), 1))
                        )
                )

                .then(literal("pin")
                        .then(literal("get")
                                .then(argument("target",  EntityArgumentType.player())
                                        .executes(context -> CoinCommand.executePinGet(context.getSource(), EntityArgumentType.getPlayer(context, "target")))
                                )

                        )

                        .then(literal("set")
                                .then(argument("targets", EntityArgumentType.players())
                                        .then(argument("pin", StringArgumentType.string())
                                                .executes(context -> CoinCommand.executePinSet(context.getSource(), EntityArgumentType.getPlayers(context, "targets"), StringArgumentType.getString(context, "pin")))
                                        )
                                        .executes(context -> CoinCommand.executePinSet(context.getSource(), EntityArgumentType.getPlayers(context, "targets"), String.format("%04d", rand.nextInt(10000))) )
                                )
                        )
                )
        );
    }

    // TODO
    private static int executePinGet(ServerCommandSource source, ServerPlayerEntity target) {
        source.sendFeedback(() -> Text.translatable("commands.coin.pin.get.success", target.getDisplayName(), 9999), false);
        return 9999;
    }

    // TODO
    private static int executePinSet(ServerCommandSource source, Collection<ServerPlayerEntity> targets, String pin) {
        // PIN must be a 4 length number
        for (ServerPlayerEntity player : targets) {
            System.out.println(player);
            System.out.println(pin);
        }

        if (targets.size() == 1) {
            source.sendFeedback(() -> Text.translatable("commands.coin.pin.set.success.single", ((ServerPlayerEntity)targets.iterator().next()).getDisplayName(), 100), true);
        } else {
            source.sendFeedback(() -> Text.translatable("commands.coin.pin.set.success.multiple", targets.size()), true);
        }
        return targets.size();
    }

    private static int executeWithdraw(ServerCommandSource source, ServerPlayerEntity target, int amount) {
        ServerPlayerEntity player = source.getPlayer();
        int total = MinecoinData.getMoney((EntityDataSaver)player);
        if (total > 0 && total >= amount) {
            ItemStack stack = new ItemStack(ModItems.MINECOIN, amount);
            player.giveItemStack(stack);
            MinecoinData.removeMoney((EntityDataSaver)player, amount);
        } else {
            source.sendFeedback(() -> Text.translatable("commands.coin.withdraw.failed", amount, total).formatted(Formatting.RED), false);
            return 0;
        }
        source.sendFeedback(() -> Text.translatable("commands.coin.withdraw.success", amount, MinecoinData.getMoney((EntityDataSaver)source.getPlayer())), false);
        return amount;
    }

    private static int executeDeposit(ServerCommandSource source, ServerPlayerEntity target, int amount) {
        int total = MinecoinUtils.getTotalMinecoins(target);
        if (amount <= total) {
            total = MinecoinData.getMoney((EntityDataSaver)target);
            if (total > 0 && total >= amount) {
                MinecoinData.addMoney((EntityDataSaver)target, amount);
                MinecoinUtils.removeItemStack(target, ModItems.MINECOIN, amount);
            }

        } else {
            int finalTotal = total;
            source.sendFeedback(() -> Text.translatable("commands.deposit.failed", amount, finalTotal).formatted(Formatting.RED), false);
            return 0;
        }


        source.sendFeedback(() -> Text.translatable("commands.coin.deposit.success", amount, target.getDisplayName(), amount), true);
        return amount;
    }

    private static int executeDepositAll(ServerCommandSource source, ServerPlayerEntity target) {
        int total = MinecoinUtils.getTotalMinecoins(target);
        return executeDeposit(source, target, total);

    }
    private static int executeGet(ServerCommandSource source, ServerPlayerEntity target) {
        int amount = MinecoinData.getMoney((EntityDataSaver)target);
        source.sendFeedback(() -> Text.translatable("commands.coin.get.success", target.getDisplayName(), amount), false);
        return amount;
    }

    private static int executeAdd(ServerCommandSource source, Collection<ServerPlayerEntity> targets, int amount) {
        int totalAmount = 0;
        for (ServerPlayerEntity player : targets) {
            totalAmount = MinecoinData.addMoney((EntityDataSaver)player, amount);
        }

        if (targets.size() == 1) {
            int finalTotalAmount = totalAmount;
            source.sendFeedback(() -> Text.translatable("commands.coin.add.success.single", amount, ((ServerPlayerEntity)targets.iterator().next()).getDisplayName(), finalTotalAmount), true);
        } else {
            source.sendFeedback(() -> Text.translatable("commands.coin.add.success.multiple", amount, targets.size()), true);
        }
        return targets.size();
    }

    private static int executeSet (ServerCommandSource source, Collection<ServerPlayerEntity> targets, int amount) {
        for (ServerPlayerEntity player : targets) {
            MinecoinData.setMoney((EntityDataSaver)player, amount);
        }

        if (targets.size() == 1) {
            source.sendFeedback(() -> Text.translatable("commands.coin.set.success.single", amount, ((ServerPlayerEntity)targets.iterator().next()).getDisplayName(), amount), true);
        } else {
            source.sendFeedback(() -> Text.translatable("commands.coin.set.success.multiple", amount, targets.size()), true);
        }
        return targets.size();
    }

    private static int executeRemove(ServerCommandSource source, Collection<ServerPlayerEntity> targets, int amount) {
        int totalAmount = 0;
        for (ServerPlayerEntity player : targets) {
            totalAmount = MinecoinData.removeMoney((EntityDataSaver)player, amount);
        }

        if (targets.size() == 1) {
            int finalTotalAmount = totalAmount;
            source.sendFeedback(() -> Text.translatable("commands.coin.remove.success.single", amount, ((ServerPlayerEntity)targets.iterator().next()).getDisplayName(), finalTotalAmount), true);
        } else {
            source.sendFeedback(() -> Text.translatable("commands.coin.remove.success.multiple", amount, targets.size()), true);
        }
        return targets.size();
    }
}
