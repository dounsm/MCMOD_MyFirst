package com.dounsm.dounsmmod.blocks;

import com.dounsm.dounsmmod.items.Huaji;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.client.event.ColorHandlerEvent;
import java.math.BigInteger;
import java.util.Random;

public class TouZi extends Block {
  public static String m_block_id = "touzi";
  public TouZi(){
    super(Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(5f,6f).requiresCorrectToolForDrops());
  };
  public BigInteger counter = new BigInteger("0");

  @Override
  public void tick(BlockState p_60462_, ServerLevel p_60463_, BlockPos p_60464_, Random p_60465_) {
    super.tick(p_60462_, p_60463_, p_60464_, p_60465_);
  }

  @Override
  public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
//        return super.use(blockState,level,blockPos,player,interactionHand,blockHitResult);
    if(blockHitResult.getDirection()!= Direction.UP){return super.use(blockState,level,blockPos,player,interactionHand,blockHitResult);};
//        if(player.getHandSlots() TntBlock.)
    if(player.getItemInHand(interactionHand).getItem().equals(Items.TNT) ) {
      level.explode(null, blockPos.getX(), blockPos.getY(), blockPos.getZ(), 10.0f, Explosion.BlockInteraction.DESTROY);
    }else if(player.getItemInHand(interactionHand).getItem() instanceof Huaji){
      for(int xoffset=-10;xoffset<=10;xoffset++){
        for(int zoffset=-10;zoffset<=10;zoffset++){
          level.explode(null, blockPos.getX()+xoffset, blockPos.getY(), blockPos.getZ()+zoffset, 5.0f, Explosion.BlockInteraction.DESTROY);
        };
      }
    };
    return InteractionResult.SUCCESS;
  }
}
