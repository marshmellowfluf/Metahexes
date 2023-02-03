package ram.marshmellowfluf.metahexes.api;

import com.google.common.base.Suppliers;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

public interface MetahexesAPI {
    String MOD_ID = "metahexes";
    Logger LOGGER = LogManager.getLogger(MOD_ID);

    Supplier<MetahexesAPI> INSTANCE = Suppliers.memoize(() -> {
        try {
            return (MetahexesAPI) Class.forName("ram.marshmellowfluf.metahexes.common.impl.YourAPIImpl")
                .getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            LogManager.getLogger().warn("Unable to find YourAPIImpl, using a dummy");
            return new MetahexesAPI() {
            };
        }
    });

    static MetahexesAPI instance() {
        return INSTANCE.get();
    }

    static ResourceLocation modLoc(String s) {
        return new ResourceLocation(MOD_ID, s);
    }
}
