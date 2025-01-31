package me.yurito.farmProtection;

import me.yurito.farmProtection.listener.EntityListener;
import me.yurito.farmProtection.listener.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FarmProtection extends JavaPlugin {
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new EntityListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
    }
}