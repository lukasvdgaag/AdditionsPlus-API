package net.gcnt.additionsplus.api.managers;

import net.gcnt.additionsplus.api.actions.ActionSender;
import net.gcnt.additionsplus.api.objects.AdditionsCommand;
import net.gcnt.additionsplus.api.objects.AdditionsItem;
import net.gcnt.additionsplus.api.objects.AdditionsMenu;
import org.bukkit.event.Cancellable;

/**
 * AdditionsPlus custom command manager.
 * Also manages cooldowns of items and menus.
 */
public interface CommandManager {

    /**
     * Get the command cooldown of a sender.
     *
     * @param sender  Sender of the menu.
     * @param command {@link AdditionsCommand} to get cooldown of.
     * @return {@link Long} last cooldown of the sender.
     */
    long getLastCooldownTime(ActionSender sender, AdditionsCommand command);

    /**
     * Get the command cooldown of a sender.
     *
     * @param sender  Sender of the menu.
     * @param command {@link AdditionsCommand} to get cooldown of.
     * @return {@link Long} cooldown of the sender.
     */
    long getCooldown(ActionSender sender, AdditionsCommand command);

    /**
     * Set the command cooldown of a sender.
     *
     * @param sender  Sender of the command.
     * @param command {@link AdditionsCommand} to set cooldown of.
     */
    void setCooldown(ActionSender sender, AdditionsCommand command);

    /**
     * Get the last item cooldown of a sender.
     *
     * @param sender Sender of the menu.
     * @param item   {@link AdditionsItem} to get cooldown of.
     * @return {@link Long} last cooldown of the sender.
     */
    long getLastItemCooldownTime(ActionSender sender, AdditionsItem item);

    /**
     * Get the item cooldown of a sender.
     *
     * @param sender Sender of the menu.
     * @param item   {@link AdditionsItem} to get cooldown of.
     * @return {@link Long} cooldown of the sender.
     */
    long getItemCooldown(ActionSender sender, AdditionsItem item);

    /**
     * Set the item cooldown of a sender.
     *
     * @param sender Sender of the menu.
     * @param item   {@link AdditionsItem} to set cooldown of.
     */
    void setItemCooldown(ActionSender sender, AdditionsItem item);

    /**
     * Get the last menu cooldown of a sender.
     *
     * @param sender Sender of the menu.
     * @param menu   {@link AdditionsMenu} to get cooldown of.
     * @return {@link Long} last cooldown of the sender.
     */
    long getLastMenuCooldownTime(ActionSender sender, AdditionsMenu menu);

    /**
     * Get the menu cooldown of a sender.
     *
     * @param sender Sender of the menu.
     * @param menu   {@link AdditionsMenu} to get cooldown of.
     * @return {@link Long} cooldown of the sender.
     */
    long getMenuCooldown(ActionSender sender, AdditionsMenu menu);

    /**
     * Set the menu cooldown of a sender.
     *
     * @param sender Sender of the menu.
     * @param menu   {@link AdditionsMenu} to set cooldown of.
     */
    void setMenuCooldown(ActionSender sender, AdditionsMenu menu);

    /**
     * Check the command event for custom commands.
     *
     * @param event   Bukkit event to check.
     * @param message Command string as executed by the sender.
     * @param sender  Sender of the command.
     */
    void checkCommandEvent(Cancellable event, String message, ActionSender sender);

    /**
     * Check if the executed command is formatted correctly.
     *
     * @param command Name of the command.
     * @param message Command string as executed by the sender.
     * @param sender  Sender of the command.
     * @return 1 if succeeded, error code otherwise.
     */
    int checkCommand(String command, String message, ActionSender sender);

    /**
     * Perform a custom command for a sender.
     *
     * @param command Name of the command.
     * @param sender  Sender of the command.
     * @param message Command string as executed by the sender.
     */
    void performCommand(String command, ActionSender sender, String message);

}
