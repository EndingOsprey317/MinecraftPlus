
package net.ospreymods.mp.item;

import net.ospreymods.mp.itemgroup.MoneyItemGroup;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@MpModElements.ModElement.Tag
public class Pound10Item extends MpModElements.ModElement {
	@ObjectHolder("mp:pound_10")
	public static final Item block = null;
	public Pound10Item(MpModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoneyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("pound_10");
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
