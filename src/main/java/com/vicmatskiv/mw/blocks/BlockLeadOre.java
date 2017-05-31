package com.vicmatskiv.mw.blocks;

import java.util.Random;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockLeadOre extends Block {
	
	public BlockLeadOre()
	{
		super(Material.ROCK);
		//setRegistryName(ModernWarfareMod.MODID + "_" + "LeadOre");
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "LeadOre");
		setHardness(6F);
		setResistance(600000F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	public Block getBlockDropped(int meta, Random rand, int fortune)
		{
			return Ores.LeadOre;
		}
		
	}