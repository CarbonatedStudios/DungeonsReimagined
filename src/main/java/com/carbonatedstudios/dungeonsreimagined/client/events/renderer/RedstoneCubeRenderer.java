package com.carbonatedstudios.dungeonsreimagined.client.events.renderer;

import com.carbonatedstudios.dungeonsreimagined.client.events.model.RedstoneCubeModel;
import com.carbonatedstudios.dungeonsreimagined.common.entity.hostile.RedstoneCube;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RedstoneCubeRenderer extends GeoEntityRenderer<RedstoneCube> {
    public RedstoneCubeRenderer(EntityRendererProvider.Context context) {
        super(context, new RedstoneCubeModel());
    }
}
