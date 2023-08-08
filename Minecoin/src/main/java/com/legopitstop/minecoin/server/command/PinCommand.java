package com.legopitstop.minecoin.server.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

import java.awt.*;

import static net.minecraft.server.command.CommandManager.literal;

public class PinCommand {

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess) {
        dispatcher.register(literal("pin")
                .executes(context -> PinCommand.executes(context.getSource()))
        );
    }

    private static int executes(ServerCommandSource source) {
        source.sendFeedback(() -> Text.translatable("commands.pin.success", 9999), false);
        return 9999;
    }
}
