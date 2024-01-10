package com.legopitstop.poses.server.pose;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Codecs;

public record ArmorStandPose(Identifier id, Text displayName, int power, Pose pose) {
    public static final Codec<ArmorStandPose> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(
                Identifier.CODEC.fieldOf("id").forGetter(ArmorStandPose::id),
                Codecs.TEXT.fieldOf("display_name").forGetter(ArmorStandPose::displayName),
                Codecs.POSITIVE_INT.fieldOf("power").forGetter(ArmorStandPose::power),
                Pose.CODEC.fieldOf("Pose").forGetter(ArmorStandPose::pose)
        ).apply(instance, ArmorStandPose::new);
    });

    public ArmorStandPose(Identifier id, Text displayName, int power, Pose pose) {
        this.id = id;
        this.displayName = displayName;
        this.power = power;
        this.pose = pose;
    }

    public void setPose(ArmorStandEntity entity) {
        this.pose.setPose(entity);
    }
}
