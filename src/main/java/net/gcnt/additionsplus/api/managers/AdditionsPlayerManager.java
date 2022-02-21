package net.gcnt.additionsplus.api.managers;

import net.gcnt.additionsplus.api.files.YAMLConfig;

import java.util.UUID;

/**
 * AdditionsPlus player manager.
 */
public interface AdditionsPlayerManager extends YAMLConfig {

    /**
     * Set whether a player has their scoreboard enabled.
     *
     * @param uuid    {@link UUID} of player to update.
     * @param enabled Whether the scoreboard is enabled.
     */
    void setScoreboardEnabled(UUID uuid, boolean enabled);

    /**
     * Check if a player has their scoreboard enabled.
     *
     * @param uuid {@link UUID} of player to check.
     * @return True if enabled, false otherwise.
     */
    boolean isScoreboardEnabled(UUID uuid);

}
