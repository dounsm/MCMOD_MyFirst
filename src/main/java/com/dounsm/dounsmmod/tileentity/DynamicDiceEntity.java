package com.dounsm.dounsmmod.tileentity;

import com.dounsm.dounsmmod.blocks.DynamicDice;
import com.dounsm.dounsmmod.register.BEReg;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class DynamicDiceEntity extends BlockEntity {
  public static String id = DynamicDice.m_block_id;
  public DynamicDiceEntity(BlockPos pos, BlockState state){
    super(BEReg.REGMAP.get(id).get(),pos,state);
  };
}


