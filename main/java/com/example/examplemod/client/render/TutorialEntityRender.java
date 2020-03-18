package com.example.examplemod.client.render;

import com.example.examplemod.ExampleModRegistries;
import com.example.examplemod.client.models.TutorialEntityModel;
import com.example.examplemod.entities.TutorialEntity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class TutorialEntityRender extends LivingRenderer<TutorialEntity, TutorialEntityModel>
{

	public TutorialEntityRender(EntityRendererManager manager)
	{
		super(manager, new TutorialEntityModel(), 0f);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ResourceLocation getEntityTexture(TutorialEntity entity) {
		// TODO Auto-generated method stub
		return ExampleModRegistries.location("textures/entity/example_entity.png");
	}
	
	public static class RenderFactory implements IRenderFactory<TutorialEntity>
	{
		@Override
		public EntityRenderer<? super TutorialEntity> createRenderFor(EntityRendererManager manager)
		{
			return new TutorialEntityRender(manager);  //factory function
		}
	}

}
