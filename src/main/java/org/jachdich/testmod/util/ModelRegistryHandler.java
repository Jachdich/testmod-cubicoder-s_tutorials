package org.jachdich.testmod.util;
import  org.jachdich.testmod.init.testitems;
import  net.minecraft.client.renderer.block.model.ModelResourceLocation;
import  net.minecraft.item.Item;
import  net.minecraftforge.client.event.ModelRegistryEvent;
import  net.minecraftforge.client.model.ModelLoader;
import  net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import  net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import  net.minecraftforge.fml.relauncher.Side;
 
@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {
    
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(testitems.beef_plus_plus);
    }
    
    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
 
}