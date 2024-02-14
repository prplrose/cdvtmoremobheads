package com.github.prplrose.cdvtmoremobheads.mixin;

import com.github.prplrose.cdvtmoremobheads.heads.Heads;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementProgress;
import net.minecraft.entity.*;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.boss.dragon.EnderDragonFight;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MobEntity.class)
public class DropEquipmentMixin extends LivingEntity {
    protected DropEquipmentMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }
    @Shadow public Iterable<ItemStack> getArmorItems() {return null;}
    @Shadow public ItemStack getEquippedStack(EquipmentSlot slot) {return null;}
    @Shadow public void equipStack(EquipmentSlot slot, ItemStack stack){}
    @Shadow public Arm getMainArm() {return null;}


    @Inject(method = "dropEquipment", at = @At(value = "TAIL"))
    protected void dropHead(DamageSource source, int lootingMultiplier, boolean allowDrops, CallbackInfo ci) {

        MobEntity mob = ((MobEntity)(Object)this);

        if (mob instanceof SkeletonEntity){
            return;
        }
        if (mob instanceof WitherSkeletonEntity){
            return;
        }
        if (mob instanceof ZombieEntity){
            return;
        }
        if (mob instanceof CreeperEntity){
            if (!((CreeperEntity)mob).shouldRenderOverlay())
                return;
        }
        if (mob instanceof PiglinEntity){
            return;
        }

        Entity attacker = source.getAttacker();
        if (attacker instanceof CreeperEntity creeperEntity && creeperEntity.shouldDropHead()) {
            if (mob instanceof EnderDragonEntity){
                this.dropStack(new ItemStack(Items.DRAGON_HEAD));
                EnderDragonFight enderDragonFight = ((EnderDragonEntity)mob).getFight();
                if(enderDragonFight == null){
                    return;
                }
                ServerBossBar bossBar = ((BossBarAccessor)enderDragonFight).getBossBar();
                for (ServerPlayerEntity player : bossBar.getPlayers()){
                    MinecraftServer server = mob.getServer();
                    if (server == null){
                        return;
                    }
                    AdvancementEntry advancement = server.getAdvancementLoader().get(new Identifier("end/cdvtmoremobheads_creeper_kill"));
                    AdvancementProgress advancementProgress = player.getAdvancementTracker().getProgress(advancement);
                    for(String string : advancementProgress.getUnobtainedCriteria()) {
                        player.getAdvancementTracker().grantCriterion(advancement, string);
                    }
                }
                return;
            }
            creeperEntity.onHeadDropped();
            ItemStack skullStack = Heads.getHead(mob);
            this.dropStack(skullStack);
        }
    }


}
