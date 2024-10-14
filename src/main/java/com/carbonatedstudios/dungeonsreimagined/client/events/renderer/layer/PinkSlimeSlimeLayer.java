package com.carbonatedstudios.dungeonsreimagined.client.events.renderer.layer;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import com.carbonatedstudios.dungeonsreimagined.common.entity.hostile.PinkSlime;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class PinkSlimeSlimeLayer extends GeoRenderLayer<PinkSlime> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(DungeonsReimagined.MODID, "textures/entity/pink_slime_slime.png");
    public PinkSlimeSlimeLayer(GeoRenderer<PinkSlime> entityRenderer) {
        super(entityRenderer);
    }

    @Override
    public void render(PoseStack poseStack, PinkSlime animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        RenderType armorRenderType = RenderType.entityTranslucent(TEXTURE);
        this.getRenderer().reRender(this.getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, armorRenderType, bufferSource.getBuffer(armorRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
