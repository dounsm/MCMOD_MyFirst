package com.dounsm.dounsmmod.tileentity;

import com.dounsm.dounsmmod.blocks.Counter;
import com.dounsm.dounsmmod.register.BEReg;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CounterEntity extends BlockEntity {
  public static String id = Counter.m_block_id;
  public int mcounter = 0;

  public CounterEntity(BlockPos pos, BlockState state){
    super(BEReg.REGMAP.get(id).get(),pos,state);
  };

  public void update(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult){
    mcounter++;
    TranslatableComponent translatableComponent = new TranslatableComponent("message.myfirst.counter_update",mcounter);
    player.sendMessage(translatableComponent,player.getUUID());
    setChanged(level,blockPos,blockState);
  };

//  @Override
//  public CompoundTag serializeNBT() {
//    CompoundTag tag = super.serializeNBT();
//    tag.putInt("mcounter",mcounter);
//    return tag;
//  }
//
//  @Override
//  public void deserializeNBT(CompoundTag nbt) {
//    super.deserializeNBT(nbt);
//    mcounter = nbt.getInt("mcounter");
//  }


  @Override
  public void load(CompoundTag tag) {
    super.load(tag);
    mcounter = tag.getInt("mcounter");
  }

  @Override
  protected void saveAdditional(CompoundTag tag) {
    super.saveAdditional(tag);
    tag.putInt("mcounter",mcounter);
  }
}
