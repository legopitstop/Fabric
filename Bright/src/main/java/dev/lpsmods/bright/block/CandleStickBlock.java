package dev.lpsmods.bright.block;

import com.google.common.collect.ImmutableList;
import dev.lpsmods.bright.registry.BrightBlockTags;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class CandleStickBlock extends AbstractCandleStickBlock implements Waterloggable  {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    private static final VoxelShape BOUNDING_SHAPE = Block.createCuboidShape(6,0,6,10,7,10);

    public CandleStickBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(LIT, false)).with(WATERLOGGED, false));
    }

    // WATERLOGGED
    @Override
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED).booleanValue()) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (state.get(WATERLOGGED).booleanValue() || fluidState.getFluid() != Fluids.WATER) {
            return false;
        }
        BlockState blockState = (BlockState)state.with(WATERLOGGED, true);
        if (state.get(LIT).booleanValue()) {
            CandleBlock.extinguish(null, blockState, world, pos);
        } else {
            world.setBlockState(pos, blockState, Block.NOTIFY_ALL);
        }
        world.scheduleFluidTick(pos, fluidState.getFluid(), fluidState.getFluid().getTickRate(world));
        return true;
    }

    // CANDLE
    @Override
    protected Iterable<Vec3d> getParticleOffsets(BlockState state) {
        return ImmutableList.of(new Vec3d(0.5, 0.5, 0.5));
    }

    public static boolean canBeLit(BlockState state) {
        return state.isIn(BrightBlockTags.CANDLE_STICKS, statex -> statex.contains(LIT) && statex.contains(WATERLOGGED)) && state.get(LIT) == false && state.get(WATERLOGGED) == false;
    }

    @Override
    protected boolean isNotLit(BlockState state) {
        return state.get(WATERLOGGED) == false && super.isNotLit(state);
    }

    public ItemActionResult onUseWithItem(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getAbilities().allowModifyWorld && player.getStackInHand(hand).isEmpty() && state.get(LIT).booleanValue()) {
            CandleStickBlock.extinguish(player, state, world, pos);
            return ItemActionResult.success(world.isClient);
        }
        if (player.getAbilities().allowModifyWorld && canBeLit(state) && (player.getStackInHand(hand).isOf(Items.FLINT_AND_STEEL) || player.getStackInHand(hand).isOf(Items.FIRE_CHARGE)) ) {
            world.setBlockState(pos, (BlockState)state.with(LIT, true), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
            if (player.getStackInHand(hand).isOf(Items.FLINT_AND_STEEL)) {
                world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0f, 1.0f);
            } else {
                world.playSound(null, pos, SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.BLOCKS, 1.0f, 1.0f);
            }
            world.emitGameEvent((Entity)player, GameEvent.BLOCK_CHANGE, pos);
            return ItemActionResult.success(world.isClient);
        }
        return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    // COMMON
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return BOUNDING_SHAPE;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        return blockState.isSolidBlock(world, blockPos);
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction[] directions;
        BlockState blockState = this.getDefaultState();
        World worldView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        for (Direction direction : directions = ctx.getPlacementDirections()) {
            Direction direction2;
            if (!direction.getAxis().isHorizontal() || !(blockState = (BlockState)blockState.with(FACING, direction2 = direction.getOpposite())).canPlaceAt(worldView, blockPos)) continue;
            return blockState;
        }
        return null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction.getOpposite() == state.get(FACING) && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return state;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, FACING, WATERLOGGED);
    }
}
