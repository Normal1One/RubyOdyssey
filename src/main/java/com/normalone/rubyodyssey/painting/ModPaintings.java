package com.normalone.rubyodyssey.painting;

import com.normalone.rubyodyssey.RubyOdysseyMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {
    public static final PaintingVariant QUIET_PET = registerPainting("the_quiet_pet", new PaintingVariant(64, 48));

    private static PaintingVariant registerPainting(String name, PaintingVariant variant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(RubyOdysseyMod.MOD_ID, name), variant);
    }

    public static void registerPaintings() {
        RubyOdysseyMod.LOGGER.info("Registering Paintings for " + RubyOdysseyMod.MOD_ID);
    }
}
