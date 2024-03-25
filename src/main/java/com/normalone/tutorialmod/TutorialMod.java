package com.normalone.tutorialmod;

import com.normalone.tutorialmod.block.ModBlocks;
import com.normalone.tutorialmod.item.ModItemGroups;
import com.normalone.tutorialmod.item.ModItems;
import com.normalone.tutorialmod.util.ModCustomTrades;
import com.normalone.tutorialmod.util.ModLootTableModifiers;
import com.normalone.tutorialmod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();
		ModVillagers.registerVillagers();
		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
	}
}