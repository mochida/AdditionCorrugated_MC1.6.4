package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGlutinousRice extends Item
{
	
	public ItemGlutinousRice(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemGlutinousRice");
		this.setTextureName("additioncorrugated:item_glutinousrice");
		this.setMaxStackSize(64);
	}
}