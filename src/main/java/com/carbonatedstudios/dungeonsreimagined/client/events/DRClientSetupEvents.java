package com.carbonatedstudios.dungeonsreimagined.client.events;

import com.carbonatedstudios.dungeonsreimagined.client.events.renderer.CauldronProjectileRenderer;
import com.carbonatedstudios.dungeonsreimagined.client.events.renderer.PinkSlimeRenderer;
import com.carbonatedstudios.dungeonsreimagined.client.events.renderer.RedstoneCubeRenderer;
import com.carbonatedstudios.dungeonsreimagined.common.registry.DREntityTypes;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static com.carbonatedstudios.dungeonsreimagined.common.registry.DREntityTypes.CAULDRON_PROJECTILE;

public class DRClientSetupEvents {
    public static void onFMLClientSetupEvent(FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public static void onRegisterRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(DREntityTypes.PINK_SLIME.get(), PinkSlimeRenderer::new);
        event.registerEntityRenderer(DREntityTypes.REDSTONE_CUBE.get(), RedstoneCubeRenderer::new);
        event.registerEntityRenderer(CAULDRON_PROJECTILE.get(), CauldronProjectileRenderer::new);
    }
}
