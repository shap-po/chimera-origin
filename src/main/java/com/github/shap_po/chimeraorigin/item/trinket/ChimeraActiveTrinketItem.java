package com.github.shap_po.chimeraorigin.item.trinket;

import net.minecraft.util.Rarity;

public class ChimeraActiveTrinketItem extends BaseChimeraTrinketItem {
    public ChimeraActiveTrinketItem() {
        super(new Settings().maxCount(1).maxDamage(32).rarity(Rarity.UNCOMMON));
    }
}
