package com.normalone.rubyodyssey.world.dimension;

import com.normalone.rubyodyssey.TutorialMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> NORMALONEDIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(TutorialMod.MOD_ID, "normalonedim"));
    public static final RegistryKey<World> NORMALONEDIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(TutorialMod.MOD_ID, "normalonedim"));
    public static final RegistryKey<DimensionType> NORMALONE_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(TutorialMod.MOD_ID, "normalonedim_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(NORMALONE_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000),
                false,
                false,
                false,
                true,
                1.0,
                true,
                false,
                0,
                256,
                256,
                BlockTags.INFINIBURN_OVERWORLD,
                DimensionTypes.OVERWORLD_ID,
                1.0f,
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)
        ));
    }
}
