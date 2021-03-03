
package net.ospreymods.mp.itemgroup;

import net.ospreymods.mp.item.MPBIItem;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MpModElements.ModElement.Tag
public class MincraftPlusTabItemsItemGroup extends MpModElements.ModElement {
	public MincraftPlusTabItemsItemGroup(MpModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmincraft_plus_tab_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MPBIItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
