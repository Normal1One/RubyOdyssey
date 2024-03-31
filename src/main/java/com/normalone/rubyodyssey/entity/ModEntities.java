package com.normalone.rubyodyssey.entity;

import com.normalone.rubyodyssey.RubyOdysseyMod;
import com.normalone.rubyodyssey.entity.custom.DiceProjectileEntity;
import com.normalone.rubyodyssey.entity.custom.PorcupineEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<PorcupineEntity> PORCUPINE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(RubyOdysseyMod.MOD_ID, "porcupine"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PorcupineEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<DiceProjectileEntity> DICE_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(RubyOdysseyMod.MOD_ID, "dice_projectile"),
            FabricEntityTypeBuilder.<DiceProjectileEntity>create(SpawnGroup.MISC,DiceProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static void registerModEntities() {
        RubyOdysseyMod.LOGGER.info("Registering Entities for " + RubyOdysseyMod.MOD_ID);
    }
}
