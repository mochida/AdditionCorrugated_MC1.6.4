package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemSuperMintGum extends ItemFood
{
	
	public ItemSuperMintGum(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("SuperMintGum");
		this.setTextureName("additioncorrugated:item_supermintgum");
		this.setMaxStackSize(64);
		this.setPotionEffect(Potion.nightVision.id, 300, 0, 0.75F);
		this.setAlwaysEdible();
	}
}