package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDemonite extends Item
{
	
	public ItemDemonite(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemDemonite");
		this.setTextureName("additioncorrugated:item_ingotdemonite");
		this.setMaxStackSize(64);
	}
}