package net.fuffypanda.madeinabyss.worlds.dimension;

import net.fuffypanda.madeinabyss.MadeInAbyss;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {

    public static final RegistryKey<World> LAYER1_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(MadeInAbyss.MOD_ID, "layer1"));
    public static final RegistryKey<DimensionType> LAYER1_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, LAYER1_DIMENSION_KEY.getValue());

    public static final RegistryKey<World> LAYER2_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(MadeInAbyss.MOD_ID, "layer2"));
    public static final RegistryKey<DimensionType> LAYER2_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, LAYER2_DIMENSION_KEY.getValue());

    public static final RegistryKey<World> LAYERTEST_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(MadeInAbyss.MOD_ID, "layertest"));
    public static final RegistryKey<DimensionType> LAYERTEST_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, LAYERTEST_DIMENSION_KEY.getValue());

    public static void register() {
        MadeInAbyss.LOGGER.debug("Registering ModDimensions for " + MadeInAbyss.MOD_ID);
    }
}
