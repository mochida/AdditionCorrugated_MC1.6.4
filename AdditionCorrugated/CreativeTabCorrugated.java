package AdditionCorrugated;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCorrugated extends CreativeTabs
{
	public CreativeTabCorrugated(String label)
	{
		super(label);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel()
	{
		return "AdditionCorrugated";
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return AdditionCorrugatedCore.blockCorrugated.blockID;
	}
}