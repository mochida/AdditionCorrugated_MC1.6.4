package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEdge extends Item
{
	
	public ItemEdge(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemEdge");
		this.setTextureName("additioncorrugated:item_edge");
		this.setMaxStackSize(64);
	}
}