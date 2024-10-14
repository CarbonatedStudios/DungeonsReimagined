package com.carbonatedstudios.dungeonsreimagined.client.events.model;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class RedstoneCubeModel extends GeoModel {
    @Override
    public ResourceLocation getModelResource(GeoAnimatable geoAnimatable) {
        return new ResourceLocation(DungeonsReimagined.MODID, "geo/redstone_cube.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GeoAnimatable geoAnimatable) {
        return new ResourceLocation(DungeonsReimagined.MODID, "textures/entity/redstone_cube_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GeoAnimatable geoAnimatable) {
        return new ResourceLocation(DungeonsReimagined.MODID, "animations/redstone_cube.animation.json");
    }
}
