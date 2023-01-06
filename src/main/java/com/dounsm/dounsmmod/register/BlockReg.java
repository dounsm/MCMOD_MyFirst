package com.dounsm.dounsmmod.register;

import com.dounsm.dounsmmod.MyFirst;
import com.dounsm.dounsmmod.blocks.Counter;
import com.dounsm.dounsmmod.blocks.DynamicDice;
import com.dounsm.dounsmmod.blocks.FirstBlock;
import com.dounsm.dounsmmod.blocks.TouZi;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;

public class BlockReg {
  public static DeferredRegister<Block> BLOCKREG = DeferredRegister.create(ForgeRegistries.BLOCKS, MyFirst.MOD_ID);
  public static DeferredRegister<Item> ITEMREG = DeferredRegister.create(ForgeRegistries.ITEMS, MyFirst.MOD_ID);
  public static HashMap<String, RegistryObject<Block>> registryObjectHashMapBlock = new HashMap<>();
  public static HashMap<String,RegistryObject<Item>> registryObjectHashMapItem = new HashMap<>();

  public static void RegAll() {
    registryObjectHashMapBlock.put(FirstBlock.m_block_id, BLOCKREG.register(FirstBlock.m_block_id, FirstBlock::new));
    registryObjectHashMapItem.put(FirstBlock.m_block_id,ITEMREG.register(FirstBlock.m_block_id,()->new BlockItem(
      registryObjectHashMapBlock.get(FirstBlock.m_block_id).get(),
      new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)
    )));

    registryObjectHashMapBlock.put(TouZi.m_block_id, BLOCKREG.register(TouZi.m_block_id, TouZi::new));
    registryObjectHashMapItem.put(TouZi.m_block_id,ITEMREG.register(TouZi.m_block_id,()->new BlockItem(
      registryObjectHashMapBlock.get(TouZi.m_block_id).get(),
      new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)
    )));

    registryObjectHashMapBlock.put(Counter.m_block_id, BLOCKREG.register(Counter.m_block_id, Counter::new));
    registryObjectHashMapItem.put(Counter.m_block_id,ITEMREG.register(Counter.m_block_id,()->new BlockItem(
      registryObjectHashMapBlock.get(Counter.m_block_id).get(),
      new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)
    )));

    registryObjectHashMapBlock.put(DynamicDice.m_block_id, BLOCKREG.register(DynamicDice.m_block_id, DynamicDice::new));
    registryObjectHashMapItem.put(DynamicDice.m_block_id,ITEMREG.register(DynamicDice.m_block_id,()->new BlockItem(
      registryObjectHashMapBlock.get(DynamicDice.m_block_id).get(),
      new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)
    )));
  }
}
