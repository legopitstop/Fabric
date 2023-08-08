package com.legopitstop.minecoin;

import com.legopitstop.minecoin.registry.ModBlockEntityType;
import com.legopitstop.minecoin.registry.ModBlocks;
import com.legopitstop.minecoin.registry.ModItemGroups;
import com.legopitstop.minecoin.registry.ModItems;
import com.legopitstop.minecoin.server.command.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class Minecoin implements ModInitializer {
	public static final String MOD_ID = "minecoin";


	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItems.register();
		ModItemGroups.register();

		ModBlockEntityType.register();

		CommandRegistrationCallback.EVENT.register(((dispatcher, dedicated, x) -> PinCommand.register(dispatcher, dedicated)));
		CommandRegistrationCallback.EVENT.register(((dispatcher, dedicated, x) -> CoinCommand.register(dispatcher, dedicated)));
		CommandRegistrationCallback.EVENT.register(((dispatcher, dedicated, x) -> BalanceCommand.register(dispatcher, dedicated)));
		CommandRegistrationCallback.EVENT.register(((dispatcher, dedicated, x) -> WithdrawCommand.register(dispatcher, dedicated)));
		CommandRegistrationCallback.EVENT.register(((dispatcher, dedicated, x) -> DepositCommand.register(dispatcher, dedicated)));

	}
}