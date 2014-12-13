package AdditionCorrugated;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemDumpling extends ItemFood
{
	
	public ItemDumpling(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("ItemDumpling");
		this.setTextureName("additioncorrugated:item_dumpling");
		this.setMaxStackSize(64);
	}
}