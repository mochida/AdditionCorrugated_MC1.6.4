package AdditionCorrugated;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class BlockTStone extends Block
{
	
	public BlockTStone(int par1, Material par2Material)
	{
		super(par1, par2Material);
		this.setUnlocalizedName("blockTStone");
		this.setTextureName("additioncorrugated:block_tstone");
		this.setStepSound(Block.soundStoneFootstep);
		this.setHardness(2.0F);
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