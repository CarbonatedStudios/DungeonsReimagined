package com.carbonatedstudios.dungeonsreimagined.datagen;


import com.carbonatedstudios.dungeonsreimagined.common.registry.DREntityTypes;
import com.carbonatedstudios.dungeonsreimagined.common.registry.DRItems;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Stream;

public class DREntityLootTableProvider extends EntityLootSubProvider {
    protected DREntityLootTableProvider() {
        super(FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        this.add(DREntityTypes.PINK_SLIME.get(), LootTable.lootTable().withPool(LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(DRItems.PLACEHOLDER_ITEM.get()))));
        this.add(DREntityTypes.REDSTONE_CUBE.get(), LootTable.lootTable().withPool(LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(DRItems.PLACEHOLDER_ITEM.get()))));
    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return DRLootTableProvider.knownSet(ForgeRegistries.ENTITY_TYPES).stream();
    }
}
