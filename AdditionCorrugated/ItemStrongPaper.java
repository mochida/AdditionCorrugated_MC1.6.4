package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStrongPaper extends Item
{
	
	public ItemStrongPaper(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemStrongPaper");
		this.setTextureName("additioncorrugated:item_strongpaper");
		this.setMaxStackSize(64);
	}
}