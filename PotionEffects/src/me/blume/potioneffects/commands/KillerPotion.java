package me.blume.potioneffects.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.blume.potioneffects.Main;

public class KillerPotion implements CommandExecutor{

	private Main plugin;
	public KillerPotion(Main plugin) {
		this.plugin=plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(label.equals("killerpotion")) {
			if(args.length==0) {
				if(!plugin.getPotionGetter().contains(player.getUniqueId())) {
					player.sendMessage("You are added");
					plugin.addPotionGetter(player);
				}
				else {
					player.sendMessage("You are already added");
				}
			}
			else if(args.length==1) {
				Player player2 = Bukkit.getPlayer(args[0]);
				if(player2!=null) {
					if(!plugin.getPotionGetter().contains(player2.getUniqueId())) {
						plugin.addPotionGetter(player2);
						player2.sendMessage("You are added");
						player.sendMessage(player2.getName()+" added");
					}
					else {
						sender.sendMessage("That Player is already added");
					}
				}
				else {
					sender.sendMessage("Could not find a player to add");
				}
			}
		}




		return false;
	}
}
