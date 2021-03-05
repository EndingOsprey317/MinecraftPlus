
package net.ospreymods.mp.itemgroup;

import net.ospreymods.mp.item.Pence1Item;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MpModElements.ModElement.Tag
public class MoneyItemGroup extends MpModElements.ModElement {
	public MoneyItemGroup(MpModElements instance) {
		super(instance, 135);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmoney") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Pence1Item.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
