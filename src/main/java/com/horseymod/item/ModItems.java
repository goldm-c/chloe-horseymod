package com.horseymod.item;

import com.horseymod.Horseymod;
import com.horseymod.block.ModBlocks;
import com.horseymod.entity.ModBoats;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item WOODCHIPS = registerItem("woodchips", new Item(new Item.Settings()
			.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Horseymod.MOD_ID, "woodchips")))));

	public static final Item FRIED_EGG = registerItem("fried_egg", new Item(new Item.Settings()
			.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Horseymod.MOD_ID, "fried_egg")))
			.food(ModFood.FRIED_EGG)));
	public static final Item EGG_NOODLE_SOUP = registerItem("egg_noodle_soup", new Item(new Item.Settings()
			.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Horseymod.MOD_ID, "egg_noodle_soup")))
			.food(ModFood.EGG_NOODLE_SOUP).maxCount(16)));
	public static final Item CHERRY = registerItem("cherry", new Item(new Item.Settings()
			.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Horseymod.MOD_ID, "cherry")))
			.food(ModFood.CHERRY)));
	public static final Item GOLDEN_CHERRY = registerItem("golden_cherry", new Item(new Item.Settings()
			.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Horseymod.MOD_ID, "golden_cherry")))
			.food(ModFood.GOLDEN_CHERRY, ModFood.GOLDEN_CHERRY_c)));
	
	public static final Item WILLOW_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.WILLOW, false);
	public static final Item WILLOW_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.WILLOW, true);
	
	public static final Item WILLOW_SIGN = registerItem("willow_sign", new SignItem(ModBlocks.WILLOW_SIGN, ModBlocks.WILLOW_WALL_SIGN,
			new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Horseymod.MOD_ID, "willow_sign")))));
	public static final Item WILLOW_HANGING_SIGN = registerItem("willow_hanging_sign", new HangingSignItem(ModBlocks.WILLOW_HANGING_SIGN, ModBlocks.WILLOW_WALL_HANGING_SIGN,
			new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Horseymod.MOD_ID, "willow_hanging_sign")))));
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Horseymod.MOD_ID, name), item);
	}

	public static void registerModItems() {
		Horseymod.LOGGER.info("Registering Horseymod Items");
		
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.add(WOODCHIPS);
		});	
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.add(WILLOW_BOAT);
			entries.add(WILLOW_CHEST_BOAT);
		});	
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.add(CHERRY);
			entries.add(GOLDEN_CHERRY);
			entries.add(FRIED_EGG);
			entries.add(EGG_NOODLE_SOUP);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
			entries.add(WILLOW_SIGN);
			entries.add(WILLOW_HANGING_SIGN);
		});
		
		CompostingChanceRegistry.INSTANCE.add(ModItems.WOODCHIPS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CHERRY, 0.6f);
		
		FuelRegistryEvents.BUILD.register((builder, context) -> {
			builder.add(ModItems.WOODCHIPS, 100);
		});
	}
}
