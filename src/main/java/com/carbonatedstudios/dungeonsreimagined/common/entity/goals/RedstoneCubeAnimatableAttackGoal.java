package com.carbonatedstudios.dungeonsreimagined.common.entity.goals;


import com.carbonatedstudios.dungeonsreimagined.common.entity.hostile.RedstoneCube;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class RedstoneCubeAnimatableAttackGoal extends Goal {

    private final RedstoneCube redstoneCube;

    int attackAnimationTimeout = 6;

    int attackCooldown = 5;

    int animationLength = 20;

    boolean attackState = false;

    public RedstoneCubeAnimatableAttackGoal(RedstoneCube redstoneCube) {
        this.redstoneCube = redstoneCube;
    }


    @Override
    public void tick() {
        super.tick();

        if (attackAnimationTimeout > 0) {
            attackAnimationTimeout--;
        }

        if (attackAnimationTimeout <= 0 && !attackState) {
            List<LivingEntity> entitiesInMeleeRange = redstoneCube.level().getNearbyEntities(LivingEntity.class, TargetingConditions.DEFAULT, redstoneCube, new AABB(redstoneCube.getX() - 1, redstoneCube.getY() - 1, redstoneCube.getZ() - 1, redstoneCube.getX() + 1, redstoneCube.getY() + 1, redstoneCube.getZ() + 1));


            for (Entity entity : entitiesInMeleeRange) {

                if (entity.isAlive() && !entity.noPhysics) {
                    redstoneCube.doHurtTarget(entity);
                }
            }
            attackState = true;
        }
    }


    @Override
    public void start() {
        super.start();
        attackCooldown = 5;
        attackAnimationTimeout = 6;
        animationLength = 20;
        redstoneCube.setAttacking(true);
    }


    @Override
    public void stop() {
        super.stop();
        attackAnimationTimeout = 0;
        redstoneCube.setAttacking(false);
        attackState = false;
    }

    @Override
    public boolean canContinueToUse() {
        return !redstoneCube.isDeadOrDying() && redstoneCube.getTarget() != null && !redstoneCube.getTarget().isDeadOrDying() && --animationLength >= 0;
    }


    @Override
    public boolean canUse() {
        return redstoneCube.isAlive() && redstoneCube.getTarget() != null && redstoneCube.getTarget().isAlive() && redstoneCube.distanceTo(redstoneCube.getTarget()) < 4;
    }
}
