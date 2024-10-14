package com.carbonatedstudios.dungeonsreimagined.client.events.renderer;

import com.carbonatedstudios.dungeonsreimagined.client.events.model.PinkSlimeModel;
import com.carbonatedstudios.dungeonsreimagined.client.events.renderer.layer.PinkSlimeSlimeLayer;
import com.carbonatedstudios.dungeonsreimagined.common.entity.hostile.PinkSlime;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class PinkSlimeRenderer extends GeoEntityRenderer<PinkSlime> {
    public PinkSlimeRenderer(EntityRendererProvider.Context context) {
        super(context, new PinkSlimeModel());
        addRenderLayer(new PinkSlimeSlimeLayer(this));

    }

}