package net.ospreymods.mp.procedures;

import net.ospreymods.mp.MpModVariables;
import net.ospreymods.mp.MpModElements;

import net.minecraft.entity.Entity;

import java.util.Map;

@MpModElements.ModElement.Tag
public class EnderStaffFindPositionProcedure extends MpModElements.ModElement {
	public EnderStaffFindPositionProcedure(MpModElements instance) {
		super(instance, 73);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure EnderStaffFindPosition!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = (double) (entity.getPosX());
			entity.getCapability(MpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerX = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) (entity.getPosY());
			entity.getCapability(MpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerY = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) (entity.getPosZ());
			entity.getCapability(MpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerZ = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
