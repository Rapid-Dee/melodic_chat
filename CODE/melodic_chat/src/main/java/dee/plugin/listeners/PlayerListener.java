package dee.plugin.listeners;

import org.bukkit.event.player.*;
import org.bukkit.event.player.PlayerEvent.*;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.*;


import org.bukkit.ChatColor;

import java.util.Random;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class PlayerListener implements Listener {
    
    Dictionary<String, ChatColor> playerColors = new Hashtable<>();
    Random r = new Random();
    String[] NOTES = {
        "~♪♫",
        "~♪",
        "~♫"
    };
    ChatColor[] COLORS = {
        ChatColor.WHITE,    ChatColor.RED,
        ChatColor.YELLOW,   ChatColor.GREEN,
        ChatColor.AQUA
    };

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Handle player join event
        Player player = event.getPlayer();
        int index = r.nextInt(COLORS.length);
        playerColors.put(player.getDisplayName(), COLORS[index]);

    }
    @EventHandler
    public void onPlayerChatEvent(PlayerChatEvent event) {
        String s = event.getMessage();
        Player player = event.getPlayer();
        int index = r.nextInt(NOTES.length);
        event.setMessage(playerColors.get(player.getDisplayName()) + s + NOTES[index]);
        // Handle player chatting
        //Input input;
    }
}