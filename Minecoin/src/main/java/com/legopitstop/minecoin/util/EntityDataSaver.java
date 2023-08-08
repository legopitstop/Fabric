package com.legopitstop.minecoin.util;

import net.minecraft.nbt.NbtCompound;

public interface EntityDataSaver {
    NbtCompound getPersistentData();
}
