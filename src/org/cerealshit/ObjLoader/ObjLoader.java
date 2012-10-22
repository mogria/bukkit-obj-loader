package org.cerealshit.ObjLoader;

import org.bukkit.plugin.java.JavaPlugin;

public class ObjLoader extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("ObjLoader has been enabled.");
        
        getCommand("objloader").setExecutor(new ObjLoaderCommandExecutor(this));
    }
 
    @Override
    public void onDisable() {
        getLogger().info("ObjLoader has been disabled.");
    }
}
