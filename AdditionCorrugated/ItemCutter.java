package AdditionCorrugated;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class ItemCutter extends Item
{
	public ItemCutter(int par1)
	{
		super(par1);
		this.setUnlocalizedName("itemCutter");
		this.setTextureName("additioncorrugated:item_cutter");
		this.setMaxStackSize(1);
	}
}