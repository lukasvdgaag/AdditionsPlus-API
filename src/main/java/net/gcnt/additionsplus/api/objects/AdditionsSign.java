package net.gcnt.additionsplus.api.objects;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * The custom AdditionsPlus sign class.
 * Used for periodically updating signs for each player individually.
 */
public interface AdditionsSign {

    /**
     * Get the update interval of this sign.
     *
     * @return Update interval of this sign.
     */
    long getUpdateInterval();

    /**
     * Get the identifier of the sign.
     *
     * @return Identifier of the sign.
     */
    String getName();

    /**
     * Get a {@link List} of sign lines.
     *
     * @return {@link List} of lines.
     */
    List<String> getLines();

    /**
     * Get a {@link List} of all sign {@link Location}.
     *
     * @return {@link List} of sign {@link Location}.
     */
    List<Location> getLocations();

    /**
     * Check if this sign has the specific location.
     *
     * @param location Location to check.
     * @return True when found, false otherwise.
     */
    boolean hasLocation(Location location);

    /**
     * Add a sign location to the signs.
     *
     * @param location Sign location to add.
     */
    void addLocation(Location location);

    /**
     * Remove a sign location from the signs.
     *
     * @param location Sign location to remove.
     */
    void removeLocation(Location location);

    /**
     * Get a {@link List} of actions to perform when interacting with this sign.
     *
     * @return {@link List} of actions to perform on interaction.
     */
    List<String> getActions();

    /**
     * Update all sign locations.
     */
    void update();

    /**
     * Update a certain sign location for all players.
     *
     * @param location Location to update.
     */
    void update(Location location);

    /**
     * Update a certain sign location for one player.
     *
     * @param location Location to update.
     * @param player   Player to update for.
     */
    void update(Location location, Player player);

}
