package baguchan.revampedwolf.client.render;

import baguchan.revampedwolf.RevampedWolfCore;
import baguchan.revampedwolf.client.model.WillardModel;
import baguchan.revampedwolf.entity.WillardEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.client.renderer.entity.model.WolfModel;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.ResourceLocation;

public class WillardRenderer extends WolfRenderer {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(RevampedWolfCore.MODID, "textures/entity/willard.png");

    public WillardRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    public WillardModel getEntityModel() {
        return new WillardModel();
    }

    @Override
    public void render(WolfEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        matrixStackIn.scale(1.5f, 1.5f, 1.5f);
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    @Override
    public ResourceLocation getEntityTexture(WolfEntity entity) {
        return TEXTURE;
    }

}
