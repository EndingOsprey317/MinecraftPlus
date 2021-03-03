
package net.ospreymods.mp.item;

import net.ospreymods.mp.itemgroup.MincraftPlusTabItemsItemGroup;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@MpModElements.ModElement.Tag
public class Magicite_DustItem extends MpModElements.ModElement {
	@ObjectHolder("mp:magicite_dust")
	public static final Item block = null;
	public Magicite_DustItem(MpModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MincraftPlusTabItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("magicite_dust");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
