package com.dounsm.dounsmmod;

import com.dounsm.dounsmmod.register.BEReg;
import com.dounsm.dounsmmod.register.BlockReg;
import com.dounsm.dounsmmod.register.ItemReg;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MyFirst.MOD_ID)
public class MyFirst {
  // Directly reference a slf4j logger
  private static final Logger LOGGER = LogUtils.getLogger();
  public static final String MOD_ID = "myfirst";

  public MyFirst() {
    LOGGER.info("Loading MyFirst ...");
    IEventBus iEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    BlockReg.BLOCKREG.register(iEventBus);
    BlockReg.ITEMREG.register(iEventBus);
    ItemReg.ITEMREG.register(iEventBus);
    BEReg.BEREG.register(iEventBus);

    BlockReg.RegAll();
    ItemReg.RegAll();
    BEReg.RegAll();
    // Register ourselves for server and other game events we are interested in
    MinecraftForge.EVENT_BUS.register(this);
  }

  ;


}
