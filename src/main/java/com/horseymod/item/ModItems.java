package com.horseymod.item;

import com.horseymod.Horseymod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item WOODCHIPS = registerItem("woodchips", new Item(new Item.Settings()
			.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Horseymod.MOD_ID, "woodchips")))));
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Horseymod.MOD_ID, name), item);
	}

	public static void registerModItems() {
		Horseymod.LOGGER.info("Registering Horseymod Items");
		
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.add(WOODCHIPS);
		});	
		
		CompostingChanceRegistry.INSTANCE.add(ModItems.WOODCHIPS, 0.3f);
		
		FuelRegistryEvents.BUILD.register((builder, context) -> {
			builder.add(ModItems.WOODCHIPS, 100);
		});
	}
}
