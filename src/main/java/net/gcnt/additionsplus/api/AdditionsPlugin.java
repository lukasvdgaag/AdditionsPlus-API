package net.gcnt.additionsplus.api;

import net.gcnt.additionsplus.api.actions.ActionQueuer;
import net.gcnt.additionsplus.api.actions.ActionUtils;
import net.gcnt.additionsplus.api.actions.AdditionsAction;
import net.gcnt.additionsplus.api.files.YAMLManager;
import net.gcnt.additionsplus.api.managers.AnimationManager;
import net.gcnt.additionsplus.api.managers.CustomMenuManager;
import net.gcnt.additionsplus.api.nms.NMS;
import net.gcnt.additionsplus.api.objects.AdditionsEvent;
import net.gcnt.additionsplus.api.utils.*;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * The main AdditionsPlus plugin class that contains the API, all the utils and other feature handlers.
 */
public interface AdditionsPlugin {

    /**
     * Get the {@link AdditionsAPI} class.
     * This class contains everything you need to interact with Additions' features.
     *
     * @return The API class.
     */
    AdditionsAPI getAPI();

    /**
     * Get the general {@link YAMLManager}.
     *
     * @return The {@link YAMLManager}.
     */
    YAMLManager getYAMLManager();

    /**
     * Get the {@link AdditionsVaultSupport} hook.
     *
     * @return {@link AdditionsVaultSupport} when Vault was detected, otherwise null.
     */
    @Nullable
    AdditionsVaultSupport getVaultSupport();

    /**
     * Get the {@link CustomMenuManager}.
     *
     * @return The {@link CustomMenuManager}.
     */
    CustomMenuManager getCustomMenuManager();

    /**
     * Get the general {@link AdditionsUtils}.
     *
     * @return The general {@link AdditionsUtils}.
     */
    AdditionsUtils getUtils();

    /**
     * Get the {@link MenuUtils} used to check conditions of custom menus.
     *
     * @return The {@link MenuUtils}.
     */
    MenuUtils getMenuUtils();

    /**
     * Get the {@link ActionUtils} used to check conditions of actions.
     *
     * @return The {@link ActionUtils}.
     */
    ActionUtils getActionUtils();

    /**
     * Get the {@link NMS} manager used for version-specific code.
     *
     * @return {@link NMS} manager.
     */
    NMS getNMS();

    /**
     * Get the official {@link ActionQueuer} used for queuing actions.
     *
     * @return The {@link ActionQueuer}.
     */
    ActionQueuer getActionQueuer();

    /**
     * Load all AdditionsPlus (sub) commands.
     */
    void loadCommands();

    /**
     * Start the interval that executes all queued actions.
     *
     * @implNote This method should only be called <u>ONCE</u> after enabling.
     */
    void startActionsQueuer();

    /**
     * Start the interval that updates the interval actions.
     *
     * @implNote This method should only be called <u>ONCE</u> after enabling.
     */
    void startIntervalScheduler();

    /**
     * Start the interval that updates the player scoreboards.
     *
     * @implNote This method should only be called <u>ONCE</u> after enabling.
     */
    void startIntervalScoreboards();

    /**
     * Start the interval that updates the player tablists.
     *
     * @implNote This method should only be called <u>ONCE</u> after enabling.
     */
    void startIntervalTablists();

    /**
     * Start the automatic update checker.
     *
     * @implNote This method should only be called <u>ONCE</u> after enabling.
     */
    void startUpdateChecker();

    /**
     * Get the GCNT Updater used for update checking.
     *
     * @return The GCNT Updater.
     */
    GCNTUpdater getUpdater();

    /**
     * Get a {@link Map} of all custom command commands.
     *
     * @return Map of all custom command commands.
     */
    Map<String, BaseCmd> getCommandCommands();

    /**
     * Get a {@link Map} of all general commands.
     *
     * @return Map of all general commands.
     */
    Map<String, BaseCmd> getGeneralCommands();

    /**
     * Get a {@link Map} of all item commands.
     *
     * @return Map of all item commands.
     */
    Map<String, BaseCmd> getItemCommands();

    /**
     * Get a {@link Map} of all menu commands.
     *
     * @return Map of all menu commands.
     */
    Map<String, BaseCmd> getMenuCommands();

    /**
     * Get the main AdditionsPlus plugin data folder used for storing plugin data files.
     *
     * @return {@link File} that links to the AdditionsPlus plugin data folder.
     */
    File getDataFolder();

    /**
     * Get a {@link HashMap} of the ProtocolLib language that players have selected.
     *
     * @return {@link HashMap} with the Player and their selected languages.
     */
    HashMap<Player, String> getLanguages();

    /**
     * Get a {@link HashMap} of all {@link AdditionsAction} and their identifiers.
     *
     * @return {@link HashMap} of all action identifiers and their {@link AdditionsAction} information.
     */
    HashMap<String, AdditionsAction> getActions();

    /**
     * Get a {@link HashMap} of all {@link AdditionsEvent} and their identifiers.
     *
     * @return {@link HashMap} of all event identifiers and their {@link AdditionsEvent}.
     */
    HashMap<String, AdditionsEvent> getEvents();

    /**
     * Get the menu creation item renaming setup instance.
     *
     * @return The Item renaming menu.
     */
    AdditionsSubMenu getItemRenameMenu();

    /**
     * Get the menu creation item enchantments' setup instance.
     *
     * @return The ItemFlag enchantments menu.
     */
    AdditionsSubMenu getItemEnchantMenu();

    /**
     * Get the menu creation item lore setup instance.
     *
     * @return The Item Lore setup menu.
     */
    AdditionsSubMenu getItemLoreMenu();

    /**
     * Get the menu creation item flag setup instance.
     *
     * @return The ItemFlag setup menu.
     */
    AdditionsSubMenu getItemFlagMenu();

    /**
     * Get the {@link AnimationManager} that allows you to register animations.
     *
     * @since 1.0.3
     * @return The {@link AnimationManager}.
     */
    AnimationManager getAnimationManager();



}
