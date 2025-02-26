package com.horseymod.world;

import java.util.Optional;

import com.horseymod.Horseymod;

import net.minecraft.block.SaplingGenerator;

public class ModSaplingGenerators {
    public static final SaplingGenerator WILLOW = new SaplingGenerator(Horseymod.MOD_ID + ":willow",
            Optional.empty(), Optional.of(ModConfiguredFeatures.WILLOW_TREE), Optional.empty());
}