package com.legopitstop.lightningglass.registry;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.legopitstop.lightningglass.LightningGlass;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.state.property.Property;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Predicate;

public class LegacyFulgurite {
    public Identifier id;
    public BlockPredicate source;
    public BlockState result;
    public String function;

    public LegacyFulgurite(Identifier id, BlockPredicate source, BlockState result, @Nullable String function) {
        this.id = id.withPath(id.getPath().replace("fulgurites/", ""));
        this.source = source;
        this.result = result;
        this.function = function;
    }

    public Identifier getId() {
        return this.id;
    }

    public BlockPredicate getSource() {
        return this.source;
    }

    public BlockState getResult() {
        return this.result;
    }

    public String getFunction() {
        return this.function;
    }

    public static BlockState asBlockState(JsonObject object, String element) {
        String string = JsonHelper.getString(object, element);
        Block block = Registries.BLOCK.getOrEmpty(new Identifier(string)).orElseThrow(() -> {
            return new JsonSyntaxException("Expected " + element + " to be an item, was unknown string '" + string + "'");
        });
        return block.getDefaultState();
    }

    public static LegacyFulgurite fromJson(Identifier id, JsonObject json) {
        if (json != null && !json.isJsonNull()) {
            // source
            BlockPredicate source = new StatePredicate(Blocks.AIR.getDefaultState(), null, null);
            if (json.has("source")) {

                if (JsonHelper.hasString(json, "source")) {// source: ""
                    source = new StatePredicate(LegacyFulgurite.asBlockState(json, "source"), null, null);
                } else if (JsonHelper.hasJsonObject(json, "source")) {
                    JsonObject sourceObj = JsonHelper.getObject(json, "source", new JsonObject());

                    if (sourceObj.has("block")) {// source: {block: "", properties: {}, nbt: ""}
                        try {
                            // TODO - Implement "properties"
                            // Map<Property<?>, Comparable<?>> properties = Maps.newHashMap();
                            Set<Property<?>> properties = null;
                            BlockState state = LegacyFulgurite.asBlockState(sourceObj, "block");
                            NbtCompound nbt = NbtHelper.fromNbtProviderString(JsonHelper.getString(sourceObj, "nbt", "{}"));
                            source = new StatePredicate(state, properties, nbt);
                        } catch (CommandSyntaxException e) {
                            LightningGlass.LOGGER.error("Failed to parse \"source.nbt\" in "+id);
                        }

                    } else if (sourceObj.has("tag")) {// source: {tag: "", properties: "", nbt: ""}
                        String tag = JsonHelper.getString(sourceObj, "tag");
                        TagKey<Block> blockTag = TagKey.of(RegistryKeys.BLOCK, new Identifier(tag));
                        try {
                            // TODO - Implement "properties"
                            // Map<String, String> properties = Maps.newHashMap();
                            Map<String, String> properties = null;
                            NbtCompound nbt = NbtHelper.fromNbtProviderString(JsonHelper.getString(sourceObj, "nbt", "{}"));
                            source = new TagPredicate(blockTag, properties, nbt);
                        } catch (CommandSyntaxException e) {
                            LightningGlass.LOGGER.error("Failed to parse \"source.nbt\" in "+id);
                        }
                    }
                }
            }


            // result
            BlockState result = Blocks.GLASS.getDefaultState();
            if (json.has("result")) {
                if (JsonHelper.hasString(json, "result")) {
                    result = LegacyFulgurite.asBlockState(json, "result");
                }
            }

            String function = null;
            if (JsonHelper.hasString(json, "function")) {
                function = JsonHelper.getString(json, "function");
                // TODO - Validate that function exists
            }

            return new LegacyFulgurite(id, source, result, function);
        }
        return null;
    }

    public interface BlockPredicate extends Predicate<CachedBlockPosition> {
        boolean hasNbt();
    }

    static class TagPredicate implements BlockPredicate {
        private final TagKey<Block> tag;
        @Nullable
        private final NbtCompound nbt;
        private final Map<String, String> properties;

        TagPredicate(TagKey<Block> tag, Map<String, String> properties, @Nullable NbtCompound nbt) {
            this.tag = tag;
            this.properties = properties;
            this.nbt = nbt;
        }

        public boolean test(CachedBlockPosition cachedBlockPosition) {
            BlockState blockState = cachedBlockPosition.getBlockState();
            if (!blockState.isIn(this.tag)) {
                return false;
            } else if (this.properties != null) {
                Iterator var3 = this.properties.entrySet().iterator();

                while(var3.hasNext()) {
                    Map.Entry<String, String> entry = (Map.Entry)var3.next();
                    Property<?> property = blockState.getBlock().getStateManager().getProperty((String)entry.getKey());
                    if (property == null) {
                        return false;
                    }

                    Comparable<?> comparable = (Comparable)property.parse((String)entry.getValue()).orElse(null);
                    if (comparable == null) {
                        return false;
                    }

                    if (blockState.get(property) != comparable) {
                        return false;
                    }
                }

                if (this.nbt == null) {
                    return true;
                } else {
                    BlockEntity blockEntity = cachedBlockPosition.getBlockEntity();
                    return blockEntity != null && NbtHelper.matches(this.nbt, blockEntity.createNbtWithIdentifyingData(), true);
                }
            }
            return true;
        }

        public boolean hasNbt() {
            return this.nbt != null;
        }
    }

    static class StatePredicate implements BlockPredicate {
        private final BlockState state;
        private final Set<Property<?>> properties;
        @Nullable
        private final NbtCompound nbt;

        public StatePredicate(BlockState state, Set<Property<?>> properties, @Nullable NbtCompound nbt) {
            this.state = state;
            this.properties = properties;
            this.nbt = nbt;
        }

        public boolean test(CachedBlockPosition cachedBlockPosition) {
            BlockState blockState = cachedBlockPosition.getBlockState();
            if (!blockState.isOf(this.state.getBlock())) {
                return false;
            } else if (this.properties != null) {
                Iterator var3 = this.properties.iterator();

                while(var3.hasNext()) {
                    Property<?> property = (Property)var3.next();
                    if (blockState.get(property) != this.state.get(property)) {
                        return false;
                    }
                }

                if (this.nbt == null) {
                    return true;
                } else {
                    BlockEntity blockEntity = cachedBlockPosition.getBlockEntity();
                    return blockEntity != null && NbtHelper.matches(this.nbt, blockEntity.createNbtWithIdentifyingData(), true);
                }
            }
            return true;
        }

        public boolean hasNbt() {
            return this.nbt != null;
        }
    }
}