/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package com.legopitstop.minecoin.server.command;

import com.legopitstop.minecoin.registry.ModItems;
import com.legopitstop.minecoin.util.EntityDataSaver;
import com.legopitstop.minecoin.util.MinecoinData;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import static com.mojang.brigadier.builder.RequiredArgumentBuilder.argument;

public class WithdrawCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess) {
        dispatcher.register(CommandManager.literal("withdraw")
                .then(CommandManager.argument("amount", IntegerArgumentType.integer(0))
                        .executes(context -> WithdrawCommand.execute(context.getSource(), IntegerArgumentType.getInteger(context, "amount")))
                )
                .executes(context -> WithdrawCommand.execute(context.getSource(), 1))
        );
    }


    // TODO
    // - If source is not player return error.
    private static int execute(ServerCommandSource source, int amount) {
        ServerPlayerEntity player = source.getPlayer();
        int total = MinecoinData.getMoney((EntityDataSaver)player);
        if (total > 0 && total >= amount) {
            ItemStack stack = new ItemStack(ModItems.MINECOIN, amount);
            player.giveItemStack(stack);
            MinecoinData.removeMoney((EntityDataSaver)player, amount);
        } else {
            source.sendFeedback(() -> Text.translatable("commands.withdraw.failed", amount, total).formatted(Formatting.RED), false);
            return 0;
        }

        source.sendFeedback(() -> Text.translatable("commands.withdraw.success", amount, MinecoinData.getMoney((EntityDataSaver)source.getPlayer())), false);
        return amount;
    }
}

