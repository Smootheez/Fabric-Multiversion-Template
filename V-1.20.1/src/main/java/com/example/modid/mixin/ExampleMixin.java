package com.example.modid.mixin;

import net.minecraft.server.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(MinecraftServer.class)
public abstract class ExampleMixin {
    @Inject(method = "loadLevel", at = @At("HEAD"))
    private void init(CallbackInfo ci) {}
}
