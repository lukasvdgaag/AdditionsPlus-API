package net.gcnt.additionsplus.api.actions;

/**
 * List of Action types to handle certain actions accordingly.
 */
public enum ActionType {

    /**
     * Action that can have inline arguments.
     * This action often does nothing on its own and has to be combined with a {@link #NORMAL} action to work.
     * We also call this action the 'check-action' as it often checks for a certain requirement.
     * Example: [action=...]
     */
    INNER,
    /**
     * Action that has an opening and closing tag with arguments in between.
     * Example: [action]...[/action]
     */
    OUTER,
    /**
     * Action that does not necessarily require a value to work, and will work without any arguments specified.
     * Example: [action]
     */
    STANDALONE,
    /**
     * Action that requires a value to work, and cannot have any inline arguments.
     * Example: [action]...
     */
    NORMAL,
    /**
     * Action that has to be combined with a {@link #NORMAL} or {@link #INNER} action in order to work. Does nothing on its own.
     * Example: [action][normal/inner action]...
     */
    COMBINED;

    boolean isCheckActions() {
        return this == INNER || this == OUTER;
    }
}