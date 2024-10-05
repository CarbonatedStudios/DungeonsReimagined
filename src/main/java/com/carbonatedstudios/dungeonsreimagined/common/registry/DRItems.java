package com.carbonatedstudios.dungeonsreimagined.common.registry;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DRItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DungeonsReimagined.MODID);

    public static final RegistryObject<Item> PLACEHOLDER_ITEM = ITEMS.register("placeholder_item", () -> new Item(new Item.Properties()));

}
//manmeme is so manmeme frfr
