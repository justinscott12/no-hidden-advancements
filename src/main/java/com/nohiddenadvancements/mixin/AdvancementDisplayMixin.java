package com.nohiddenadvancements.mixin;

import net.minecraft.advancements.DisplayInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import com.nohiddenadvancements.NoHiddenAdvancementsMod;

@Mixin(DisplayInfo.class)
public class AdvancementDisplayMixin {
    // Make all hidden advancements visible in the UI
    @Inject(method = "isHidden", at = @At("HEAD"), cancellable = true)
    private void makeHiddenAdvancementsVisible(CallbackInfoReturnable<Boolean> cir) {
        NoHiddenAdvancementsMod.LOGGER.debug("Making hidden advancement visible");
        cir.setReturnValue(false);
    }
}
