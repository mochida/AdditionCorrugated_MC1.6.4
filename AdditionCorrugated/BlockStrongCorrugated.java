package AdditionCorrugated;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockStrongCorrugated extends Block
{
	
	public BlockStrongCorrugated(int par1, Material par2Material)
	{
		super(par1, par2Material);
		this.setUnlocalizedName("blockStrongCorrugated");
		this.setTextureName("additioncorrugated:block_strongcorrugated");
		this.setHardness(10.0F);
		this.setResistance(500.0F);
		this.setStepSound(Block.soundStoneFootstep);
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