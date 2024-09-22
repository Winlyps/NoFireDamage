package winlyps.noFireDamage

import org.bukkit.plugin.java.JavaPlugin

class NoFireDamage : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(FireDamageListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}