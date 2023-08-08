package com.legopitstop.minecoin.registry;

import com.legopitstop.minecoin.Minecoin;
import com.legopitstop.minecoin.block.entity.MinecoinRegisterBlockEntity;
import com.legopitstop.minecoin.block.entity.PiggyBankBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntityType {
    public static final BlockEntityType<PiggyBankBlockEntity> PIGGY_BANK_BLOCK_ENTITY = FabricBlockEntityTypeBuilder.create(PiggyBankBlockEntity::new, ModBlocks.PINK_PIGGY_BANK).build();
    public static final BlockEntityType<MinecoinRegisterBlockEntity> MINECOIN_REGISTER_BLOCK_ENTITY = FabricBlockEntityTypeBuilder.create(MinecoinRegisterBlockEntity::new, ModBlocks.MINECOIN_REGISTER).build();

    public static void register() {
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Minecoin.MOD_ID, "piggy_bank_block_entity"), PIGGY_BANK_BLOCK_ENTITY);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Minecoin.MOD_ID, "minecoin_register_block_entity"), MINECOIN_REGISTER_BLOCK_ENTITY);
    }

}
