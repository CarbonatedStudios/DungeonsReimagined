package com.carbonatedstudios.dungeonsreimagined.manager;

import com.carbonatedstudios.dungeonsreimagined.common.registry.*;
import net.minecraftforge.eventbus.api.IEventBus;

public final class DRRegistryManager {

    static void registerRegistries(IEventBus modBus) {
        DRTags.initialize();

        DRCreativeModeTabs.CREATIVE_MODE_TABS.register(modBus);
        DRBlocks.ITEM_BLOCKS.register(modBus);
        DRBlocks.BLOCKS.register(modBus);
        DRItems.ITEMS.register(modBus);
        DREntityTypes.ENTITY_TYPES.register(modBus);
        DRPaintings.PAINTING_VARIANTS.register(modBus);
    }
}
