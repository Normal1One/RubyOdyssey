package com.normalone.rubyodyssey.entity.client;

import com.normalone.rubyodyssey.RubyOdysseyMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(RubyOdysseyMod.MOD_ID, "porcupine"), "main");
}
