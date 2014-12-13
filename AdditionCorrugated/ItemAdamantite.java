package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAdamantite extends Item
{
	
	public ItemAdamantite(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemAdamantite");
		this.setTextureName("additioncorrugated:item_ingotadamantite");
		this.setMaxStackSize(64);
	}
}