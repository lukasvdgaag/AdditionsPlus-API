package net.gcnt.additionsplus.api.actions;

import org.bukkit.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Set of useful action utils in AdditionsPlus.
 */
public interface ActionUtils {

    /**
     * Remove all action tags of an action string.
     *
     * @param actionString Action string to strip.
     * @return Stripped action string.
     */
    String removeTags(String actionString);

    /**
     * Get arguments of a certain action tag.
     *
     * @param actionString Action string to check.
     * @param action       Action to check.
     * @return {@link String} array with the arguments.
     */
    String[] returnTagArguments(String actionString, AdditionsAction action);

    /**
     * Get arguments of a certain action tag.
     *
     * @param actionString Action string to check.
     * @param action       Action to check.
     * @param alias        Specific action alias to check.
     * @return {@link String} array with the arguments.
     */
    String[] returnTagArguments(String actionString, AdditionsAction action, String alias);

    /**
     * Evaluate the RNG (Random Number Generator) in the action string.
     *
     * @param params Arguments of the RNG tag.
     * @return Evaluated RNG result.
     */
    String evaluateRNG(String[] params);

    /**
     * Evaluate the script tags in the action string.
     *
     * @param actionString Action string to check.
     * @return Evaluated script tags in the action string.
     */
    String evaluateScript(String actionString);

    /**
     * Evaluate the mathematical expressions of an action string.
     *
     * @param input Action string to check.
     * @return Evaluated math action string.
     */
    String evaluateMath(String input);

    /**
     * Evaluate the if-chances of an action.
     *
     * @param actionString Action string to check.
     * @return True when validated, false otherwise.
     */
    boolean evaluateIfChances(String actionString);

    /**
     * Get the base {@link AdditionsAction} of this action string.
     *
     * @param actionString Action string to check.
     * @return {@link AdditionsAction} if found, null otherwise.
     */
    AdditionsAction getBaseAction(String actionString);

    /**
     * Get the permission of an action.
     *
     * @param actionString Action string to check.
     * @return Permission of this action string.
     */
    String getPermission(String actionString);

    /**
     * Get the specified regex of an action.
     *
     * @param actionString Action string to check.
     * @return Regex of this action string.
     */
    String getRegex(String actionString);

    /**
     * Get the in-world world of an action.
     *
     * @param actionString Action string to check.
     * @return In-world world of this action string.
     */
    String getInWorld(String actionString);

    /**
     * Get the anti permission of an action.
     *
     * @param actionString Action string to check.
     * @return No permission of this action string.
     */
    String getNoPermission(String actionString);

    /**
     * Get the vault group of an action.
     *
     * @param actionString Action string to check.
     * @return Vault group of this action string.
     */
    String getVaultGroup(String actionString);

    /**
     * Get the anti vault group of an action.
     *
     * @param actionString Action string to check.
     * @return No vault group of this action string.
     */
    String getNoVaultGroup(String actionString);

    /**
     * Get the chance of an action.
     *
     * @param actionString Action string to check.
     * @return Chance of this action string.
     */
    double getChance(String actionString);

    /**
     * Get the specified language of an action.
     *
     * @param actionString Action string to check.
     * @return Language of this action string.
     */
    String getLanguage(String actionString);

    /**
     * Get the price of an action.
     *
     * @param actionString Action string to check.
     * @return Price of this action string.
     */
    int getPrice(String actionString);

    /**
     * Get the delay of an action.
     *
     * @param actionString Action string to check.
     * @return Delay of this action string.
     */
    long getDelay(String actionString);

    /**
     * Get a {@link List} of {@link World} in the action string.
     *
     * @param action     Action string to check.
     * @param worlds     {@link List} of all {@link World}.
     * @param worldNames {@link List} of all world names.
     * @return {@link List} with all worlds found in this action.
     */
    List<World> getWorlds(String action, List<World> worlds, List<String> worldNames);

    /**
     * Get an action argument as string.
     *
     * @param actionString Action string to check.
     * @param action       Action to check.
     * @return {@link String} when found, null otherwise.
     */
    @Nullable
    String getArgumentAsString(String actionString, AdditionsAction action);

    /**
     * Get an action argument as boolean.
     *
     * @param actionString Action string to check.
     * @param action       Action to check.
     * @return {@link Boolean} when found, false otherwise.
     */
    boolean getArgumentAsBoolean(String actionString, AdditionsAction action);

    /**
     * Get an action argument as integer.
     *
     * @param actionString Action string to check.
     * @param action       Action to check.
     * @return {@link Integer} when found, 0 otherwise.
     */
    int getArgumentAsInt(String actionString, AdditionsAction action);

    /**
     * Get an action argument as double.
     *
     * @param actionString Action string to check.
     * @param action       Action to check.
     * @return {@link Double} when found, 0 otherwise.
     */
    double getArgumentAsDouble(String actionString, AdditionsAction action);

}
