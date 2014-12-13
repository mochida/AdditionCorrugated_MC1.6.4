package AdditionCorrugated;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import AdditionCorrugated.AdditionCorrugatedCore;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCorrugated extends Block
{
	
	public BlockCorrugated(int par1, Material par2Material)
	{
		super(par1, par2Material);
		this.setUnlocalizedName("blockCorrugated");
		this.setTextureName("additioncorrugated:block_corrugated");
		this.setHardness(0.2F);
		this.setResistance(0.0F);
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
	
	@Override
	public boolean isFlammable(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
	{
		return true;
	}
	
	@Override
	public boolean isBlockBurning(World world, int x, int y, int z)
	{
		return true;
	}
	
	@Override
	public boolean isFireSource(World world, int x, int y, int z, int metadata, ForgeDirection side)
	{
		return true;
	}
	
	public int getFlammable(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
	{
		return this.blockID;
		
	}
	
	public int getFireSpreeadSpeed(World world, int x, int y, int z, int metadata, ForgeDirection side)
	{
		return this.blockID;
	}
}