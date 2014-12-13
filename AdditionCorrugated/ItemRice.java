package AdditionCorrugated;

import net.minecraft.item.ItemFood;

public class ItemRice extends ItemFood
{
	
	public ItemRice(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("Rice");
		this.setTextureName("additioncorrugated:item_rice");
		this.setMaxStackSize(64);
	}
}