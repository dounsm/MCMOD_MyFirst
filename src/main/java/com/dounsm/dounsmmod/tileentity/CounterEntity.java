package com.dounsm.dounsmmod.tileentity;

import com.dounsm.dounsmmod.blocks.Counter;
import com.dounsm.dounsmmod.register.BEReg;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CounterEntity extends BlockEntity {
  public static String id = Counter.m_block_id;
  public int mcounter = 0;

  public CounterEntity(BlockPos pos, BlockState state){
    super(BEReg.REGMAP.get(id).get(),pos,state);
  };

  public void update(Player player){
    TranslatableComponent translatableComponent = new TranslatableComponent("message.myfirst.counter_update",mcounter);
    player.sendMessage(translatableComponent,player.getUUID());
    mcounter++;
  };

}
