package com.dounsm.dounsmmod.register;

import com.dounsm.dounsmmod.MyFirst;
import com.dounsm.dounsmmod.blocks.Counter;
import com.dounsm.dounsmmod.blocks.DynamicDice;
import com.dounsm.dounsmmod.tileentity.CounterEntity;
import com.dounsm.dounsmmod.tileentity.DynamicDiceEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;

public class BEReg {
  public static DeferredRegister<BlockEntityType<?>> BEREG = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MyFirst.MOD_ID);
  public static HashMap<String, RegistryObject<BlockEntityType<?>>> REGMAP = new HashMap<>();

  public static void RegAll(){
    REGMAP.put(CounterEntity.id,BEREG.register(CounterEntity.id,()->BlockEntityType.Builder.of(CounterEntity::new, BlockReg.registryObjectHashMapBlock.get(Counter.m_block_id).get()).build(null)));
    REGMAP.put(DynamicDiceEntity.id,BEREG.register(DynamicDiceEntity.id,()->BlockEntityType.Builder.of(DynamicDiceEntity::new, BlockReg.registryObjectHashMapBlock.get(DynamicDice.m_block_id).get()).build(null)));

  };
}
