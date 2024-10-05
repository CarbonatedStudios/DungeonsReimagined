package com.carbonatedstudios.dungeonsreimagined.client.events;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class DRClientSetupEvents {
    public static void onFMLClientSetupEvent(FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public static void onRegisterRenderers(final EntityRenderersEvent.RegisterRenderers event) {
    }
}
