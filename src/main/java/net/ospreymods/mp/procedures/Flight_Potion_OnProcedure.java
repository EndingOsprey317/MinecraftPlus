package net.ospreymods.mp.procedures;

import net.ospreymods.mp.MpModElements;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@MpModElements.ModElement.Tag
public class Flight_Potion_OnProcedure extends MpModElements.ModElement {
	public Flight_Potion_OnProcedure(MpModElements instance) {
		super(instance, 96);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Flight_Potion_On!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.allowFlying = (0 == 0);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
	}
}
