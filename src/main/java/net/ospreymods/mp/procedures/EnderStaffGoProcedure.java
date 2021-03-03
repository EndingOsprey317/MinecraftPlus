package net.ospreymods.mp.procedures;

import net.ospreymods.mp.MpModElements;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

@MpModElements.ModElement.Tag
public class EnderStaffGoProcedure extends MpModElements.ModElement {
	public EnderStaffGoProcedure(MpModElements instance) {
		super(instance, 72);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure EnderStaffGo!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				System.err.println("Failed to load dependency guistate for procedure EnderStaffGo!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(new Object() {
				int convert(String s) {
					try {
						return Integer.parseInt(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert((new Object() {
				public String getText() {
					TextFieldWidget textField = (TextFieldWidget) guistate.get("text:X_Location");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText())), new Object() {
				int convert(String s) {
					try {
						return Integer.parseInt(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert((new Object() {
				public String getText() {
					TextFieldWidget textField = (TextFieldWidget) guistate.get("text:Y_Location");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText())), new Object() {
				int convert(String s) {
					try {
						return Integer.parseInt(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert((new Object() {
				public String getText() {
					TextFieldWidget textField = (TextFieldWidget) guistate.get("text:Z_Location");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText())));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(new Object() {
					int convert(String s) {
						try {
							return Integer.parseInt(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((new Object() {
					public String getText() {
						TextFieldWidget textField = (TextFieldWidget) guistate.get("text:X_Location");
						if (textField != null) {
							return textField.getText();
						}
						return "";
					}
				}.getText())), new Object() {
					int convert(String s) {
						try {
							return Integer.parseInt(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((new Object() {
					public String getText() {
						TextFieldWidget textField = (TextFieldWidget) guistate.get("text:Y_Location");
						if (textField != null) {
							return textField.getText();
						}
						return "";
					}
				}.getText())), new Object() {
					int convert(String s) {
						try {
							return Integer.parseInt(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((new Object() {
					public String getText() {
						TextFieldWidget textField = (TextFieldWidget) guistate.get("text:Z_Location");
						if (textField != null) {
							return textField.getText();
						}
						return "";
					}
				}.getText())), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
	}
}
