
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
public class MilkChocolateBarItem extends MpModElements.ModElement {
	@ObjectHolder("mp:milk_chocolate_bar")
	public static final Item block = null;
	public MilkChocolateBarItem(MpModElements instance) {
		super(instance, 119);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MincraftPlusTabItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("milk_chocolate_bar");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}