package net.nepheel.projecteve;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.DimensionRenderingRegistry;
import net.nepheel.projecteve.util.ModRegistries;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectEveMod implements ModInitializer {
		public static final String MOD_ID = "projecteve";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModRegistries.registerModStuffs();
	}
}
