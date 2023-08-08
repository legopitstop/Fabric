/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package com.legopitstop.minecoin.server.command;

import com.legopitstop.minecoin.registry.ModItems;
import com.legopitstop.minecoin.util.EntityDataSaver;
import com.legopitstop.minecoin.util.MinecoinData;
import com.legopitstop.minecoin.util.MinecoinUtils;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class DepositCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess) {
        dispatcher.register(CommandManager.literal("deposit")
                .then(CommandManager.argument("amount", IntegerArgumentType.integer(0))
                        .executes(context -> DepositCommand.execute(context.getSource(), IntegerArgumentType.getInteger(context, "amount")))
                )
                .then(CommandManager.literal("*")
                        .executes(context -> DepositCommand.executeAll(context.getSource()))
                )
                .executes(context -> DepositCommand.execute(context.getSource(), 1))
        );
    }


    // TODO
    // - If source is not player return error.
    private static int execute(ServerCommandSource source, int amount) {
        ServerPlayerEntity player = source.getPlayer();
        int total = MinecoinUtils.getTotalMinecoins(player);
        if (amount <= total) {
            total = MinecoinData.getMoney((EntityDataSaver)player);
            if (total >= amount) {
                MinecoinData.addMoney((EntityDataSaver)player, amount);
                MinecoinUtils.removeItemStack(player, ModItems.MINECOIN, amount);
            }

        } else {
            int finalTotal = total;
            source.sendFeedback(() -> Text.translatable("commands.deposit.failed", amount, finalTotal).formatted(Formatting.RED), false);
            return 0;
        }
        source.sendFeedback(() -> Text.translatable("commands.deposit.success", amount, MinecoinData.getMoney((EntityDataSaver)player)), false);
        return amount;
    }

    private static int executeAll(ServerCommandSource source) {
        ServerPlayerEntity player = source.getPlayer();
        int total = MinecoinUtils.getTotalMinecoins(player);
        return execute(source, total);
    }
}

