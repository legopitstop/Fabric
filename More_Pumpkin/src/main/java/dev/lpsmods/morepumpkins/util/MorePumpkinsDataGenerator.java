package dev.lpsmods.morepumpkins.util;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MorePumpkinsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(BlockTagGenerator::new);
        pack.addProvider(LootTableGenerator::new);
        pack.addProvider(RecipeGenerator::new);
    }
}

