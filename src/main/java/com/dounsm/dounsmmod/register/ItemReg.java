package com.dounsm.dounsmmod.register;

import com.dounsm.dounsmmod.MyFirst;
import com.dounsm.dounsmmod.items.Huaji;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;

public class ItemReg {
    public static DeferredRegister<Item> ITEMREG = DeferredRegister.create(ForgeRegistries.ITEMS, MyFirst.MOD_ID);
    public static HashMap<String, RegistryObject<Item>> REGITEMS = new HashMap<>();

    public static void RegAll(){
      REGITEMS.put(Huaji.m_item_id,ITEMREG.register(Huaji.m_item_id,()->(
         new Huaji()
        )));
    };
}
