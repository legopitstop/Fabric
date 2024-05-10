package dev.lpsmods.poses.util;

import com.mojang.serialization.Codec;
import net.minecraft.util.Util;
import net.minecraft.util.math.EulerAngle;

import java.util.stream.LongStream;

public record EulerAngleProvider(float pitch, float yaw, float roll) {
    public static final Codec<EulerAngle> CODEC = Codec.LONG_STREAM.comapFlatMap((stream) -> {
        return Util.decodeFixedLengthArray(stream, 3).map((values) -> {
            return new EulerAngle(values[0], values[1], values[2]);
        });
    }, (pos) -> {
        return LongStream.of(new long[]{(long)pos.getPitch(), (long)pos.getRoll(), (long)pos.getYaw()});
    }).stable();

    public EulerAngleProvider(float pitch, float yaw, float roll) {
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
    }
}
