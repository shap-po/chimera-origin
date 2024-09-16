package com.github.shap_po.chimeraorigin.item.trinket;

import net.minecraft.util.Rarity;

public class ChimeraCoreTrinketItem extends BaseChimeraTrinketItem {
    public ChimeraCoreTrinketItem() {
        super(new Settings().maxCount(1).maxDamage(16).rarity(Rarity.RARE));
    }
}
