package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemPickledPlum extends ItemFood
{
	
	public ItemPickledPlum(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("ItemPickledPlum");
		this.setTextureName("additioncorrugated:item_pickledplum");
		this.setMaxStackSize(64);
		this.setAlwaysEdible();
		this.setPotionEffect(Potion.jump.id, 60, 9, 0.75F);
	}
}