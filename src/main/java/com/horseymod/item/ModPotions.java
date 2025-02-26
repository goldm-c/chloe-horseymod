package com.horseymod.item;

import com.horseymod.Horseymod;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions{
	public static final RegistryEntry<Potion> HASTE = registerPotion("haste", 
			new Potion("haste", new StatusEffectInstance(StatusEffects.HASTE, 3600, 0)));
	public static final RegistryEntry<Potion> LONG_HASTE = registerPotion("long_haste", 
			new Potion("haste", new StatusEffectInstance(StatusEffects.HASTE, 9600, 0)));
	public static final RegistryEntry<Potion> STRONG_HASTE = registerPotion("strong_haste", 
			new Potion("haste", new StatusEffectInstance(StatusEffects.HASTE, 1800, 1)));
	
	private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
		return Registry.registerReference(Registries.POTION, Identifier.of(Horseymod.MOD_ID, name), potion);
	}
	
	public static void registerPotions() {
		
	}
}