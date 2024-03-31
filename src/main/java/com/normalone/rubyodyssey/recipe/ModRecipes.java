package com.normalone.rubyodyssey.recipe;

import com.normalone.rubyodyssey.RubyOdysseyMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(RubyOdysseyMod.MOD_ID, GemPolishingRecipe.Serializer.ID),
                GemPolishingRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(RubyOdysseyMod.MOD_ID, GemPolishingRecipe.Serializer.ID),
                GemPolishingRecipe.Type.INSTANCE);
    }
}
