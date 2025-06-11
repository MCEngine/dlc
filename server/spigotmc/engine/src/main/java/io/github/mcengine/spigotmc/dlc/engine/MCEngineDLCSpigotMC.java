package io.github.mcengine.spigotmc.dlc.engine;

import io.github.mcengine.api.mcengine.MCEngineApi;
import io.github.mcengine.api.mcengine.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class MCEngineDLCSpigotMC extends JavaPlugin {

    /**
     * Called when the plugin is enabled.
     */
    @Override
    public void onEnable() {
        new Metrics(this, 25752);
        saveDefaultConfig(); // Save config.yml if it doesn't exist

        boolean enabled = getConfig().getBoolean("enable", false);
        if (!enabled) {
            getLogger().warning("Plugin is disabled in config.yml (enable: false). Disabling plugin...");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        MCEngineApi.checkUpdate(this, getLogger(), "github", "MCEngine", "dlc-engine", getConfig().getString("github.token", "null"));
    }

    /**
     * Called when the plugin is disabled.
     */
    @Override
    public void onDisable() {}
}
