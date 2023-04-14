package net.fuffypanda.madeinabyss;

import net.fabricmc.api.ModInitializer;
import net.fuffypanda.madeinabyss.item.ModItems;
import net.fuffypanda.madeinabyss.worlds.dimension.ModDimensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MadeInAbyss implements ModInitializer {
	public static final String MOD_ID = "madeinabyss";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModDimensions.register();

	}
}
