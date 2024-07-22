package net.herrobriam.nostalgiafeaturesalpha;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NostalgiaFeaturesAlpha implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("nostalgia-features-alpha");

	@Override
	public void onInitialize() {
		LOGGER.info("Removing modern world generation features...");
	}
}