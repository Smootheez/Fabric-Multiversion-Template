package com.example.modid.mixin.client;

import net.fabricmc.api.*;
import net.minecraft.client.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Environment(EnvType.CLIENT)
@Mixin(Minecraft.class)
public abstract class ExampleClientMixin {
    @Inject(method = "run", at = @At("HEAD"))
    private void init(CallbackInfo ci) {}
}
