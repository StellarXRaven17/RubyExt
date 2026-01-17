/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubyext.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.rubyext.RubyextMod;

public class RubyextModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RubyextMod.MODID);
	public static final RegistryObject<SoundEvent> BLOCK_WATER_LILY_INFUSE = REGISTRY.register("block.water_lily.infuse", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("rubyext", "block.water_lily.infuse")));
}