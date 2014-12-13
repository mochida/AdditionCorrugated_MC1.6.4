package AdditionCorrugated;

import java.io.IOException;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.minecraftforge.common.ForgeHooks;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraftforge.common.DimensionManager;

@Mod(modid="Addition Corrugated", name="Addition Corrugated", version="1.4.2")
public class AdditionCorrugatedCore
{
	public static final CreativeTabs tabCorrugated = new CreativeTabCorrugated("Corrugated");
		
	public static final Block commandBlock = (Block.commandBlock).setCreativeTab(CreativeTabs.tabRedstone);	
		
	public static Block blockCorrugated;
	public static int blockCorrugatedID = 1999;
	
	public static Block blockCorrugatedLight;
	public static int blockCorrugatedLightID = 2000;
	
	public static Block blockStrongCorrugated;
	public static int blockStrongCorrugatedID = 2001;
	
	public static Block blockStrongCorrugatedLight;
	public static int blockStrongCorrugatedLightID = 2002;
	
	public static Block oreFluorite;
	public static int oreFluoriteID = 2003;
	
	public static Block TemperedGlass;
	public static int TemperedGlassID = 2004;
	
	public static Block blockTStone;
	public static int blockTStoneID = 2005;
	
	public static Block oreTNT;
	public static int oreTNTID = 2006;
	
	public static Block oreAdamantite;
	public static int oreAdamantiteID = 2007;
	
	public static Block oreCobalt;
	public static int oreCobaltID = 2008;
	
	public static Block oreDemonite;
	public static int oreDemoniteID = 2009;
	
	public static Block oreHellstone;
	public static int oreHellstoneID = 2010;
	
	public static Block oreMeteorite;
	public static int oreMeteoriteID = 2011;
	
	public static Block oreMythril;
	public static int oreMythrilID = 2012;
	
	public static Block BlackStone;
	public static int BlackStoneID = 2013;
	
	public static Item itemStrongPaper;
	public static int itemStrongPaperID = 19999;
	
	public static Item itemRustyEdge;
	public static int itemRustyEdgeID = 20000;
	
	public static Item itemEdge;
	public static int itemEdgeID = 20001;
	
	public static Item itemPolishngPowder;
	public static int itemPolishngPowderID = 20002;
	
	public static Item itemCorrugatedBoard;
	public static int itemCorrugatedBoardID = 20003;
	
	public static Item itemCutter;
	public static int itemCutterID = 20004;
		
	public static Item itemFluorite;
	public static int itemFluoriteID = 20005;
	
	public static Item itemStrongCorrugatedBoard;
	public static int itemStrongCorrugatedBoardID = 20006;
	
	public static Item Gum;
	public static int GumID = 20007;
	
	public static Item MintGum;
	public static int MintGumID = 20008;
	
	public static Item SuperMintGum;
	public static int SuperMintGumID = 20009;
	
	public static Item ChocolateBar;
	public static int ChocolateBarID = 20010;
	
	public static Item Blueberry;
	public static int BlueberryID = 20011;
	
	public static Item PickledPlum;
	public static int PickledPlumID = 20012;
	
	public static Item Plum;
	public static int PlumID = 20013;
	
	public static Item RiceCake;
	public static int RiceCakeID = 20014;
	
	public static Item Adamantite;
	public static int AdamantiteID = 20015;
	
	public static Item Cobalt;
	public static int CobaltID = 20016;
	
	public static Item Demonite;
	public static int DemoniteID = 20017;
	
	public static Item Hellstone;
	public static int HellstoneID = 20018;
	
	public static Item Meteorite;
	public static int MeteoriteID = 20019;
	
	public static Item Mythril;
	public static int MythrilID = 20020;
	
	public static Item SolarFragment;
	public static int SolarFragmentID = 20021;
	
	public static Item GlutinousRice;
	public static int GlutinousRiceID = 20022;
	
	public static Item Straw;
	public static int StrawID = 20023;
	
	public static Item SeaMustard;
	public static int SeaMustardID = 20024;
	
	public static Item Dumpling;
	public static int DumplingID = 20025;
	
	public static Item SoySauce;
	public static int SoySauceID = 20026;
	
	public static Item FermentedSoybeans;
	public static int FermentedSoybeansID = 20027;
	
	public static Item Soybeans;
	public static int SoybeansID = 20028;
	
	public static Item SpongeGourd;
	public static int SpongeGourdID = 20029;
	
	public static Item DrySpongeGourd;
	public static int DrySpongeGourdID = 20030;
	
	public static Item Kimchi;
	public static int KimchiID = 20031;
	
	public static Item JapaneseLeek;
	public static int JapaneseLeekID = 20032;
	
	public static Item Mustard;
	public static int MustardID = 20033;
	
	public static Item Capsicum;
	public static int CapsicumID = 20034;
	
	public static Item Rice;
	public static int RiceID = 20035;
	
	public static Item SeaMustardRevision;
	public static int SeaMustardRevisionID = 20036;
		
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		LanguageRegistry.addName(blockCorrugated, "Corrugated");
		LanguageRegistry.instance().addNameForObject(blockCorrugated, "ja_JP", "ダンボール");
		
		LanguageRegistry.addName(blockCorrugatedLight, "CorrugatedLight");
		LanguageRegistry.instance().addNameForObject(blockCorrugatedLight, "ja_JP", "ダンボールライト");
		
		LanguageRegistry.addName(blockStrongCorrugated, "StrongCorrugated");
		LanguageRegistry.instance().addNameForObject(blockStrongCorrugated, "ja_JP", "強化ダンボール");
		
		LanguageRegistry.addName(blockStrongCorrugatedLight, "StrongCorrugatedLight");
		LanguageRegistry.instance().addNameForObject(blockStrongCorrugatedLight, "ja_JP", "強化ダンボールライト");
		
		LanguageRegistry.addName(itemStrongPaper, "StrongPaper");
		LanguageRegistry.instance().addNameForObject(itemStrongPaper, "ja_JP", "強化紙");
		
		LanguageRegistry.addName(itemRustyEdge, "RustyEdge");
		LanguageRegistry.instance().addNameForObject(itemRustyEdge, "ja_JP", "錆びた刃");
		
		LanguageRegistry.addName(itemEdge, "Edge");
		LanguageRegistry.instance().addNameForObject(itemEdge, "ja_JP", "刃");
		
		LanguageRegistry.addName(itemPolishngPowder, "PolishngPowder");
		LanguageRegistry.instance().addNameForObject(itemPolishngPowder, "ja_JP", "磨き粉");
		
		LanguageRegistry.addName(itemCorrugatedBoard, "CorrugatedBoard");
		LanguageRegistry.instance().addNameForObject(itemCorrugatedBoard, "ja_JP", "ダンボール板");
		
		LanguageRegistry.addName(itemCutter, "Cutter");
		LanguageRegistry.instance().addNameForObject(itemCutter, "ja_JP", "カッター");
		
		LanguageRegistry.addName(itemFluorite, "Fluorite");
		LanguageRegistry.instance().addNameForObject(itemFluorite, "ja_JP", "フローライト");
		
		LanguageRegistry.addName(oreFluorite, "oreFluorite");
		LanguageRegistry.instance().addNameForObject(oreFluorite, "ja_JP", "蛍石鉱石");
		
		LanguageRegistry.addName(itemStrongCorrugatedBoard, "StrongCorrugatedBoard");
		LanguageRegistry.instance().addNameForObject(itemStrongCorrugatedBoard, "ja_JP", "強化ダンボール板");
		
		LanguageRegistry.addName(TemperedGlass, "Tempered Glass");
		LanguageRegistry.instance().addNameForObject(TemperedGlass, "ja_JP", "強化ガラス");
		
		LanguageRegistry.addName(Gum, "Gum");
		LanguageRegistry.instance().addNameForObject(Gum, "ja_JP", "ガム");
		
		LanguageRegistry.addName(MintGum, "MintGum");
		LanguageRegistry.instance().addNameForObject(MintGum, "ja_JP", "ミントガム");
		
		LanguageRegistry.addName(SuperMintGum, "SuperMintGum");
		LanguageRegistry.instance().addNameForObject(SuperMintGum, "ja_JP", "超ミントガム");
		
		LanguageRegistry.addName(ChocolateBar, "ChocolateBar");
		LanguageRegistry.instance().addNameForObject(ChocolateBar, "ja_JP", "板チョコ");
		
		LanguageRegistry.addName(blockTStone, "T Stone");
		LanguageRegistry.instance().addNameForObject(blockTStone, "ja_JP", "T石");
		
		LanguageRegistry.addName(oreTNT, "oreTNT");
		LanguageRegistry.instance().addNameForObject(oreTNT, "ja_JP", "TNT鉱石");
		
		LanguageRegistry.addName(Blueberry, "Blueberry");
		LanguageRegistry.instance().addNameForObject(Blueberry, "ja_JP", "ブルーベリー");
		
		LanguageRegistry.addName(oreAdamantite, "oreAdamantite");
		LanguageRegistry.instance().addNameForObject(oreAdamantite, "ja_JP", "アダマンタイト鉱石");
		
		LanguageRegistry.addName(oreCobalt, "oreCobalt");
		LanguageRegistry.instance().addNameForObject(oreCobalt, "ja_JP", "コバルト鉱石");
		
		LanguageRegistry.addName(oreDemonite, "oreDemonite");
		LanguageRegistry.instance().addNameForObject(oreDemonite, "ja_JP", "デモナイト鉱石");
		
		LanguageRegistry.addName(oreHellstone, "oreHellstone");
		LanguageRegistry.instance().addNameForObject(oreHellstone, "ja_JP", "ヘルストーン鉱石");
		
		LanguageRegistry.addName(oreMeteorite, "oreMeteorite");
		LanguageRegistry.instance().addNameForObject(oreMeteorite, "ja_JP", "メテオライト鉱石");
		
		LanguageRegistry.addName(oreMythril, "oreMythril");
		LanguageRegistry.instance().addNameForObject(oreMythril, "ja_JP", "ミスリル鉱石");
		
		LanguageRegistry.addName(PickledPlum, "Pickled Plum");
		LanguageRegistry.instance().addNameForObject(PickledPlum, "ja_JP", "梅干し");
		
		LanguageRegistry.addName(Plum, "Plum");
		LanguageRegistry.instance().addNameForObject(Plum, "ja_JP", "梅");
		
		LanguageRegistry.addName(RiceCake, "RiceCake");
		LanguageRegistry.instance().addNameForObject(RiceCake, "ja_JP", "餅");
		
		LanguageRegistry.addName(Adamantite, "Adamantite");
		LanguageRegistry.instance().addNameForObject(Adamantite, "ja_JP", "アダマンタイト");
		
		LanguageRegistry.addName(Cobalt, "Cobalt");
		LanguageRegistry.instance().addNameForObject(Cobalt, "ja_JP", "コバルト");
		
		LanguageRegistry.addName(Demonite, "Demonite");
		LanguageRegistry.instance().addNameForObject(Demonite, "ja_JP", "デモナイト");
		
		LanguageRegistry.addName(Hellstone, "Hellstone");
		LanguageRegistry.instance().addNameForObject(Hellstone, "ja_JP", "ヘルストーン");
		
		LanguageRegistry.addName(Meteorite, "Meteorite");
		LanguageRegistry.instance().addNameForObject(Meteorite, "ja_JP", "メテオライト");
		
		LanguageRegistry.addName(Mythril, "Mythril");
		LanguageRegistry.instance().addNameForObject(Mythril, "ja_JP", "ミスリル");
		
		LanguageRegistry.addName(SolarFragment, "Solar Fragment");
		LanguageRegistry.instance().addNameForObject(SolarFragment, "ja_JP", "太陽の破片");
		
		LanguageRegistry.addName(GlutinousRice, "Glutinous Rice");
		LanguageRegistry.instance().addNameForObject(GlutinousRice, "ja_JP", "餅米");
		
		LanguageRegistry.addName(Straw, "Straw");
		LanguageRegistry.instance().addNameForObject(Straw, "ja_JP", "藁");
		
		LanguageRegistry.addName(BlackStone, "BlackStone");
		LanguageRegistry.instance().addNameForObject(BlackStone, "ja_JP", "黒い石");
		
		LanguageRegistry.addName(SeaMustard, "Sea Mustard");
		LanguageRegistry.instance().addNameForObject(SeaMustard, "ja_JP", "わかめ");
		
		LanguageRegistry.addName(Dumpling, "Dumpling");
		LanguageRegistry.instance().addNameForObject(Dumpling, "ja_JP", "団子");
		
		LanguageRegistry.addName(SoySauce, "Soy Sauce");
		LanguageRegistry.instance().addNameForObject(SoySauce, "ja_JP", "醤油");
		
		LanguageRegistry.addName(FermentedSoybeans, "Fermented Soybeans");
		LanguageRegistry.instance().addNameForObject(FermentedSoybeans, "ja_JP", "納豆");
		
		LanguageRegistry.addName(Soybeans, "Soybeans");
		LanguageRegistry.instance().addNameForObject(Soybeans, "ja_JP", "大豆");
		
		LanguageRegistry.addName(SpongeGourd, "Sponge Gourd");
		LanguageRegistry.instance().addNameForObject(SpongeGourd, "ja_JP", "糸瓜");
		
		LanguageRegistry.addName(DrySpongeGourd, "Dry Sponge Gourd");
		LanguageRegistry.instance().addNameForObject(DrySpongeGourd, "ja_JP", "乾燥糸瓜");
				
		LanguageRegistry.addName(Kimchi, "Kimchi");
		LanguageRegistry.instance().addNameForObject(Kimchi, "ja_JP", "キムチ");
		
		LanguageRegistry.addName(JapaneseLeek, "Japanese Leek");
		LanguageRegistry.instance().addNameForObject(JapaneseLeek, "ja_JP", "長ネギ");
		
		LanguageRegistry.addName(Mustard, "Mustard");
		LanguageRegistry.instance().addNameForObject(Mustard, "ja_JP", "カラシ");
		
		LanguageRegistry.addName(Capsicum, "Capsicum");
		LanguageRegistry.instance().addNameForObject(Capsicum, "ja_JP", "唐辛子");
		
		LanguageRegistry.addName(Rice, "Rice");
		LanguageRegistry.instance().addNameForObject(Rice, "ja_JP", "ご飯");
		
		LanguageRegistry.addName(SeaMustardRevision, "Sea Mustard Revision");
		LanguageRegistry.instance().addNameForObject(SeaMustardRevision, "ja_JP", "わかめ改");
		
		itemCorrugatedBoard = (itemCorrugatedBoard).setCreativeTab(tabCorrugated);
		
		itemStrongCorrugatedBoard = (itemStrongCorrugatedBoard).setCreativeTab(tabCorrugated);
		
		itemCutter = (itemCutter).setCreativeTab(tabCorrugated);
		
		itemStrongPaper = (itemStrongPaper).setCreativeTab(tabCorrugated);
		
		itemRustyEdge = (itemRustyEdge).setCreativeTab(tabCorrugated);
		
		itemPolishngPowder = (itemPolishngPowder).setCreativeTab(tabCorrugated);
		
		itemEdge = (itemEdge).setCreativeTab(tabCorrugated);
		
		itemFluorite = (itemFluorite).setCreativeTab(tabCorrugated);
		
		blockCorrugated = (blockCorrugated).setCreativeTab(tabCorrugated);
		
		oreFluorite = (oreFluorite).setCreativeTab(tabCorrugated);
		
		blockCorrugatedLight = (blockCorrugatedLight).setCreativeTab(tabCorrugated);
		
		blockStrongCorrugated = (blockStrongCorrugated).setCreativeTab(tabCorrugated);
		
		blockStrongCorrugatedLight = (blockStrongCorrugatedLight).setCreativeTab(tabCorrugated);
		
		TemperedGlass = (TemperedGlass).setCreativeTab(tabCorrugated);
		
		Gum = (Gum).setCreativeTab(tabCorrugated);
		
		MintGum = (MintGum).setCreativeTab(tabCorrugated);
		
		SuperMintGum = (SuperMintGum).setCreativeTab(tabCorrugated);
		
		ChocolateBar = (ChocolateBar).setCreativeTab(tabCorrugated);
		
		blockTStone = (blockTStone).setCreativeTab(tabCorrugated);
		
		oreTNT = (oreTNT).setCreativeTab(tabCorrugated);
		
		Blueberry = (Blueberry).setCreativeTab(tabCorrugated);
		
		oreAdamantite = (oreAdamantite).setCreativeTab(tabCorrugated);
		
		oreCobalt = (oreCobalt).setCreativeTab(tabCorrugated);
		
		oreDemonite = (oreDemonite).setCreativeTab(tabCorrugated);
		
		oreHellstone = (oreHellstone).setCreativeTab(tabCorrugated);
		
		oreMeteorite = (oreMeteorite).setCreativeTab(tabCorrugated);
		
		oreMythril = (oreMythril).setCreativeTab(tabCorrugated);
		
		PickledPlum = (PickledPlum).setCreativeTab(tabCorrugated);
		
		Plum = (Plum).setCreativeTab(tabCorrugated);
		
		RiceCake = (RiceCake).setCreativeTab(tabCorrugated);
		
		Adamantite = (Adamantite).setCreativeTab(tabCorrugated);
		
		Cobalt = (Cobalt).setCreativeTab(tabCorrugated);
		
		Demonite = (Demonite).setCreativeTab(tabCorrugated);
		
		Hellstone = (Hellstone).setCreativeTab(tabCorrugated);
		
		Meteorite = (Meteorite).setCreativeTab(tabCorrugated);
		
		Mythril = (Mythril).setCreativeTab(tabCorrugated);
		
		SolarFragment = (SolarFragment).setCreativeTab(tabCorrugated);
		
		GlutinousRice = (GlutinousRice).setCreativeTab(tabCorrugated);
		
		Straw = (Straw).setCreativeTab(tabCorrugated);
		
		BlackStone = (BlackStone).setCreativeTab(tabCorrugated);
		
		SeaMustard = (SeaMustard).setCreativeTab(tabCorrugated);
		
		Dumpling = (Dumpling).setCreativeTab(tabCorrugated);
		
		SoySauce = (SoySauce).setCreativeTab(tabCorrugated);
		
		FermentedSoybeans = (FermentedSoybeans).setCreativeTab(tabCorrugated);
		
		Soybeans = (Soybeans).setCreativeTab(tabCorrugated);
		
		SpongeGourd = (SpongeGourd).setCreativeTab(tabCorrugated);
		
		DrySpongeGourd = (DrySpongeGourd).setCreativeTab(tabCorrugated);
		
		Kimchi = (Kimchi).setCreativeTab(tabCorrugated);
		
		JapaneseLeek = (JapaneseLeek).setCreativeTab(tabCorrugated);
		
		Mustard = (Mustard).setCreativeTab(tabCorrugated);
		
		Capsicum = (Capsicum).setCreativeTab(tabCorrugated);
		
		Rice = (Rice).setCreativeTab(tabCorrugated);
		
		SeaMustardRevision = (SeaMustardRevision).setCreativeTab(tabCorrugated);
	
		MinecraftForge.EVENT_BUS.register(new PolishngPowderDrop());
		
		MinecraftForge.EVENT_BUS.register(new RustyEdgeDrop());
		
		MinecraftForge.EVENT_BUS.register(new FluoriteDrop());
		
		MinecraftForge.EVENT_BUS.register(new SolarFragmentDrop());
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)	
	{			
		blockCorrugated = new BlockCorrugated(blockCorrugatedID, Material.tnt);
		GameRegistry.registerBlock(blockCorrugated, "blockCorrugated");
		
		blockCorrugatedLight = new BlockCorrugatedLight(blockCorrugatedLightID, Material.tnt);
		GameRegistry.registerBlock(blockCorrugatedLight, "blockCorrugatedLight");
		
		blockStrongCorrugated = new BlockStrongCorrugated(blockStrongCorrugatedID, Material.tnt);
		GameRegistry.registerBlock(blockStrongCorrugated, "blockStrongCorrugated");
		
		blockStrongCorrugatedLight = new BlockStrongCorrugatedLight(blockStrongCorrugatedLightID, Material.tnt);
		GameRegistry.registerBlock(blockStrongCorrugatedLight, "blockStrongCorrugatedLight");
		
		itemStrongPaper = new ItemStrongPaper(itemStrongPaperID-256);
		GameRegistry.registerItem(itemStrongPaper, "itemStrongPaper");
		
		itemRustyEdge = new ItemRustyEdge(itemRustyEdgeID-256);
		GameRegistry.registerItem(itemRustyEdge, "itemRustyEdge");
		
		itemEdge = new ItemEdge(itemEdgeID-256);
		GameRegistry.registerItem(itemEdge, "itemEdge");
		
		itemPolishngPowder = new ItemPolishngPowder(itemPolishngPowderID-256);
		GameRegistry.registerItem(itemPolishngPowder, "itempolishngpowder");
		
		itemCorrugatedBoard = new ItemCorrugatedBoard(itemCorrugatedBoardID-256);
		GameRegistry.registerItem(itemCorrugatedBoard, "itemCorrugatedBoard");
		
		itemCutter = new ItemCutter(itemCutterID-256);
		GameRegistry.registerItem(itemCutter, "itemCutter");
		
		oreFluorite = new BlockoreFluorite(oreFluoriteID, Material.rock);
		GameRegistry.registerBlock(oreFluorite, "OreFruorite");
		
		itemFluorite = new ItemFluorite(itemFluoriteID-256);
		GameRegistry.registerItem(itemFluorite, "itemFluorite");
		
		TemperedGlass = new BlockTemperedGlass(TemperedGlassID,Material.glass);
		GameRegistry.registerBlock(TemperedGlass, "TemperedGlass");
		
		itemStrongCorrugatedBoard = new ItemStrongCorrugatedBoard(itemStrongCorrugatedBoardID-256);
		GameRegistry.registerItem(itemStrongCorrugatedBoard, "itemStrongCorrugatedBoard");
		
		Gum = new ItemGum(GumID-256, 4, true);
		GameRegistry.registerItem(Gum, "Gum");
		
		MintGum = new ItemMintGum(MintGumID-256, 5, true);
		GameRegistry.registerItem(MintGum, "MintGum");
		
		SuperMintGum = new ItemSuperMintGum(SuperMintGumID-256, 6, false);
		GameRegistry.registerItem(SuperMintGum, "SuperMintGum");
		
		ChocolateBar = new ItemChocolateBar(ChocolateBarID-256, 5, true);
		GameRegistry.registerItem(ChocolateBar, "ChocolateBar");
		
		Blueberry = new ItemBlueberry(BlueberryID-256, 2, true);
		GameRegistry.registerItem(Blueberry, "Blueberry");
		
		blockTStone = new BlockTStone(blockTStoneID, Material.rock);
		GameRegistry.registerBlock(blockTStone, "blockTStone");
		
		oreTNT = new BlockoreTNT(oreTNTID, Material.iron);
		GameRegistry.registerBlock(oreTNT, "oreTNT");
		
		oreAdamantite = new BlockoreAdamantite(oreAdamantiteID, Material.iron);
		GameRegistry.registerBlock(oreAdamantite, "oreAdamantite");
		
		oreCobalt = new BlockoreCobalt(oreCobaltID, Material.iron);
		GameRegistry.registerBlock(oreCobalt, "oreCobalt");
		
		oreDemonite = new BlockoreDemonite(oreDemoniteID, Material.iron);
		GameRegistry.registerBlock(oreDemonite, "oreDemonite");
		
		oreHellstone = new BlockoreHellstone(oreHellstoneID, Material.iron);
		GameRegistry.registerBlock(oreHellstone, "oreHellstone");
		
		oreMeteorite = new BlockoreMeteorite(oreMeteoriteID, Material.iron);
		GameRegistry.registerBlock(oreMeteorite, "oreMeteorite");
		
		oreMythril = new BlockoreMythril(oreMythrilID, Material.iron);
		GameRegistry.registerBlock(oreMythril, "oreMythril");
		
		PickledPlum = new ItemPickledPlum(PickledPlumID-256, 4, true);
		GameRegistry.registerItem(PickledPlum, "PickledPlum");
		
		Plum = new ItemPlum(PlumID-256, 2, false);
		GameRegistry.registerItem(Plum, "Plum");
		
		RiceCake = new ItemRiceCake(RiceCakeID-256, 2, true);
		GameRegistry.registerItem(RiceCake, "RiceCake");
		
		SeaMustard = new ItemSeaMustard(SeaMustardID-256, 1, true);
		GameRegistry.registerItem(SeaMustard, "SeaMustard");
		
		Adamantite = new ItemAdamantite(AdamantiteID-256);
		GameRegistry.registerItem(Adamantite, "Adamantite");
		
		Cobalt = new ItemCobalt(CobaltID-256);
		GameRegistry.registerItem(Cobalt, "Cobalt");
		
		Demonite = new ItemDemonite(DemoniteID-256);
		GameRegistry.registerItem(Demonite, "Demonite");
		
		Hellstone = new ItemHellstone(HellstoneID-256);
		GameRegistry.registerItem(Hellstone, "Hellstone");
		
		Meteorite = new ItemMeteorite(MeteoriteID-256);
		GameRegistry.registerItem(Meteorite, "Meteorite");
		
		Mythril = new ItemMythril(MythrilID-256);
		GameRegistry.registerItem(Mythril, "Mythril");
		
		SolarFragment = new ItemSolarFragment(SolarFragmentID-256);
		GameRegistry.registerItem(SolarFragment, "SolarFragment");
		
		GlutinousRice = new ItemGlutinousRice(GlutinousRiceID-256);
		GameRegistry.registerItem(GlutinousRice, "GlutinousRice");
		
		Straw = new ItemStraw(StrawID-256);
		GameRegistry.registerItem(Straw, "Straw");
		
		BlackStone = new BlockBlackStone(BlackStoneID, Material.rock);
		GameRegistry.registerBlock(BlackStone, "BlackStone");
		
		Dumpling = new ItemDumpling(DumplingID-256, 4, true);
		GameRegistry.registerItem(Dumpling, "Dumpling");
		
		SoySauce = new ItemSoySauce(SoySauceID-256, 1, false);
		GameRegistry.registerItem(SoySauce, "SoySauce");
		
		FermentedSoybeans = new ItemFermentedSoybeans(FermentedSoybeansID-256, 6, true);
		GameRegistry.registerItem(FermentedSoybeans, "FermentedSoybeans");
		
		Soybeans = new ItemSoybeans(SoybeansID-256, 2, true);
		GameRegistry.registerItem(Soybeans, "Soybeans");
		
		SpongeGourd = new ItemSpongeGourd(SpongeGourdID-256);
		GameRegistry.registerItem(SpongeGourd, "SpongeGourd");
		
		DrySpongeGourd = new ItemDrySpongeGourd(DrySpongeGourdID-256);
		GameRegistry.registerItem(DrySpongeGourd, "DrySpongeGourd");
		
		Kimchi = new ItemKimchi(KimchiID-256, 4, true);
		GameRegistry.registerItem(Kimchi, "Kimchi");
		
		JapaneseLeek = new ItemJapaneseLeek(JapaneseLeekID-256, 4, true);
		GameRegistry.registerItem(JapaneseLeek, "JapaneseLeek");
		
		Mustard = new ItemMustard(MustardID-256, 4, true);
		GameRegistry.registerItem(Mustard, "Mustard");
		
		Capsicum = new ItemCapsicum(CapsicumID-256, 4, true);
		GameRegistry.registerItem(Capsicum, "Capsicum");
		
		Rice = new ItemRice(RiceID-256, 4, true);
		GameRegistry.registerItem(Rice, "Rice");
		
		SeaMustardRevision = new ItemSeaMustardRevision(SeaMustardRevisionID-256, 2, true);
		GameRegistry.registerItem(SeaMustardRevision, "SeaMustardRevision");
		
		OreDictionary.registerOre("oreFluorite", new ItemStack(this.oreFluorite, 1, 0));
		
		OreDictionary.registerOre("gemFluorite", new ItemStack(this.itemFluorite, 1, 0));
		
		OreDictionary.registerOre("oreTNT", new ItemStack(this.oreTNT, 1, 0));
		
		OreDictionary.registerOre("natto", new ItemStack(this.FermentedSoybeans, 1, 0));
		
		OreDictionary.registerOre("soybeans", new ItemStack(this.Soybeans, 1, 0));
		
		OreDictionary.registerOre("bottlesoysauce", new ItemStack(this.SoySauce, 1, 0));
		
		OreDictionary.registerOre("oreAdamantite", new ItemStack(this.oreAdamantite, 1, 0));
		
		OreDictionary.registerOre("oreCobalt", new ItemStack(this.oreCobalt, 1, 0));
		
		OreDictionary.registerOre("oreDemonite", new ItemStack(this.oreDemonite, 1, 0));
		
		OreDictionary.registerOre("oreHellstone", new ItemStack(this.oreHellstone, 1, 0));
		
		OreDictionary.registerOre("oreMeteorite", new ItemStack(this.oreMeteorite, 1, 0));
		
		OreDictionary.registerOre("oreMythril", new ItemStack(this.oreMythril, 1, 0));
		
		OreDictionary.registerOre("Adamantite", new ItemStack(this.Adamantite, 1, 0));
		
		OreDictionary.registerOre("Cobalt", new ItemStack(this.Cobalt, 1, 0));
		
		OreDictionary.registerOre("Demonite", new ItemStack(this.Demonite, 1, 0));
		
		OreDictionary.registerOre("Hellstone", new ItemStack(this.Hellstone, 1, 0));
		
		OreDictionary.registerOre("Meteorite", new ItemStack(this.Meteorite, 1, 0));
		
		OreDictionary.registerOre("Mythril", new ItemStack(this.Mythril, 1, 0));
		
		OreDictionary.registerOre("Rice", new ItemStack(this.Rice, 1, 0));
		
		OreDictionary.registerOre("JapaneseLeek", new ItemStack(this.JapaneseLeek, 1, 0));
		
		OreDictionary.registerOre("GlutinousRice", new ItemStack(this.GlutinousRice, 1, 0));
		
		OreDictionary.registerOre("RiceCake", new ItemStack(this.RiceCake, 1, 0));
		}
	
	@EventHandler
	public void init1(FMLInitializationEvent event) throws IOException
	{
		GameRegistry.addRecipe(new ItemStack(blockCorrugated, 1),
		new Object[]{ "X X","X X","XXX",
				'X',Item.paper});
		
		GameRegistry.addRecipe(new ItemStack(blockCorrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',itemCorrugatedBoard});
		
		GameRegistry.addShapelessRecipe(new ItemStack(itemCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(blockCorrugated,1)});
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(blockCorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(Item.paper, 1, 0)}));
		
		GameRegistry.addRecipe(new ItemStack(blockStrongCorrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',itemStrongPaper});
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(blockStrongCorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(itemStrongPaper, 1, 0)}));
		
		GameRegistry.addRecipe(new ItemStack(itemCutter, 1),
				new Object[]{ "XYX","XYX","XYX",
						'X',Item.stick,'Y',itemEdge});
		
		GameRegistry.addShapelessRecipe(new ItemStack(itemStrongPaper, 1),
				new Object[]{
				new ItemStack(Item.paper,1),new ItemStack(Block.obsidian,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(itemEdge, 1),
				new Object[]{
					new ItemStack(itemPolishngPowder,1),new ItemStack(itemRustyEdge,1)});
		
		GameRegistry.addSmelting(Item.ingotIron.itemID, new ItemStack(itemEdge, 1), 0.75F);
		
		GameRegistry.addSmelting(oreFluorite.blockID, new ItemStack(itemFluorite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreAdamantite.blockID, new ItemStack(Adamantite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreCobalt.blockID, new ItemStack(Cobalt, 1), 0.99F);
		
		GameRegistry.addSmelting(oreDemonite.blockID, new ItemStack(Demonite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreHellstone.blockID, new ItemStack(Hellstone, 1), 0.99F);
		
		GameRegistry.addSmelting(oreMeteorite.blockID, new ItemStack(Meteorite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreMythril.blockID, new ItemStack(Mythril, 1), 0.99F);
		
		GameRegistry.addRecipe(new ItemStack(blockStrongCorrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',itemStrongCorrugatedBoard});
		
		GameRegistry.addShapelessRecipe(new ItemStack(itemStrongCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(blockStrongCorrugated,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(TemperedGlass, 1),
				new Object[]{
				new ItemStack(Block.glass,1),new ItemStack(Block.obsidian,1)});
		
		GameRegistry.addRecipe(new ItemStack(Gum, 1),
				new Object[]{ "XXX","YYY"," Z ",
						'X',Item.sugar,'Y',Item.wheat,'Z',Item.bucketWater});
		
		GameRegistry.addShapelessRecipe(new ItemStack(MintGum, 6),
				new Object[]{
				new ItemStack(Gum,1),new ItemStack(Item.ingotGold,1)});
		
		GameRegistry.addRecipe(new ItemStack(SuperMintGum, 1),
				new Object[]{ " Y ","YXY"," Y ",
						'X',MintGum,'Y',Item.redstone});
		
		GameRegistry.addRecipe(new ItemStack(ChocolateBar, 1),
				new Object[]{ " X ","YZY","ZYZ",
						'X',Item.bucketWater,'Y',Item.sugar,'Z',new ItemStack(Item.dyePowder, 1, 3)});
		
			GameRegistry.addShapelessRecipe(new ItemStack(blockTStone, 1),
			new Object[]{
				new ItemStack(Block.tnt,1),new ItemStack(Block.stone,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(RiceCake, 1),
					new Object[]{
					new ItemStack(GlutinousRice,1),new ItemStack(Item.bucketWater,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(PickledPlum, 1),
					new Object[]{
					new ItemStack(SolarFragment,1),new ItemStack(Item.bucketWater,1),new ItemStack(Plum,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(Straw, 1),
					new Object[]{
					new ItemStack(SolarFragment,1),new ItemStack(Item.wheat,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(BlackStone, 1),
					new Object[]{
					new ItemStack(Block.stone,1),new ItemStack(Item.dyePowder, 1, 0)});
			
			GameRegistry.addRecipe(new ItemStack(Dumpling, 1),
					new Object[]{ "X Y"," X ","  Z",
							'X',RiceCake,'Y',SoySauce,'Z',new ItemStack(Item.stick, 1)});
			
			GameRegistry.addRecipe(new ItemStack(FermentedSoybeans, 1),
					new Object[]{ " X "," Y "," Z ",
							'X',SoySauce,'Y',Soybeans,'Z',Straw});
			
			GameRegistry.addRecipe(new ItemStack(Block.sponge, 1),
					new Object[]{ "XXX","XXX","XXX",
							'X',DrySpongeGourd});
			
			GameRegistry.addShapelessRecipe(new ItemStack(DrySpongeGourd, 1),
					new Object[]{
					new ItemStack(SpongeGourd,1),new ItemStack(SolarFragment, 1)});
	}
}