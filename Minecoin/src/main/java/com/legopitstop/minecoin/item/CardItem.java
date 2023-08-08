package com.legopitstop.minecoin.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

// TODO
// - ToolTip disappears when a different user has it.
public class CardItem extends Item {
    public static final String OWNER_KEY = "Owner";

    public CardItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return this.hasOwner(stack);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        PlayerEntity owner = this.getOwner(world, stack);
        if (owner != null) {
            tooltip.add(Text.translatable(this.getTranslationKey()+".desc", owner.getDisplayName()).formatted(Formatting.GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        if (world.isClient) {return TypedActionResult.pass(stack);}
        if (stack.getItem() == this.asItem() && !this.hasOwner(stack)) {
            this.setOwnerUuid(stack, user.getUuid());
            return TypedActionResult.success(stack);
        }
        return super.use(world, user, hand);
    }

    public boolean hasOwner(ItemStack stack, PlayerEntity player) {
        return this.hasOwner(stack) && this.getOwnerUuid(stack) == player.getUuid();
    }

    public PlayerEntity getOwner(World world, ItemStack stack) {
        UUID uUID = this.getOwnerUuid(stack);
        if (uUID == null) {
            return null;
        }
        return world.getPlayerByUuid(uUID);
    }

    @Nullable
    public UUID getOwnerUuid(ItemStack stack) {
        NbtCompound nbt = stack.getOrCreateNbt();
        if (nbt.contains(OWNER_KEY, NbtElement.INT_ARRAY_TYPE)) {
            return NbtHelper.toUuid(nbt.get(OWNER_KEY));
        }
        return null;
    }

    public boolean hasOwner(ItemStack stack) {
        return stack.getOrCreateNbt().contains(OWNER_KEY);
    }

    public void setOwnerUuid(ItemStack stack, UUID ownerUuid) {
        NbtCompound nbt = stack.getOrCreateNbt();
        nbt.putUuid(OWNER_KEY, ownerUuid);
    }
}
