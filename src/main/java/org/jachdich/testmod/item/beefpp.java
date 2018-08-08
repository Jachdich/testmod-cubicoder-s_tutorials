package org.jachdich.testmod.item;
import  org.jachdich.testmod.testmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class beefpp extends Item {
 
    public beefpp(String unlocalizedName, String registryName) {
        setUnlocalizedName(testmod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MISC);
    }
 
}