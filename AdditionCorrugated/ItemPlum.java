package AdditionCorrugated;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemPlum extends ItemFood
{
	
	public ItemPlum(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("ItemPlum");
		this.setTextureName("additioncorrugated:item_plum");
		this.setMaxStackSize(64);
	}
}