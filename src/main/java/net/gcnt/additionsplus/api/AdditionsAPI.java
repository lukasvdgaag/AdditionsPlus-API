package net.gcnt.additionsplus.api;

import net.gcnt.additionsplus.api.actions.ActionSender;
import net.gcnt.additionsplus.api.actions.AdditionsAction;
import net.gcnt.additionsplus.api.files.AdditionsConfig;
import net.gcnt.additionsplus.api.files.AdditionsFileAPI;
import net.gcnt.additionsplus.api.managers.CommandManager;
import net.gcnt.additionsplus.api.objects.*;
import net.gcnt.additionsplus.api.utils.AdditionsUtils;
import net.gcnt.additionsplus.api.utils.NMS;
import org.bukkit.Location;
import org.bukkit.scoreboard.Scoreboard;

import java.util.List;

/**
 * The official AdditionsPlus API class.
 * This class holds all data that you can use in your plugin to control or use different aspects of this plugin.
 */
public interface AdditionsAPI {

    /**
     * Get the {@link AdditionsPlugin} main class.
     *
     * @return {@link AdditionsPlugin} main class.
     */
    AdditionsPlugin getPlugin();

    /**
     * Perform a list of actions for a specific sender.
     *
     * @param sender  {@link ActionSender} who is the executor of the actions.
     * @param actions {@link List} of action strings to be executed.
     */
    void performActions(ActionSender sender, List<String> actions);

    /**
     * Load all AdditionsPlus data files.
     */
    void loadFiles();

    /**
     * Register a custom event.
     *
     * @param event {@link AdditionsEvent} instance to register.
     * @return true when succeeded, false otherwise.
     */
    boolean registerCustomEvent(AdditionsEvent event);

    /**
     * Register a custom action.
     *
     * @param action {@link AdditionsAction} instance to register.
     * @return true when succeeded, false otherwise.
     */
    boolean registerCustomAction(AdditionsAction action);

    /**
     * Get a {@link List} of {@link AdditionsAction} that were registered.
     *
     * @return A {@link List} of {@link AdditionsAction}.
     */
    List<AdditionsAction> getCustomActions();

    /**
     * Check if there is an action registered with the given identifier.
     *
     * @param identifier Identifier to look up.
     * @return True when found, false otherwise.
     */
    boolean isCustomActionRegistered(String identifier);

    /**
     * Get the general {@link AdditionsUtils}.
     *
     * @return The general {@link AdditionsUtils}.
     */
    AdditionsUtils getUtils();

    /**
     * Get a {@link List} of {@link AdditionsCommand} that were registered.
     *
     * @return A {@link List} of {@link AdditionsCommand}.
     */
    List<AdditionsCommand> getCommands();

    /**
     * Get a custom {@link AdditionsCommand} that matches the given name.
     *
     * @param name Name of the command.
     * @return {@link AdditionsCommand} when found, null otherwise.
     */
    AdditionsCommand getCommandByName(String name);

    /**
     * Get a custom {@link AdditionsCommand} that matches the given alias.
     *
     * @param alias Command alias to look up.
     * @return {@link AdditionsCommand} when found, null otherwise.
     */
    AdditionsCommand getCommandByAlias(String alias);

    /**
     * Get a {@link List} of similar {@link AdditionsCommand} that match the given command name.
     * Checks for custom command with the same command name (first word).
     *
     * @param name Name of the command.
     * @return A {@link List} of similar {@link AdditionsCommand}.
     */
    List<AdditionsCommand> getSimilarCommands(String name);

    /**
     * Get a {@link List} of {@link AdditionsItem} that were registered.
     *
     * @return A {@link List} of {@link AdditionsItem}.
     */
    List<AdditionsItem> getCustomItems();

    /**
     * Get the current config.yml file.
     *
     * @return Current config.yml file.
     */
    AdditionsConfig getConfig();

    /**
     * Set current config.yml instance.
     *
     * @param config New {@link AdditionsConfig} to use.
     */
    void setConfig(AdditionsConfig config);

    /**
     * Get a {@link List} of {@link AdditionsEvent} that were registered.
     *
     * @return A {@link List} of {@link AdditionsEvent}.
     */
    List<AdditionsEvent> getEvents();

    /**
     * Get a registered {@link AdditionsEvent} by its identifier.
     *
     * @param name Identifier of the event.
     * @return {@link AdditionsEvent} when found, null otherwise.
     */
    AdditionsEvent getEventById(String name);

    /**
     * Get a {@link List} of {@link AdditionsInterval} that were registered.
     *
     * @return A {@link List} of {@link AdditionsInterval}.
     */
    List<AdditionsInterval> getIntervalActions();

    /**
     * Get an {@link AdditionsInterval} by its identifier.
     *
     * @param name Identifier of the interval.
     * @return {@link AdditionsInterval} when found, null otherwise.
     */
    AdditionsInterval getIntervalActionByName(String name);

    /**
     * Get a {@link List} of {@link AdditionsBook} that were registered.
     *
     * @return A {@link List} of {@link AdditionsBook}.
     */
    List<AdditionsBook> getBooks();

    /**
     * Get a custom {@link AdditionsBook} by its identifier.
     *
     * @param name Identifier of the book.
     * @return {@link AdditionsBook} when found, null otherwise.
     */
    AdditionsBook getBookByName(String name);

    /**
     * Get a {@link List} of {@link AdditionsSign} that were registered.
     *
     * @return A {@link List} of {@link AdditionsSign}.
     */
    List<AdditionsSign> getSigns();

    /**
     * Get a custom {@link AdditionsSign} by its identifier.
     *
     * @param name Identifier of the sign.
     * @return {@link AdditionsSign} when found, null otherwise.
     */
    AdditionsSign getSignByName(String name);

    /**
     * Get a custom {@link AdditionsSign} by its location.
     *
     * @param location {@link Location} of the sign.
     * @return {@link AdditionsSign} when found, null otherwise.
     */
    AdditionsSign getSignByLocation(Location location);

    /**
     * Get the {@link NMS} manager used for version-specific code.
     *
     * @return {@link NMS} manager.
     */
    NMS getNMS();

    /**
     * Get a {@link List} of {@link AdditionsItem} that were registered.
     *
     * @return a {@link List} of {@link AdditionsItem}.
     */
    List<AdditionsItem> getItems();

    /**
     * Get a custom {@link AdditionsItem} by its identifier.
     *
     * @param name Identifier of the item.
     * @return {@link AdditionsItem} when found, null otherwise.
     */
    AdditionsItem getItemByName(String name);

    /**
     * Get a {@link List} of {@link AdditionsMenu} that were registered.
     *
     * @return a {@link List} of {@link AdditionsMenu}.
     */
    List<AdditionsMenu> getMenus();

    /**
     * Get a custom {@link AdditionsMenu} by its identifier.
     *
     * @param name Identifier of the menu.
     * @return An {@link AdditionsMenu} when found, null otherwise.
     */
    AdditionsMenu getMenuByName(String name);

    /**
     * Get a {@link List} of {@link AdditionsNameTag} that were registered.
     *
     * @return A {@link List} of {@link AdditionsNameTag}.
     */
    List<AdditionsNameTag> getNameTags();

    /**
     * Get an {@link AdditionsNameTag} by its group name.
     *
     * @param group Group name to look up.
     * @return {@link AdditionsNameTag} when found, null otherwise.
     */
    AdditionsNameTag getNameTagByGroup(String group);

    /**
     * Get the {@link CommandManager} used to check and set cooldowns and perform the custom commands.
     *
     * @return The {@link CommandManager}.
     */
    CommandManager getCommandManager();

    /**
     * Get the {@link AdditionsFileAPI} that contains every data file and its data.
     *
     * @return The {@link AdditionsFileAPI}.
     */
    AdditionsFileAPI getFilesAPI();

    /**
     * Get the sorted scoreboard used for tablists.
     *
     * @return Sorted tablist {@link Scoreboard}.
     */
    @Deprecated
    Scoreboard getSortedTablist();

}