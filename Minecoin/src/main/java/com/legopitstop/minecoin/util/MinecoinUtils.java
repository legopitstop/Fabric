package com.legopitstop.minecoin.util;

import com.legopitstop.minecoin.registry.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;

public class MinecoinUtils {

    // TODO
    // - This does not remove the items
    public static void removeItemStack(ServerPlayerEntity player, Item item, int maxCount) {
        int itemsToRemove = maxCount;
        for (int i = 0; i < player.getInventory().size(); i++) {
            ItemStack stack = player.getInventory().getStack(i);
            if(!stack.isEmpty()) {
                if(stack.getItem() == item) {
                    int preAmount = stack.getCount();
                    int newAmount = Math.max(0, preAmount - itemsToRemove);
                    itemsToRemove = Math.max(0, itemsToRemove - preAmount);
                    stack.setCount(newAmount);
                    if(itemsToRemove == 0) {
                        break;
                    }
                }
            }
        }
    }

    public static int getTotalMinecoins(ServerPlayerEntity player) {
        int has = 0;
        for (ItemStack item: player.getInventory().main) {
            if (item.isOf(ModItems.MINECOIN)) {
                has += item.getCount();
            }
        }
        return has;
    }

}
