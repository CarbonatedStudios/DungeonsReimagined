package com.carbonatedstudios.dungeonsreimagined.manager;


import net.minecraftforge.eventbus.api.IEventBus;

public final class DRModManager {

    public static void registerAll(IEventBus modBus, IEventBus forgeBus) {
        DREventManager.registerEvents(modBus, forgeBus);
        DRRegistryManager.registerRegistries(modBus);
    }
}

