package com.carbonatedstudios.dungeonsreimagined.datagen;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import com.carbonatedstudios.dungeonsreimagined.common.registry.DRBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class DRBlockStateProvider extends BlockStateProvider {
    public DRBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DungeonsReimagined.MODID, exFileHelper);
    }

    @Override
    public @NotNull String getName() {
        return DungeonsReimagined.MOD_NAME.concat(": BlockState Provider");
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(DRBlocks.MOLDY_STONE.get());
    }

    protected void farmland(FarmBlock farmBlock) {
        ModelFile normalModel = models().getExistingFile(blockTexture(farmBlock));
        ModelFile moistModel = models().getExistingFile(DungeonsReimagined.prefix(blockTexture(farmBlock).getPath() + "_moist"));

        getVariantBuilder(farmBlock).forAllStatesExcept(targetState -> ConfiguredModel.builder().modelFile(targetState.getValue(FarmBlock.MOISTURE) == 7 ? moistModel : normalModel).build());
    }

    protected void topBlock(Block targetBlock) {
        simpleBlock(targetBlock, new ConfiguredModel(models().cubeTop(ForgeRegistries.BLOCKS.getKey(targetBlock).getPath(), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath() + "_side"), DungeonsReimagined.prefix("block/" + ForgeRegistries.BLOCKS.getKey(targetBlock).getPath() + "_top"))));
    }
    private <B extends Block> void blockWithItem(RegistryObject<B> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

