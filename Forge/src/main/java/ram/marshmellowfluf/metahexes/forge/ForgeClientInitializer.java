package ram.marshmellowfluf.metahexes.forge;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

// This is Java because I can't kotlin-fu some of the consumers
public class ForgeClientInitializer {
    @SubscribeEvent
    public static void clientInit(FMLClientSetupEvent evt) {
        var evBus = MinecraftForge.EVENT_BUS;

        //evBus.addListener();
    }
}
