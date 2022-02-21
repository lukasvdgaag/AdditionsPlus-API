package net.gcnt.additionsplus.api.managers;

import net.gcnt.additionsplus.api.utils.AdditionsSubMenu;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.UUID;

/**
 * Manager for custom menu setups and editing.
 */
public interface CustomMenuManager extends AdditionsSubMenu {

    /**
     * Discard the current custom menu of a player.
     * This cannot be undone.
     *
     * @param player Player to discard setup of.
     */
    void discard(Player player);

    /**
     * Get the custom menu inventory that the player is editing.
     *
     * @param player Player to check.
     * @return {@link Inventory} when found, null otherwise.
     */
    Inventory getMenu(Player player);

    /**
     * Store the player's current inventory.
     *
     * @param player Player to save inventory of.
     */
    void storeInventory(Player player);

    /**
     * Add the custom menu managing items to the player's inventory.
     *
     * @param player Player to add items to.
     */
    void addManagingItems(Player player);

    /**
     * Restore the original inventory of the player.
     *
     * @param player Player to restore.
     */
    void restoreInventory(Player player);

    /**
     * Save the current menu inventory that the player is working on.
     *
     * @param player Player to save.
     */
    void saveMenu(Player player);

    /**
     * Save the current menu inventory that the player is working on.
     *
     * @param player    Player to save.
     * @param inventory Inventory to save.
     */
    void saveMenu(Player player, Inventory inventory);

    /**
     * Check whether a player has a custom menu set up.
     *
     * @param player Player to check.
     * @return True when menu found, false otherwise.
     */
    boolean hasMenu(Player player);

    /**
     * Set whether a player is currently editing a custom menu.
     *
     * @param player  Player to check.
     * @param editing Whether the player is editing.
     */
    void setEditingMenu(Player player, boolean editing);

    /**
     * Get whether a player is currently editing a custom menu.
     *
     * @param player Player to check.
     * @return True when editing, false otherwise.
     */
    boolean isEditingMenu(Player player);

    /**
     * Adds a player to the do-not-restore inventory list.
     *
     * @param player  Player to add.
     * @param restore Whether to restore or not.
     */
    void dontRestore(Player player, boolean restore);

    /**
     * Get a list of players that are currently setting up/editing a custom menu.
     *
     * @return List of players that are editing custom menus.
     */
    HashMap<Player, Boolean> getEditingMenus();

    /**
     * Get a {@link HashMap} of player {@link UUID} and their custom menu titles.
     *
     * @return {@link HashMap} of player {@link UUID} and  their custom menu titles.
     */
    HashMap<UUID, String> getMenuTitles();

}
