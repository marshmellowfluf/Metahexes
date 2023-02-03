package ram.marshmellowfluf.metahexes.forge;

import net.minecraftforge.common.ForgeConfigSpec;
import ram.marshmellowfluf.metahexes.api.MetahexesConfig;

public class ForgeConfig implements MetahexesConfig.CommonConfigAccess {

    public ForgeConfig(ForgeConfigSpec.Builder builder) {
    }

    public static class Client implements MetahexesConfig.ClientConfigAccess {

        public Client(ForgeConfigSpec.Builder builder) {
        }
    }

    public static class Server implements MetahexesConfig.ServerConfigAccess {
        public Server(ForgeConfigSpec.Builder builder) {
        }
    }
}
