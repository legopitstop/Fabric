package com.legopitstop.poses.server.pose;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Codecs;

public record Pose(Identifier id, int power, Text displayName, PoseData pose) {
    public static final Codec<Pose> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(
                Identifier.CODEC.fieldOf("id").forGetter(Pose::id),
                Codecs.TEXT.fieldOf("display_name").forGetter(Pose::displayName),
                Codecs.rangedInt(1, 15).fieldOf("power").forGetter(Pose::power),
                PoseData.CODEC.fieldOf("Pose").forGetter(Pose::pose)
        ).apply(instance, Pose::new);
    });

    public Pose(Identifier id, Text displayName, int power, PoseData pose) {
        this.id = id;
        this.displayName = displayName;
        this.power = power;
        this.pose = pose;
    }

    public Identifier getId() {
        return this.id;
    }

    public Text getDisplayName() {
        return this.displayName;
    }

    public int getPower() {
        return this.power;
    }

    public void setPose(ArmorStandEntity entity) {
        if (this.pose != null) {entity.setHeadRotation(this.pose.getHead());}
        if (this.pose != null) {entity.setBodyRotation(this.pose.getBody());}
        if (this.pose != null) {entity.setLeftArmRotation(this.pose.getLeftArm());}
        if (this.pose != null) {entity.setRightArmRotation(this.pose.getRightArm());}
        if (this.pose != null) {entity.setLeftLegRotation(this.pose.getLeftLeg());}
        if (this.pose != null) {entity.setRightLegRotation(this.pose.getRightLeg());}

    }
}
