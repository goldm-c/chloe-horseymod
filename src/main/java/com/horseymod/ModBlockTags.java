package com.horseymod;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
  public static final TagKey<Block> CATTAILS_PLACEABLE_ON = TagKey.of(RegistryKeys.BLOCK, Identifier.of(Horseymod.MOD_ID, "cattails_placeable_on"));
}