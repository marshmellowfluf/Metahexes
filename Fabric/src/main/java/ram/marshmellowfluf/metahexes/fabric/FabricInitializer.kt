package ram.marshmellowfluf.metahexes.fabric

import net.fabricmc.api.ModInitializer
import ram.marshmellowfluf.metahexes.casting.actions.RegisterPatterns
import net.minecraft.core.Registry
import net.minecraft.resources.ResourceLocation
import ram.marshmellowfluf.metahexes.xplat.IXplatAbstractions
import java.util.function.BiConsumer

object FabricInitializer : ModInitializer {
    override fun onInitialize() {
        //FabricConfig.setup()

        initListeners()

        initRegistries()

        RegisterPatterns.registerPatterns()
    }

    fun initListeners() {
        //ServerTickEvents.END_WORLD_TICK.register()
        //// Can register server ticks on a (dedicated) client, but not client ticks on a (dedicated) server.
        if (IXplatAbstractions.INSTANCE.isPhysicalClient) {
            //ClientTickEvents.END_WORLD_TICK.register()
        }
    }

    fun initRegistries() {

    }

    private fun <T> bind(registry: Registry<in T>): BiConsumer<T, ResourceLocation> =
        BiConsumer<T, ResourceLocation> { t, id -> Registry.register(registry, id, t) }
}
