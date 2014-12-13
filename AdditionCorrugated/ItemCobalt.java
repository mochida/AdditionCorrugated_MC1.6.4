package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCobalt extends Item
{
	
	public ItemCobalt(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemCobalt");
		this.setTextureName("additioncorrugated:item_ingotcobalt");
		this.setMaxStackSize(64);
	}
}