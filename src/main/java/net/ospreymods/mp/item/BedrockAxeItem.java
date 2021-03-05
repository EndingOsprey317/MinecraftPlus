
package net.ospreymods.mp.item;

import net.ospreymods.mp.itemgroup.MinecraftPlusTabCombatAndToolsItemGroup;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.block.Blocks;

@MpModElements.ModElement.Tag
public class BedrockAxeItem extends MpModElements.ModElement {
	@ObjectHolder("mp:bedrock_axe")
	public static final Item block = null;
	public BedrockAxeItem(MpModElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6280;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 88f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.BEDROCK, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MinecraftPlusTabCombatAndToolsItemGroup.tab)) {
		}.setRegistryName("bedrock_axe"));
	}
}
