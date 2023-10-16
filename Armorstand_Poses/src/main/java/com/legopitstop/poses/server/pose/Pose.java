package com.legopitstop.poses.server.pose;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.nbt.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.math.EulerAngle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public record Pose(Identifier id, int power, Text displayName, NbtCompound pose, EulerAngle headRotation, EulerAngle bodyRotation, EulerAngle leftArmRotation, EulerAngle rightArmRotation, EulerAngle leftLegRotation, EulerAngle rightLegRotation) {

    public Pose(Identifier id, Text displayName, int power, EulerAngle headRotation, EulerAngle bodyRotation, EulerAngle leftArmRotation, EulerAngle rightArmRotation, EulerAngle leftLegRotation, EulerAngle rightLegRotation) {
        this.id = id;
        this.displayName = displayName;
        this.power = power;
        this.headRotation = headRotation;
        this.bodyRotation = bodyRotation;
        this.leftArmRotation = leftArmRotation;
        this.rightArmRotation = rightArmRotation;
        this.leftLegRotation = leftLegRotation;
        this.rightLegRotation = rightLegRotation;
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

    public NbtCompound getPose() {
        return this.pose;
    }

    public static EulerAngle parseBone(JsonArray json) {
        List<Float> list = new ArrayList();
        IntStream.range(0, 3).forEach(i -> {
            try {
                list.add(json.get(i).getAsFloat());
            } catch (IndexOutOfBoundsException e) {
                list.add(0.0F);
            }
        });
        return new EulerAngle(list.get(0), list.get(1), list.get(2));
    }

    public static Pose fromJson(Identifier id, JsonObject json) {
        if (json != null && !json.isJsonNull()) {
            Text displayName;
            EulerAngle headRotation = null;
            EulerAngle bodyRotation = null;
            EulerAngle leftArmRotation = null;
            EulerAngle rightArmRotation = null;
            EulerAngle leftLegRotation = null;
            EulerAngle rightLegRotation = null;

            int power = JsonHelper.getInt(json, "power", 0);
            if (power < 0 || power > 15) {
                throw new JsonSyntaxException("power must be a whole number but less than 15");
            }

            JsonObject poseObj = JsonHelper.getObject(json, "Pose");
            if (poseObj.has("Head")) {
                headRotation = parseBone(JsonHelper.getArray(poseObj, "Head"));
            }
            if (poseObj.has("Body")) {
                bodyRotation = parseBone(JsonHelper.getArray(poseObj, "Body"));
            }
            if (poseObj.has("LeftArm")) {
                leftArmRotation = parseBone(JsonHelper.getArray(poseObj, "LeftArm"));
            }
            if (poseObj.has("RightArm")) {
                rightArmRotation = parseBone(JsonHelper.getArray(poseObj, "RightArm"));
            }
            if (poseObj.has("LeftLeg")) {
                leftLegRotation = parseBone(JsonHelper.getArray(poseObj, "LeftLeg"));
            }
            if (poseObj.has("RightLeg")) {
                rightLegRotation = parseBone(JsonHelper.getArray(poseObj, "RightLeg"));
            }

            if (json.has("display_name")) {
                String name = JsonHelper.getString(json, "display_name");
                displayName = Text.translatable(name);
            } else {
                displayName = Text.translatable(id.toTranslationKey("pose"));
            }
            return new Pose(id, displayName, power, headRotation, bodyRotation, leftArmRotation, rightArmRotation, leftLegRotation, rightLegRotation);
        }
        return null;
    }

    public void setPose(ArmorStandEntity entity) {
        if (this.headRotation != null) {entity.setHeadRotation(this.headRotation);}
        if (this.bodyRotation != null) {entity.setBodyRotation(this.bodyRotation);}
        if (this.leftArmRotation != null) {entity.setLeftArmRotation(this.leftArmRotation);}
        if (this.rightArmRotation != null) {entity.setRightArmRotation(this.rightArmRotation);}
        if (this.leftLegRotation != null) {entity.setLeftLegRotation(this.leftLegRotation);}
        if (this.rightLegRotation != null) {entity.setRightLegRotation(this.rightLegRotation);}

    }
}
