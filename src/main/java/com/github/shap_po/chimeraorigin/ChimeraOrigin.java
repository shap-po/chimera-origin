package com.github.shap_po.chimeraorigin;

import com.github.shap_po.chimeraorigin.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChimeraOrigin implements ModInitializer {
	public static final String MOD_ID = "chimeraorigin";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.register();
	}

	public static Identifier identifier(String path) {
		return new Identifier(MOD_ID, path);
	}
}
