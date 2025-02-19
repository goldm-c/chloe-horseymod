package com.horseymod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.horseymod.block.ModBlocks;
import com.horseymod.item.ModItems;

public class Horseymod implements ModInitializer {
	public static final String MOD_ID = "horseymod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("NEIGH!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		
		FuelRegistryEvents.BUILD.register((builder, context) -> {
			builder.add(ModBlocks.CATTAILS, 100); 
			});
		
		

	}
}