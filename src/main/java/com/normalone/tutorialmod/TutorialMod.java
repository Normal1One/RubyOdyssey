package com.normalone.tutorialmod;

import com.normalone.tutorialmod.block.ModBlocks;
import com.normalone.tutorialmod.block.entity.ModBlockEntities;
import com.normalone.tutorialmod.entity.ModBoats;
import com.normalone.tutorialmod.entity.ModEntities;
import com.normalone.tutorialmod.entity.custom.PorcupineEntity;
import com.normalone.tutorialmod.item.ModItemGroups;
import com.normalone.tutorialmod.item.ModItems;
import com.normalone.tutorialmod.recipe.ModRecipes;
import com.normalone.tutorialmod.screen.ModScreenHandlers;
import com.normalone.tutorialmod.sound.ModSounds;
import com.normalone.tutorialmod.util.ModCustomTrades;
import com.normalone.tutorialmod.util.ModLootTableModifiers;
import com.normalone.tutorialmod.villager.ModVillagers;
import com.normalone.tutorialmod.world.gen.ModWorldGeneration;
import com.normalone.tutorialmod.world.tree.ModFoliagePlacerTypes;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
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
		ModSounds.registerSounds();
		ModEntities.registerModEntities();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		ModRecipes.registerRecipes();
		ModBoats.registerBoats();
		ModWorldGeneration.generateModWorldGen();
		ModFoliagePlacerTypes.register();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());

		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_LOG, ModBlocks.STRIPPED_CHESTNUT_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_WOOD, ModBlocks.STRIPPED_CHESTNUT_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LEAVES, 30, 60);
	}
}