package com.dounsm.dounsmmod.blocks;

import com.dounsm.dounsmmod.tileentity.DynamicDiceEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class DynamicDice extends TouZi implements EntityBlock {
  public static String m_block_id = "dynamic_dice";
  public DynamicDice(){
    super();
  };

  @Nullable
  @Override
  public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
    return new DynamicDiceEntity(blockPos,blockState);
  }
}
