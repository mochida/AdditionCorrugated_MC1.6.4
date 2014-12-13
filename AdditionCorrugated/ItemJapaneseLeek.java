package AdditionCorrugated;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemJapaneseLeek extends ItemFood
{
	
	public ItemJapaneseLeek(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("JapaneseLeek");
		this.setTextureName("additioncorrugated:item_japaneseleek");
		this.setPotionEffect(Potion.moveSpeed.id, 30, 0, 1.0F);
		this.setMaxStackSize(64);
	}
}