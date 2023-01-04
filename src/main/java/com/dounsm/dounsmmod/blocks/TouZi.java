package com.dounsm.dounsmmod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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


public class TouZi extends Block {
    public static String m_block_id = "touzi";
    public TouZi(){
        super(Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(5f,6f));
    };

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
//        return super.use(blockState,level,blockPos,player,interactionHand,blockHitResult);
        if(blockHitResult.getDirection()!= Direction.UP){return super.use(blockState,level,blockPos,player,interactionHand,blockHitResult);};
//        if(player.getHandSlots() TntBlock.)
        if(player.getItemInHand(interactionHand).getItem().equals(Items.TNT) ) {
            level.explode(null, blockPos.getX(), blockPos.getY(), blockPos.getZ(), 10.0f, Explosion.BlockInteraction.DESTROY);
        };
        return InteractionResult.SUCCESS;
    }
}
