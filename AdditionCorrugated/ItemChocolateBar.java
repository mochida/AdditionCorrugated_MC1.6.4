package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemChocolateBar extends ItemFood
{
	
	public ItemChocolateBar(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("ItemChocolateBar");
		this.setTextureName("additioncorrugated:item_chocolatebar");
		this.setMaxStackSize(64);
	}
}