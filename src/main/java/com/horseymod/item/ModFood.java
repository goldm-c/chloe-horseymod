package com.horseymod.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFood {
	public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f).build();
	public static final FoodComponent CHERRY = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();
	public static final FoodComponent GOLDEN_CHERRY = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f).build();
	
	public static final ConsumableComponent GOLDEN_CHERRY_c = ConsumableComponents.food()
			.consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 3))).build();
}