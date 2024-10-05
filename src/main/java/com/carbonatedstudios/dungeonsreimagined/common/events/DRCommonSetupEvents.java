package com.carbonatedstudios.dungeonsreimagined.common.events;

import com.carbonatedstudios.dungeonsreimagined.datagen.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.concurrent.CompletableFuture;

public class DRCommonSetupEvents {
    public static class ModEvents {
        @SubscribeEvent
        public static void onFMLCommonSetupEvent(FMLCommonSetupEvent event) {

        }

        @SubscribeEvent
        public static void onAttributeRegisterer(EntityAttributeCreationEvent event) {
        }



        @SubscribeEvent
        public static void onGatherDataEvent(GatherDataEvent event) {
                DataGenerator dataGen = event.getGenerator();
                PackOutput dataGenPackOutput = dataGen.getPackOutput();
                final ExistingFileHelper curFileHelper = event.getExistingFileHelper();
                final CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

                dataGen.addProvider(event.includeClient(), new DRBlockModelProvider(dataGenPackOutput, curFileHelper));
                dataGen.addProvider(event.includeClient(), new DRBlockStateProvider(dataGenPackOutput, curFileHelper));
                dataGen.addProvider(event.includeClient(), new DRItemModelProvider(dataGenPackOutput, curFileHelper));
                dataGen.addProvider(event.includeClient(), new DRLanguageProvider(dataGenPackOutput));

                DRTagProvider.BlockTagProvider blockTagProvider = new DRTagProvider.BlockTagProvider(dataGenPackOutput, lookupProvider, curFileHelper);

                dataGen.addProvider(event.includeServer(), blockTagProvider);
                dataGen.addProvider(event.includeServer(), new DRTagProvider.ItemTagProvider(dataGenPackOutput, lookupProvider, blockTagProvider.contentsGetter(), curFileHelper));
                dataGen.addProvider(event.includeServer(), new DRTagProvider.EntityTypeTagProvider(dataGenPackOutput, lookupProvider, curFileHelper));
                dataGen.addProvider(event.includeServer(), new DRTagProvider.PaintingTagProvider(dataGenPackOutput, lookupProvider, curFileHelper));
                dataGen.addProvider(event.includeServer(), new DRLootTableProvider(dataGenPackOutput));
                dataGen.addProvider(event.includeServer(), new DRRecipeProvider(dataGenPackOutput));
        }
    }

    public static class ForgeEvents {

    }
}
