package net.gcnt.additionsplus.api.objects;

import net.gcnt.additionsplus.api.utils.AdditionsAnimation;

/**
 * Custom AdditionsPlus Name Tag class.
 * Periodically update (animated) name tags based on groups.
 * Supports Placeholders and HEX colors.
 */
public interface AdditionsNameTag {

    /**
     * Get the server order position of this name tag.
     *
     * @return Order position of this name tag.
     */
    int getOrder();

    /**
     * Get the permission of this name tag.
     *
     * @return Permission of this name tag.
     */
    String getPermission();

    /**
     * Get the name tag value.
     *
     * @return {@link AdditionsAnimation} that contains the frames.
     */
    AdditionsAnimation getTag();

    /**
     * Get the identifier of this name tag (group).
     *
     * @return Group identifier of this name tag.
     */
    String getGroup();

    /**
     * Get the update interval of this name tag in ticks.
     *
     * @return Update interval of this name tag in ticks.
     */
    long getUpdateInterval();

    /**
     * Get whether to change the chat display name of the player.
     *
     * @return true when enabled, false otherwise.
     */
    boolean isChangeDisplayName();

    /**
     * Get whether to change the display name above the player's head.
     *
     * @return true when enabled, false otherwise.
     */
    boolean isChangeAbovePlayerName();

    /**
     * Get the player name prefix.
     *
     * @return {@link AdditionsAnimation} that contains the frames.
     */
    AdditionsAnimation getPrefix();

    /**
     * Get the player name suffix.
     *
     * @return {@link AdditionsAnimation} that contains the frames.
     */
    AdditionsAnimation getSuffix();

}
