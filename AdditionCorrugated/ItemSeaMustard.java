package AdditionCorrugated;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemSeaMustard extends ItemFood
{
	
	public ItemSeaMustard(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("ItemSeaMustard");
		this.setTextureName("additioncorrugated:item_seamustard");
		this.setMaxStackSize(64);
	}
}