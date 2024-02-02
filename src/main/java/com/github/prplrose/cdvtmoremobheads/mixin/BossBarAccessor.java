package com.github.prplrose.cdvtmoremobheads.mixin;

import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.boss.dragon.EnderDragonFight;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(EnderDragonFight.class)
public interface BossBarAccessor {

    @Accessor
    public ServerBossBar getBossBar();
}
