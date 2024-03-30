package com.normalone.rubyodyssey.entity;

import com.normalone.rubyodyssey.TutorialMod;
import com.normalone.rubyodyssey.block.ModBlocks;
import com.normalone.rubyodyssey.item.ModItems;
import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier CHESTNUT_BOAT_ID = new Identifier(TutorialMod.MOD_ID, "chestnut_boat");
    public static final Identifier CHESTNUT_CHEST_BOAT_ID = new Identifier(TutorialMod.MOD_ID, "chestnut_chest_boat");

    public static final RegistryKey<TerraformBoatType> CHESTNUT_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CHESTNUT_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType chestnutBoat = new TerraformBoatType.Builder()
                .item(ModItems.CHESTNUT_BOAT)
                .chestItem(ModItems.CHESTNUT_CHEST_BOAT)
                .planks(ModBlocks.CHESTNUT_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CHESTNUT_BOAT_KEY, chestnutBoat);
    }
}
