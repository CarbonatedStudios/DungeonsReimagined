package com.carbonatedstudios.dungeonsreimagined.datagen;


import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Stream;

public class DREntityLootTableProvider extends EntityLootSubProvider {
    protected DREntityLootTableProvider() {
        super(FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return DRLootTableProvider.knownSet(ForgeRegistries.ENTITY_TYPES).stream();
    }
}
