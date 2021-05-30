package me.blume.potioneffects;

import java.util.HashSet;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.blume.potioneffects.commands.KillerPotion;
import me.blume.potioneffects.commands.RemoveKillerPotion;
import me.blume.potioneffects.listeners.KillListener;

public class Main extends JavaPlugin{
	HashSet<UUID> potiongetter = new HashSet<UUID>();
	@Override
	public void onEnable() {
		getCommand("killerpotion").setExecutor(new KillerPotion(this));
		getCommand("killerpotionremove").setExecutor(new RemoveKillerPotion(this));
		Bukkit.getPluginManager().registerEvents(new KillListener(this), this);
		loadConfig();
	}
	@Override
	public void onDisable() {
		
	}
	public void addPotionGetter(Player player) {
		potiongetter.add(player.getUniqueId());
	}

	public void removePotionGetter(Player player) {
		potiongetter.remove(player.getUniqueId());
	}
	public HashSet<UUID> getPotionGetter(){
		return potiongetter;
	}
	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}
