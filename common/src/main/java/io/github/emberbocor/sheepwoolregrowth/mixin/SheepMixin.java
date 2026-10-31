package io.github.emberbocor.sheepwoolregrowth.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import io.github.emberbocor.sheepwoolregrowth.regrowth.WoolRegrowth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.animal.sheep.Sheep;
import net.minecraft.world.entity.player.Player;

@Mixin(Sheep.class)
public abstract class SheepMixin {
    @Inject(method = "mobInteract", at = @At("HEAD"), cancellable = true)
    private void sheepwoolregrowth$regrowWool(Player player, InteractionHand hand, CallbackInfoReturnable<InteractionResult> cir) {
        if (WoolRegrowth.feed((Sheep) (Object) this, player, hand)) {
            cir.setReturnValue(InteractionResult.SUCCESS_SERVER);
        }
    }
}
