
package net.ospreymods.mp.item;

import net.ospreymods.mp.itemgroup.MoneyItemGroup;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@MpModElements.ModElement.Tag
public class Pence50Item extends MpModElements.ModElement {
	@ObjectHolder("mp:pence_50")
	public static final Item block = null;
	public Pence50Item(MpModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoneyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("pence_50");
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
