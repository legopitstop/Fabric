package com.legopitstop.lightningglass.mixin;

import com.legopitstop.lightningglass.registry.FulguriteRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.entity.LightningEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LightningEntity.class)
public class LightningEntityMixin {
    @Shadow
    private int ambientTick;
    private boolean doFulguite = true;

    @Inject(at=@At("TAIL"), method="tick()V")
    private void injectMethod(CallbackInfo info) {
        LightningEntity entity = (LightningEntity)(Object)this;
       if (this.ambientTick < 0 && this.doFulguite) {
           spawnBlock(entity);
           this.doFulguite = false;
       }
    }

    private void spawnBlock(LightningEntity entity) {
        if (entity.method_48926() instanceof ServerWorld) {
            BlockPos pos = entity.getBlockPos().down();
            CachedBlockPosition cachedBlock = new CachedBlockPosition(entity.method_48926(), pos, false);
            FulguriteRegistry.generateFulgurite((ServerWorld)entity.method_48926(), cachedBlock);
        }
    }
}
