package com.legopitstop.spawnercraft.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class SpawnerCraftRecipeGenerator extends FabricRecipeProvider {
    public SpawnerCraftRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        // Example
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BEDROCK)
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('C', Items.COBBLESTONE)
                .criterion(FabricRecipeProvider.hasItem(Items.STONE),
                        FabricRecipeProvider.conditionsFromItem(Items.STONE))
                .criterion(FabricRecipeProvider.hasItem(Items.COBBLESTONE),
                        FabricRecipeProvider.conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.BEDROCK)));

    }
}
