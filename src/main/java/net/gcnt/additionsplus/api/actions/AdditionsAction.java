package net.gcnt.additionsplus.api.actions;

import org.bukkit.plugin.Plugin;

import java.util.List;
import java.util.function.Consumer;

/**
 * Custom AdditionsPlus action class.
 * Perform a consumer when this action is being called.
 */
public interface AdditionsAction {

    /**
     * Get the Bukkit {@link Plugin} of this action.
     *
     * @return {@link Plugin} of this action.
     */
    Plugin getPlugin();

    /**
     * Get the identifier of this action.
     *
     * @return Identifier of this action.
     */
    String getIdentifier();

    /**
     * Get the {@link ActionType} of this action.
     *
     * @return {@link ActionType} of this action.
     */
    ActionType getType();

    /**
     * Get a {@link List} of aliases for this action.
     *
     * @return {@link List} of action aliases.
     */
    List<String> getAliases();

    /**
     * Check if this action requires a player as executor to work.
     *
     * @return True if enabled, false otherwise.
     */
    boolean isRequirePlayer();

    /**
     * Get the {@link Consumer<QueuedAction>} that is called when this action is being performed.
     *
     * @return {@link Consumer<QueuedAction>} that is performed.
     */
    Consumer<QueuedAction> getConsumer();

    /**
     * Perform this action for the sender.
     *
     * @param sender       Sender to perform actions for.
     * @param queuedAction {@link QueuedAction} to perform.
     */
    void perform(ActionSender sender, QueuedAction queuedAction);

    /**
     * Get whether an action string contains this action tag.
     *
     * @param action Action string to check.
     * @return True if it contains this action, false otherwise.
     */
    boolean containsTag(String action);

    /**
     * Remove this action tag from the given string.
     *
     * @param actionString String to remove the action from.
     * @return String without this action tag.
     */
    String removeTagFromString(String actionString);

}
