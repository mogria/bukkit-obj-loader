
package org.cerealshit.ObjLoader;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ObjLoaderCommandExecutor implements CommandExecutor {
    private  ObjLoader plugin;
    
    public ObjLoaderCommandExecutor(ObjLoader plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
        sender.sendMessage("you just executed this the /" + cmd.getName() + " of the image Loader plugin :)");
        if(sender instanceof Player) {
            if(args.length >= 1) {
                // put awesome code here ...
            } else {
                return false;
            }
        } else {
            sender.sendMessage("you con't do this on the console");
        }
        return true;
    }
}
