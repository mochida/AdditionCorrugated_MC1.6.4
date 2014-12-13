package AdditionCorrugated;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemKimchi extends ItemFood
{
	
	public ItemKimchi(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("Kimchi");
		this.setTextureName("additioncorrugated:item_kimchi");
		this.setPotionEffect(Potion.regeneration.id, 30, 0, 1.0F);
		this.setMaxStackSize(64);
	}
}