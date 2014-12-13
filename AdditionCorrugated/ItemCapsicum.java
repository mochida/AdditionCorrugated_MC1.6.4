package AdditionCorrugated;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemCapsicum extends ItemFood
{
	
	public ItemCapsicum(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("Capsicum");
		this.setTextureName("additioncorrugated:item_capsicum");
		this.setPotionEffect(Potion.fireResistance.id, 30, 0, 1.0F);
		this.setMaxStackSize(64);
	}
}