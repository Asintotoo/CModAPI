
package com.asintoto.cmod.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 *
 * @author Asintoto
 */
public class CModPunishmentEvent extends Event implements Cancellable{
    private static final HandlerList HANDLERS = new HandlerList();
    private boolean isCancelled;
    private final Player player;
    private final int violetions;
    
    public CModPunishmentEvent(Player player, int violetions) {
        this.player = player;
        this.violetions = violetions;
        this.isCancelled = false;
    }
    
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
    
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }
    
    @Override
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
    
    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }
    
    public Player getPlayer() {
        return this.player;
    }
    
    public int getPlayerVioletions() {
        return this.violetions;
    }
}
