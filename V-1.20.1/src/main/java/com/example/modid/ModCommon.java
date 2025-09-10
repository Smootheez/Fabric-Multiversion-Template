package com.example.modid;

import net.fabricmc.api.*;

public class ModCommon implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOGGER.info("Hello Fabric world from common!");
    }
}
