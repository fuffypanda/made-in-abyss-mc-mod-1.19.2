/*
package net.fuffypanda.madeinabyss.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public record HangingTreeConfig(BlockState BlockStateProvider) implements FeatureConfig {
    public HangingTreeConfig(BlockStateProvider block) {
        this.block = block;
    }

    public static Codec<HangingTreeConfig> CODEC = RecordCodecBuilder.create(
            instance ->
                    instance.group(
                            BlockStateProvider.CODEC.fieldOf("block").forGetter(config -> config.block)
                    ).apply(instance, HangingTreeConfig::new));

    public BlockState block() {
        return block;
    }
}
*/