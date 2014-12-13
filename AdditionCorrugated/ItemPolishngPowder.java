package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPolishngPowder extends Item
{
	
	public ItemPolishngPowder(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemPolishngPowder");
		this.setTextureName("additioncorrugated:item_polishngpowder");
		this.setMaxStackSize(64);
	}
}