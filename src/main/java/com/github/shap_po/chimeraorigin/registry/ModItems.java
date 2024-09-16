package com.github.shap_po.chimeraorigin.registry;

import com.github.shap_po.chimeraorigin.ChimeraOrigin;
import com.github.shap_po.chimeraorigin.item.trinket.ChimeraActiveTrinketItem;
import com.github.shap_po.chimeraorigin.item.trinket.ChimeraCoreTrinketItem;
import com.github.shap_po.chimeraorigin.item.trinket.ChimeraPassiveTrinketItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

public class ModItems {
    public static final Item BLAZE_CORE = new ChimeraCoreTrinketItem();
    public static final Item CHIMERA_PRIME_CORE = new ChimeraCoreTrinketItem();
    public static final Item DRAGON_HEART = new ChimeraCoreTrinketItem();
    public static final Item OMNIVORE_STOMACH = new ChimeraCoreTrinketItem();
    public static final Item PRISMARINE_CORE = new ChimeraCoreTrinketItem();
    public static final Item SILVERFISH_STOMACH = new ChimeraCoreTrinketItem();

    public static final Item LLAMA_GLANDS = new ChimeraActiveTrinketItem();
    public static final Item MAGE_KILLER = new ChimeraActiveTrinketItem();
    public static final Item RAVAGER_HORNS = new ChimeraActiveTrinketItem();
    public static final Item SLIME_TENTACLES = new ChimeraActiveTrinketItem();
    public static final Item SQUID_TENTACLES = new ChimeraActiveTrinketItem();
    public static final Item WARDEN_VOCAL_CORDS = new ChimeraActiveTrinketItem();

    public static final Item ALLAY_LARYNX = new ChimeraPassiveTrinketItem();
    public static final Item CAVE_SPIDER_FANGS = new ChimeraPassiveTrinketItem();
    public static final Item CREEPER_SKIN = new ChimeraPassiveTrinketItem();
    public static final Item DRAGON_SCALES = new ChimeraPassiveTrinketItem();
    public static final Item HORSE_MUSCLES = new ChimeraPassiveTrinketItem();
    public static final Item OCELOT_PAWS = new ChimeraPassiveTrinketItem();
    public static final Item PHANTOM_EYES = new ChimeraPassiveTrinketItem();
    public static final Item WARDEN_CLAWS = new ChimeraPassiveTrinketItem();


    public static void register() {
        register("chimera_prime_core", CHIMERA_PRIME_CORE, ItemGroups.TOOLS);
        register("dragon_heart", DRAGON_HEART, ItemGroups.TOOLS);
        register("blaze_core", BLAZE_CORE, ItemGroups.TOOLS);
        register("prismarine_core", PRISMARINE_CORE, ItemGroups.TOOLS);
        register("omnivore_stomach", OMNIVORE_STOMACH, ItemGroups.TOOLS);
        register("silverfish_stomach", SILVERFISH_STOMACH, ItemGroups.TOOLS);

        register("mage_killer", MAGE_KILLER, ItemGroups.TOOLS);
        register("slime_tentacles", SLIME_TENTACLES, ItemGroups.TOOLS);
        register("squid_tentacles", SQUID_TENTACLES, ItemGroups.TOOLS);
        register("warden_vocal_cords", WARDEN_VOCAL_CORDS, ItemGroups.TOOLS);
        register("ravager_horns", RAVAGER_HORNS, ItemGroups.TOOLS);
        register("llama_glands", LLAMA_GLANDS, ItemGroups.TOOLS);

        register("creeper_skin", CREEPER_SKIN, ItemGroups.TOOLS);
        register("dragon_scales", DRAGON_SCALES, ItemGroups.TOOLS);
        register("cave_spider_fangs", CAVE_SPIDER_FANGS, ItemGroups.TOOLS);
        register("ocelot_paws", OCELOT_PAWS, ItemGroups.TOOLS);
        register("allay_larynx", ALLAY_LARYNX, ItemGroups.TOOLS);
        register("phantom_eyes", PHANTOM_EYES, ItemGroups.TOOLS);
        register("warden_claws", WARDEN_CLAWS, ItemGroups.TOOLS);
        register("horse_muscles", HORSE_MUSCLES, ItemGroups.TOOLS);
    }

    private static <I extends Item> void register(String name, I item) {
        Registry.register(Registries.ITEM, ChimeraOrigin.identifier(name), item);
    }

    private static <I extends Item> void register(String name, I item, RegistryKey<ItemGroup> group) {
        register(name, item);
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });
    }
}
