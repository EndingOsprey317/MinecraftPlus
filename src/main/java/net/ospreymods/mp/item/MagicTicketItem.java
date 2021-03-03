
package net.ospreymods.mp.item;

import net.ospreymods.mp.itemgroup.MincraftPlusTabItemsItemGroup;
import net.ospreymods.mp.MpModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

@MpModElements.ModElement.Tag
public class MagicTicketItem extends MpModElements.ModElement {
	@ObjectHolder("mp:magic_ticket")
	public static final Item block = null;
	public MagicTicketItem(MpModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MincraftPlusTabItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("magic_ticket");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Use In Stone Cutter To Get Items"));
		}
	}
}
