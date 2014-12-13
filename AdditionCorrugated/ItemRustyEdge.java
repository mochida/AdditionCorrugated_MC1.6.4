package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRustyEdge extends Item
{
	
	public ItemRustyEdge(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemRustyEdge");
		this.setTextureName("additioncorrugated:item_rustedge");
		this.setMaxStackSize(64);
	}
}