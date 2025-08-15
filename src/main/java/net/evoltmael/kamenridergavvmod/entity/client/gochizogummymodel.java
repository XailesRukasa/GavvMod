package net.evoltmael.kamenridergavvmod.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.client.event.RenderHighlightEvent;

public class gochizogummymodel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "gochizogummymodel"), "main");
	private final ModelPart gochizogummymodel;
	private final ModelPart tophalf;
	private final ModelPart bottomhalf;
	private final ModelPart Inner;
	private final ModelPart leftarm;
	private final ModelPart rightarm;

	public gochizogummymodel(ModelPart root) {
		this.gochizogummymodel = root.getChild("gochizogummymodel");
		this.tophalf = this.gochizogummymodel.getChild("tophalf");
		this.bottomhalf = this.gochizogummymodel.getChild("bottomhalf");
		this.Inner = this.gochizogummymodel.getChild("Inner");
		this.leftarm = this.Inner.getChild("leftarm");
		this.rightarm = this.Inner.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gochizogummymodel = partdefinition.addOrReplaceChild("gochizogummymodel", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tophalf = gochizogummymodel.addOrReplaceChild("tophalf", CubeListBuilder.create().texOffs(14, 14).addBox(-3.0F, 1.0625F, -0.725F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-3.0F, -0.9375F, -0.825F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 12).addBox(-3.0F, -2.9375F, -0.125F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -1.9375F, -0.625F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0625F, -0.375F));

		PartDefinition righteye_r1 = tophalf.addOrReplaceChild("righteye_r1", CubeListBuilder.create().texOffs(22, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.3125F, -0.475F, 0.0F, 0.0F, -0.2182F));

		PartDefinition lefteye_r1 = tophalf.addOrReplaceChild("lefteye_r1", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.3125F, -0.475F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r1 = tophalf.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.0625F, 0.375F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = tophalf.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 0.0625F, 0.375F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bottomhalf = gochizogummymodel.addOrReplaceChild("bottomhalf", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0F, -1.3F, -1.06F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 10).addBox(-3.0F, 0.7F, -0.36F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-3.0F, -1.3F, -0.86F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.7F, -0.14F));

		PartDefinition cube_r3 = bottomhalf.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 16).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.3F, 0.14F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = bottomhalf.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 16).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -0.3F, 0.14F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Inner = gochizogummymodel.addOrReplaceChild("Inner", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -1.5F, -0.7143F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 18).addBox(1.0F, -1.5F, -0.7143F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 18).addBox(-1.0F, -1.5F, -0.7143F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 18).addBox(-1.0F, -1.25F, -0.4643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 20).addBox(-1.0F, 1.25F, -0.4643F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 2).addBox(-1.0F, -0.5F, -0.3143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 5).addBox(-1.0F, -1.5F, -0.3143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.5F, 0.2143F));

		PartDefinition leftarm = Inner.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(0.875F, 2.15F, -0.2143F));

		PartDefinition cube_r5 = leftarm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 20).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.875F, 0.45F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r6 = leftarm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 18).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.875F, -0.45F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition rightarm = Inner.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(-0.925F, 2.15F, -0.2143F));

		PartDefinition cube_r7 = rightarm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 8).addBox(-0.0161F, -0.4951F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-1.9839F, -0.5049F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, -2.6616F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        gochizogummymodel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return gochizogummymodel;
    }
}