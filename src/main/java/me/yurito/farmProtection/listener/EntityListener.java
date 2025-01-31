package me.yurito.farmProtection.listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;

public class EntityListener implements Listener {
    @EventHandler
    public void onEntityInteract(EntityInteractEvent event) {
        Block block = event.getBlock();
        if (block != null && block.getType() == Material.FARMLAND) {
            event.setCancelled(true);
        }
    }
}