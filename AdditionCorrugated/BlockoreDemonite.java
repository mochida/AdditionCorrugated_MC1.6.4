package AdditionCorrugated;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import AdditionCorrugated.AdditionCorrugatedCore;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockoreDemonite extends Block
{
	
	public BlockoreDemonite(int par1, Material par2Material)
	{
		super(par1, par2Material);
		this.setUnlocalizedName("oreDemonite");
		this.setTextureName("additioncorrugated:block_oredemonite");
		this.setHardness(3.0F);
		this.setResistance(1.0F);
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
	
	public int quantityDroppedWithBonus(int par1, Random rand)
	{
		int var3 = this.quantityDropped(rand) + rand.nextInt(1 +par1);
		
		if (var3 > 2)
		{
			var3 = 2;
		}
		
		return var3;
	}
}