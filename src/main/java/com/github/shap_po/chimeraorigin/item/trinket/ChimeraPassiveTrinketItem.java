package com.github.shap_po.chimeraorigin.item.trinket;

import net.minecraft.util.Rarity;

public class ChimeraPassiveTrinketItem extends BaseChimeraTrinketItem {
    public ChimeraPassiveTrinketItem() {
        super(new Settings().maxCount(1).maxDamage(32).rarity(Rarity.UNCOMMON));
    }
}
