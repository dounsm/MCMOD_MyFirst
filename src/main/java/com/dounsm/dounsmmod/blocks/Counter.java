package com.dounsm.dounsmmod.blocks;

import com.dounsm.dounsmmod.tileentity.CounterEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class Counter extends Block implements EntityBlock {
  public static String m_block_id = "counter";
  public Counter(){
    super(Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(4f,5f).requiresCorrectToolForDrops());
  };

  @Nullable
  @Override
  public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
    return new CounterEntity(pos,state);
  }

  @Override
  public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
    if(level.isClientSide()){
      return InteractionResult.SUCCESS;
    };
    CounterEntity be = (CounterEntity) level.getBlockEntity(blockPos);
    be.update(player);
    return InteractionResult.SUCCESS;
  }
}
