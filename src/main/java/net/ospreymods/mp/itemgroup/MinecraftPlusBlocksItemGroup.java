
package net.ospreymods.mp.itemgroup;

import net.ospreymods.mp.block.Magicite_BlockBlock;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MpModElements.ModElement.Tag
public class MinecraftPlusBlocksItemGroup extends MpModElements.ModElement {
	public MinecraftPlusBlocksItemGroup(MpModElements instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabminecraft_plus_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Magicite_BlockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
