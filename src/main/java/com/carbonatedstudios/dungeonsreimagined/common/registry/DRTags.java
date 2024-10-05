package com.carbonatedstudios.dungeonsreimagined.common.registry;

import com.carbonatedstudios.dungeonsreimagined.DungeonsReimagined;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.world.level.levelgen.structure.Structure;

public class DRTags {
    public static class EntityTypeTags {

        private static TagKey<EntityType<?>> createEntityTag(String tagName) {
            return TagKey.create(Registries.ENTITY_TYPE, DungeonsReimagined.prefix(tagName));
        }
    }

    public static class BlockTags {

        private static TagKey<Block> createBlockTag(String tagName) {
            return TagKey.create(Registries.BLOCK, DungeonsReimagined.prefix(tagName));
        }
    }

    public static class EffectTags {

        private static TagKey<MobEffect> createMobEffectTag(String tagName) {
            return TagKey.create(Registries.MOB_EFFECT, DungeonsReimagined.prefix(tagName));
        }
    }

    public static class ItemTags {

        private static TagKey<Item> createItemTag(String tagName) {
            return TagKey.create(Registries.ITEM, DungeonsReimagined.prefix(tagName));
        }
    }

    public static class BiomeTags {

        private static TagKey<Biome> createBiomeTag(String tagName) {
            return TagKey.create(Registries.BIOME, DungeonsReimagined.prefix(tagName));
        }
    }

    public static class StructureTags {

        private static TagKey<Structure> createBiomeTag(String tagName) {
            return TagKey.create(Registries.STRUCTURE, DungeonsReimagined.prefix(tagName));
        }
    }

    public static class BannerPatternTags {

        private static TagKey<BannerPattern> tag(String tagName) {
            return TagKey.create(Registries.BANNER_PATTERN, DungeonsReimagined.prefix(tagName));
        }
    }

    public static void initialize() {}
}