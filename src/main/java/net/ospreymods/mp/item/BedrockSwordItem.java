
package net.ospreymods.mp.item;

import net.ospreymods.mp.itemgroup.MinecraftPlusTabCombatAndToolsItemGroup;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

@MpModElements.ModElement.Tag
public class BedrockSwordItem extends MpModElements.ModElement {
	@ObjectHolder("mp:bedrock_sword")
	public static final Item block = null;
	public BedrockSwordItem(MpModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 6280;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 58f;
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
		}, 3, -3f, new Item.Properties().group(MinecraftPlusTabCombatAndToolsItemGroup.tab)) {
		}.setRegistryName("bedrock_sword"));
	}
}
