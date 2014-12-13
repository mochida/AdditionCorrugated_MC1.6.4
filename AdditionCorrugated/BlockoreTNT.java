package AdditionCorrugated;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.EnumPlantType;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockoreTNT extends Block
{
	
	public BlockoreTNT(int par1, Material par2Material)
	{
		super(par1, par2Material);
		this.setUnlocalizedName("oreTNT");
		this.setTextureName("additioncorrugated:block_oretnt");
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundStoneFootstep);
	}

	@Override
	public int idDropped(int par1, Random rand, int par2Material)
	{
		return Block.tnt.blockID;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 1 +  rand.nextInt(2);
	}
	
	public int quantityDroppedWithBonus(int par1, Random rand)
	{
		int var3 = this.quantityDropped(rand) + rand.nextInt(1 +par1);
		
		if (var3 > 4)
		{
			var3 = 4;
		}
		
		return var3;
	}
	
	public void generate(Random random, int chunkX, int chunkY, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkPovider)
	{
		if (world.provider instanceof WorldProviderHell)
		{
			this.generateOre(world, random, chunkX << 4, chunkZ << 4);
		}
	}

	private void generateOre(World world, Random random, int x, int z)
	{
		for (int i = 0; i < 100; ++i)
		{
			int genX = x + random.nextInt(16);
			int genY = 1 + random.nextInt(100);
			int genZ = x + random.nextInt(16);
			
		(new WorldGenMinable(this.blockID, 1000)).generate(world, random, genX, genY, genZ);
		}
	}
}