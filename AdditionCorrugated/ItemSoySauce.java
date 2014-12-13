package AdditionCorrugated;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemSoySauce extends ItemFood
{
	
	public ItemSoySauce(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("ItemSoySauce");
		this.setTextureName("additioncorrugated:item_soysauce");
		this.setMaxStackSize(64);
	}
}