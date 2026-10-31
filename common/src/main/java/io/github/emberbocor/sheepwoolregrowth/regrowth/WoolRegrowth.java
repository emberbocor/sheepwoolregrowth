package io.github.emberbocor.sheepwoolregrowth.regrowth;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public final class WoolRegrowth {
    private static final byte EAT_ANIMATION_EVENT = 10;

    private WoolRegrowth() {
    }

    public static boolean feed(Sheep sheep, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (sheep.level().isClientSide || !stack.is(Items.WHEAT) || sheep.isBaby() || !sheep.isSheared()) {
            return false;
        }

        if (!player.getAbilities().instabuild) {
            stack.shrink(1);
        }
        sheep.ate();
        sheep.level().broadcastEntityEvent(sheep, EAT_ANIMATION_EVENT);
        sheep.playSound(SoundEvents.GENERIC_EAT);
        return true;
    }
}
