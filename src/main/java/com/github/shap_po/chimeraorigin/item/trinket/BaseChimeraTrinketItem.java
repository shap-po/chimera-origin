package com.github.shap_po.chimeraorigin.item.trinket;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class BaseChimeraTrinketItem extends TrinketItem {
    public BaseChimeraTrinketItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }
}
