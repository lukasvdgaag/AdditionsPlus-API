package net.gcnt.additionsplus.api.objects;

import net.gcnt.additionsplus.api.actions.ActionSender;

import java.util.List;

public interface CompletionArgument {

    /**
     * Get all possible completions for the input of the sender.
     *
     * @param input The input of the sender.
     * @return A {@link List<String>} of all possible completions.
     */
    List<String> getChildCompletions(String input);

    /**
     * Get all the possible completions for the given {@link CompletionArgument}.
     * This parses any placeholder variables like {player} and {world}.
     *
     * @param argument The {@link CompletionArgument} to get the completions for.
     * @return A {@link List<String>} of all the possible completions.
     */
    List<String> getPossibilities(CompletionArgument argument);

    /**
     * Get the parent of this {@link CompletionArgument}.
     *
     * @return The parent of this {@link CompletionArgument}, null when this argument is the root argument.
     */
    CompletionArgument getParent();

    /**
     * Get a sub argument by name.
     *
     * @param name The name of the sub argument.
     * @return The sub argument.
     */
    CompletionArgument getArgumentByName(String name);

    /**
     * Get the name of this argument.
     *
     * @return The name of this argument.
     */
    String getName();

    /**
     * Get the permissions required to use this argument.
     * Only one permission is required to use this argument.
     *
     * @return The permissions required to use this argument.
     */
    List<String> getPermissions();

    /**
     * Get a list of sub arguments for this argument.
     *
     * @return A list of sub {@link CompletionArgument}s.
     */
    List<CompletionArgument> getSubArgs();

    /**
     * Set the name of this argument.
     *
     * @param name The name of this argument.
     */
    void setName(String name);

    /**
     * Set the permissions for this argument.
     * Senders only need one of the permissions to be able to use this argument.
     *
     * @param permissions The permissions to set.
     */
    void setPermissions(List<String> permissions);

    /**
     * Add a permission to this argument.
     *
     * @param permission Permission to add.
     */
    void addPermission(String permission);

    /**
     * Check if the sender has any of the argument permissions needed to execute this argument.
     *
     * @param sender The sender to check permissions for.
     * @return True if the sender has any of the permissions, false otherwise.
     */
    boolean hasPermission(ActionSender sender);

    /**
     * Set the sub arguments of this argument.
     *
     * @param subArgs The sub arguments to set.
     */
    void setSubArgs(List<CompletionArgument> subArgs);

}
