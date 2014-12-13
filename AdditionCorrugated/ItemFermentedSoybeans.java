package AdditionCorrugated;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemFermentedSoybeans extends ItemFood
{
	
	public ItemFermentedSoybeans(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("ItemFermentedSoybeans");
		this.setTextureName("additioncorrugated:item_fermentedsoybeans");
		this.setMaxStackSize(64);
	}
}