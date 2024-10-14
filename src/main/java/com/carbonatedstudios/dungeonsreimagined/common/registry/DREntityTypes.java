package com.carbonatedstudios.dungeonsreimagined.common.registry;


import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import com.carbonatedstudios.dungeonsreimagined.common.entity.hostile.PinkSlime;
import com.carbonatedstudios.dungeonsreimagined.common.entity.hostile.RedstoneCube;
import com.carbonatedstudios.dungeonsreimagined.common.entity.projectile.CauldronProjectile;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class DREntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DungeonsReimagined.MODID);

    public static final RegistryObject<EntityType<PinkSlime>> PINK_SLIME = ENTITY_TYPES.register("pink_slime", () -> EntityType.Builder.of((EntityType.EntityFactory<PinkSlime>) PinkSlime::new, MobCategory.CREATURE).sized(0.5F, 0.5F).build(new ResourceLocation(DungeonsReimagined.MODID, "pink_slime").toString()));

    public static final RegistryObject<EntityType<RedstoneCube>> REDSTONE_CUBE = ENTITY_TYPES.register("redstone_cube", () -> EntityType.Builder.of((EntityType.EntityFactory<RedstoneCube>) RedstoneCube::new, MobCategory.CREATURE).sized(1.0F, 1.0F).build(new ResourceLocation(DungeonsReimagined.MODID, "redstone_cube").toString()));

    public static final RegistryObject<EntityType<CauldronProjectile>> CAULDRON_PROJECTILE = ENTITY_TYPES.register("cauldron_projectile", () -> EntityType.Builder.of((EntityType.EntityFactory<CauldronProjectile>) CauldronProjectile::new, MobCategory.MISC).sized(0.5F, 0.5F).build(new ResourceLocation(DungeonsReimagined.MODID, "cauldron_projectile").toString()));
}



