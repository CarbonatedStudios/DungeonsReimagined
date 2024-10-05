package com.carbonatedstudios.dungeonsreimagined.common.registry;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DRPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, DungeonsReimagined.MODID);

    public static final RegistryObject<PaintingVariant> MAN_KISSER = PAINTING_VARIANTS.register("man_kisser",
            () -> new PaintingVariant(100, 100));

    public static void initialize(IEventBus modBus) {
        PAINTING_VARIANTS.register(modBus);
    }


}
