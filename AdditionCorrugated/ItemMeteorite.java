package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMeteorite extends Item
{
	
	public ItemMeteorite(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemMeteorite");
		this.setTextureName("additioncorrugated:item_ingotmeteorite");
		this.setMaxStackSize(64);
	}
}