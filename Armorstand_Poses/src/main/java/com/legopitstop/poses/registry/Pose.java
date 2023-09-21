package com.legopitstop.poses.registry;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.nbt.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;

import java.util.Arrays;
import java.util.List;

public class Pose {
    public Identifier id;
    public int power;
    public Text displayName;
    public NbtCompound pose;

    public Pose(Identifier id, Text displayName, int power, NbtCompound pose) {
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

    public NbtCompound getPose() {
        return this.pose;
    }

    public static NbtList parseBone(JsonArray json) {
        NbtList list = new NbtList();
        for (JsonElement x : json.asList()) {
            NbtElement ele = NbtDouble.of(x.getAsFloat());
            list.add(ele);
        }
        return list;
    }

    public static void parsePoses(NbtCompound pose, JsonObject json) {
        List<String> bones = Arrays.asList("Head", "Body", "LeftLeg", "RightLeg", "LeftArm", "RightArm");
        int i;
        for (i = 0; i < bones.size(); i++) {
            String b = bones.get(i);
            if (json.has(b)) {
                JsonArray bone = JsonHelper.getArray(json, b);
                NbtList ele = Pose.parseBone(bone);
                pose.put(b, ele);
            }
        }
    }

    public static Pose fromJson(Identifier id, JsonObject json) {
        if (json != null && !json.isJsonNull()) {
            int power = 0;
            Text displayName = Text.literal(id.toString());
            NbtCompound pose = new NbtCompound();
            // Power
            if (json.has("power")) {
                power = JsonHelper.getInt(json, "power");
            }

            // Display Name
            if (json.has("display_name")) {
                String name = JsonHelper.getString(json, "display_name");
                displayName = Text.translatable(name);
            }

            // Pose
            if (json.has("Pose")) {
                JsonObject poseObj = JsonHelper.getObject(json, "Pose");
                Pose.parsePoses(pose, poseObj);
            }

            return new Pose(id, displayName, power, pose);
        }
        return null;
    }
}
