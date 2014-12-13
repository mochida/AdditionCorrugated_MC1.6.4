package AdditionCorrugated;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockBlackStone extends Block
{
	public BlockBlackStone(int par1, Material par2Material)
    {
        super(par1, Material.rock);
        this.setHardness(10.0F);
        this.setResistance(100.0F);
        this.setStepSound(soundStoneFootstep);
		this.setTextureName("additioncorrugated:block_blackstone");
    }

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