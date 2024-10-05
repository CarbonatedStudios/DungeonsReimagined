package com.carbonatedstudios.dungeonsreimagined;

import com.carbonatedstudios.dungeonsreimagined.manager.DRModManager;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import javax.annotation.Nullable;
import java.util.Locale;


@Mod(DungeonsReimagined.MODID)
public class DungeonsReimagined {
    public static final String MODID = "dungeonsreimagined";
    public static final String MOD_NAME = "Dungeons Reimagined";
    public static final Logger LOGGER = LogUtils.getLogger();
    private static DungeonsReimagined INSTANCE;
    public DungeonsReimagined() {
        INSTANCE = this;

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;


        if (modBus != null && forgeBus != null) DRModManager.registerAll(modBus, forgeBus);
    }

    public static ResourceLocation prefix(String path) {
        return new ResourceLocation(MODID, path.toLowerCase(Locale.ROOT));
    }

    @Nullable
    public static DungeonsReimagined getInstance() {
        return INSTANCE;
    }

    public static boolean isLoaded() {
        return INSTANCE != null;
    }
}
