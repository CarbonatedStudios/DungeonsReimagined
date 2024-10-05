package com.carbonatedstudios.dungeonsreimagined.datagen;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.IForgeRegistry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DRLootTableProvider extends LootTableProvider {
    public DRLootTableProvider(PackOutput p_254123_) {
        super(p_254123_, Set.of(), ObjectArrayList.of(
                new SubProviderEntry(DREntityLootTableProvider::new, LootContextParamSets.ENTITY)
        ));
    }

    public static <T> Set<T> knownSet(final IForgeRegistry<T> targetRegistry) {
        return StreamSupport
                .stream(targetRegistry.spliterator(), false)
                .filter(entry -> Optional.ofNullable(targetRegistry.getKey(entry))
                        .filter(key -> key.getNamespace().equals(DungeonsReimagined.MODID))
                        .isPresent()).collect(Collectors.toSet());
    }
}