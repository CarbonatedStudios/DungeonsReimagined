package com.carbonatedstudios.dungeonsreimagined.client.events.renderer;

import com.carbonatedstudios.dungeonsreimagined.client.events.model.CauldronProjectileModel;
import com.carbonatedstudios.dungeonsreimagined.common.entity.projectile.CauldronProjectile;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CauldronProjectileRenderer extends GeoEntityRenderer<CauldronProjectile> {
    public CauldronProjectileRenderer(EntityRendererProvider.Context context) {
        super(context, new CauldronProjectileModel());
    }
}