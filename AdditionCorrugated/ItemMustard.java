package AdditionCorrugated;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemMustard extends ItemFood
{
	
	public ItemMustard(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("Mustard");
		this.setTextureName("additioncorrugated:item_mustard");
		this.setPotionEffect(Potion.damageBoost.id, 30, 0, 1.0F);
		this.setMaxStackSize(64);
	}
}