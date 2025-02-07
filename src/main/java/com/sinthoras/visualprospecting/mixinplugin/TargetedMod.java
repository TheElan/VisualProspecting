package com.sinthoras.visualprospecting.mixinplugin;

public enum TargetedMod {

    //
    // IMPORTANT: Do not make any references to any mod from this file. This file is loaded quite early on and if
    // you refer to other mods you load them as well. The consequence is: You can't inject any previously loaded classes!
    // Exception: Tags.java, as long as it is used for Strings only!
    //

    // Replace with your injected mods here, but always keep VANILLA:
    VANILLA("Minecraft", "unused", true),
    GREGTECH("GregTech", "gregtech", true),
    JOURNEYMAP("JourneyMap", "journeymap-1.7.10", true),
    XAEROWORLDMAP("Xaero's World Map", "XaerosWorldMap", true),
    XAEROMINIMAP("Xaero's Minimap", "Xaeros_Minimap", true),
    TCNODETRACKER("TCNodeTracker", "tcnodetracker-1.7.10", true),
    BARTWORKS("Bartworks", "bartworks", false),
    GALACTICGREG("GalacticGreg", "GalacticGreg", false);

    public final String modName;
    public final String jarNameBeginsWith;
    // Optional dependencies can be omitted in development. Especially skipping GT5U will drastically speed up your game start!
    public final boolean loadInDevelopment;

    TargetedMod(String modName, String jarNameBeginsWith, boolean loadInDevelopment) {
        this.modName = modName;
        this.jarNameBeginsWith = jarNameBeginsWith;
        this.loadInDevelopment = loadInDevelopment;
    }
}
