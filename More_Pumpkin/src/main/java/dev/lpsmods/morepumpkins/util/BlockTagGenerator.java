package dev.lpsmods.morepumpkins.util;

import dev.lpsmods.morepumpkins.MorePumpkins;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    private static final TagKey<Block> CARVED_PUMPKINS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MorePumpkins.MOD_ID, "carved_pumpkins"));
    private static final TagKey<Block> JACK_O_LANTERNS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MorePumpkins.MOD_ID, "jack_o_lanterns"));
    private static final TagKey<Block> SOUL_JACK_O_LANTERNS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MorePumpkins.MOD_ID, "soul_jack_o_lanterns"));
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        FabricTagBuilder carvedPumpkins = getOrCreateTagBuilder(CARVED_PUMPKINS);
        FabricTagBuilder jackOLanterns = getOrCreateTagBuilder(JACK_O_LANTERNS);
        FabricTagBuilder soulJackOLanterns = getOrCreateTagBuilder(SOUL_JACK_O_LANTERNS);

        for (int i = 0; i < MorePumpkins.pumpkins.size(); i++) {
            String prefix = (String)MorePumpkins.pumpkins.get(i);
            carvedPumpkins.add(Identifier.of(MorePumpkins.MOD_ID, prefix+"_carved_pumpkin"));
            jackOLanterns.add(Identifier.of(MorePumpkins.MOD_ID, prefix+"_jack_o_lantern"));
            soulJackOLanterns.add(Identifier.of(MorePumpkins.MOD_ID, prefix+"_soul_jack_o_lantern"));
        }
    }
}
