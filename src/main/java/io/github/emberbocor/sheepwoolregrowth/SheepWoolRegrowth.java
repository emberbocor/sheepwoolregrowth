package io.github.emberbocor.sheepwoolregrowth;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(SheepWoolRegrowth.MODID)
public class SheepWoolRegrowth {
    public static final String MODID = "sheepwoolregrowth";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SheepWoolRegrowth(IEventBus modEventBus, ModContainer modContainer) {
    }
}
