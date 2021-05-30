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
	@EventHandler
	public void onKillEvent(PlayerDeathEvent event) {
		Player killer = event.getEntity().getKiller();
		Player victim = (Player) event.getEntity();
		if(killer instanceof Player &&plugin.getPotionGetter().contains(killer.getUniqueId())) {
			if(!plugin.getPotionGetter().contains(victim.getUniqueId())) {
				plugin.getConfig().set("KillCount", (plugin.getConfig().getInt("KillCount"))+1);
				plugin.getConfig().set("DurationTime",(plugin.getConfig().getInt("DurationTime"))+20);
				plugin.saveConfig();
				if(plugin.getConfig().getInt("KillCount")==0) {
					return;
				}
				if(plugin.getConfig().getInt("KillCount")==1) { killer.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,(plugin.getConfig().getInt("DurationTime"))*20,plugin.getConfig().getInt("KillCount")));
				}
				else if(plugin.getConfig().getInt("KillCount")==2) { killer.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,(plugin.getConfig().getInt("DurationTime"))*20,plugin.getConfig().getInt("KillCount")));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,(plugin.getConfig().getInt("DurationTime"))*20,1)); 
				}
				else if(plugin.getConfig().getInt("KillCount")==3) {killer.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,(plugin.getConfig().getInt("DurationTime"))*20,plugin.getConfig().getInt("KillCount")));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,(plugin.getConfig().getInt("DurationTime"))*20,1));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount")))); 
				}
				else if(plugin.getConfig().getInt("KillCount")==4) {killer.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,(plugin.getConfig().getInt("DurationTime"))*20,plugin.getConfig().getInt("KillCount")));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,(plugin.getConfig().getInt("DurationTime"))*20,1));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				}
				else if(plugin.getConfig().getInt("KillCount")==5) {killer.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,(plugin.getConfig().getInt("DurationTime"))*20,2));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount")))); 
				}
				else if(plugin.getConfig().getInt("KillCount")==6) {killer.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,(plugin.getConfig().getInt("DurationTime"))*20,2));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				}
				else if(plugin.getConfig().getInt("KillCount")==7) { killer.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,(plugin.getConfig().getInt("DurationTime"))*20,2));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				}
				else if(plugin.getConfig().getInt("KillCount")==8) { killer.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,(plugin.getConfig().getInt("DurationTime"))*20,2));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				}
				else if(plugin.getConfig().getInt("KillCount")==9) { killer.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,(plugin.getConfig().getInt("DurationTime"))*20,2));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				killer.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				}
				else {
					killer.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
					killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,(plugin.getConfig().getInt("DurationTime"))*20,2));
					killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
					killer.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
					killer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
					killer.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
					killer.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
					killer.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,(plugin.getConfig().getInt("DurationTime"))*20,(plugin.getConfig().getInt("KillCount"))));
				}
			}
		}
	}
}
				
