package com.carbonatedstudios.dungeonsreimagined.datagen;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelProvider;
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
        //cubeAll(DRBlocks.BLOCK.get());
    }

    protected void cubeAll(Block targetBlock) {
        cubeAll(ForgeRegistries.BLOCKS.getKey(targetBlock).getPath(), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath()));
    }


    protected void cubeTop(Block targetBlock) {
        cubeTop(ForgeRegistries.BLOCKS.getKey(targetBlock).getPath(), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath() + "_side"), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath() + "_top"));
    }
}
