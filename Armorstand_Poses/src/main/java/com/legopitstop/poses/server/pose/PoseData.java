package com.legopitstop.poses.server.pose;

import com.legopitstop.poses.util.EulerAngleProvider;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.EulerAngle;

public record PoseData(EulerAngleProvider headRotation, EulerAngleProvider bodyRotation, EulerAngleProvider leftArmRotation, EulerAngleProvider rightArmRotation, EulerAngleProvider leftLegRotation, EulerAngleProvider rightLegRotation) {
    public static final Codec<PoseData> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(
                EulerAngleProvider.CODEC.fieldOf("Head").orElse(new EulerAngleProvider(0.0F, 0.0F, 0.0F)).forGetter(PoseData::headRotation),
                EulerAngleProvider.CODEC.fieldOf("Body").orElse(new EulerAngleProvider(0.0F, 0.0F, 0.0F)).forGetter(PoseData::bodyRotation),
                EulerAngleProvider.CODEC.fieldOf("LeftLeg").orElse(new EulerAngleProvider(0.0F, 0.0F, 0.0F)).forGetter(PoseData::leftLegRotation),
                EulerAngleProvider.CODEC.fieldOf("RightLeg").orElse(new EulerAngleProvider(0.0F, 0.0F, 0.0F)).forGetter(PoseData::rightLegRotation),
                EulerAngleProvider.CODEC.fieldOf("LeftArm").orElse(new EulerAngleProvider(0.0F, 0.0F, 0.0F)).forGetter(PoseData::leftArmRotation),
                EulerAngleProvider.CODEC.fieldOf("RightArm").orElse(new EulerAngleProvider(0.0F, 0.0F, 0.0F)).forGetter(PoseData::rightArmRotation)
        ).apply(instance, PoseData::new);
    });


    public PoseData(EulerAngleProvider headRotation, EulerAngleProvider bodyRotation, EulerAngleProvider leftArmRotation, EulerAngleProvider rightArmRotation, EulerAngleProvider leftLegRotation, EulerAngleProvider rightLegRotation) {
        this.headRotation = headRotation;
        this.bodyRotation = bodyRotation;
        this.leftArmRotation = leftArmRotation;
        this.rightArmRotation = rightArmRotation;
        this.leftLegRotation = leftLegRotation;
        this.rightLegRotation = rightLegRotation;
    }

    public EulerAngle getHead() {
        return this.headRotation.get();
    }

    public EulerAngle getBody() {
        return this.bodyRotation.get();
    }

    public EulerAngle getLeftArm() {
        return this.leftArmRotation.get();
    }

    public EulerAngle getRightArm() {
        return this.rightArmRotation.get();
    }

    public EulerAngle getLeftLeg() {
        return this.leftLegRotation.get();
    }

    public EulerAngle getRightLeg() {
        return this.rightLegRotation.get();
    }
}
