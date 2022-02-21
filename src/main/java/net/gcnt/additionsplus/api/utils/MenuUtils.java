package net.gcnt.additionsplus.api.utils;

import net.gcnt.additionsplus.api.objects.AdditionsMenu;
import org.bukkit.entity.Player;

/**
 * Class that holds some useful utils for custom menus.
 */
public interface MenuUtils {

    /**
     * Store the player's current inventory.
     *
     * @param player Player to store inventory of.
     */
    void storeInventory(Player player);

    /**
     * Restore the player's stored inventory.
     *
     * @param player Player to restore inventory of.
     */
    void restoreInventory(Player player);

    /**
     * Set the current {@link AdditionsMenu} that the player has open.
     *
     * @param player Player to update.
     * @param menu   {@link AdditionsMenu} that is open.
     */
    void setPlayerMenu(Player player, AdditionsMenu menu);

    /**
     * Get the current {@link AdditionsMenu} that the player has open.
     *
     * @param player Player to check.
     * @return {@link AdditionsMenu} if open, null otherwise.
     */
    AdditionsMenu getPlayerMenu(Player player);

    /**
     * Close the current inventory of a player.
     *
     * @param player         Player to close inventory of.
     * @param checkForCancel Whether to check if this event is cancelled.
     */
    void close(Player player, boolean checkForCancel);

    /**
     * Check if a material is legacy (<1.13)
     *
     * @param material Material to check.
     * @return True when legacy, false otherwise.
     */
    boolean isMaterialLegacy(String material);

}
