package net.ospreymods.mp.procedures;

import net.ospreymods.mp.MpModVariables;
import net.ospreymods.mp.MpModElements;

import net.minecraft.entity.Entity;

import java.util.Map;

@MpModElements.ModElement.Tag
public class SetSquashesTo0Procedure extends MpModElements.ModElement {
	public SetSquashesTo0Procedure(MpModElements instance) {
		super(instance, 131);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SetSquashesTo0!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = (double) 0;
			entity.getCapability(MpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Squashes = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
