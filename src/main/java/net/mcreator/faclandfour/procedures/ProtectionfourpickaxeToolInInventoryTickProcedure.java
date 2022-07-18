package net.mcreator.faclandfour.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class ProtectionfourpickaxeToolInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("ProtFourPickaxeEnchanted") == false) {
			itemstack.getOrCreateTag().putBoolean("ProtFourPickaxeEnchanted", (true));
			(itemstack).enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
		}
	}
}
