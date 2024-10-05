package com.carbonatedstudios.dungeonsreimagined.datagen;

import com.carbonatedstudios.dungeonsreimagined.common.registry.DRBlocks;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collections;
import java.util.stream.Collectors;

public class DRBlockLootTableProvider extends BlockLootSubProvider {

    public DRBlockLootTableProvider() {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(DRBlocks.MOLDY_STONE.get());
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DRBlocks.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .collect(Collectors.toCollection(ObjectArrayList::new));
    }
}
