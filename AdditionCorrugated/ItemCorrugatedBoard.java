package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCorrugatedBoard extends Item
{
	
	public ItemCorrugatedBoard(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemCorrugatedBoard");
		this.setTextureName("additioncorrugated:item_corrugatedboard");
		this.setMaxStackSize(64);
	}
}