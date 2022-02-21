package net.gcnt.additionsplus.api.objects;

import net.gcnt.additionsplus.api.AdditionsPlugin;
import org.bukkit.entity.Player;

import java.util.HashMap;

/**
 * Custom AdditionsPlus events class.
 * This class can be called when firing a certain event to execute its actions.
 */
public interface AdditionsEvent {

    /**
     * Get the author of this event.
     *
     * @return Author of this event.
     */
    String getAuthor();

    /**
     * Get the event description.
     *
     * @return Description of this event.
     */
    String getDescription();

    /**
     * Get the plugin name of this event.
     *
     * @return Plugin name of this event.
     */
    String getPluginName();

    /**
     * Get the name of this event.
     *
     * @return Get the name of this event.
     */
    String getEventName();

    /**
     * Add a placeholder to the replacement list.
     *
     * @param search  String to search for.
     * @param replace String to replace with.
     * @return Current {@link AdditionsEvent} instance.
     */
    AdditionsEvent addPlaceholder(String search, String replace);

    /**
     * Remove a placeholder from the replacement list.
     *
     * @param key Placeholder key to remove.
     * @return Current {@link AdditionsEvent} instance.
     */
    AdditionsEvent removePlaceholder(String key);

    /**
     * Load the data of this event.
     */
    void loadData();

    /**
     * Get the identifier of this event.
     *
     * @return Identifier of this event.
     */
    String getIdentifier();

    /**
     * Get a {@link HashMap} of all extra options and their {@link Object} values.
     *
     * @return {@link HashMap} of options and their {@link Object} values
     */
    HashMap<String, Object> getExtraOptions();

    /**
     * Get the value of any extra option.
     *
     * @param key Key to search for.
     * @return {@link Object} value of the key when found, null otherwise.
     */
    Object getExtraOption(String key);

    /**
     * Perform the event.
     *
     * @param plugin Main {@link AdditionsPlugin} class to execute the event from.
     * @param player Player to execute the event for.
     */
    void perform(AdditionsPlugin plugin, Player player);

}
