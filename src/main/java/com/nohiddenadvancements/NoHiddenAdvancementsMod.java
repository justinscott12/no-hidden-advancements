package com.nohiddenadvancements;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoHiddenAdvancementsMod implements ModInitializer {
    public static final String MOD_ID = "no-hidden-advancements";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("No Hidden Advancements Mod initialized!");
        LOGGER.info("Making the following previously hidden advancements visible:");
        LOGGER.info("  - How Did We Get Here?");
        LOGGER.info("  - Voluntary Exile");
        LOGGER.info("  - Hero of the Village");
        LOGGER.info("  - Arbalistic");
        LOGGER.info("  - You've Got a Friend in Me");
        LOGGER.info("  - Smells Interesting");
        LOGGER.info("  - Birthday Song");
        LOGGER.info("  - Little Sniffs");
        LOGGER.info("  - Planting the Past");
        LOGGER.info("All hidden advancements will now be visible in the advancement UI!");
    }
}
