package com.horseymod.block;

import com.horseymod.Horseymod;
import com.horseymod.world.ModSaplingGenerators;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
	public static final Block STEEL_BLOCK = registerBlock("steel_block", 
			new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)
					.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "steel_block")))
					.mapColor(MapColor.IRON_GRAY).strength(3.0F, 6.0F).requiresTool()));
	public static final Block EXPOSED_STEEL = registerBlock("exposed_steel", 
			new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)
					.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "exposed_steel")))
					.mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).strength(3.0F, 6.0F).requiresTool()));
	public static final Block WEATHERED_STEEL = registerBlock("weathered_steel", 
			new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)
					.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "weathered_steel")))
					.mapColor(MapColor.TERRACOTTA_ORANGE).strength(3.0F, 6.0F).requiresTool()));
	public static final Block RUSTED_STEEL = registerBlock("rusted_steel", 
			new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)
					.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "rusted_steel")))
					.mapColor(MapColor.TERRACOTTA_RED).strength(3.0F, 6.0F).requiresTool()));
	
	public static final Block MULCH = registerBlock("mulch", 
			new Block(AbstractBlock.Settings.create()
			.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "mulch")))
			.mapColor(MapColor.OAK_TAN).strength(0.5F).sounds(BlockSoundGroup.CROP)));
	
	public static final PillarBlock WILLOW_LOG = registerBlock("willow_log", 
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG)
			.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "willow_log")))));
	public static final PillarBlock STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log", 
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG)
			.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "stripped_willow_log")))));
	public static final PillarBlock WILLOW_WOOD = registerBlock("willow_wood", 
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG)
			.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "willow_wood")))));
	public static final PillarBlock NATURAL_WILLOW_WOOD = registerBlockNoItem("natural_willow_wood", 
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG)
			.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "natural_willow_wood")))));
	public static final PillarBlock STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood", 
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG)
			.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "stripped_willow_wood")))));
	public static final Block WILLOW_PLANKS = registerBlock("willow_planks", 
			new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
			.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "willow_planks")))
			.mapColor(MapColor.STONE_GRAY)));

	public static final LeavesBlock WILLOW_LEAVES = registerBlock("willow_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "willow_leaves")))));
	public static final LeavesBlock WILLOW_VINES = registerBlock("willow_vines",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "willow_vines")))
            .noCollision()));
	public static final SaplingBlock WILLOW_SAPLING = registerBlock("willow_sapling",
			new SaplingBlock(ModSaplingGenerators.WILLOW, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
				.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "willow_sapling")))));
	
	public static final Block BIG_FLOWER_POT = registerBlock("big_flower_pot", 
			new Block(AbstractBlock.Settings.create()
			.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "willow_planks")))
			.mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.DECORATED_POT).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
	public static final TallFlowerBlock CATTAILS = registerBlock(
			"cattails",
			new TallWaterFlowerBlock(
			AbstractBlock.Settings.create()
			.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "cattails")))
				.mapColor(MapColor.DARK_GREEN)
				.noCollision()
				.breakInstantly()
				.sounds(BlockSoundGroup.GRASS)
				.offset(AbstractBlock.OffsetType.XZ)
				.burnable()
				.pistonBehavior(PistonBehavior.DESTROY)));
	
	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(Horseymod.MOD_ID, name), block);
	}
	private static PillarBlock registerBlock(String name, PillarBlock block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(Horseymod.MOD_ID, name), block);
	}
	private static LeavesBlock registerBlock(String name, LeavesBlock block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(Horseymod.MOD_ID, name), block);
	}
	private static SaplingBlock registerBlock(String name, SaplingBlock block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(Horseymod.MOD_ID, name), block);
	}
	private static TallWaterFlowerBlock registerBlock(String name, TallWaterFlowerBlock block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(Horseymod.MOD_ID, name), block);
	}
	
	private static PillarBlock registerBlockNoItem(String name, PillarBlock block) {
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
			entries.add(WILLOW_LOG);
			entries.add(WILLOW_WOOD);
			entries.add(STRIPPED_WILLOW_LOG);
			entries.add(STRIPPED_WILLOW_WOOD);
			entries.add(BIG_FLOWER_POT);
			entries.add(STEEL_BLOCK);
			entries.add(EXPOSED_STEEL);
			entries.add(WEATHERED_STEEL);
			entries.add(RUSTED_STEEL);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.add(MULCH);
			entries.add(WILLOW_LOG);
			entries.add(WILLOW_LEAVES);
			entries.add(WILLOW_VINES);
			entries.add(WILLOW_SAPLING);
			entries.add(CATTAILS);
		});
		Horseymod.LOGGER.info("Registering Horseymod Flammables");
	    FlammableBlockRegistry.getDefaultInstance().add(WILLOW_LOG, 5, 5);
	    FlammableBlockRegistry.getDefaultInstance().add(WILLOW_WOOD, 5, 5);
	    FlammableBlockRegistry.getDefaultInstance().add(NATURAL_WILLOW_WOOD, 5, 5);
	    FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_WILLOW_LOG, 5, 5);
	    FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_WILLOW_WOOD, 5, 5);
	    FlammableBlockRegistry.getDefaultInstance().add(WILLOW_PLANKS, 5, 5);
	    FlammableBlockRegistry.getDefaultInstance().add(WILLOW_LEAVES, 5, 5);
	    FlammableBlockRegistry.getDefaultInstance().add(WILLOW_VINES, 5, 5);
	    FlammableBlockRegistry.getDefaultInstance().add(WILLOW_SAPLING, 5, 5);
	    FlammableBlockRegistry.getDefaultInstance().add(CATTAILS, 5, 5);
		
		Horseymod.LOGGER.info("Registering Horseymod Oxidization Pairs");
	    OxidizableBlocksRegistry.registerOxidizableBlockPair(STEEL_BLOCK, EXPOSED_STEEL);
	    OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_STEEL, WEATHERED_STEEL);
	    OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_STEEL, RUSTED_STEEL);
	    
	    Horseymod.LOGGER.info("Registering Horseymod Stripped Log Pairs");
	    StrippableBlockRegistry.register(WILLOW_LOG, STRIPPED_WILLOW_LOG);
	    StrippableBlockRegistry.register(WILLOW_WOOD, STRIPPED_WILLOW_WOOD);
	    StrippableBlockRegistry.register(NATURAL_WILLOW_WOOD, STRIPPED_WILLOW_WOOD);
	}

}
