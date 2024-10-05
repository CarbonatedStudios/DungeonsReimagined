package com.carbonatedstudios.dungeonsreimagined.common.registry;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.stream.Collectors;

public class DRCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DungeonsReimagined.MODID);

    public static final RegistryObject<CreativeModeTab> DUNGEONS_REMASTERED_ITEMS = CREATIVE_MODE_TABS.register("dungeonsreimagined_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.dr.dr_items"))
            .displayItems((displayParams, curOutput) -> curOutput.acceptAll(DRItems.ITEMS.getEntries().stream().map(RegistryObject::get).filter(itemEntry -> !(itemEntry instanceof TieredItem) && !(itemEntry instanceof ArmorItem)).map(Item::getDefaultInstance).collect(Collectors.toCollection(ObjectArrayList::new)), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY))
            .icon(() -> DRItems.ITEMS.getEntries().stream().map(RegistryObject::get).map(Item::asItem).map(Item::getDefaultInstance).findFirst().get())
            .build());

    public static final RegistryObject<CreativeModeTab> DUNGEONS_REMASTERED_GEAR = CREATIVE_MODE_TABS.register("dungeonsreimagined_gear", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.dr.dr_gear"))
            .displayItems((displayParams, curOutput) -> curOutput.acceptAll(DRItems.ITEMS.getEntries().stream().map(RegistryObject::get).filter(itemEntry -> itemEntry instanceof TieredItem || itemEntry instanceof ArmorItem).map(Item::getDefaultInstance).collect(Collectors.toCollection(ObjectArrayList::new)), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY))
            .icon(() -> DRItems.ITEMS.getEntries().stream().map(RegistryObject::get).map(Item::asItem).map(Item::getDefaultInstance).findFirst().get())
            .build());

    public static final RegistryObject<CreativeModeTab> DUNGEONS_REMASTERED_BLOCKS = CREATIVE_MODE_TABS.register("dungeonsreimagined_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.dr.dr_blocks"))
            .displayItems((displayParams, curOutput) -> curOutput.acceptAll(DRBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).map(Block::asItem).map(Item::getDefaultInstance).collect(Collectors.toCollection(ObjectArrayList::new)), CreativeModeTab.TabVisibility.PARENT_TAB_ONLY))
            .icon(() -> DRItems.ITEMS.getEntries().stream().map(RegistryObject::get).map(Item::asItem).map(Item::getDefaultInstance).findFirst().get())
            .build());
}
