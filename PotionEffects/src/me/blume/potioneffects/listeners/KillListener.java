package me.blume.potioneffects.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.blume.potioneffects.Main;

public class KillListener implements Listener{
	private Main plugin;
	public KillListener(Main plugin) {
		this.plugin=plugin;
	}
	PotionEffectType[] potions = {PotionEffectType.DOLPHINS_GRACE,PotionEffectType.SPEED,PotionEffectType.REGENERATION,
			PotionEffectType.FAST_DIGGING,PotionEffectType.INCREASE_DAMAGE,PotionEffectType.FIRE_RESISTANCE,PotionEffectType.WATER_BREATHING,
			PotionEffectType.INVISIBILITY};
	public void addPotions(Player player,int level,int time) {
		if(level< potions.length) {
			for(int i =0;i<level;i++) {
				player.addPotionEffect(new PotionEffect(potions[i],time*20,level));
			}
		}
		else {
			for(int i=0;i<potions.length;i++) {
				player.addPotionEffect(new PotionEffect(potions[i],time*20,level));
			}
		}
	}
	@EventHandler
	public void onKillEvent(PlayerDeathEvent event) {
		Player killer = event.getEntity().getKiller();
		Player victim = (Player) event.getEntity();
		if(killer instanceof Player &&plugin.getPotionGetter().contains(killer.getUniqueId())) {
			if(!plugin.getPotionGetter().contains(victim.getUniqueId())) {
				plugin.getConfig().set("KillCount", (plugin.getConfig().getInt("KillCount"))+1);
				plugin.getConfig().set("DurationTime",(plugin.getConfig().getInt("DurationTime"))+20);
				plugin.saveConfig();
				addPotions(killer,plugin.getConfig().getInt("KillCount"),plugin.getConfig().getInt("DurationTime"));
			}
		}
		
	}
}
				
