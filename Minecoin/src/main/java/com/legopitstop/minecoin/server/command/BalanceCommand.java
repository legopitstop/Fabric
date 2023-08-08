/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package com.legopitstop.minecoin.server.command;

import com.legopitstop.minecoin.util.EntityDataSaver;
import com.legopitstop.minecoin.util.MinecoinData;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.command.argument.ItemStackArgument;
import net.minecraft.command.argument.ItemStackArgumentType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;

public class BalanceCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess) {
        dispatcher.register(CommandManager.literal("balance")
                .executes(context -> BalanceCommand.execute(context.getSource())));
    }

    // TODO
    // - If source is not player return error.
    private static int execute(ServerCommandSource source) {
        int amount = MinecoinData.getMoney((EntityDataSaver)source.getPlayer());
        source.sendFeedback(() -> Text.translatable("commands.balance.success", amount), false);
        return amount;
    }
}

