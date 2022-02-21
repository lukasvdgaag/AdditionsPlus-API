package net.gcnt.additionsplus.api;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Base command class that holds all information about a (sub) command and its usage.
 */
public abstract class BaseCmd {

    public AdditionsPlugin plugin;
    public CommandSender sender;
    public String[] args;
    public String command;
    public String mainCommand = "additions";
    public boolean forcePlayer = false;
    public String permission = "additions.command";
    public String subUsage = "";
    public String usage = "";
    public Player player;

    public BaseCmd(AdditionsPlugin plugin) {
        this.plugin = plugin;
    }

    /**
     * Processes the command, used in listeners.
     * Checks for required permission.
     *
     * @param sender The sender of the command.
     * @param args   The arguments the sender provided.
     * @return True when completed, false on failure.
     */
    public boolean processCommand(CommandSender sender, String[] args) {
        this.sender = sender;
        this.args = args;

        if (sender instanceof Player) {
            this.player = (Player) this.sender;
        }

        if (forcePlayer) {
            if (!(sender instanceof Player)) {
                this.sender.sendMessage(ChatColor.RED + "You must be a player to perform this command");
                return true;
            }
        }

        if (!sender.hasPermission(permission)) {
            sender.sendMessage(ChatColor.RED + "You are not allowed to do this");
        } else {
            return run();
        }
        return true;
    }

    /**
     * The method that is called when this command is being executed.
     *
     * @return True when completed, false on failure.
     */
    public abstract boolean run();

    /**
     * Send the usage of this command to the sender.
     *
     * @param send Whether to send the message or only return its value.
     * @return The formatted usage string.
     */
    public String sendUsage(boolean send) {
        String k = usage.equals("") ? "&7" : " &7";
        String s = (plugin.getUtils().c("&send/" + mainCommand + " " + command + " " + usage + k + subUsage));
        if (send) {
            sender.sendMessage(plugin.getUtils().c("&fUsage: " + s));
            return plugin.getUtils().c("&fUsage: " + s);
        }
        return s;
    }

}
