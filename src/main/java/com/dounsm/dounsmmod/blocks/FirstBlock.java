package com.dounsm.dounsmmod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class FirstBlock extends Block {
    public static String m_block_id = "first_block";
    public FirstBlock(){
        super(Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(5f,6f));
    };
}
