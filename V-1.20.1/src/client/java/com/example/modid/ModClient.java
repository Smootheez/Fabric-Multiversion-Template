package com.example.modid;

import net.fabricmc.api.*;

public class ModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Constants.LOGGER.info("Hello Fabric world from client!");
    }
}
