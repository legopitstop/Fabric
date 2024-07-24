package dev.lpsmods.morepumpkins.util;

import dev.lpsmods.morepumpkins.MorePumpkins;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Jack O'Lantern Recipes
        Item soulJackOLantern = Registries.ITEM.get(Identifier.of(MorePumpkins.MOD_ID, "soul_jack_o_lantern"));

        for (int i = 0; i < MorePumpkins.pumpkins.size(); i++) {
            String prefix = (String)MorePumpkins.pumpkins.get(i);
            Item carvedPumpkin = Registries.ITEM.get(Identifier.of(MorePumpkins.MOD_ID, prefix+"_carved_pumpkin"));
            Item jack = Registries.ITEM.get(Identifier.of(MorePumpkins.MOD_ID, prefix+"_jack_o_lantern"));
            Item soulJack = Registries.ITEM.get(Identifier.of(MorePumpkins.MOD_ID, prefix+"_soul_jack_o_lantern"));
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, jack).pattern("A").pattern("B")
                    .input('A', carvedPumpkin)
                    .input('B', Blocks.TORCH)
                    .criterion(FabricRecipeProvider.hasItem(carvedPumpkin),
                            FabricRecipeProvider.conditionsFromItem(carvedPumpkin))
                    .criterion(FabricRecipeProvider.hasItem(jack),
                            FabricRecipeProvider.conditionsFromItem(jack))
                    .offerTo(exporter);
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, soulJack).pattern("A").pattern("B")
                    .input('A', carvedPumpkin)
                    .input('B', Blocks.SOUL_TORCH)
                    .criterion(FabricRecipeProvider.hasItem(carvedPumpkin),
                            FabricRecipeProvider.conditionsFromItem(carvedPumpkin))
                    .criterion(FabricRecipeProvider.hasItem(soulJack),
                            FabricRecipeProvider.conditionsFromItem(soulJack))
                    .offerTo(exporter);

            // Stonecutter
            Item carved = Registries.ITEM.get(Identifier.of(MorePumpkins.MOD_ID, prefix+"_pumpkin"));
            // vanilla -> custom
            FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, carved, Items.CARVED_PUMPKIN);
            FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, jack, Items.JACK_O_LANTERN);
            FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, soulJack, soulJackOLantern);
            // custom -> vanilla
//            FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CARVED_PUMPKIN, carved);
//            FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JACK_O_LANTERN, jack);
            FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, soulJackOLantern, soulJack);

        }
        // Stonecutter - Convert variants
        for (int i = 0; i < MorePumpkins.pumpkins.size(); i++) {
            String prefix1 = (String)MorePumpkins.pumpkins.get(i);
            for (int j = 0; j < MorePumpkins.pumpkins.size(); j++) {
                String prefix2 = (String)MorePumpkins.pumpkins.get(j);
                if (!Objects.equals(prefix1, prefix2)) { // Ignore duplicate input=outputs
                    Item jackOutput = Registries.ITEM.get(Identifier.of(MorePumpkins.MOD_ID, prefix1+"_jack_o_lantern"));
                    Item jackInput = Registries.ITEM.get(Identifier.of(MorePumpkins.MOD_ID, prefix2+"_jack_o_lantern"));
                    FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, jackOutput, jackInput);

                    Item soulJackOutput = Registries.ITEM.get(Identifier.of(MorePumpkins.MOD_ID, prefix1+"_soul_jack_o_lantern"));
                    Item soulJackInput = Registries.ITEM.get(Identifier.of(MorePumpkins.MOD_ID, prefix2+"_soul_jack_o_lantern"));
                    FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, soulJackOutput, soulJackInput);
                }
            }
        }
    }
}
