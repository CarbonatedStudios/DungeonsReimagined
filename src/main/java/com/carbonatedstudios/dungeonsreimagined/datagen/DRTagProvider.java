package com.carbonatedstudios.dungeonsreimagined.datagen;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import com.carbonatedstudios.dungeonsreimagined.common.registry.DRPaintings;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DRTagProvider {


    public static class BlockTagProvider extends BlockTagsProvider {

        public BlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, DungeonsReimagined.MODID, existingFileHelper);
        }

        @Override
        public String getName() {
            return DungeonsReimagined.MOD_NAME.concat(": Block Tags");
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
        }
    }

    public static class ItemTagProvider extends ItemTagsProvider {

        public ItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
            super(pOutput, pLookupProvider, pBlockTags, DungeonsReimagined.MODID, existingFileHelper);
        }

        @Override
        public String getName() {
            return DungeonsReimagined.MOD_NAME.concat(": Item Tags");
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
        }
    }

    public static class EntityTypeTagProvider extends EntityTypeTagsProvider {

        public EntityTypeTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(pOutput, pLookupProvider, DungeonsReimagined.MODID, existingFileHelper);
        }

        @Override
        public String getName() {
            return DungeonsReimagined.MOD_NAME.concat(": EntityType Tags");
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
        }
    }

    public static class PaintingTagProvider extends PaintingVariantTagsProvider {

        public PaintingTagProvider(PackOutput p_255750_, CompletableFuture<HolderLookup.Provider> p_256184_, @Nullable ExistingFileHelper existingFileHelper) {
            super(p_255750_, p_256184_, DungeonsReimagined.MODID, existingFileHelper);
        }

        @Override
        public String getName() {
            return DungeonsReimagined.MOD_NAME.concat(": Painting Tags");
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
            this.tag(PaintingVariantTags.PLACEABLE).add(DRPaintings.MAN_KISSER.getKey());
        }
    }
}
