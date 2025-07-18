package com.excsi.riftfixes;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ModConfig {

    public static Configuration config;

    public static boolean enableChromatiCraftMixin;

    public static boolean hasSound;

    public static boolean hasShader;

    public static boolean disableStrataVents;

    public static boolean disableStrataOreVeins;

    public static boolean enableArmorMixin;

    public static boolean changeArmorBarAmount;

    public static float protectionMultiplier;

    public static void init(File file){
        config = new Configuration(file);
        syncConfig();
    }

    public static void syncConfig(){
        enableChromatiCraftMixin = config.getBoolean("ChromatiCraftMixin","general",true,"Toggles the progression effects");
        hasSound = config.getBoolean("SoundEffect","general",false,"Toggles progression's sound effects");
        hasShader= config.getBoolean("ShaderEffect","general",false,"Toggles progression's shader effects");
        disableStrataVents = config.getBoolean("DisableStrataVents","general",false,"Toggles GeoStrata's vent spawn");
        disableStrataOreVeins = config.getBoolean("DisableStrataOreVeins","general",false,"Toggles GeoStrata's ore vein spawn");
        enableArmorMixin = config.getBoolean("EnableArmorMixin","general",true,"Enable mixin scaling armor protections");
        changeArmorBarAmount = config.getBoolean("ChangeArmorBarAmount","general",true,
                "Enable mixin that changes armor bar displayed amount, may affect other things");
        protectionMultiplier = config.getFloat("protectionMultiplier","general",0.5F,0.0F,1F,"Scales armor's protection(1.0 is unchanged armor)");
        config.save();
    }
}