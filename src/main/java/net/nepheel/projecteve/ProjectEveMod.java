package net.nepheel.projecteve;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectEveMod implements ModInitializer {
	public static final String MOD_ID = "projecteve";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Very important Comment!
		LOGGER.info("Hello Fabric world!");
	}
}