package net.ospreymods.mp.procedures;

import net.ospreymods.mp.enchantment.GetHelpEnchantment;
import net.ospreymods.mp.MpModElements;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;

import java.util.Map;

@MpModElements.ModElement.Tag
public class GetHelpUseProcedure extends MpModElements.ModElement {
	public GetHelpUseProcedure(MpModElements instance) {
		super(instance, 56);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure GetHelpUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemInMainHand = ItemStack.EMPTY;
		itemInMainHand = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
		if (((EnchantmentHelper.getEnchantmentLevel(GetHelpEnchantment.enchantment, (itemInMainHand))) != 0)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) 400,
						(int) (EnchantmentHelper.getEnchantmentLevel(GetHelpEnchantment.enchantment, (itemInMainHand))), (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 400,
						(int) (EnchantmentHelper.getEnchantmentLevel(GetHelpEnchantment.enchantment, (itemInMainHand))), (false), (false)));
			if (((EnchantmentHelper.getEnchantmentLevel(GetHelpEnchantment.enchantment, (itemInMainHand))) != 1)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 400,
							(int) (EnchantmentHelper.getEnchantmentLevel(GetHelpEnchantment.enchantment, (itemInMainHand))), (false), (false)));
				if (((EnchantmentHelper.getEnchantmentLevel(GetHelpEnchantment.enchantment, (itemInMainHand))) != 2)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 400,
								(int) (EnchantmentHelper.getEnchantmentLevel(GetHelpEnchantment.enchantment, (itemInMainHand))), (false), (false)));
				}
			}
		}
		itemInMainHand = new ItemStack(Blocks.AIR, (int) (1));
	}
}
