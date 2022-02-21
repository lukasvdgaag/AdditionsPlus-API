package net.gcnt.additionsplus.api.utils;

import org.bukkit.entity.Player;

public interface AdditionsSubMenu {

    /**
     * Open the menu for a player.
     *
     * @param player Player to open for.
     */
    void openMenu(Player player);

    /**
     * Open the menu for a player.
     *
     * @param player      Player to open for.
     * @param extraOption Optionally extra option.
     */
    void openMenu(Player player, boolean extraOption);

}
