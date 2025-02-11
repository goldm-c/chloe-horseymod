package com.horseymod.world;

import com.horseymod.Horseymod;
import com.horseymod.block.ModBlocks;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;

public class ModConfiguredFeatures {
	public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW_TREE = registerKey("willow");
	
	public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
	
		register(context, WILLOW_TREE, Feature.TREE, new TreeFeatureConfig.Builder(
			BlockStateProvider.of(ModBlocks.WILLOW_LOG),
			new CherryTrunkPlacer(5, 1, 2, (IntProvider) IntProvider.createValidatingCodec(1, 3), (IntProvider) IntProvider.createValidatingCodec(2, 5), (UniformIntProvider) UniformIntProvider.createValidatingCodec(-4, 4), (UniformIntProvider) UniformIntProvider.createValidatingCodec(-4, 4)), 
			
			BlockStateProvider.of(ModBlocks.WILLOW_LEAVES),
			new BlobFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(1), 4), 
			new TwoLayersFeatureSize(1, 0, 2)
			).build());
	}
	
	public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Horseymod.MOD_ID, name));
    }
	
	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
            RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
			context.register(key, new ConfiguredFeature<>(feature, configuration));
	}
	   
}