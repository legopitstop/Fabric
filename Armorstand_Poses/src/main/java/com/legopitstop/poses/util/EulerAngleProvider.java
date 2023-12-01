package com.legopitstop.poses.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.EulerAngle;

public record EulerAngleProvider(float pitch, float yaw, float roll) {
    public static final Codec<EulerAngleProvider> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(
                // TODO - This should parse as list.
                Codec.INT.fieldOf("pitch").forGetter(EulerAngleProvider::pitch),
                Codec.INT.fieldOf("yaw").forGetter(EulerAngleProvider::yaw),
                Codec.INT.fieldOf("roll").forGetter(EulerAngleProvider::roll)
        ).apply(instance, EulerAngleProvider::new);
    });


    public EulerAngleProvider(float pitch, float yaw, float roll) {
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
    }

    public EulerAngle get() {
        return new EulerAngle(this.pitch, this.yaw, this.roll);
    }
}
