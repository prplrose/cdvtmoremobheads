package com.github.prplrose.cdvtmoremobheads.heads;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.VexEntity;
import net.minecraft.entity.mob.ZombieVillagerEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.StringNbtReader;
import net.minecraft.text.Text;
import net.minecraft.village.VillagerProfession;
import com.github.prplrose.cdvtmoremobheads.CDVTMoreMobHeads;

import java.util.HashMap;

public class Heads {

    public static final HashMap<EntityType<?>, String> mobEntityHashMap = new HashMap<>();

    public static void init(){
        mobEntityHashMap.put(EntityType.ALLAY, "{SkullOwner:{Id:[I;-1451893487,1412123722,-1640093147,1259255479],Name:\"Allay\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2MwMzg5MTc3ZGJhYTkyZjBkNWZmZGY4NDg4NjJjN2Y5YjM2ZGYyMjJmYmZkNzM3ZTI2MzlkYzMwNTllMGNmMyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.allay.ambient_without_item\"}}");
        mobEntityHashMap.put(EntityType.AXOLOTL, "depends");
        mobEntityHashMap.put(EntityType.BAT, "{SkullOwner:{Id:[I;1153215872,-1167635675,-1699769537,-1407340177],Name:\"Bat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGViODFjNDBiNWI2M2YzZDgzMDM0MGY4ZmNjNGFhYjUzOGQ0ZTU0NGU5NWVlYzlkNzBkNjFmNzg2ZjZiNjk3NCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.bat.ambient\"}}");
        mobEntityHashMap.put(EntityType.BEE, "depends");
        mobEntityHashMap.put(EntityType.BLAZE, "{SkullOwner:{Id:[I;154901009,355289695,-1810345794,-1471547454],Name:\"Blaze\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGVlMjNkYzdhMTBjNmE4N2VmOTM3NDU0YzBlOTRlZDQyYzIzYWE2NDFhOTFlZDg0NzBhMzA0MmQwNWM1MmM1MiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.blaze.ambient\"}}");
        mobEntityHashMap.put(EntityType.CAMEL, "{SkullOwner:{Id:[I;-1518613311,-1411627016,-1901550779,751255424],Name:\"Camel\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTY3ZDQ1OTczNDAxNjZlMTk3OGE2NjhhMDZiZjU3NTZjMTdiNGNiNWI0MGFiOGZmMjQ0MDkzYjZiOGJjNzVkMyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.camel.ambient\"}}");
        mobEntityHashMap.put(EntityType.CAT, "depends");
        mobEntityHashMap.put(EntityType.CAVE_SPIDER, "{SkullOwner:{Id:[I;-2123009263,979846129,-1655305232,-1114743926],Name:\"Cave Spider\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTZhMWMyNTk5ZmM5MTIwM2E2NWEwM2Q0NzljOGRjODdmNjYyZGVhYzM2NjNjMTZjNWUwNGQ2MjViMzk3OGEyNSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.spider.step\"}}");
        mobEntityHashMap.put(EntityType.CHICKEN, "{SkullOwner:{Id:[I;-935129388,-883012526,-1795271171,133599976],Name:\"Chicken\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDJhZjZlNTg0N2VlYTA5OWUxYjBhYjhjMjBhOWU1ZjNjNzE5MDE1OGJkYTU0ZTI4MTMzZDliMjcxZWMwY2I0YiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.chicken.ambient\"}}");
        mobEntityHashMap.put(EntityType.COD, "{SkullOwner:{Id:[I;2054676279,-1972548100,-2043577712,772634513],Name:\"Cod\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjI0NmUxOWIzMmNmNzg0NTQ5NDQ3ZTA3Yjk2MDcyZTFmNjU2ZDc4ZTkzY2NjYTU2Mzc0ODVlNjc0OTczNDY1MiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cod.flop\"}}");
        mobEntityHashMap.put(EntityType.COW, "{SkullOwner:{Id:[I;906227793,992953384,-1126463235,1664106940],Name:\"Cow\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjNkNjIxMTAwZmVhNTg4MzkyMmU3OGJiNDQ4MDU2NDQ4Yzk4M2UzZjk3ODQxOTQ4YTJkYTc0N2Q2YjA4YjhhYiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cow.ambient\"}}");
        mobEntityHashMap.put(EntityType.CREEPER, "{SkullOwner:{Id:[I;1000070145,-970177879,-1352555940,-1878407368],Name:\"Charged Creeper\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUxMWU0YTNkNWFkZDZhNTQ0OTlhYmFkMTBkNzk5ZDA2Y2U0NWNiYTllNTIwYWZkMjAwODYwOGE2Mjg4YjdlNyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.generic.explode\"}}");
        mobEntityHashMap.put(EntityType.DOLPHIN, "{SkullOwner:{Id:[I;-1954755219,920537056,-1923453081,-1715011912],Name:\"Dolphin\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGU5Njg4Yjk1MGQ4ODBiNTViN2FhMmNmY2Q3NmU1YTBmYTk0YWFjNmQxNmY3OGU4MzNmNzQ0M2VhMjlmZWQzIn19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.dolphin.ambient_water\"}}");
        mobEntityHashMap.put(EntityType.DONKEY, "{SkullOwner:{Id:[I;2117845544,1553026972,-1461227030,1401726037],Name:\"Donkey\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGUyNWVlOTI3M2FkNTc5ZDQ0YmY0MDZmNmY2Mjk1NTg2NDgxZWExOThmZDU3MjA3NmNkMGM1ODgyZGE3ZTZjYyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.donkey.ambient\"}}");
        mobEntityHashMap.put(EntityType.DROWNED, "{SkullOwner:{Id:[I;790009440,1639859901,-1397417282,-100772047],Name:\"Drowned\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzNmN2NjZjYxZGJjM2Y5ZmU5YTYzMzNjZGUwYzBlMTQzOTllYjJlZWE3MWQzNGNmMjIzYjNhY2UyMjA1MSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.drowned.ambient\"}}");
        mobEntityHashMap.put(EntityType.ELDER_GUARDIAN, "{SkullOwner:{Id:[I;1449915152,-149469738,-1161669070,1520260531],Name:\"Elder Guardian\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGEyZDY0ZjRhMDBlOWM4NWY2NzI2MmVkY2FjYjg0NTIzNTgxYWUwZjM3YmRhYjIyZGQ3MDQ1MjRmNjJlMTY5ZiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.elder_guardian.ambient\"}}");
        mobEntityHashMap.put(EntityType.ENDERMAN, "{SkullOwner:{Id:[I;-866849205,-281000227,-1565473038,1819911211],Name:\"Enderman\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODk3N2E5NGYwMjQ5OGNhZDBjZmRiNjVjYTdjYjcyZTIzMTExYTkxNGQ4YzY3MGFjY2NjN2E2NWIzNDdkNzc3NiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.enderman.scream\"}}");
        mobEntityHashMap.put(EntityType.ENDERMITE, "{SkullOwner:{Id:[I;12782162,-588822498,-1170731033,1974792938],Name:\"Endermite\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGM2YjY1YzIyYjQ0NjViYTY3OTNiMjE5NWNkNTA4NGNlODNiODhkY2E2ZTU1ZWI5NDg0NTQwYWNkNzM1MmE1MCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.endermite.ambient\"}}");
        mobEntityHashMap.put(EntityType.EVOKER, "{SkullOwner:{Id:[I;-187598897,-1305656313,-2131539956,1355558238],Name:\"Evoker\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzkwZmJkODhmNjU5ZDM5NjNjNjhjYmJjYjdjNzEyMWQ4MTk1YThiZTY1YmJkMmJmMTI1N2QxZjY5YmNjYzBjNyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.evoker.prepare_attack\"}}");
        mobEntityHashMap.put(EntityType.FOX, "depends");
        mobEntityHashMap.put(EntityType.FROG, "depends");
        mobEntityHashMap.put(EntityType.GHAST, "{SkullOwner:{Id:[I;35271643,-910013577,-1204529468,1419567531],Name:\"Ghast\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzUzZGUzMWEyZDAwNDFhNmVmNzViZjdhNmM4NDY4NDY0ZGIxYWFhNjIwMWViYjFhNjAxM2VkYjIyNDVjNzYwNyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.ghast.warn\"}}");
        mobEntityHashMap.put(EntityType.GLOW_SQUID, "{SkullOwner:{Id:[I;197043621,-425833010,-1931009088,1483434690],Name:\"Glow Squid\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGIyZTliNjU4MWZlZDQ4YTk5ZTAzMjMwOTFhZDVjM2MzMjZjZGEyMDA3M2UyOGE5MDJhMDM3M2Y3MzgyYjU5ZiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.glow_squid.ambient\"}}");
        mobEntityHashMap.put(EntityType.GOAT, "depends");
        mobEntityHashMap.put(EntityType.GUARDIAN, "{SkullOwner:{Id:[I;315814816,-1478801991,-1911738820,-775456178],Name:\"Guardian\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJiYTM0NDE2NjcwNDU0YjFhMjA0OTZmODBiOTM5ODUyOWY0OTAwM2ZjNjEzZWI5MzAyNDhlYTliNWQxYTM5MSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.elder_guardian.flop\"}}");
        mobEntityHashMap.put(EntityType.HOGLIN, "{SkullOwner:{Id:[I;1806221708,-2011543511,-2031692223,1629147534],Name:\"Hoglin\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmM0YTdmNTdmYzAzYjEzYWEyZjlkODNjZGQ0ODIyYjkzNjc5MzA5NmRhZjUxZTc4MDI1YmJkMjQxZWQ2ZjY4ZCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.hoglin.angry\"}}");
        mobEntityHashMap.put(EntityType.HORSE, "depends");
        mobEntityHashMap.put(EntityType.HUSK, "{SkullOwner:{Id:[I;-1069986875,-1993847421,-1795916590,-1976443972],Name:\"Husk\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzMzODMxOGJjOTFhMzZjZDVhYjZhYTg4NWM5YTRlZTJiZGFjZGFhNWM2NmIyYTk5ZGZiMGE1NjA5ODNmMjQ4MCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.husk.ambient\"}}");
        mobEntityHashMap.put(EntityType.ILLUSIONER, "{SkullOwner:{Id:[I;510982214,-1276819779,-2029496273,-1623921693],Name:\"Illusioner\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDM4MjcwMWM2N2Q2YzU0YzkwNzU1ODg5MWRjMTc2MjI1MTEyNTE4NzcxZTA2MWM1ZDhiZDkxODQ3OWU2YmRkOCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.illusioner.cast_spell\"}}");
        mobEntityHashMap.put(EntityType.IRON_GOLEM, "{SkullOwner:{Id:[I;-2071425534,-1189982480,-2037144920,449163386],Name:\"Iron Golem\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmU3YzA3MTlmYWJlMTE2ZGNlNjA1MTk5YmNhZGM2OWE1Mzg4NjA4NjRlZjE1NzA2OTgzZmY2NjI4MjJkOWZlMyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.iron_golem.hurt\"}}");
        mobEntityHashMap.put(EntityType.LLAMA, "depends");
        mobEntityHashMap.put(EntityType.MAGMA_CUBE, "{SkullOwner:{Id:[I;1451953794,124535138,-1669831071,2101664984],Name:\"Magma Cube\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjgxNzE4ZDQ5ODQ4NDdhNGFkM2VjMDgxYTRlYmZmZDE4Mzc0MzIzOWFlY2FiNjAzMjIxMzhhNzI2MDk4MTJjMyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.magma_cube.squish\"}}");
        mobEntityHashMap.put(EntityType.MOOSHROOM, "depends");
        mobEntityHashMap.put(EntityType.MULE, "{SkullOwner:{Id:[I;-1184888478,1667187502,-1382680618,1754186037],Name:\"Mule\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFjMjI0YTEwMzFiZTQzNGQyNWFlMTg4NWJmNGZmNDAwYzk4OTRjNjliZmVmNTZhNDkzNTRjNTYyNWMwYzA5YyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.mule.ambient\"}}");
        mobEntityHashMap.put(EntityType.OCELOT, "{SkullOwner:{Id:[I;2014593465,-735293544,-2035371785,-1332122417],Name:\"Ocelot\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTE3NWNjNDNlYThhZTIwMTY4YTFmMTcwODEwYjRkYTRkOWI0ZWJkM2M5OTc2ZTlmYzIyZTlmOTk1YzNjYmMzYyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.ocelot.ambient\"}}");
        mobEntityHashMap.put(EntityType.PANDA, "depends");
        mobEntityHashMap.put(EntityType.PARROT, "depends");
        mobEntityHashMap.put(EntityType.PHANTOM, "{SkullOwner:{Id:[I;-1836012072,-1030665638,-1886758577,374605475],Name:\"Phantom\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2U5NTE1M2VjMjMyODRiMjgzZjAwZDE5ZDI5NzU2ZjI0NDMxM2EwNjFiNzBhYzAzYjk3ZDIzNmVlNTdiZDk4MiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.phantom.ambient\"}}");
        mobEntityHashMap.put(EntityType.PIG, "{SkullOwner:{Id:[I;-1388919770,57427511,-1742279351,-1877871031],Name:\"Pig\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFlZTc2ODFhZGYwMDA2N2YwNGJmNDI2MTFjOTc2NDEwNzVhNDRhZTJiMWMwMzgxZDVhYzZiMzI0NjIxMWJmZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.pig.ambient\"}}");
        mobEntityHashMap.put(EntityType.PIGLIN_BRUTE, "{SkullOwner:{Id:[I;-1179055889,425870002,-1373572226,1177565319],Name:\"Piglin Brute\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjQ4ODc5OWM4M2VjYjI5NDUyY2ViYTg5YzNjMDA5OTIxOTI3NGNlNWIyYmZiOGFkMGIzZWE0YzY1ZmFjNDYzMCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.piglin_brute.ambient\"}}");
        mobEntityHashMap.put(EntityType.PILLAGER, "{SkullOwner:{Id:[I;1339570758,-1965080213,-1455428410,-985047630],Name:\"Pillager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzIyNWYwYjQ5YzUyOTUwNDhhNDA5YzljNjAxY2NhNzlhYThlYjUyYWZmNWUyMDMzZWJiODY1ZjQzNjdlZjQzZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.pillager.ambient\"}}");
        mobEntityHashMap.put(EntityType.POLAR_BEAR, "{SkullOwner:{Id:[I;-1918547379,1384533169,-1305465137,1135589197],Name:\"Polar Bear\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Q4NzAyOTExZTYxNmMwZDMyZmJlNzc4ZDE5NWYyMWVjY2U5MDI1YmNiZDA5MTUxZTNkOTdhZjMxOTJhYTdlYyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.polar_bear.ambient\"}}");
        mobEntityHashMap.put(EntityType.PUFFERFISH, "{SkullOwner:{Id:[I;-955548222,358892461,-1589578606,704722779],Name:\"Pufferfish\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTI3MzNkNWRhNTljODJlYWYzMTBiMzgyYWZmNDBiZDUxM2M0NDM1NGRiYmFiZmUxNGIwNjZhNTU2ODEwYTdmOSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.puffer_fish.blow_up\"}}");
        mobEntityHashMap.put(EntityType.RABBIT, "depends");
        mobEntityHashMap.put(EntityType.RAVAGER, "{SkullOwner:{Id:[I;-44506356,1970291713,-1814172632,-1194518028],Name:\"Ravager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI0ZGIyOTg2MTQwZTI1MWUzMmU3MGVkMDhjOGEwODE3MjAzMTNjZTI1NzYzMmJlMWVmOTRhMDczNzM5NGRiIn19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.ravager.roar\"}}");
        mobEntityHashMap.put(EntityType.SALMON, "{SkullOwner:{Id:[I;-1223961430,-2106964034,-1568964036,1418127398],Name:\"Salmon\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzkxZDllNjliNzk1ZGE0ZWFhY2ZjZjczNTBkZmU4YWUzNjdmZWQ4MzM1NTY3MDZlMDQwMzM5ZGQ3ZmUwMjQwYSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.salmon.flop\"}}");
        mobEntityHashMap.put(EntityType.SHEEP, "depends");
        mobEntityHashMap.put(EntityType.SHULKER, "{SkullOwner:{Id:[I;1316730932,1403535779,-1483116252,-490192580],Name:\"Shulker\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI5ZTZhZjZiODE5ZjNkOTBlNjdjZTJlNzA1OWZiZWYzMWRhMmFhOTUzZDM1ZTM0NTRmMTAyMWZhOTEyZWZkZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.shulker.ambient\"}}");
        mobEntityHashMap.put(EntityType.SILVERFISH, "{SkullOwner:{Id:[I;610549108,583027638,-1609076290,-470789079],Name:\"Silverfish\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjI1ZTlmYWUzNzE2NjRkZTFhODAwYzg0ZDAyNTEyNGFiYjhmMTUxMTE4MDdjOGJjMWFiOTEyNmFhY2JkNGY5NSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.silverfish.ambient\"}}");
        mobEntityHashMap.put(EntityType.SKELETON_HORSE, "{SkullOwner:{Id:[I;-786516013,-1572517462,-1977705820,-991614125],Name:\"Skeleton Horse\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUyMjY3MDViZDJhOWU3YmI4ZDZiMGY0ZGFhOTY5YjllMTJkNGFlNWM2NmRhNjkzYmI1ZjRhNGExZTZhYTI5NiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.skeleton_horse.ambient\"}}");
        mobEntityHashMap.put(EntityType.SLIME, "{SkullOwner:{Id:[I;-1454910696,-624080636,-2129208842,-1990874458],Name:\"Slime\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzA2NDI0ZWM3YTE5NmIxNWY5YWQ1NzMzYTM2YTZkMWYyZTZhMGQ0MmZmY2UxZTE1MDhmOTBmMzEyYWM0Y2FlZCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.slime.squish_small\"}}");
        mobEntityHashMap.put(EntityType.SNIFFER, "{SkullOwner:{Id:[I;-157701764,-2068101937,-1234373861,-597076338],Name:\"Sniffer\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzg0YTdlN2ZlMTk3YjdlNzQxOWI1MWQ0NmNjMjMzNTUxYjllYzg5OWRlMWFmZTdmNjUzZTRmOGZiMjZhNjg2ZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sniffer.scenting\"}}");
        mobEntityHashMap.put(EntityType.SNOW_GOLEM, "{SkullOwner:{Id:[I;1341358639,589516301,-1317216292,914807712],Name:\"Snow Golem\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2FhM2UxN2VmMWIyOWE0Yjg3ZmE0M2RlZTFkYjEyYzQxZmQzOWFhMzg3ZmExM2FmMmEwNzliNWIzNzhmZGU4YiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.snow_golem.hurt\"}}");
        mobEntityHashMap.put(EntityType.SPIDER, "{SkullOwner:{Id:[I;1972761510,769281580,-2118093684,-1152804129],Name:\"Spider\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGUyOGU2NjI5YjZlZDFkYTk0ZDRhODE4NzYxNjEyYzM2ZmIzYTY4MTNjNGI2M2ZiOWZlYTUwNzY0MTVmM2YwYyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.spider.ambient\"}}");
        mobEntityHashMap.put(EntityType.SQUID, "{SkullOwner:{Id:[I;294370025,1643594310,-1392005677,1469989550],Name:\"Squid\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODM1MWI3ZDlhNGYzNmNmZTMxZmQ1OWQ4YzkwMGU0MTlhMTM1MTQ0MTA1ZTdhOTgxY2FhNWExNjhkY2ZmMzI1YiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.squid.ambient\"}}");
        mobEntityHashMap.put(EntityType.STRAY, "{SkullOwner:{Id:[I;2089681891,2057717105,-1735267241,-1458914135],Name:\"Stray\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTkyYjU1OTcwODVlMzVkYjUzZDliZGEwMDhjYWU3MmIyZjAwY2Q3ZDRjZDhkYzY5ZmYxNzRhNTViNjg5ZTZlIn19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.stray.ambient\"}}");
        mobEntityHashMap.put(EntityType.STRIDER, "depends");
        mobEntityHashMap.put(EntityType.TADPOLE, "{SkullOwner:{Id:[I;1388457076,-260486307,-1298739672,-1823086011],Name:\"Tadpole\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2RhZjE2NTNiNWY1OWI1ZWM1YTNmNzk2MDljYjQyMzM1NzlmZWYwN2U2OTNiNjE3NDllMDkwMDE0OWVkZjU2MyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.tadpole.flop\"}}");
        mobEntityHashMap.put(EntityType.TRADER_LLAMA, "depends");
        mobEntityHashMap.put(EntityType.TROPICAL_FISH, "{SkullOwner:{Id:[I;1487997170,-272283534,-1813130350,-1556131307],Name:\"Tropical Fish\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRhMGM4NGRjM2MwOTBkZjdiYWZjNDM2N2E5ZmM2Yzg1MjBkYTJmNzNlZmZmYjgwZTkzNGQxMTg5ZWFkYWM0MSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.tropical_fish.flop\"}}");
        mobEntityHashMap.put(EntityType.TURTLE, "{SkullOwner:{Id:[I;-630254624,-837990550,-1118417637,-2131664733],Name:\"Turtle\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzA0OTMxMjAwYWQ0NjBiNjUwYTE5MGU4ZDQxMjI3YzM5OTlmYmViOTMzYjUxY2E0OWZkOWU1OTIwZDFmOGU3ZCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.turtle.ambient_land\"}}");
        mobEntityHashMap.put(EntityType.VEX, "depends");
        mobEntityHashMap.put(EntityType.VILLAGER, "depends");
        mobEntityHashMap.put(EntityType.VINDICATOR, "{SkullOwner:{Id:[I;-236127053,-88518796,-1291216276,787836719],Name:\"Vindicator\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmRhYmFmZGUyN2VlMTJiMDk4NjUwNDdhZmY2ZjE4M2ZkYjY0ZTA0ZGFlMWMwMGNjYmRlMDRhZDkzZGNjNmM5NSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.vindicator.ambient\"}}");
        mobEntityHashMap.put(EntityType.WANDERING_TRADER, "{SkullOwner:{Id:[I;-1808185366,1041911772,-2048527048,933168617],Name:\"Wandering Trader\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWYxMzc5YTgyMjkwZDdhYmUxZWZhYWJiYzcwNzEwZmYyZWMwMmRkMzRhZGUzODZiYzAwYzkzMGM0NjFjZjkzMiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.wandering_trader.ambient\"}}");
        mobEntityHashMap.put(EntityType.WARDEN, "{SkullOwner:{Id:[I;-1918074277,941639967,-1247506580,1612784779],Name:\"Warden\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJmMzg3OWI3MzcxMjc0ODVlYjM1ZGRlZTc0OGQwNmNmOTE0YjE5M2Q5Nzc1M2FlMzRlOTIyMzA4NDI4MzFmYiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.warden.ambient\"}}");
        mobEntityHashMap.put(EntityType.WITCH, "{SkullOwner:{Id:[I;761166562,-715371631,-2067037693,-1073046345],Name:\"Witch\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTUyMGYxMmM2M2M3OTEyMTg2YzRiZTRlMzBjMzNjNWFjYWVjMGRiMGI2YWJkODM2ZDUxN2Q3NGE2MjI3NWQ0YiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.witch.ambient\"}}");
        mobEntityHashMap.put(EntityType.WITHER, "depends");
        mobEntityHashMap.put(EntityType.WOLF, "depends");
        mobEntityHashMap.put(EntityType.ZOGLIN, "{SkullOwner:{Id:[I;1953490566,1736787332,-1612986518,-535449778],Name:\"Zoglin\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmUzNDkzYTk1NmJmZDc1ODhlZDFhOGVhODU4NzU5NjY3NjU5ZDU4MTAwY2JlY2Q2ZDk2Y2NjMGNhOWIzNjkyMyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zoglin.ambient\"}}");
        mobEntityHashMap.put(EntityType.ZOMBIE_HORSE, "{SkullOwner:{Id:[I;255137132,1571046008,-1658158902,-182820539],Name:\"Zombie Horse\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjYxOGZmYmUxY2ZhMjA1OGZlODBhMDY1ZjcwYzEyOGMyMjVhMWUwYmM5ZGVhZjhiMzhiMDM5NTQ0M2Y0MDkwOSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_horse.ambient\"}}");
        mobEntityHashMap.put(EntityType.ZOMBIE_VILLAGER, "depends");
        mobEntityHashMap.put(EntityType.ZOMBIFIED_PIGLIN, "{SkullOwner:{Id:[I;-2085738719,-1437383164,-1311606964,-1304479199],Name:\"Zombified Piglin\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmRmMDMxMjhiMDAyYTcwNzA4ZDY4MjVlZDZjZjU0ZGRmNjk0YjM3NjZkNzhkNTY0OTAzMGIxY2I4YjM0YzZmYSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombified_piglin.ambient\"}}");


    }

    public static ItemStack getHead(MobEntity entity){

        EntityType<?> entityType = entity.getType();
        ItemStack playerHead = new ItemStack(Items.PLAYER_HEAD);
        String nbtString = mobEntityHashMap.get(entityType);
        if (nbtString == null){
            return new ItemStack(Items.AIR);
        }
        NbtCompound nbtCompound;
        if (nbtString.equals("depends")){
            nbtString = getVariantSpecificHeadNbt(entity);
            if (nbtString == null){
                return new ItemStack(Items.AIR);
            }
        }
        try {
            nbtCompound = StringNbtReader.parse(nbtString);
        } catch (CommandSyntaxException e) {
            CDVTMoreMobHeads.LOGGER.error(e.getMessage());
            return new ItemStack(Items.AIR);
        }
        if(nbtCompound.contains("SkullOwner")){
            NbtCompound ownerCompound = nbtCompound.getCompound("SkullOwner");
            if (entity.hasCustomName()){
                Text name = entity.getCustomName();
                ownerCompound.putString("Name", name.getString());
                nbtCompound.put("SkullOwner", ownerCompound);
            }
        }
        playerHead.setNbt(nbtCompound);
        return playerHead;
    }

    static String getVariantSpecificHeadNbt(MobEntity entity){
        if (entity instanceof AxolotlEntity){
            return axolotlHeadNbt((AxolotlEntity) entity);
        }
        if (entity instanceof BeeEntity){
            return beeHeadNbt((BeeEntity) entity);
        }
        if (entity instanceof CatEntity){
            return catHeadNbt((CatEntity) entity);
        }
        if (entity instanceof FoxEntity){
            return foxHeadNbt((FoxEntity) entity);
        }
        if (entity instanceof FrogEntity){
            return frogHeadNbt((FrogEntity) entity);
        }
        if (entity instanceof GoatEntity){
            return goatHeadNbt((GoatEntity) entity);
        }
        if (entity instanceof HorseEntity){
            return horseHeadNbt((HorseEntity) entity);
        }
        if (entity instanceof LlamaEntity){
            return llamaHeadNbt((LlamaEntity) entity);
        }
        if (entity instanceof MooshroomEntity){
            return mooshroomHeadNbt((MooshroomEntity) entity);
        }
        if (entity instanceof PandaEntity){
            return pandaHeadNbt((PandaEntity) entity);
        }
        if (entity instanceof ParrotEntity){
            return parrotHeadNbt((ParrotEntity) entity);
        }
        if (entity instanceof RabbitEntity){
            return rabbitHeadNbt((RabbitEntity) entity);
        }
        if (entity instanceof SheepEntity){
            return sheepHeadNbt((SheepEntity) entity);
        }
        if (entity instanceof StriderEntity){
            return striderHeadNbt((StriderEntity) entity);
        }
        if (entity instanceof TraderLlamaEntity){
            return traderLlamaHeadNbt((TraderLlamaEntity) entity);
        }
        if (entity instanceof VexEntity){
            return vexHeadNbt((VexEntity) entity);
        }
        if (entity instanceof VillagerEntity){
            return villagerHeadNbt((VillagerEntity) entity);
        }
        if (entity instanceof WitherEntity){
            return witherHeadNbt((WitherEntity) entity);
        }
        if (entity instanceof WolfEntity){
            return wolfHeadNbt((WolfEntity) entity);
        }
        if (entity instanceof ZombieVillagerEntity){
            return zombieVillagerHeadNbt((ZombieVillagerEntity) entity);
        }

        return null;
    }

    static String axolotlHeadNbt(AxolotlEntity axolotl){
        return switch (axolotl.getVariant().getId()) {
            case 0 ->
                    "{SkullOwner:{Id:[I;-495293005,-481671693,-1239113299,1549606366],Name:\"Lucy Axolotl\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjY3ZTE1ZWFiNzMwNjRiNjY4MGQxZGI5OGJhNDQ1ZWQwOTE0YmEzNWE3OTk5OTdjMGRhMmIwM2ZmYzNhODgyNiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.axolotl.idle_air\"}}";
            case 1 ->
                    "{SkullOwner:{Id:[I;1713596526,957432793,-1149242759,513234937],Name:\"Wild Axolotl\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDdjZjAyNzQ5OThiZjVhN2YzOGIzNzAzNmUxNTRmMTEyZmEyZTI4YmFkNDBkNWE3Yzk0NzY1ZmU0ZjUyMjExZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.axolotl.idle_air\"}}";
            case 2 ->
                    "{SkullOwner:{Id:[I;706383151,735923467,-1295348188,-1428745865],Name:\"Gold Axolotl\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTU4NTYwMTE1ZmFhZDExNjE5YjNkNTVkZTc5ZWYyYTA1M2Y0NzhhNjcxOTRiYmU5MjQ3ZWRlYTBiYzk4ZTgzNCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.axolotl.idle_air\"}}";
            case 3 ->
                    "{SkullOwner:{Id:[I;-99306391,701121531,-1561983959,678763888],Name:\"Cyan Axolotl\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODUxMTk2ZDQzOTMwNjU5ZDcxN2UxYjZhMDQ2YTA4ZDEyMjBmY2I0ZTMxYzQ4NTZiYzMzZTc1NTE5ODZlZjFkIn19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.axolotl.idle_air\"}}";
            case 4 ->
                    "{SkullOwner:{Id:[I;-597818000,-567195819,-1576428771,-1756821454],Name:\"Blue Axolotl\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjhmZDEwYjBmZWY0NTk1OTYwYjFmNjQxOTNiYzhhMTg2NWEyZDJlZDQ4YjJlMmNlMDNkOTk0NTYzMDI3ZGY5NSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.axolotl.idle_air\"}}";
            default -> null;
        };
    }

    static String beeHeadNbt(BeeEntity bee){
        if(bee.hasNectar()){
            if (bee.hasAngerTime()){
                return "{SkullOwner:{Id:[I;352237603,-1093908583,-1451367127,286134688],Name:\"Angry Bee\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQwMDIyM2YxZmE1NDc0MWQ0MjFkN2U4MDQ2NDA5ZDVmM2UxNWM3ZjQzNjRiMWI3Mzk5NDAyMDhmM2I2ODZkNCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.bee.loop_aggressive\"}}";
            }
            return "{SkullOwner:{Id:[I;2003235278,1405764951,-2132605639,-755508983],Name:\"Pollinated Bee\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjcyN2QwYWIwM2Y1Y2QwMjJmODcwNWQzZjdmMTMzY2E0OTIwZWFlOGUxZTQ3YjUwNzQ0MzNhMTM3ZTY5MWU0ZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.bee.pollinate\"}}";
        }
        if(bee.hasAngerTime()){
            return "{SkullOwner:{Id:[I;-1589074262,619334070,-1296151011,487786327],Name:\"Angry Pollinated Bee\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTZiNzRlMDUyYjc0Mjg4Nzk5YmE2ZDlmMzVjNWQwMjIxY2Y4YjA0MzMxNTQ3ZWMyZjY4ZDczNTk3YWUyYzliIn19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.bee.loop_aggressive\"}}";
        }
        return "{SkullOwner:{Id:[I;1999906402,-2005908390,-2036338514,-247436483],Name:\"Bee\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTlhYzE2ZjI5NmI0NjFkMDVlYTA3ODVkNDc3MDMzZTUyNzM1OGI0ZjMwYzI2NmFhMDJmMDIwMTU3ZmZjYTczNiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.bee.loop\"}}";
    }

    static String catHeadNbt(CatEntity cat){
        NbtCompound catNbt = new NbtCompound();
        cat.writeNbt(catNbt);
        return switch (catNbt.getString("variant")) {
            case "minecraft:tabby" ->
                    "{SkullOwner:{Id:[I;416313838,-1585690901,-2039730102,1210297349],Name:\"Tabby Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGUyOGQzMGRiM2Y4YzNmZTUwY2E0ZjI2ZjMwNzVlMzZmMDAzYWU4MDI4MTM1YThjZDY5MmYyNGM5YTk4YWUxYiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            case "minecraft:black" ->
                    "{SkullOwner:{Id:[I;-254071636,-572241954,-1675116543,1581897909],Name:\"Tuxedo Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGZkMTBjOGU3NWY2NzM5OGM0NzU4N2QyNWZjMTQ2ZjMxMWMwNTNjYzVkMGFlYWI4NzkwYmNlMzZlZTg4ZjVmOCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            case "minecraft:red" ->
                    "{SkullOwner:{Id:[I;298992683,197215349,-1533415299,-869620723],Name:\"Ginger Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjExM2RiZDNjNmEwNzhhMTdiNGVkYjc4Y2UwN2Q4MzZjMzhkYWNlNTAyN2Q0YjBhODNmZDYwZTdjYTdhMGZjYiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            case "minecraft:siamese" ->
                    "{SkullOwner:{Id:[I;2101899796,1383483823,-1146027621,1228426601],Name:\"Siamese Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDViM2Y4Y2E0YjNhNTU1Y2NiM2QxOTQ0NDk4MDhiNGM5ZDc4MzMyNzE5NzgwMGQ0ZDY1OTc0Y2M2ODVhZjJlYSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            case "minecraft:british_shorthair" ->
                    "{SkullOwner:{Id:[I;1127415624,-1978777244,-1370149610,-889814640],Name:\"British Shorthair Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTM4OWUwZDVkM2U4MWY4NGI1NzBlMjk3ODI0NGIzYTczZTVhMjJiY2RiNjg3NGI0NGVmNWQwZjY2Y2EyNGVlYyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            case "minecraft:calico" ->
                    "{SkullOwner:{Id:[I;38101243,-2069544753,-1230911239,-639946775],Name:\"Calico Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQwMDk3MjcxYmI2ODBmZTk4MWU4NTllOGJhOTNmZWEyOGI4MTNiMTA0MmJkMjc3ZWEzMzI5YmVjNDkzZWVmMyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            case "minecraft:persian" ->
                    "{SkullOwner:{Id:[I;1881121448,-282376499,-1177326383,1809939380],Name:\"Persian Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmY0MGM3NDYyNjBlZjkxYzk2YjI3MTU5Nzk1ZTg3MTkxYWU3Y2UzZDVmNzY3YmY4Yzc0ZmFhZDk2ODlhZjI1ZCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            case "minecraft:ragdoll" ->
                    "{SkullOwner:{Id:[I;-1235324373,1513440609,-1461724260,2052195359],Name:\"Ragdoll Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM3YTQ1ZDI1ODg5ZTNmZGY3Nzk3Y2IyNThlMjZkNGU5NGY1YmMxM2VlZjAwNzk1ZGFmZWYyZTgzZTBhYjUxMSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            case "minecraft:white" ->
                    "{SkullOwner:{Id:[I;-611027776,-249673773,-1495519556,-580962336],Name:\"White Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjFkMTVhYzk1NThlOThiODlhY2E4OWQzODE5NTAzZjFjNTI1NmMyMTk3ZGQzYzM0ZGY1YWFjNGQ3MmU3ZmJlZCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            case "minecraft:jellie" ->
                    "{SkullOwner:{Id:[I;-257253285,42157667,-1688775973,-221632688],Name:\"Jellie Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTBkYjQxMzc2Y2E1N2RmMTBmY2IxNTM5ZTg2NjU0ZWVjZmQzNmQzZmU3NWU4MTc2ODg1ZTkzMTg1ZGYyODBhNSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            case "minecraft:all_black" ->
                        "{SkullOwner:{Id:[I;-124177180,-1717547605,-1856930973,-2095161391],Name:\"Black Cat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjJjMWU4MWZmMDNlODJhM2U3MWUwY2Q1ZmJlYzYwN2UxMTM2MTA4OWFhNDdmMjkwZDQ2YzhhMmMwNzQ2MGQ5MiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cat.ambient\"}}";
            default -> null;
        };
    }

    static String foxHeadNbt(FoxEntity fox){
        return switch (fox.getVariant().asString()){
            case "red" ->
                "{SkullOwner:{Id:[I;-360843764,83019,-2060888545,-1667975102],Name:\"Fox\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDdlMDA0MzExMWJjNTcwOTA4NTYyNTkxNTU1NzFjNzkwNmU3MDcwNDZkZjA0MWI4YjU3MjcwNGM0NTFmY2Q4MiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.fox.ambient\"}}";
            case "snow" ->
                    "{SkullOwner:{Id:[I;-1299416143,-1230419589,-1976749208,1994939037],Name:\"Snow Fox\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDE0MzYzNzdlYjRjNGI0ZTM5ZmIwZTFlZDg4OTlmYjYxZWUxODE0YTkxNjliOGQwODcyOWVmMDFkYzg1ZDFiYSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.fox.ambient\"}}";
            default ->
                    null;
        };
    }

    static String frogHeadNbt(FrogEntity frog){
        NbtCompound frogNbt = new NbtCompound();
        frog.writeNbt(frogNbt);
        return switch (frogNbt.getString("variant")) {
            case "minecraft:cold" ->
                    "{SkullOwner:{Id:[I;1664994465,-1240773287,-1850665878,1247178442],Name:\"Cold Frog\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzY4Nzc4OTNlOTIwZmY1ZGZhNGI1ZmJkMTRkYWJlZTJlNjMwOGE2Zjk3YzNhMTliMDhlMjQxYTI5ZWI5YTVjMyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.frog.ambient\"}}";
            case "minecraft:temperate" ->
                    "{SkullOwner:{Id:[I;768473393,-1501871060,-1500614792,590041761],Name:\"Temperate Frog\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTUwZDEwNzNkNDFmMTkzNDA1ZDk1YjFkOTQxZjlmZTFhN2ZmMDgwZTM4MTU1ZDdiYjc4MGJiYmQ4ZTg2ZjcwZCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.frog.ambient\"}}";
            case "minecraft:warm" ->
                    "{SkullOwner:{Id:[I;-660076955,-96384899,-1845147499,-348866620],Name:\"Warm Frog\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDViMGRhNDM5NzViODNjMzMyMjc4OGRkYTMxNzUwNjMzMzg0M2FlYmU1NTEyNzg3Y2IyZTNkNzY5ZWQyYjM4MiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.frog.ambient\"}}";
            default ->
                null;
        };
    }

    static String goatHeadNbt(GoatEntity goat){
        if (goat.isScreaming()){
            return "{SkullOwner:{Id:[I;-794148567,-1946073371,-1420453866,-1100303190],Name:\"Screaming Goat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmRhNDg1YWMyMzUxMjQyMDg5MWE1YWUxZThkZTk4OWYwOTFkODQ4ZDE1YTkwNjhkYTQ3MjBkMzE2ZmM0MzMwZiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.goat.screaming.prepare_ram\"}}";
        }
        return "{SkullOwner:{Id:[I;-511378304,1806060036,-1710884032,2059216206],Name:\"Goat\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODc0NzNlMDU1ZGY2ZTdmZDk4NjY0ZTlmZGI2MzY3NWYwODgxMDYzMDVkNzQ0MDI0YTQxYmIzNTg5MThhMTQyYiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.goat.ambient\"}}";
    }

    static String horseHeadNbt(HorseEntity horse){
        return switch (horse.getVariant().asString()){
            case "white" ->
                "{SkullOwner:{Id:[I;1415911806,1601915664,-1523683596,1983642922],Name:\"White Horse\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzdiYzYxNjA5NzMwZjJjYjAxMDI2OGZhYjA4MjFiZDQ3MzUyNjk5NzUwYTE1MDU5OWYyMWMzZmM0ZTkyNTkxYSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.horse.ambient\"}}";
            case "creamy" ->
                    "{SkullOwner:{Id:[I;-864913760,-788050528,-2055570796,-675897996],Name:\"Creamy Horse\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDJhMGQ1NGNjMDcxMjY3ZDZiZmQ1ZjUyM2Y4Yzg5ZGNmZGM1ZTgwNWZhYmJiNzYwMTBjYjNiZWZhNDY1YWE5NCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.horse.ambient\"}}";
            case "chestnut" ->
                    "{SkullOwner:{Id:[I;-1450249515,-1672984150,-2112709286,12187312],Name:\"Chestnut Horse\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmM4NzIwZDFmNTUyNjkzYjQwYTlhMzNhZmE0MWNlZjA2YWZkMTQyODMzYmVkOWZhNWI4ODdlODhmMDVmNDlmYSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.horse.ambient\"}}";
            case "brown" ->
                    "{SkullOwner:{Id:[I;1630202423,-156548059,-1269130179,1738609424],Name:\"Brown Horse\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjc3MTgwMDc3MGNiNGU4MTRhM2Q5MTE4NmZjZDc5NWVjODJlMDYxMDJmZjdjMWVlNGU1YzM4MDEwMmEwYzcwZiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.horse.ambient\"}}";
            case "black" ->
                    "{SkullOwner:{Id:[I;-569369555,2138852300,-1350415842,1423131134],Name:\"Black Horse\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjcyM2ZhNWJlNmFjMjI5MmE3MjIzMGY1ZmQ3YWI2NjM0OTNiZDhmN2U2NDgxNjQyNGRjNWJmMjRmMTMzODkwYyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.horse.ambient\"}}";
            case "gray" ->
                    "{SkullOwner:{Id:[I;1355895264,1144342879,-1602848783,871687874],Name:\"Gray Horse\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzI1OTg2MTAyMTgxMDgzZmIzMTdiYzU3MTJmNzEwNGRhYTVhM2U4ODkyNjRkZmViYjkxNTlmNmUwOGJhYzkwYyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.horse.ambient\"}}";
            case "dark_brown" ->
                    "{SkullOwner:{Id:[I;-1914263079,-1038857263,-1437450910,-759957551],Name:\"Dark Brown Horse\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2YyMzQxYWFhMGM4MmMyMmJiYzIwNzA2M2UzMTkyOTEwOTdjNTM5YWRhZDlhYTkxM2ViODAwMWIxMWFhNTlkYSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.horse.ambient\"}}";
            default -> null;
        };
    }

    static String llamaHeadNbt(LlamaEntity llama){
        return switch (llama.getVariant().getIndex()){
            case 0 ->
                    "{SkullOwner:{Id:[I;-586532583,-384220532,-1835504180,1097854109],Name:\"Creamy Llama\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ2N2ZkNGJmZjI5MzI2OWNiOTA4OTc0ZGNhODNjMzM0ODVlNDM1ZWQ1YThlMWRiZDY1MjFjNjE2ODcxNDAifX19\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.llama.ambient\"}}";
            case 1 ->
                    "{SkullOwner:{Id:[I;1624738111,-1238087496,-1922109313,-1588637419],Name:\"White Llama\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODAyNzdlNmIzZDlmNzgxOWVmYzdkYTRiNDI3NDVmN2FiOWE2M2JhOGYzNmQ2Yjg0YTdhMjUwYzZkMWEzNThlYiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.llama.ambient\"}}";
            case 2 ->
                    "{SkullOwner:{Id:[I;1979386085,605636346,-1089906890,557380148],Name:\"Brown Llama\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJiMWVjZmY3N2ZmZTNiNTAzYzMwYTU0OGViMjNhMWEwOGZhMjZmZDY3Y2RmZjM4OTg1NWQ3NDkyMTM2OCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.llama.ambient\"}}";
            case 3 ->
                    "{SkullOwner:{Id:[I;-305497587,1997489110,-1879247200,244638839],Name:\"Gray Llama\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2YyNGU1NmZkOWZmZDcxMzNkYTZkMWYzZTJmNDU1OTUyYjFkYTQ2MjY4NmY3NTNjNTk3ZWU4MjI5OWEifX19\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.llama.ambient\"}}";
            default -> null;
        };
    }

    static String mooshroomHeadNbt(MooshroomEntity mooshroom){
        return switch (mooshroom.getVariant().asString()){
            case "red" ->
                    "{SkullOwner:{Id:[I;-1043345433,-1915205024,-1319783024,1345020847],Name:\"Red Mooshroom\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGE4MDYwNmU4MmM2NDJmMTQxNTg3NzMzZTMxODBhZTU3ZjY0NjQ0MmM5ZmZmZDRlNTk5NzQ1N2UzNDMxMWEyOSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cow.ambient\"}}";
            case "brown" ->
                    "{SkullOwner:{Id:[I;1343259795,-414497460,-2098198200,-2128852243],Name:\"Brown Mooshroom\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2U2NDY2MzAyYTVhYjQzOThiNGU0NzczNDk4MDhlNWQ5NDAyZWEzYWQ4ZmM0MmUyNDQ2ZTRiZWQwYTVlZDVlIn19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.cow.ambient\"}}";
            default -> null;
        };
    }

    static String pandaHeadNbt(PandaEntity panda){
        return switch (panda.getMainGene()){
            case AGGRESSIVE ->
                    "{SkullOwner:{Id:[I;812216692,-1691270628,-1132790931,1623898990],Name:\"Aggressive Panda\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTU0NmU0MzZkMTY2YjE3ZjA1MjFiZDg1MzhlYTEzY2Q2ZWUzYjVkZjEwMmViMzJlM2U0MjVjYjI4NWQ0NDA2MyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.panda.aggressive_ambient\"}}";
            case LAZY ->
                    "{SkullOwner:{Id:[I;-1528953800,626869358,-2040989171,412588151],Name:\"Lazy Panda\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTg3ZjFmNWRiMmUyNGRmNGRhYWVkNDY4NWQ2YWVlNWRlYjdjZGQwMjk2MzBmMDA3OWMxZjhlMWY5NzQxYWNmZCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.panda.ambient\"}}";
            case PLAYFUL ->
                    "{SkullOwner:{Id:[I;1832623614,-1641593378,-1971230058,795229187],Name:\"Playful Panda\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNhZGQ0YmYzYzRjYWNlOTE2NjgwZTFmZWY5MGI1ZDE2YWQ2NjQzOTUxNzI1NjY4YmE2YjQ5OTZiNjljYTE0MCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.panda.ambient\"}}";
            case WORRIED ->
                    "{SkullOwner:{Id:[I;-1569837977,-494778765,-1909323364,780139674],Name:\"Worried Panda\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI4NmZkMWJmOGNiY2UyM2JjMDhmYjkwNjkxNzE3NjExYWRkYzg1YWI4MjNiNzcxNGFlYzk4YTU2NjBlZmYxNSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.panda.worried_ambient\"}}";
            default -> {
                    if (panda.getMainGene() == PandaEntity.Gene.BROWN && panda.getHiddenGene() == PandaEntity.Gene.BROWN) {
                        yield "{SkullOwner:{Id:[I;-1566316321,-1140045089,-2088034968,2056398888],Name:\"Brown Panda\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQ1ZjZkNjEyNjcyODY3MWI0NGMxYzc3NWY5OTYxNzQyNGUzMzYxMWI1ZDMxYWQyYWNmZjI4MDRlYjk2ZWIwNiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.panda.ambient\"}}";
                    }
                    if (panda.getMainGene() == PandaEntity.Gene.WEAK && panda.getHiddenGene() == PandaEntity.Gene.WEAK) {
                        yield "{SkullOwner:{Id:[I;-957160100,-268943190,-1936714442,-1856692735],Name:\"Weak Panda\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2M1NmEzNTVmYmUwZTJmYmQyOGU4NWM0ZDgxNWZmYTVkMWY5ZDVmODc5OGRiYzI1OWZmODhjNGFkZGIyMDJhZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.panda.sneeze\"}}";
                    }
                    yield "{SkullOwner:{Id:[I;-652176701,1253853427,-1523590946,1843710337],Name:\"Panda\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTlkZjQ3ZTAxNWQ1YzFjNjhkNzJiZTExYmI2NTYzODBmYzZkYjUzM2FhYjM4OTQxYTkxYjFkM2Q1ZTM5NjQ5NyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.panda.ambient\"}}";
            }
        };
    }

    static String parrotHeadNbt(ParrotEntity parrot){
        return switch (parrot.getVariant().getId()){
            case 0 ->
                    "{SkullOwner:{Id:[I;115730555,1410550917,-1945091386,-821504775],Name:\"Red Parrot\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBhM2Q0N2Y1NGU3MWE1OGJmOGY1N2M1MjUzZmIyZDIxM2Y0ZjU1YmI3OTM0YTE5MTA0YmZiOTRlZGM3NmVhYSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.parrot.ambient\"}}";
            case 1 ->
                    "{SkullOwner:{Id:[I;-1591962916,-688305264,-1779076897,229311782],Name:\"Blue Parrot\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjk0YmQzZmNmNGQ0NjM1NGVkZThmZWY3MzEyNmRiY2FiNTJiMzAxYTFjOGMyM2I2Y2RmYzEyZDYxMmI2MWJlYSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.parrot.ambient\"}}";
            case 2 ->
                    "{SkullOwner:{Id:[I;341076148,164905100,-1973177163,1184145867],Name:\"Green Parrot\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmExZGMzMzExNTIzMmY4MDA4MjVjYWM5ZTNkOWVkMDNmYzE4YWU1NTNjMjViODA1OTUxMzAwMGM1OWUzNTRmZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.parrot.ambient\"}}";
            case 3 ->
                    "{SkullOwner:{Id:[I;-897575079,1202538514,-2134639547,1599715494],Name:\"Light Blue Parrot\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzI2OGNlMzdiZTg1MDdlZDY3ZTNkNDBiNjE3ZTJkNzJmNjZmOWQyMGIxMDZlZmIwOGU2YmEwNDFmOWI5ZWYxMCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.parrot.ambient\"}}";
            case 4 ->
                    "{SkullOwner:{Id:[I;-1013000136,-198229486,-2112536545,-1273944051],Name:\"Gray Parrot\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFiZTcyM2FhMTczOTNkOTlkYWRkYzExOWM5OGIyYzc5YzU0YjM1ZGViZTA1YzcxMzhlZGViOGQwMjU2ZGM0NiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.parrot.ambient\"}}";
            default -> null;
        };
    }

    static String rabbitHeadNbt(RabbitEntity rabbit){
        if (rabbit.hasCustomName()){
            if (Text.literal("Toast").equals(rabbit.getCustomName()) || "Toast".equals(rabbit.getCustomName().getLiteralString())){
                return "{SkullOwner:{Id:[I;-1641248077,1046954686,-1366358770,-929771023],Name:\"Toast\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTFhNTdjM2QwYTliMTBlMTNmNjZkZjc0MjAwY2I4YTZkNDg0YzY3MjIyNjgxMmQ3NGUyNWY2YzAyNzQxMDYxNiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.rabbit.ambient\"}}";
            }
        }
        return switch (rabbit.getVariant().getId()){
            case 0 ->
                    "{SkullOwner:{Id:[I;-1787791594,-1480439999,-1150286986,485591162],Name:\"Brown Rabbit\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2ZkNGY4NmNmNzQ3M2ZiYWU5M2IxZTA5MDQ4OWI2NGMwYmUxMjZjN2JiMTZmZmM4OGMwMDI0NDdkNWM3Mjc5NSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.rabbit.ambient\"}}";
            case 1 ->
                    "{SkullOwner:{Id:[I;310960422,1105020424,-1291548968,1147459044],Name:\"White Rabbit\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTU0MmQ3MTYwOTg3MTQ4YTVkOGUyMGU0NjliZDliM2MyYTM5NDZjN2ZiNTkyM2Y1NWI5YmVhZTk5MTg1ZiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.rabbit.ambient\"}}";
            case 2 ->
                    "{SkullOwner:{Id:[I;1418904787,-1255911947,-1838736568,-396062239],Name:\"Black Rabbit\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJiNDI1ZmYyYTIzNmFiMTljYzkzOTcxOTVkYjQwZjhmMTg1YjE5MWM0MGJmNDRiMjZlOTVlYWM5ZmI1ZWZhMyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.rabbit.ambient\"}}";
            case 3 ->
                    "{SkullOwner:{Id:[I;-624883408,-1394127810,-1451784718,2132385809],Name:\"Black and White Rabbit\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzVmNzJhMjE5NWViZjQxMTdjNTA1NmNmZTJiNzM1N2VjNWJmODMyZWRlMTg1NmE3NzczZWU0MmEwZDBmYjNmMCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.rabbit.ambient\"}}";
            case 4 ->
                    "{SkullOwner:{Id:[I;-2019255070,-67550231,-1591702539,-1889687886],Name:\"Gold Rabbit\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzY3YjcyMjY1NmZkZWVjMzk5NzRkMzM5NWM1ZTE4YjQ3YzVlMjM3YmNlNWJiY2VkOWI3NTUzYWExNGI1NDU4NyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.rabbit.ambient\"}}";
            case 5 ->
                    "{SkullOwner:{Id:[I;2137683371,809060187,-1913095354,-1103751952],Name:\"Salt and Pepper Rabbit\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTIzODUxOWZmMzk4MTViMTZjNDA2MjgyM2U0MzE2MWZmYWFjOTY4OTRmZTA4OGIwMThlNmEyNGMyNmUxODFlYyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.rabbit.ambient\"}}";
            case 99 ->
                    "{SkullOwner:{Id:[I;786103411,-187218169,-1254981543,-1015463336],Name:\"The Killer Bunny\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFkZDc2NzkyOWVmMmZkMmQ0M2U4NmU4NzQ0YzRiMGQ4MTA4NTM0NzEyMDFmMmRmYTE4Zjk2YTY3ZGU1NmUyZiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.rabbit.attack\"}}";
            default -> null;
        };
    }

    static String sheepHeadNbt(SheepEntity sheep){
        if (sheep.hasCustomName()){
            if (Text.literal("jeb_").equals(sheep.getCustomName()) || "jeb_".equals(sheep.getCustomName().getLiteralString())){
                return "{SkullOwner:{Id:[I;1047621714,615532832,-1644674494,-748521845],Name:\"jeb_ Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjMzMzI2NzY1YTE5MGViZjkwZDU0ODZkNzFmMjBlMjU5N2U0YmVlMmEzOTFmZWNiYmQ4MGRlYmZlMWY4MmQ3OCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.shear\"}}";
            }
        }
        return switch (sheep.getColor()){
            case BLACK ->
                    "{SkullOwner:{Id:[I;-1067827748,-1531689024,-1996762374,-1760412468],Name:\"Black Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTMzMzVlODA2NWM3YjVkZmVhNThkM2RmNzQ3NGYzOTZhZjRmYTBhMmJhNTJhM2M5YjdmYmE2ODMxOTI3MWM5MSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case BLUE ->
                    "{SkullOwner:{Id:[I;35067668,152850181,-2055683214,-1643148636],Name:\"Blue Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzQwZTI3N2RhNmMzOThiNzQ5YTMyZjlkMDgwZjFjZjRjNGVmM2YxZjIwZGQ5ZTVmNDIyNTA5ZTdmZjU5M2MwIn19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case BROWN ->
                    "{SkullOwner:{Id:[I;-319982265,-381271998,-1214398175,-1898689453],Name:\"Brown Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzEyOGQwODZiYzgxNjY5ZmMyMjU1YmIyMmNhZGM2NmEwZjVlZDcwODg1ZTg0YzMyZDM3YzFiNDg0ZGIzNTkwMSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case CYAN ->
                    "{SkullOwner:{Id:[I;-610664437,-297646773,-1522887944,-1496580530],Name:\"Cyan Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWQ0MmZjYmNhZjlkNDhmNzNmZmIwYzNjMzZmMzRiNDY0MzI5NWY2ZGFhNmNjNzRhYjlkMjQyZWQ1YWE1NjM2In19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case GRAY ->
                    "{SkullOwner:{Id:[I;-1722503086,69357176,-1410876840,1613265857],Name:\"Gray Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2ZhZmVjZjA2MDNiMmRjZDc5ODRkMjUyNTg2MDY5ODk1ZGI5YWE3OGUxODQxYmQ1NTRiMTk1MDhkY2Y5NjdhMSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case GREEN ->
                    "{SkullOwner:{Id:[I;731104223,613632743,-1340680185,2064832692],Name:\"Green Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWVhODg3ZWFlNGIwNzYzNmU5ZTJmOTA2NjA5YjAwYWI4ZDliODZiNzQ3MjhiODE5ZmY2ZjM3NjU4M2VhMTM5In19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case LIGHT_BLUE ->
                    "{SkullOwner:{Id:[I;1363466330,1339703551,-1611029030,1799093499],Name:\"Light Blue Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWJmMjNhZjg3MTljNDM3YjNlZTg0MDE5YmEzYzllNjljYTg1NGQzYThhZmQ1Y2JhNmQ5Njk2YzA1M2I0ODYxNCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case LIGHT_GRAY ->
                    "{SkullOwner:{Id:[I;1750550694,1826508326,-1524837646,254098541],Name:\"Light Gray Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQyZTJlOTNhMTQyYmZkNDNmMjQwZDM3ZGU4ZjliMDk3NmU3NmU2NWIyMjY1MTkwODI1OWU0NmRiNzcwZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case LIME ->
                    "{SkullOwner:{Id:[I;1287435907,-218808040,-1343748755,-967007072],Name:\"Lime Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmJlYWQwMzQyYWU4OWI4ZGZkM2Q3MTFhNjBhZGQ2NWUyYzJiZmVhOGQwYmQyNzRhNzU4N2RlZWQ3YTMxODkyZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case MAGENTA ->
                    "{SkullOwner:{Id:[I;1295070073,749946091,-1420404987,1810598465],Name:\"Magenta Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYThlMWYwNWYwZGFjY2E2M2E3MzE4NzRmOTBhNjkzZmZlMjFmZjgzMmUyYjFlMWQwN2I2NWM4NzY0NTI2ZjA4OSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case ORANGE ->
                    "{SkullOwner:{Id:[I;-1659364310,-1226226116,-1693897344,-2097332172],Name:\"Orange Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjY4NGQwNGZhODBhYTU5ZGExNDUzNWRlYWQzODgzZDA5N2ZiYmE0MDA2MjU2NTlmNTI1OTk2NDgwNmJhNjZmMCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case PINK ->
                    "{SkullOwner:{Id:[I;-305810543,789856627,-1293793230,-575937365],Name:\"Pink Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjM2M2U4YTkzZDI4N2E4NGU2NDAzMDlhZTgzY2ExZGUwYTBiMjU3NTA1YTIwZWM1NWIzMzQ5ZDQwYTQ0ODU0In19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case PURPLE ->
                    "{SkullOwner:{Id:[I;-996311885,-1057339452,-1663293651,-449905612],Name:\"Purple Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ0OWQwODI5MWRhZTQ1YTI0NjczNjE5NjAyZjQzNWI1N2Y0Y2Q0ZTllOThkMmUwZmJlYzRmMTgxNDQ3ODFkMyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case RED ->
                    "{SkullOwner:{Id:[I;-1931790612,1757564302,-1613542270,1303824883],Name:\"Red Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTQ3OGUwNTcxNThkZTZmNDVlMjU0MWNkMTc3ODhlNjQwY2NiNTk3MjNkZTU5YzI1NGU4MmFiNTcxMWYzZmMyNyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.evoker.prepare_wololo\"}}";
            case WHITE ->
                    "{SkullOwner:{Id:[I;1709416521,-1703654120,-1943757901,990313825],Name:\"White Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmRmZTdjYzQ2ZDc0OWIxNTMyNjFjMWRjMTFhYmJmMmEzMTA4ZWExYmEwYjI2NTAyODBlZWQxNTkyZGNmYzc1YiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            case YELLOW ->
                    "{SkullOwner:{Id:[I;-538769203,-68924429,-1873938686,-788513363],Name:\"Yellow Sheep\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRiMjhmMDM1NzM1OTA2ZjgyZmZjNGRiYTk5YzlmMGI1NTI0MGU0MjZjZDFjNTI1YTlhYTc3MTgwZWVjNDkzNCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.sheep.ambient\"}}";
            default ->
                null;
        };
    }

    static String striderHeadNbt(StriderEntity strider){
        if(strider.isCold()){
            return "{SkullOwner:{Id:[I;-666642686,-1702084198,-2133468564,1369620486],Name:\"Cold Strider\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjcxMzA4NWE1NzUyN2U0NTQ1OWMzOGZhYTdiYjkxY2FiYjM4MWRmMzFjZjJiZjc5ZDY3YTA3MTU2YjZjMjMwOSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.strider.ambient\"}}";
        }
        return "{SkullOwner:{Id:[I;-1612828497,1048134459,-1263554916,-987034474],Name:\"Strider\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWM0MGZhZDFjMTFkZTllNjQyMmI0MDU0MjZlOWI5NzkwN2YzNWJjZTM0NWUzNzU4NjA0ZDNlN2JlN2RmODg0In19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.strider.happy\"}}";
    }

    static String traderLlamaHeadNbt(TraderLlamaEntity llama){
        return switch (llama.getVariant().getIndex()){
            case 0 ->
                    "{SkullOwner:{Id:[I;-1193140515,-1034205581,-1778227599,8343688],Name:\"Creamy Trader Llama\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTg5YTJlYjE3NzA1ZmU3MTU0YWIwNDFlNWM3NmEwOGQ0MTU0NmEzMWJhMjBlYTMwNjBlM2VjOGVkYzEwNDEyYyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.llama.ambient\"}}";
            case 1 ->
                    "{SkullOwner:{Id:[I;1205590709,274678460,-1786722788,-292408845],Name:\"White Trader Llama\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzA4N2E1NTZkNGZmYTk1ZWNkMjg0NGYzNTBkYzQzZTI1NGU1ZDUzNWZhNTk2ZjU0MGQ3ZTc3ZmE2N2RmNDY5NiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.llama.ambient\"}}";
            case 2 ->
                    "{SkullOwner:{Id:[I;-1453867496,843729284,-1474562730,-1483495862],Name:\"Brown Trader Llama\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQyNDc4MGIzYzVjNTM1MWNmNDlmYjViZjQxZmNiMjg5NDkxZGY2YzQzMDY4M2M4NGQ3ODQ2MTg4ZGI0Zjg0ZCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.llama.ambient\"}}";
            case 3 ->
                    "{SkullOwner:{Id:[I;884980779,1817790431,-1930005417,-1391126950],Name:\"Gray Trader Llama\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmU0ZDhhMGJjMTVmMjM5OTIxZWZkOGJlMzQ4MGJhNzdhOThlZTdkOWNlMDA3MjhjMGQ3MzNmMGEyZDYxNGQxNiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.llama.ambient\"}}";
            default -> null;
        };
    }

    static String vexHeadNbt(VexEntity vex){
        if (vex.age % 2 == 0){
            return "{SkullOwner:{Id:[I;-20863080,-1413462456,-1706164864,-564581925],Name:\"Vex\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjk1MzhmMjgzMGM0ZGVhNjk5NmVkNzQ0Nzg1NTA0ZTMyZTBlMjBkODY2M2VkYWI2YjAyMjJmMmMwMjIwNzdiZCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.vex.ambient\"}}";
        }
        return "{SkullOwner:{Id:[I;-2123787134,1975798505,-1602251928,-1627362110],Name:\"Vex\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGE0ZTUxOGUxNmU0YjVjMTE0YWNiZDljNjFjZDE4MjkyZGE5ZWY2MDU1MGE0ZmNhZTI3ZDM5YWUyOTNlNDc3YSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.vex.charge\"}}";
    }

    static String villagerHeadNbt(VillagerEntity villager){
        VillagerProfession profession = villager.getVillagerData().getProfession();
        return switch (profession.toString()){
            case "armorer" ->
                    "{SkullOwner:{Id:[I;-1627151347,-1285404754,-1966464448,95988217],Name:\"Armorer Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWVmNjI3ZjU2NmFjMGE3ODI4YmFkOTNlOWU0Yjk2NDNkOTlhOTI4YTEzZDVmOTc3YmY0NDFlNDBkYjEzMzZiZiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "butcher" ->
                    "{SkullOwner:{Id:[I;-1958848492,-1136704916,-1204946794,981552340],Name:\"Butcher Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTFiYWQ2NDE4NWUwNGJmMWRhZmUzZGE4NDkzM2QwMjU0NWVhNGE2MzIyMWExMGQwZjA3NzU5MTc5MTEyYmRjMiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "cartographer" ->
                    "{SkullOwner:{Id:[I;-1530336204,127485113,-1129389748,648352210],Name:\"Cartographer Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTNhZWNmYmU4MDFjZjMyYjVkMWIwYjFmNjY4MDA0OTY2NjE1ODY3OGM1M2Y0YTY1MWZjODNlMGRmOWQzNzM4YiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "cleric" ->
                    "{SkullOwner:{Id:[I;-1449678884,1755333049,-1266768369,1645723165],Name:\"Cleric Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWI5ZTU4MmUyZjliODlkNTU2ZTc5YzQ2OTdmNzA2YjFkZDQ5MjllY2FlM2MwN2VlOTBiZjFkNWJlMzE5YmY2ZiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "farmer" ->
                    "{SkullOwner:{Id:[I;-1942451583,-1297792036,-1269674622,558190098],Name:\"Farmer Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDkyNzJkMDNjZGE2MjkwZTRkOTI1YTdlODUwYTc0NWU3MTFmZTU3NjBmNmYwNmY5M2Q5MmI4ZjhjNzM5ZGIwNyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "fisherman" ->
                    "{SkullOwner:{Id:[I;-1558427898,-80395654,-1539972253,-1897275374],Name:\"Fisherman Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDE4OWZiNGFjZDE1ZDczZmYyYTU4YTg4ZGYwNDY2YWQ5ZjRjMTU0YTIwMDhlNWM2MjY1ZDVjMmYwN2QzOTM3NiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "fletcher" ->
                    "{SkullOwner:{Id:[I;1972188752,1038437151,-1255133373,-1723054561],Name:\"Fletcher Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmY2MTFmMTJlMThjZTQ0YTU3MjM4ZWVmMWNhZTAzY2Q5ZjczMGE3YTQ1ZTBlYzI0OGYxNGNlODRlOWM0ODA1NiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "leatherworker" ->
                    "{SkullOwner:{Id:[I;1445316252,2041728101,-1840993025,-322242010],Name:\"Leatherworker Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "librarian" ->
                    "{SkullOwner:{Id:[I;2047317031,960709978,-1246891731,-1197134412],Name:\"Librarian Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2RjYWE1NzRiYWJiNDBlZTBmYTgzZjJmZDVlYTIwY2ZmMzFmZmEyNzJmZTExMzU4OGNlZWU0Njk2ODIxMjhlNyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "mason" ->
                    "{SkullOwner:{Id:[I;1445316252,2041728101,-1840993025,-322242010],Name:\"Mason Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "nitwit" ->
                    "{SkullOwner:{Id:[I;1445316252,2041728101,-1840993025,-322242010],Name:\"Nitwit Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "shepherd" ->
                    "{SkullOwner:{Id:[I;-1872621004,-1520941095,-1386917366,898929216],Name:\"Shepherd Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFiZjRlOTE1NGFjOTI3MTk0MWM3MzNlYWNjNjJkYzlmYzBhNmRjMWI1ZDY3Yzc4Y2E5OGFmYjVjYjFiZTliMiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "toolsmith" ->
                    "{SkullOwner:{Id:[I;1445316252,2041728101,-1840993025,-322242010],Name:\"Toolsmith Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            case "weaponsmith" ->
                    "{SkullOwner:{Id:[I;-1988786943,-471251346,-2084795059,-456600256],Name:\"Weaponsmith Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQ3NmZmYTQxMGJiZTdmYTcwOTA5OTY1YTEyNWY0YTRlOWE0ZmIxY2UxYjhiM2MzNGJmYjczYWFmZmQ0Y2U0MyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
            default ->
                    "{SkullOwner:{Id:[I;1445316252,2041728101,-1840993025,-322242010],Name:\"Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUwZTk1OTFlMTFhYWVmNGMyYzUxZDlhYzY5NTE0ZTM0MDQ4NWRlZmNjMmMxMmMzOGNkMTIzODZjMmVjNmI3OCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.villager.ambient\"}}";
        };

    }

    static String witherHeadNbt(WitherEntity wither){
        return switch (wither.age % 4){
            case 0 ->
                    "{SkullOwner:{Id:[I;178681563,-997636041,-1221372488,-1760242442],Name:\"Wither Projectile\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjM3YzU4MTRhOTJmOGVjMGY2YWU5OTMzYWJlOTU0MmUxNjUxOTA3NjhlNzYwNDc4NTQzYWViZWVkNDAyN2MyNyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.wither.shoot\"}}";
            case 1 ->
                    "{SkullOwner:{Id:[I;-1907584814,-692829797,-1460246851,-1397511329],Name:\"Blue Wither Projectile\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDM2ODJiMDYyMDNiOWRlNGMyODU0MTA3MWEyNmNkYzM0MGRkMjVkNGMzNzJiNzAyM2VjMmY0MTIwMjFkNjJmNyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.wither.shoot\"}}";
            default ->
                    "{SkullOwner:{Id:[I;-2046605516,-121224030,-1660948409,-623704172],Name:\"Wither\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWRhMTA4MjhmNjNiN2VjZGVmZDc2N2IzMjQ1ZmJkYWExM2MzZWMwYzZiMTM3NzRmMWVlOGQzMDdjMDM0YzM4MyJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.wither.ambient\"}}";

        };
    }

    static String wolfHeadNbt(WolfEntity wolf){
        if (wolf.hasAngerTime())
            return "{SkullOwner:{Id:[I;-778701493,-2072295514,-1975288126,203552561],Name:\"Angry Wolf\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQxYWE3ZTNiOTU2NGIzODQ2ZjFkZWExNGYxYjFjY2JmMzk5YmJiMjNiOTUyZGJkN2VlYzQxODAyYTI4OWM5NiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.wolf.growl\"}}";
        return "{SkullOwner:{Id:[I;331091154,-831306847,-1792330377,780116157],Name:\"Wolf\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY0MzlhNDNlNTY4NzAwODgxNWEyZGQxZmY0YTEzNGMxMjIyMWI3ODIzMzY2NzhiOTc5YWQxM2RjZTM5NjY1ZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.wolf.ambient\"}}";
    }

    static String zombieVillagerHeadNbt(ZombieVillagerEntity zombieVillagerEntity){
        VillagerProfession profession = zombieVillagerEntity.getVillagerData().getProfession();
        return switch (profession.toString()){
            case "armorer" ->
                    "{SkullOwner:{Id:[I;2096843698,839205627,-1344900867,1477425317],Name:\"Zombie Armorer\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzg2NzllMDM0NzY3ZDUxODY2MGQ5NDE2ZGM1ZWFmMzE5ZDY5NzY4MmFjNDBjODg2ZTNjMmJjOGRmYTFkZTFkIn19fQ==\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "butcher" ->
                    "{SkullOwner:{Id:[I;1815714177,-1845539437,-1299985766,-249396350],Name:\"Zombie Butcher\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWNjZThkNmNlNDEyNGNlYzNlODRhODUyZTcwZjUwMjkzZjI0NGRkYzllZTg1NzhmN2Q2ZDg5MjllMTZiYWQ2OSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "cartographer" ->
                    "{SkullOwner:{Id:[I;-1100180737,-40612522,-1177935632,84884289],Name:\"Zombie Cartographer\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTYwODAwYjAxMDEyZTk2M2U3YzIwYzhiYTE0YjcwYTAyNjRkMTQ2YTg1MGRlZmZiY2E3YmZlNTEyZjRjYjIzZCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "cleric" ->
                    "{SkullOwner:{Id:[I;648641787,1287409525,-1203270335,538623305],Name:\"Zombie Cleric\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjk1ODU3OGJlMGUxMjE3MjczNGE3ODI0MmRhYjE0OTY0YWJjODVhYjliNTk2MzYxZjdjNWRhZjhmMTRhMGZlYiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "farmer" ->
                    "{SkullOwner:{Id:[I;1184252343,-325498270,-1248344102,-2059244882],Name:\"Zombie Farmer\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjc3ZDQxNWY5YmFhNGZhNGI1ZTA1OGY1YjgxYmY3ZjAwM2IwYTJjOTBhNDgzMWU1M2E3ZGJjMDk4NDFjNTUxMSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "fisherman" ->
                    "{SkullOwner:{Id:[I;403833101,-476951492,-1268224880,1726114843],Name:\"Zombie Fisherman\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjkwNWQ1M2ZlNGZhZWIwYjMxNWE2ODc4YzlhYjgxYjRiZTUyYzMxY2Q0NzhjMDI3ZjBkN2VjZTlmNmRhODkxNCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "fletcher" ->
                    "{SkullOwner:{Id:[I;2099295440,96552589,-1593973544,1732222062],Name:\"Zombie Fletcher\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmVhMjZhYzBlMjU0OThhZGFkYTRlY2VhNThiYjRlNzZkYTMyZDVjYTJkZTMwN2VmZTVlNDIxOGZiN2M1ZWY4OSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "leatherworker" ->
                    "{SkullOwner:{Id:[I;-2018152173,-657829980,-2112558488,-1763520945],Name:\"Zombie Leatherworker\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1NTJjOTBmMjEyZTg1NWQxMjI1NWQ1Y2Q2MmVkMzhiOWNkN2UzMGU3M2YwZWE3NzlkMTc2NDMzMGU2OTI2NCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "librarian" ->
                    "{SkullOwner:{Id:[I;543806214,-1390195783,-1496262174,-176728090],Name:\"Zombie Librarian\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIyMTFhMWY0MDljY2E0MjQ5YzcwZDIwY2E4MDM5OWZhNDg0NGVhNDE3NDU4YmU5ODhjYzIxZWI0Nzk3Mzc1ZSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "mason" ->
                    "{SkullOwner:{Id:[I;-2018152173,-657829980,-2112558488,-1763520945],Name:\"Zombie Mason\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1NTJjOTBmMjEyZTg1NWQxMjI1NWQ1Y2Q2MmVkMzhiOWNkN2UzMGU3M2YwZWE3NzlkMTc2NDMzMGU2OTI2NCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "nitwit" ->
                    "{SkullOwner:{Id:[I;-2018152173,-657829980,-2112558488,-1763520945],Name:\"Zombie Nitwit\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1NTJjOTBmMjEyZTg1NWQxMjI1NWQ1Y2Q2MmVkMzhiOWNkN2UzMGU3M2YwZWE3NzlkMTc2NDMzMGU2OTI2NCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "shepherd" ->
                    "{SkullOwner:{Id:[I;1207380466,-1608759608,-1741978926,-1403436161],Name:\"Zombie Shepherd\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjkxMzkxYmVmM2E0NmVmMjY3ZDNiNzE3MTA4NmJhNGM4ZDE3ZjJhNmIwZjgzZmEyYWMzMGVmZTkxNGI3YzI0OSJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "toolsmith" ->
                    "{SkullOwner:{Id:[I;-2018152173,-657829980,-2112558488,-1763520945],Name:\"Zombie Toolsmith\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1NTJjOTBmMjEyZTg1NWQxMjI1NWQ1Y2Q2MmVkMzhiOWNkN2UzMGU3M2YwZWE3NzlkMTc2NDMzMGU2OTI2NCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            case "weaponsmith" ->
                    "{SkullOwner:{Id:[I;-1844572353,-185316455,-1901309798,-1756753005],Name:\"Zombie Weaponsmith\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDM3MDg5NGI1Y2MzMDVkODdhYTA4YzNiNGIwODU4N2RiNjhmZjI5ZTdhM2VmMzU0Y2FkNmFiY2E1MGU1NTI4YiJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
            default ->
                    "{SkullOwner:{Id:[I;-2018152173,-657829980,-2112558488,-1763520945],Name:\"Zombie Villager\",Properties:{textures:[{Value:\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI1NTJjOTBmMjEyZTg1NWQxMjI1NWQ1Y2Q2MmVkMzhiOWNkN2UzMGU3M2YwZWE3NzlkMTc2NDMzMGU2OTI2NCJ9fX0=\"}]}},BlockEntityTag:{note_block_sound:\"minecraft:entity.zombie_villager.ambient\"}}";
        };

    }
}
