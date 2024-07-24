package dev.lpsmods.morepumpkins.util;

import dev.lpsmods.morepumpkins.MorePumpkins;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;


public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (int i = 0; i < MorePumpkins.pumpkins.size(); i++) {
            String prefix = (String)MorePumpkins.pumpkins.get(i);
            Block carvedPumpkin = Registries.BLOCK.get(Identifier.of(MorePumpkins.MOD_ID, prefix+"_carved_pumpkin"));
            Block jackOLantern = Registries.BLOCK.get(Identifier.of(MorePumpkins.MOD_ID, prefix+"_jack_o_lantern"));
            Block soulJackOLantern = Registries.BLOCK.get(Identifier.of(MorePumpkins.MOD_ID, prefix+"_soul_jack_o_lantern"));
            addDrop(carvedPumpkin);
            addDrop(jackOLantern);
            addDrop(soulJackOLantern);
        }
    }
}
