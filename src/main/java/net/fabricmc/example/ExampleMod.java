package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("SilkTest");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Silk! Have some apple?");
		LOGGER.info(Items.APPLE.toString());
	}
}
