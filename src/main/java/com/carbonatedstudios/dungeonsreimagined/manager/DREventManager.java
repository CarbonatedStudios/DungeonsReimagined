package com.carbonatedstudios.dungeonsreimagined.manager;

import com.carbonatedstudios.dungeonsreimagined.client.events.DRClientMiscEvents;
import com.carbonatedstudios.dungeonsreimagined.client.events.DRClientSetupEvents;
import com.carbonatedstudios.dungeonsreimagined.common.events.DRCommonMiscEvents;
import com.carbonatedstudios.dungeonsreimagined.common.events.DRCommonSetupEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.loading.FMLEnvironment;

public final class DREventManager {

    static void registerEvents(IEventBus modBus, IEventBus forgeBus) {
        registerCommonEvents(modBus, forgeBus);
        registerClientEvents(modBus, forgeBus);
        registerServerEvents(modBus, forgeBus);
    }

    private static void registerClientEvents(IEventBus modBus, IEventBus forgeBus) {
        if (FMLEnvironment.dist.isClient()) {
            modBus.register(DRClientSetupEvents.class);

            forgeBus.register(DRClientMiscEvents.class);
        }
    }

    private static void registerCommonEvents(IEventBus modBus, IEventBus forgeBus) {
        modBus.addListener(DRNetworkManager::registerPackets);
        modBus.register(DRCommonSetupEvents.ModEvents.class);

        forgeBus.register(DRCommonMiscEvents.class);
        forgeBus.register(DRCommonSetupEvents.ForgeEvents.class);
    }

    private static void registerServerEvents(IEventBus modBus, IEventBus forgeBus) {
        if (FMLEnvironment.dist.isDedicatedServer()) {

        }
    }
}
