package com.carbonatedstudios.dungeonsreimagined.client.events.model;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class PinkSlimeModel extends GeoModel {
    @Override
    public ResourceLocation getModelResource(GeoAnimatable geoAnimatable) {
        return new ResourceLocation(DungeonsReimagined.MODID, "geo/pink_slime.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GeoAnimatable geoAnimatable) {
        return new ResourceLocation(DungeonsReimagined.MODID, "textures/entity/pink_slime_innards.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GeoAnimatable geoAnimatable) {
        return new ResourceLocation(DungeonsReimagined.MODID, "animations/pink_slime.animation.json");
    }
}
