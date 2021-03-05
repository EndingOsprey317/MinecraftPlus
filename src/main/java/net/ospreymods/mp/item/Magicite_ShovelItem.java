
package net.ospreymods.mp.item;

import net.ospreymods.mp.itemgroup.MinecraftPlusTabCombatAndToolsItemGroup;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@MpModElements.ModElement.Tag
public class Magicite_ShovelItem extends MpModElements.ModElement {
	@ObjectHolder("mp:magicite_shovel")
	public static final Item block = null;
	public Magicite_ShovelItem(MpModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 5588;
			}

			public float getEfficiency() {
				return 23f;
			}

			public float getAttackDamage() {
				return 16f;
			}

			public int getHarvestLevel() {
				return 18;
			}

			public int getEnchantability() {
				return 129;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Magicite_DustItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MinecraftPlusTabCombatAndToolsItemGroup.tab)) {
		}.setRegistryName("magicite_shovel"));
	}
}
