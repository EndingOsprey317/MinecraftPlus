
package net.ospreymods.mp.itemgroup;

import net.ospreymods.mp.item.Magicite_SwordItem;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MpModElements.ModElement.Tag
public class MinecraftPlusTabCombatAndToolsItemGroup extends MpModElements.ModElement {
	public MinecraftPlusTabCombatAndToolsItemGroup(MpModElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabminecraft_plus_tab_combat_and_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Magicite_SwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
