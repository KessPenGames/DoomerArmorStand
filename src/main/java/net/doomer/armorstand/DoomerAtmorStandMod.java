package net.doomer.armorstand;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;

public class DoomerAtmorStandMod implements ModInitializer {
    @Override
    public void onInitialize() {
        LogManager.getLogger().info("Mod initialized!");
    }
}
