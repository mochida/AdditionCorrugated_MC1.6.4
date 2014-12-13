package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFluorite extends Item
{
	
	public ItemFluorite(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemFluorite");
		this.setTextureName("additioncorrugated:item_fluorite");
		this.setMaxStackSize(64);
	}
}