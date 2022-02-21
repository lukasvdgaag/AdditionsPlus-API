package net.gcnt.additionsplus.api.actions;

/**
 * Object that contains all information about a queued action.
 */
public interface QueuedAction {

    /**
     * Use the same queued action for a different user, and replace the placeholders for the new user.
     *
     * @param sender User to replace the placeholders for
     * @return Same queued action with a different placeholder target.
     */
    QueuedAction placeholders(ActionSender sender);

    /**
     * Get the target player the placeholders should be replaced as.
     *
     * @return ActionSender with the placeholder player.
     */
    ActionSender getPlaceholderTarget();

    /**
     * Copy the entire queued action but change the action sender.
     *
     * @param sender New action sender.
     * @return Copy of the queued action with a different sender.
     */
    QueuedAction copy(ActionSender sender);

    /**
     * Get the sender of the action.
     *
     * @return {@link ActionSender} sender of the action.
     */
    ActionSender getSender();

    /**
     * Set the sender of the queued action.
     *
     * @param sender {@link ActionSender} sender of the action.
     */
    void setSender(ActionSender sender);

    /**
     * Set the original, raw action string, without placeholders and colors being replaced.
     *
     * @return Original, raw action string.
     */
    String getOriginalActionString();

    /**
     * Get the raw value of this action, with all action tags being removed.
     *
     * @return Raw value of the action string, without action tags.
     */
    String getValue();

    /**
     * Get the colored value of this action, with all tags being removed.
     *
     * @return Colored value of the action string, without action tags.
     */
    String getColoredValue();

    /**
     * Get a list of arguments that were found in the main action.
     *
     * @return {@link String} array with action arguments.
     */
    String[] getArguments();

    /**
     * Get the Action that has been queued.
     *
     * @return Queued {@link AdditionsAction}.
     */
    AdditionsAction getAction();

    /**
     * Get the result of this queued action.
     * This will replace all math and other calculus tags along with the placeholders.
     *
     * @return Final executable result of this queued action.
     */
    QueuedAction result();

}
