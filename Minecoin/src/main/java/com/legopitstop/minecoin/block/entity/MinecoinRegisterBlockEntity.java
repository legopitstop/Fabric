package com.legopitstop.minecoin.block.entity;

import com.legopitstop.minecoin.registry.ModBlockEntityType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;


// TODO
// - BlockEntity - store items

// STATES
// - open bool - When UI is open. Locked for other players.

public class MinecoinRegisterBlockEntity extends BlockEntity {
    private int NUMBER = 7;

    public MinecoinRegisterBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityType.MINECOIN_REGISTER_BLOCK_ENTITY, pos, state);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        nbt.putInt("number", NUMBER);
        super.writeNbt(nbt);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        NUMBER = nbt.getInt("number");
    }
}
