package net.gcnt.additionsplus.api.managers;

import net.gcnt.additionsplus.api.objects.CompletionArgument;

import java.util.HashMap;

public interface TabCompletionManager {

    /**
     * Initializes the tab complete manager and loads all the arguments for every custom command.
     */
    void setup();

    /**
     * Get the root {@link CompletionArgument} for the given custom command.
     *
     * @param name The name of the custom command.
     * @return The root {@link CompletionArgument} for the given custom command.
     */
    CompletionArgument getCommandRoot(String name);

    /**
     * Get the root {@link CompletionArgument} for every custom command.
     *
     * @return {@link HashMap<String, CompletionArgument>} of all root arguments.
     */
    HashMap<String, CompletionArgument> getCompletionArguments();

}
