package fox.spiteful.avaritia.compat.ticon;

import tconstruct.library.client.TConstructClientRegistry;
import fox.spiteful.avaritia.Lumberjack;

public class TonkersClient {

    public static void dunkThosePaintbrushes() {
        Lumberjack.info("Registering TiCon renderer mappings");
        TConstructClientRegistry.addMaterialRenderMapping(Tonkers.neutroniumId, "tinker", Tonkers.neutroniumName, true);
        TConstructClientRegistry
                .addMaterialRenderMapping(Tonkers.infinityMetalId, "tinker", Tonkers.infinityMetalName, true);

        NeutroniumIcons iconN = new NeutroniumIcons();
        iconN.register();
        InfinityIcons iconI = new InfinityIcons();
        iconI.register();
    }
}
