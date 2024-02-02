package com.github.prplrose.cdvtmoremobheads;

import com.github.prplrose.cdvtmoremobheads.heads.Heads;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CDVTMoreMobHeads implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("CCDVTM MobHeads");

    @Override
    public void onInitialize() {
        Heads.init();
    }
}
