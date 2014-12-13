package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMythril extends Item
{
	
	public ItemMythril(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemMythril");
		this.setTextureName("additioncorrugated:item_ingotmythril");
		this.setMaxStackSize(64);
	}
}