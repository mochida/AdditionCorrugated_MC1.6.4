package AdditionCorrugated;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemMintGum extends ItemFood
{
	
	public ItemMintGum(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("MintGum");
		this.setTextureName("additioncorrugated:item_mintgum");
		this.setMaxStackSize(64);
		this.setPotionEffect(Potion.nightVision.id, 60, 0, 0.75F);
		this.setAlwaysEdible();
	}
}