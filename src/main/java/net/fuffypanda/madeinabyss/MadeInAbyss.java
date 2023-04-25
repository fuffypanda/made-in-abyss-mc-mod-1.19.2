package net.fuffypanda.madeinabyss;

import net.fabricmc.api.ModInitializer;
import net.fuffypanda.madeinabyss.feature.ExampleFeature;
import net.fuffypanda.madeinabyss.feature.ExampleFeatureConfig;
import net.fuffypanda.madeinabyss.worlds.dimension.ModDimensions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MadeInAbyss implements ModInitializer {
	public static final String MOD_ID = "madeinabyss";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	// all below is example_feature stuff //

	public static final Identifier EXAMPLE_FEATURE_ID = new Identifier("wiki-example", "example_feature");
	public static Feature<ExampleFeatureConfig> EXAMPLE_FEATURE = new ExampleFeature(ExampleFeatureConfig.CODEC);

	public static ConfiguredFeature<ExampleFeatureConfig, ExampleFeature>EXAMPLE_FEATURE_CONFIGURED = new ConfiguredFeature<>(
			(ExampleFeature) EXAMPLE_FEATURE,
			new ExampleFeatureConfig(400, new Identifier("minecraft", "smooth_basalt"))
	);
	public static PlacedFeature EXAMPLE_FEATURE_PLACED = new PlacedFeature(
			RegistryEntry.of(
					EXAMPLE_FEATURE_CONFIGURED
			), List.of(SquarePlacementModifier.of())
	);

	@Override
	public void onInitialize() {

		ModDimensions.register();

		Registry.register(Registry.FEATURE, EXAMPLE_FEATURE_ID, EXAMPLE_FEATURE);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, EXAMPLE_FEATURE_ID, EXAMPLE_FEATURE_CONFIGURED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, EXAMPLE_FEATURE_ID, EXAMPLE_FEATURE_PLACED);

		ModStructures.registerStructureFeatures();

	}
}
