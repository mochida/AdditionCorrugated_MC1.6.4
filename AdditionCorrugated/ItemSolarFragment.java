package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSolarFragment extends Item
{
	
	public ItemSolarFragment(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemSolarFragment");
		this.setTextureName("additioncorrugated:item_solarfragment");
		this.setMaxStackSize(64);
	}
}