package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemBlueberry extends ItemFood
{
	
	public ItemBlueberry(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("ItemBlueberry");
		this.setTextureName("additioncorrugated:item_blueberry");
		this.setMaxStackSize(64);
		this.setPotionEffect(Potion.nightVision.id, 300, 0, 0.5F);
		this.setAlwaysEdible();
	}
}