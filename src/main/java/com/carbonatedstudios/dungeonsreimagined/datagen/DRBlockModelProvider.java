package com.carbonatedstudios.dungeonsreimagined.datagen;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import com.carbonatedstudios.dungeonsreimagined.common.registry.DRBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class DRBlockModelProvider extends BlockModelProvider {
    public DRBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DungeonsReimagined.MODID, existingFileHelper);
    }

    @Override
    public String getName() {
        return DungeonsReimagined.MOD_NAME.concat(": Block Models");
    }

    @Override
    protected void registerModels() { //TODO Automate
        cubeAll(DRBlocks.MOLDY_STONE.get());
    }

    private void cubeBottomTop(Block targetBlock) {
        cubeBottomTop(ForgeRegistries.BLOCKS.getKey(targetBlock).getPath(), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath() + "_side"), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath() + "_top"), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath() + "_bottom"));
    }

    protected void cubeAll(Block targetBlock) {
        cubeAll(ForgeRegistries.BLOCKS.getKey(targetBlock).getPath(), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath()));
    }


    protected void cubeTop(Block targetBlock) {
        cubeTop(ForgeRegistries.BLOCKS.getKey(targetBlock).getPath(), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath() + "_side"), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath() + "_top"));
    }
}
