package com.legopitstop.poses.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import net.minecraft.entity.decoration.DisplayEntity;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtOps;
import net.minecraft.util.math.EulerAngle;
import org.joml.Vector3f;

public record EulerAngleProvider(float pitch, float yaw, float roll) {
    public static final Codec<EulerAngle> CODEC = Codec.PASSTHROUGH.comapFlatMap((dynamic) -> {
        NbtElement nbtElement = (NbtElement)dynamic.convert(NbtOps.INSTANCE).getValue();
        return nbtElement instanceof NbtList ? DataResult.success(new EulerAngle((NbtList)nbtElement)) : DataResult.error(() -> {
            return "Not an array: " + nbtElement;
        });
    }, (json) -> {
        return new Dynamic(NbtOps.INSTANCE, json);
    });

    public EulerAngleProvider(float pitch, float yaw, float roll) {
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
    }

    public EulerAngle get() {
        return new EulerAngle(0.0F, 0.0F, 0.0F);
    }
}
