
package net.ospreymods.mp.item;

import net.ospreymods.mp.itemgroup.MincraftPlusTabItemsItemGroup;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@MpModElements.ModElement.Tag
public class DarkChocolateItem extends MpModElements.ModElement {
	@ObjectHolder("mp:dark_chocolate")
	public static final Item block = null;
	public DarkChocolateItem(MpModElements instance) {
		super(instance, 114);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MincraftPlusTabItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(1).saturation(0f).build()));
			setRegistryName("dark_chocolate");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
