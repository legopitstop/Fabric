package dev.lpsmods.poses.server.pose;

import dev.lpsmods.poses.util.EulerAngleProvider;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.nbt.NbtList;
import net.minecraft.util.math.EulerAngle;

public record Pose(EulerAngle head, EulerAngle body, EulerAngle leftArm, EulerAngle rightArm, EulerAngle leftLeg, EulerAngle rightLeg) {
    public static final Codec<Pose> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(
                EulerAngleProvider.CODEC.fieldOf("Head").forGetter(Pose::head),
                EulerAngleProvider.CODEC.fieldOf("Body").forGetter(Pose::body),
                EulerAngleProvider.CODEC.fieldOf("LeftArm").forGetter(Pose::leftArm),
                EulerAngleProvider.CODEC.fieldOf("RightArm").forGetter(Pose::rightArm),
                EulerAngleProvider.CODEC.fieldOf("LeftLeg").forGetter(Pose::leftLeg),
                EulerAngleProvider.CODEC.fieldOf("RightLeg").forGetter(Pose::rightLeg)
        ).apply(instance, Pose::new);
    });
    
    public Pose(EulerAngle head, EulerAngle body, EulerAngle leftArm, EulerAngle rightArm, EulerAngle leftLeg, EulerAngle rightLeg) {
        this.head = head;
        this.body = body;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }
    public Pose(NbtList head, NbtList body, NbtList leftArm, NbtList rightArm, NbtList leftLeg, NbtList rightLeg) {
        this(new EulerAngle(head), new EulerAngle(body), new EulerAngle(leftArm), new EulerAngle(rightArm), new EulerAngle(leftLeg), new EulerAngle(rightLeg));
    }

    public void setPose(ArmorStandEntity entity) {
        if (this.head != null) {entity.setHeadRotation(this.head);}
        if (this.body != null) {entity.setBodyRotation(this.body);}
        if (this.leftArm != null) {entity.setLeftArmRotation(this.leftArm);}
        if (this.rightArm != null) {entity.setRightArmRotation(this.rightArm);}
        if (this.leftLeg != null) {entity.setLeftLegRotation(this.leftLeg);}
        if (this.rightLeg != null) {entity.setRightLegRotation(this.rightLeg);}
    }
}
