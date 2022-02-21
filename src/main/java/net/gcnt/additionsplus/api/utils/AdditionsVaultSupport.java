package net.gcnt.additionsplus.api.utils;

import net.gcnt.additionsplus.api.actions.ActionSender;
import org.bukkit.entity.Player;

import java.util.List;

public interface AdditionsVaultSupport {

    /**
     * Set up the economy hook for Vault.
     *
     * @return True when set up correctly, false otherwise.
     */
    boolean setupEconomy();

    /**
     * Get a {@link List} of group names that the player is in.
     *
     * @param player Player to check.
     * @return {@link List} group names.
     */
    List<String> getGroups(Player player);

    /**
     * Check if a player is in a certain Vault group.
     *
     * @param player Player to check.
     * @param group  Name of the group.
     * @return True when in the group, false otherwise.
     */
    boolean isGroup(Player player, String group);

    /**
     * Check if a sender is in a certain Vault group.
     *
     * @param sender Sender to check.
     * @param group  Name of the group.
     * @return True when in the group, false otherwise.
     */
    boolean isGroup(ActionSender sender, String group);

}
