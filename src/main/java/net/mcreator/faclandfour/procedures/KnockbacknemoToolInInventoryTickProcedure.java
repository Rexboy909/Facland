package net.mcreator.faclandfour.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class KnockbacknemoToolInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("Knockback_nemo_enchanted") == false) {
			itemstack.getOrCreateTag().putBoolean("Knockback_nemo_enchanted", (true));
			(itemstack).enchant(Enchantments.KNOCKBACK, 10);
		}
	}
}
