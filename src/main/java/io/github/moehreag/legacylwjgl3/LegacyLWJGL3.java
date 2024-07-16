package io.github.moehreag.legacylwjgl3;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = "legacy-lwjgl3", useMetadata = true)
public class LegacyLWJGL3 {
	public static final Logger LOGGER = LogManager.getLogger();

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info("Loading LWJGL 3...");
	}
}
