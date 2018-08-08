package org.jachdich.testmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.jachdich.testmod.proxy.IProxy;
import org.jachdich.testmod.proxy.ServerProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = testmod.MODID, name = testmod.NAME, version = testmod.VERSION)
public class testmod
{
    public static final String MODID = "testmod";
    public static final String NAME = "Test Mod";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";
    
    public static final String CLIENT = "org.jachdich.testmod.proxy.ClientProxy";
    public static final String SERVER = "org.jachdich.testmod.proxy.ServerProxy";
 
    @SidedProxy(clientSide = testmod.CLIENT, serverSide = testmod.SERVER)
    public static IProxy proxy;
    
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
