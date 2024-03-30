package com.normalone.rubyodyssey.util;

import com.normalone.rubyodyssey.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS = createTag("metal_detector_detectable_blocks");
        public static final TagKey<Block> CHESTNUT_LOGS = createTag("chestnut_logs");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(TutorialMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CHESTNUT_LOGS = createTag("chestnut_logs");

        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(TutorialMod.MOD_ID, name));
        }
    }
}
