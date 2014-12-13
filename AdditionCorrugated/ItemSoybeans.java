package AdditionCorrugated;

import net.minecraft.item.ItemFood;

public class ItemSoybeans extends ItemFood
{
	
	public ItemSoybeans(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("ItemSoybeans");
		this.setTextureName("additioncorrugated:item_soybeans");
		this.setMaxStackSize(64);
	}
}