package org.jachdich.testmod.util;
 
import  org.jachdich.testmod.item.beefpp;
 
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
 
    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new beefpp("beefpp", "beef_plus_plus")
        };
 
        event.getRegistry().registerAll(items);
    }
 
}