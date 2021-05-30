package me.blume.potioneffects.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.blume.potioneffects.Main;

public class RemoveKillerPotion implements CommandExecutor {
	private Main plugin;
	public RemoveKillerPotion(Main plugin) {
		this.plugin=plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(label.equals("killerpotionremove")) {
			if(args.length==0) {
				if(plugin.getPotionGetter().contains(player.getUniqueId())) {
					player.sendMessage("You are removed");
					plugin.removePotionGetter(player);
					plugin.getConfig().set("KillCount", 0);
					plugin.getConfig().set("DurationTime",0);
					plugin.saveConfig();
				}
				else {
					player.sendMessage("You are not added");
				}
			}
			else if(args.length==1) {
				Player player2 = Bukkit.getPlayer(args[0]);
				if(player2!=null) {
					if(plugin.getPotionGetter().contains(player2.getUniqueId())) {
						plugin.removePotionGetter(player2);
						player2.sendMessage("You are removed");
						player.sendMessage(player2.getName()+" removed");
						plugin.getConfig().set("KillCount", 0);
						plugin.getConfig().set("DurationTime",0);
						plugin.saveConfig();
					}
					else {
						sender.sendMessage("That Player is not added");
					}
				}
				else {
					sender.sendMessage("Could not find a player to remove");
				}
			}
		}
		return false;
	}

}
