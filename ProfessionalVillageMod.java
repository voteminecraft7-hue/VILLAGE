package com.voteminecraft7hue.village;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProfessionalVillageMod implements ModInitializer {
    public static final String MOD_ID = "professional_village";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Professional Village Mod initialized!");

        // TODO: Register Engineer profession and workstation
        // TODO: Add logic for professional villagers
    }
}