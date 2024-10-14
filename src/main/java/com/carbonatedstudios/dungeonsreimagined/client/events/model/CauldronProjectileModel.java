package com.carbonatedstudios.dungeonsreimagined.client.events.model;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class CauldronProjectileModel extends GeoModel {
    @Override
    public ResourceLocation getModelResource(GeoAnimatable geoAnimatable) {
        return new ResourceLocation(DungeonsReimagined.MODID, "geo/cauldron_projectile.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GeoAnimatable geoAnimatable) {
        return new ResourceLocation(DungeonsReimagined.MODID, "textures/entity/cauldron_projectile_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GeoAnimatable geoAnimatable) {
        return new ResourceLocation(DungeonsReimagined.MODID, "animations/cauldron_projectile.animation.json");
    }
}
