package com.horseymod.block;

import com.horseymod.Horseymod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {
	public static final Block STEEL_BLOCK = registerBlock("steel_block", 
			new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)
					.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "steel_block")))
					.mapColor(MapColor.IRON_GRAY)));
	public static final Block EXPOSED_STEEL = registerBlock("exposed_steel", 
			new Block(AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)
					.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "exposed_steel")))
					.mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
	public static final Block WEATHERED_STEEL = registerBlock("weathered_steel", 
			new Block(AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)
					.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "weathered_steel")))
					.mapColor(MapColor.TERRACOTTA_ORANGE)));
	public static final Block RUSTED_STEEL = registerBlock("rusted_steel", 
			new Block(AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)
					.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "rusted_steel")))
					.mapColor(MapColor.TERRACOTTA_RED)));
	
	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(Horseymod.MOD_ID, name), block);
	}
	
	private static void registerBlockItem(String name, Block block) {
		Registry.register(Registries.ITEM, Identifier.of(Horseymod.MOD_ID, name),
				new BlockItem(block, new Item.Settings()
						.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Horseymod.MOD_ID, name)))));
	}

	public static void registerModBlocks() {
		Horseymod.LOGGER.info("Registering Horseymod Blocks");
		
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.add(STEEL_BLOCK);
			entries.add(EXPOSED_STEEL);
			entries.add(WEATHERED_STEEL);
			entries.add(RUSTED_STEEL);
		});
	}
	
	public static void registerOxidizationPairs() {
		Horseymod.LOGGER.info("Registering Horseymod Oxidization Pairs");
	    OxidizableBlocksRegistry.registerOxidizableBlockPair(STEEL_BLOCK, EXPOSED_STEEL);
	    OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_STEEL, WEATHERED_STEEL);
	    OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_STEEL, RUSTED_STEEL);
	}

}
