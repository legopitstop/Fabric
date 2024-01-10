package com.legopitstop.poses.server.pose;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TextCodecs;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Codecs;

import java.util.Optional;

public record ArmorStandPose(Optional<Text> displayName, int power, Pose pose) {
    public static final Codec<ArmorStandPose> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(
                TextCodecs.CODEC.optionalFieldOf("display_name").forGetter(ArmorStandPose::displayName),
                Codecs.POSITIVE_INT.fieldOf("power").forGetter(ArmorStandPose::power),
                Pose.CODEC.fieldOf("Pose").forGetter(ArmorStandPose::pose)
        ).apply(instance, ArmorStandPose::new);
    });

    public ArmorStandPose(Optional<Text> displayName, int power, Pose pose) {
        this.displayName = displayName;
        this.power = power;
        this.pose = pose;
    }

    public void setPose(ArmorStandEntity entity) {
        this.pose.setPose(entity);
    }
}
