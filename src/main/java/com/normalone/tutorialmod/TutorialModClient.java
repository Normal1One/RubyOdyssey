package com.normalone.tutorialmod;

import com.normalone.tutorialmod.block.ModBlocks;
import com.normalone.tutorialmod.block.entity.ModBlockEntities;
import com.normalone.tutorialmod.block.entity.renderer.GemPolishingBlockEntityRenderer;
import com.normalone.tutorialmod.entity.ModBoats;
import com.normalone.tutorialmod.entity.ModEntities;
import com.normalone.tutorialmod.entity.client.ModModelLayers;
import com.normalone.tutorialmod.entity.client.PorcupineModel;
import com.normalone.tutorialmod.entity.client.PorcupineRenderer;
import com.normalone.tutorialmod.item.ModItems;
import com.normalone.tutorialmod.screen.GemPolishingScreen;
import com.normalone.tutorialmod.screen.ModScreenHandlers;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.RUBY_DOOR);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.RUBY_TRAPDOOR);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.TOMATO_CROP);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.CORN_CROP);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.DAHLIA);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.POTTED_DAHLIA);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.CHESTNUT_LEAVES);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.CHESTNUT_SAPLING);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.POTTED_CHESTNUT_SAPLING);

        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);

        HandledScreens.register(ModScreenHandlers.GEM_POLISHING_SCREEN_HANDLER, GemPolishingScreen::new);

        BlockEntityRendererFactories.register(ModBlockEntities.GEM_POLISHING_STATION_BLOCK_ENTITY, GemPolishingBlockEntityRenderer::new);

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.CHESTNUT_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.CHESTNUT_HANGING_SIGN_TEXTURE));

        TerraformBoatClientHelper.registerModelLayers(ModBoats.CHESTNUT_BOAT_ID, false);

        EntityRendererRegistry.register(ModEntities.DICE_PROJECTILE, FlyingItemEntityRenderer::new);

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.RUBY_BLOCK)
                .lightWithItem(ModItems.RUBY_STAFF)
                .destDimID(new Identifier(TutorialMod.MOD_ID, "normalonedim"))
                .tintColor(0xf84134)
                .registerPortal();
    }
}
