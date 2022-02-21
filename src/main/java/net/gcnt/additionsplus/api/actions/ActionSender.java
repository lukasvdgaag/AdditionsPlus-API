package net.gcnt.additionsplus.api.actions;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;

/**
 * Sender of an action, used as a bridge between console and players.
 */
public interface ActionSender {

    /**
     * Check whether the sender is a player.
     *
     * @return True if sender is a player, false otherwise.
     */
    boolean isPlayer();

    /**
     * Get the Bukkit {@link Player}.
     *
     * @return Bukkit {@link Player} if player, null otherwise.
     */
    @Nullable
    Player getPlayer();

    /**
     * Get the Bukkit {@link CommandSender}.
     *
     * @return Bukkit {@link CommandSender}.
     */
    CommandSender getSender();

    /**
     * Send a message as this sender.
     *
     * @param message Message to send.
     */
    void sendMessage(String message);

    /**
     * Check whether the sender has a certain permission.
     * If the sender is the console, this returns true.
     *
     * @param permission Permission to check.
     * @return True when permission, false otherwise.
     */
    boolean hasPermission(String permission);

    /**
     * Perform a command as this sender.
     *
     * @param command Command to perform.
     */
    void dispatchCommand(String command);

    /**
     * Send a chat message as this sender.
     *
     * @param message Message to send.
     */
    void chat(String message);

    /**
     * Get the name of this sender.
     *
     * @return Name of the sender.
     */
    String getName();

    /**
     * Get whether the player is an operator.
     * If the sender is the console, this returns true.
     *
     * @return True if OP, false otherwise.
     */
    boolean isOp();

    /**
     * Get the name of the world that the player is in.
     *
     * @return World name of the player.
     */
    String getWorldName();

}
