package net.gcnt.additionsplus.api.objects;

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
     * @return {@link java.util.List} of {@link String} when animated, single {@link String} otherwise.
     */
    Object getTag();

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

}
