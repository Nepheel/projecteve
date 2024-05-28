package net.nepheel.projecteve.world.dimension;

import net.nepheel.projecteve.ProjectEveMod;
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
    public static final RegistryKey<DimensionOptions> EVEDIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(ProjectEveMod.MOD_ID, "evedim"));
    public static final RegistryKey<World> EVEDIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(ProjectEveMod.MOD_ID, "evedim"));
    public static final RegistryKey<DimensionType> EVE_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(ProjectEveMod.MOD_ID, "evedim_type"));

    }

