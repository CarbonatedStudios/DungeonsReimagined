package com.carbonatedstudios.dungeonsreimagined.common.entity.projectile;

import com.carbonatedstudios.dungeonsreimagined.common.registry.DREntityTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class CauldronProjectile extends AbstractArrow implements GeoAnimatable {

    protected static final RawAnimation IDLE = RawAnimation.begin().thenLoop("animation.model.move");

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public CauldronProjectile(EntityType<? extends CauldronProjectile> type, Level world) {
        super(type, world);
    }

    public CauldronProjectile(Level world, LivingEntity shooter) {
        super(DREntityTypes.CAULDRON_PROJECTILE.get(), shooter, world);
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        remove(RemovalReason.DISCARDED);
        super.onHitBlock(pResult);
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        pResult.getEntity().hurt(this.damageSources().mobProjectile(this, null), 1.0F);
        remove(RemovalReason.DISCARDED);
        super.onHitEntity(pResult);
    }

    @Override
    public void tick() {
        if (tickCount < 100) {
            super.tick();
        } else {
            remove(RemovalReason.DISCARDED);
        }
    }

    @Override
    protected ItemStack getPickupItem() {
        return null;
    }

    @Override
    public void registerControllers(final AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "animation.model.move", 0, state -> {
            state.setAnimation(IDLE);
            return PlayState.CONTINUE;
        }));
    }

    @Override
    public double getBoneResetTime() {
        return GeoAnimatable.super.getBoneResetTime();
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

    @Override
    public double getTick(Object o) {
        return tickCount;
    }
}

