package com.legopitstop.minecoin.util;

import net.minecraft.entity.EntityData;
import net.minecraft.nbt.NbtCompound;

public class MinecoinData {

    public static int getMoney(EntityDataSaver player) {
        NbtCompound nbt = player.getPersistentData();
        return nbt.getInt("checking");
    }

    public static int setMoney(EntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        nbt.putInt("checking", amount);
        // Sync data
        return amount;
    }

    public static int addMoney(EntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        int money = nbt.getInt("checking");
        money += amount;

        nbt.putInt("checking", money);
        // Sync data

        return money;
    }

    public static int removeMoney(EntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        int money = nbt.getInt("checking");
        money -= amount;

        nbt.putInt("checking", money);
        // Sync data
        return money;
    }
}
