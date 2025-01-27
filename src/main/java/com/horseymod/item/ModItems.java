package com.horseymod.item;

import com.horseymod.Horseymod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	//public static final Item STEEL_BLOCK = registerItem("pink_garnet", new Item(new Item.Settings()));
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Horseymod.MOD_ID, name), item);
	}

	public static void registerModItems() {
		Horseymod.LOGGER.info("Registering Horseymod Items");
		
		
	}
}
