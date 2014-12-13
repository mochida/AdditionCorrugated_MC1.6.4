package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemHellstone extends Item
{
	
	public ItemHellstone(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemHellstone");
		this.setTextureName("additioncorrugated:item_ingothellstone");
		this.setMaxStackSize(64);
	}
}