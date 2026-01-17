package net.mcreator.rubyext.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class WaterLilyHealProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("lilyHealTimer") == 0) {
			entity.getPersistentData().putDouble("lilyHealTimer", 20);
		} else {
			entity.getPersistentData().putDouble("lilyHealTimer", (entity.getPersistentData().getDouble("lilyHealTimer") - 1));
		}
		if (entity.getPersistentData().getDouble("lilyHealTimer") == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1);
		}
	}
}