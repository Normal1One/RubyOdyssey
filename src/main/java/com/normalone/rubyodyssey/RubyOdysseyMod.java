package com.normalone.rubyodyssey;

import com.normalone.rubyodyssey.block.ModBlocks;
import com.normalone.rubyodyssey.block.entity.ModBlockEntities;
import com.normalone.rubyodyssey.entity.ModBoats;
import com.normalone.rubyodyssey.entity.ModEntities;
import com.normalone.rubyodyssey.entity.custom.PorcupineEntity;
import com.normalone.rubyodyssey.item.ModItemGroups;
import com.normalone.rubyodyssey.item.ModItems;
import com.normalone.rubyodyssey.painting.ModPaintings;
import com.normalone.rubyodyssey.recipe.ModRecipes;
import com.normalone.rubyodyssey.screen.ModScreenHandlers;
import com.normalone.rubyodyssey.sound.ModSounds;
import com.normalone.rubyodyssey.util.ModCustomTrades;
import com.normalone.rubyodyssey.util.ModLootTableModifiers;
import com.normalone.rubyodyssey.villager.ModVillagers;
import com.normalone.rubyodyssey.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyOdysseyMod implements ModInitializer {
	public static final String MOD_ID = "rubyodyssey";
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
		ModPaintings.registerPaintings();
		ModWorldGeneration.generateModWorldGen();

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