package net.gcnt.additionsplus.api.objects;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Custom AdditionsPlus Command class.
 * Execute or overrides bukkit commands with custom actions, aliases and more.
 */
public interface AdditionsCommand {

    /**
     * Get the plugin of this command.
     *
     * @return Plugin of this command.
     */
    String getPlugin();

    /**
     * Get the command name.
     *
     * @return Command name.
     */
    String getCommandName();

    /**
     * Get the {@link List} of command aliases.
     *
     * @return {@link List} of aliases.
     */
    List<String> getAliases();

    /**
     * Set the {@link List} of aliases of this command.
     *
     * @param aliases {@link List} of aliases.
     */
    void setAliases(List<String> aliases);

    /**
     * Get the cooldown in ticks.
     *
     * @return Cooldown in ticks.
     */
    long getCooldown();

    /**
     * Set the cooldown in ticks.
     *
     * @param cooldown Cooldown in ticks.
     */
    void setCooldown(long cooldown);

    /**
     * Get the on-cooldown message of this command.
     *
     * @return Cooldown message.
     */
    String getCooldownMessage();

    /**
     * Set the on-cooldown message of this command.
     *
     * @param cooldownMessage Message to send.
     */
    void setCooldownMessage(String cooldownMessage);

    /**
     * Get the required Bukkit permission of this command.
     *
     * @return Required Bukkit permission.
     */
    String getPermission();

    /**
     * Set the permission of this command.
     *
     * @param permission Bukkit permission.
     */
    void setPermission(@Nullable String permission);

    /**
     * Get the message that is sent to the player when they do not have permission for this command.
     *
     * @return No permission message to send.
     */
    String getNoPermissionMessage();

    /**
     * Set the message that is sent to the player when they do not have permission for this command.
     *
     * @param message Message to send.
     */
    void setNoPermissionMessage(String message);

    /**
     * Get whether the command should be registered to Bukkit.
     * If this is enabled, the message will pop up while tab completing.
     * This is required if you want the command to be executable from other plugins.
     *
     * @return True if enabled, false otherwise.
     */
    boolean isRegister();

    /**
     * Set whether this command should be registered to Bukkit.
     *
     * @param register Whether the command should be registered.
     */
    void setRegister(boolean register);

    /**
     * Get the actions of this command.
     *
     * @return {@link List} of actions.
     */
    List<String> getActions();

    /**
     * Set theactions of this command.
     *
     * @param actions {@link List} of actions.
     */
    void setActions(List<String> actions);

    /**
     * Get the usage of this command.
     *
     * @return Usage of this command.
     */
    String getUsage();

    /**
     * Set the usage of this command.
     *
     * @param usage New usage.
     */
    void setUsage(String usage);

    /**
     * Get the description of this command.
     *
     * @return Description of this command.
     */
    String getDescription();

    /**
     * Set the description of the command.
     *
     * @param description Description of the command.
     */
    void setDescription(String description);

}
