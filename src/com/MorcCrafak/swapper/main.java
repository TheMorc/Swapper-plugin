package com.MorcCrafak.swapper;


import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
//import org.bukkit.event.EventHandler;
//import org.bukkit.event.player.PlayerInteractEvent;

public class main extends JavaPlugin{
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		Player player = event.getPlayer();
		if(player.getItemInHand().getType() == Material.RECORD_5);{
		}		
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args){
		
		Player player = (Player) sender; // nastav� player instanciu na kick atd...
		  if(commandlabel.equalsIgnoreCase("swap")){ // zistuje ci hrac napisal prikaz
			  if(player.hasPermission("MorcCrafak.swap")){
			  if(args.length == 0) {
				  player.sendMessage("Too few arguments!");
			  }else if(args.length == 1) {
				  Player victim = player.getServer().getPlayer(args[0]);
				  Location loc0 = victim.getLocation();
				  Location loc1 = player.getLocation();
				  victim.teleport(loc1);
				  player.teleport(loc0);
			  }

		}else{
			player.sendMessage(ChatColor.RED + "You don't have permission for this!");
		}
		
		  }
		  return false;
		  }
}
