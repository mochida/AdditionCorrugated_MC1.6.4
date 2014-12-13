package AdditionCorrugated;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockCorrugatedLight extends Block
{
	
	public BlockCorrugatedLight(int par1, Material par2Material)
	{
		super(par1, par2Material);
		this.setUnlocalizedName("blockCorrugatedLight");
		this.setTextureName("additioncorrugated:block_corrugatedlight");
		this.setHardness(0.2F);
		this.setResistance(0.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setLightValue(1.0F);
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