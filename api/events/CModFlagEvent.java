
package com.asintoto.cmod.api.events;

import com.asintoto.cmod.api.enums.CheckType;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 *
 * @author Asintoto
 */
public class CModFlagEvent extends Event implements Cancellable{
    private static final HandlerList HANDLERS = new HandlerList();
    private final CheckType type;
    private boolean isCancelled;
    private final Player player;
    private String flaginfo;
    
    public CModFlagEvent(Player player, CheckType type, String flaginfo) {
        this.player = player;
        this.type = type;
        this.flaginfo = flaginfo;
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
    
    public CheckType getCheckType() {
        return this.type;
    }
    
    public String getFlagInfo() {
        return this.flaginfo;
    }
    
    public void setFlagInfo(String flaginfo) {
        this.flaginfo = flaginfo;
    }
}
