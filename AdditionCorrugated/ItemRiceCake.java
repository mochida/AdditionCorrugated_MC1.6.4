package AdditionCorrugated;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemRiceCake extends ItemFood
{
	
	public ItemRiceCake(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("ItemRiceCake");
		this.setTextureName("additioncorrugated:item_ricecake");
		this.setMaxStackSize(64);
	}
}