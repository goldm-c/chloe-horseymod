package com.horseymod.item;

import java.util.List;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFood {
	public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f).build();
	public static final FoodComponent EGG_NOODLE_SOUP = new FoodComponent.Builder().nutrition(9).saturationModifier(0.9f).build();
	public static final FoodComponent CHERRY = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();
	public static final FoodComponent GOLDEN_CHERRY = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f).build();
	
	public static final ConsumableComponent GOLDEN_CHERRY_c = ConsumableComponents.food()
			.consumeEffect(new ApplyEffectsConsumeEffect(
					List.of(
							new StatusEffectInstance(StatusEffects.REGENERATION, 60, 2),
							new StatusEffectInstance(StatusEffects.RESISTANCE, 60, 3)
						))).build();
}