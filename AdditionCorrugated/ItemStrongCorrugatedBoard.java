package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStrongCorrugatedBoard extends Item
{
	
	public ItemStrongCorrugatedBoard(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemStrongCorrugatedBoard");
		this.setTextureName("additioncorrugated:item_strongcorrugatedboard");
		this.setMaxStackSize(64);
	}
}