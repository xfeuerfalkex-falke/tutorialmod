package tutorial.xfeuerfalkex;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tutorial.xfeuerfalkex.block.ModBlocks;
import tutorial.xfeuerfalkex.item.ModItemGroups;
import tutorial.xfeuerfalkex.item.ModItems;

public class Tutorialmod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
