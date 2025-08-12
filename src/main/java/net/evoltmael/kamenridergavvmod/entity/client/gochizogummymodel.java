package net.evoltmael.kamenridergavvmod.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.client.event.RenderHighlightEvent;

public class gochizogummymodel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart gochizogummymodel;
	private final ModelPart tophalf;
	private final ModelPart bottomhalf;

	public gochizogummymodel(ModelPart root) {
		this.gochizogummymodel = root.getChild("gochizogummymodel");
		this.tophalf = this.gochizogummymodel.getChild("tophalf");
		this.bottomhalf = this.gochizogummymodel.getChild("bottomhalf");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gochizogummymodel = partdefinition.addOrReplaceChild("gochizogummymodel", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tophalf = gochizogummymodel.addOrReplaceChild("tophalf", CubeListBuilder.create().texOffs(14, 14).addBox(-3.0F, 1.0625F, -0.725F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-3.0F, -0.9375F, -0.825F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 12).addBox(-3.0F, -2.9375F, -0.125F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -1.9375F, -0.625F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0625F, -0.375F));

		PartDefinition righteye_r1 = tophalf.addOrReplaceChild("righteye_r1", CubeListBuilder.create().texOffs(16, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.3125F, -0.475F, 0.0F, 0.0F, -0.2182F));

		PartDefinition lefteye_r1 = tophalf.addOrReplaceChild("lefteye_r1", CubeListBuilder.create().texOffs(16, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.3125F, -0.475F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r1 = tophalf.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.0625F, 0.375F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = tophalf.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 0.0625F, 0.375F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bottomhalf = gochizogummymodel.addOrReplaceChild("bottomhalf", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0F, -1.3F, -1.06F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 10).addBox(-3.0F, 0.7F, -0.36F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-3.0F, -1.3F, -0.86F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.7F, -0.14F));

		PartDefinition cube_r3 = bottomhalf.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 4).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.3F, 0.14F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = bottomhalf.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 2).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -0.3F, 0.14F, 0.0F, 0.0F, 1.5708F));

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