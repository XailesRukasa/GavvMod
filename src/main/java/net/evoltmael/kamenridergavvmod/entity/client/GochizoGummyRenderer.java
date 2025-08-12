package net.evoltmael.kamenridergavvmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.evoltmael.kamenridergavvmod.KRGavvMod;
import net.evoltmael.kamenridergavvmod.entity.custom.GochizoGummyEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GochizoGummyRenderer extends MobRenderer<GochizoGummyEntity, gochizogummymodel<GochizoGummyEntity>> {

    public GochizoGummyRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new gochizogummymodel<>(pContext.bakeLayer(ModModelLayers.GOCHIZOGUMMY_LAYER)),  0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(GochizoGummyEntity pEntity) {
        return new ResourceLocation(KRGavvMod.MOD_ID, "textures/entity/gochizogummytexture.png");
    }

    @Override
    public void render(GochizoGummyEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {

            pMatrixStack.scale(0.5F, 0.5F, 0.5F);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
