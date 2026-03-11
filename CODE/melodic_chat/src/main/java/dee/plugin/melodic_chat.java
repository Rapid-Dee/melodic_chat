package dee.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import dee.plugin.managers.PluginManager;
import dee.plugin.listeners.PlayerListener;

public class melodic_chat extends JavaPlugin {
    
    @Override
    public void onEnable() {
        
        // Initialize managers
        PluginManager.getInstance().initialize();
        
        // Register listeners
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        
        getLogger().info("melodic_chat has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("melodic_chat has been disabled!");
    }
    
}