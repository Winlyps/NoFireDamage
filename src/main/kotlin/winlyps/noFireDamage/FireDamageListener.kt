package winlyps.noFireDamage

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.plugin.Plugin

class FireDamageListener(private val plugin: Plugin) : Listener {

    @EventHandler
    fun onEntityDamage(event: EntityDamageEvent) {
        // Check if the damage is caused by fire or lava
        if (event.cause == EntityDamageEvent.DamageCause.FIRE ||
                event.cause == EntityDamageEvent.DamageCause.FIRE_TICK ||
                event.cause == EntityDamageEvent.DamageCause.LAVA) {
            // Cancel the event to prevent damage
            event.isCancelled = true
        }
    }
}