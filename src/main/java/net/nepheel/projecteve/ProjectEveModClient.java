package net.nepheel.projecteve;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.DimensionRenderingRegistry;
import net.minecraft.util.Identifier;

public class ProjectEveModClient implements ClientModInitializer {
    public static final Identifier EVEDIM_EFFECTS_ID = new Identifier("projecteve", "evedim_effects");

    @Override
    public void onInitializeClient() {
        DimensionRenderingRegistry.registerDimensionEffects(EVEDIM_EFFECTS_ID, new net.nepheel.projecteve.effects.EvedimEffects());
    }
}