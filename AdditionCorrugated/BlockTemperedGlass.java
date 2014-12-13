package AdditionCorrugated;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockTemperedGlass extends Block
{
	
	public BlockTemperedGlass(int par1, Material par2Material)
	{
		super(par1, par2Material);
		this.setUnlocalizedName("TemperedGlass");
		this.setTextureName("additioncorrugated:block_temperedglass");
		this.setHardness(5.0F);
		this.setResistance(100.0F);
		this.setStepSound(Block.soundGlassFootstep);
	}
	
	@Override
	public int idDropped(int par1, Random rand, int par2Material)
	{
		return this.blockID;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 1;
	}
}