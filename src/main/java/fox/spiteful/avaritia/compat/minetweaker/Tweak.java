package fox.spiteful.avaritia.compat.minetweaker;

import minetweaker.MineTweakerAPI;
import fox.spiteful.avaritia.Config;

public class Tweak {

    public static void registrate() {
        MineTweakerAPI.registerClass(ExtremeCrafting.class);
        if (Config.craftingOnly) return;

        MineTweakerAPI.registerClass(Compressor.class);
    }
}
