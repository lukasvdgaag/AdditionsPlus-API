package net.gcnt.additionsplus.api.utils;

import net.gcnt.additionsplus.api.actions.ActionSender;
import org.bukkit.Color;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * General Utils class that holds general utility methods.
 */
public interface AdditionsUtils {

    /**
     * Get the Vault language of a sender.
     *
     * @param sender Sender to check.
     * @return Vault language when found, null otherwise.
     */
    String getLanguage(ActionSender sender);

    /**
     * Get the Vault language of a player.
     *
     * @param player Player to check.
     * @return Vault language when found, null otherwise.
     */
    String getLanguage(Player player);

    /**
     * Send a horizontally centered message to the player.
     *
     * @param player  Player to send the message to.
     * @param message Message to send.
     */
    void sendCenteredMessage(ActionSender player, String message);

    /**
     * Get the {@link GameMode} from a string.
     *
     * @param input String to check.
     * @return {@link GameMode} when found, null otherwise.
     */
    GameMode getGameMode(String input);

    /**
     * Resolve a mathematical expression with JavaScript.
     *
     * @param input Expression to resolve.
     * @return Result of the expression.
     */
    double evaluate(String input);

    /**
     * Color a string.
     *
     * @param message {@link String} to color.
     * @return Colored {@link String}.
     */
    String c(String message);

    /**
     * Log a message to the console.
     *
     * @param message Message to log.
     * @param severe  Whether it should be sent as an error.
     */
    void logToConsole(String message, boolean severe);

    /**
     * Calculate if a random number between 0-100 is lower than the given chance.
     *
     * @param chance Chance to check.
     * @return true when validated, false otherwise.
     */
    boolean calculateChance(double chance);

    /**
     * Execute a JavaScript script.
     *
     * @param script Piece of code to execute.
     * @return The result of the script.
     */
    String executeScript(String script);

    /**
     * Execute the [IF] action parameters and check if they are true.
     *
     * @param value Value of the IF action to check.
     * @return true when script equals true, false otherwise.
     */
    boolean calculateIfChances(String value);

    /**
     * Parse all placeholders of a player to the message.
     * Supports PAPI and MvdW PAPI.
     *
     * @param message Message to parse.
     * @param sender  Placeholder owner.
     * @return String with parsed placeholders.
     */
    String parseStatics(String message, ActionSender sender);

    /**
     * Parse all placeholders of a player to the messages.
     * Supports PAPI and MvdW PAPI.
     *
     * @param messages Messages to parse.
     * @param sender   Placeholder owner.
     * @return {@link List} of {@link String} with parsed placeholders.
     */
    List<String> parseStatics(List<String> messages, ActionSender sender);

    /**
     * Parse all placeholders of a player to the message.
     * Supports PAPI and MvdW PAPI.
     *
     * @param message Message to parse.
     * @param player  Placeholder owner.
     * @return String with parsed placeholders.
     */
    String parseStatics(String message, Player player);

    /**
     * Color a list of strings.
     *
     * @param messages {@link List} of {@link String} to color.
     * @return {@link List} of colored {@link String}.
     */
    List<String> c(List<String> messages);

    /**
     * Send the cooldown message to a player.
     * Replaces %time% with the formatted cooldown time.
     *
     * @param player   Player to send message to.
     * @param message  Message to send.
     * @param cooldown Cooldown in ticks.
     */
    void sendCooldownMessage(Player player, String message, long cooldown);

    /**
     * Check if a string is an integer.
     *
     * @param string String to check.
     * @return true when integer, false otherwise.
     */
    boolean isInt(String string);

    /**
     * Check if a string is a long.
     *
     * @param string String to check.
     * @return true when long, false otherwise.
     */
    boolean isLong(String string);

    /**
     * Check if a string is a double.
     *
     * @param string String to check.
     * @return true when double, false otherwise.
     */
    boolean isDouble(String string);

    /**
     * Check if a string is a float.
     *
     * @param string String to check.
     * @return true when float, false otherwise.
     */
    boolean isFloat(String string);

    /**
     * Check if a string is a boolean.
     *
     * @param string String to check.
     * @return true when boolean, false otherwise.
     */
    boolean isBoolean(String string);

    /**
     * Replace all HEX colors with bukkit encoding in a string.
     *
     * @param message String to replace HEX colors of.
     * @return Same string with bukkit encoded colors instead of raw HEXes.
     */
    String replaceHEXColors(String message);

    /**
     * Get the HEX color from a string.
     * Could start with or without #, in format of RGB or RRGGBB.
     *
     * @param message String to get the hex color of.
     * @return {@link Color} when found, null otherwise.
     */
    Color getHEXColor(String message);

    /**
     * Get the Bukkit command map used for registering commands.
     *
     * @return Bukkit CommandMap.
     */
    CommandMap getCommandMap();

    /**
     * Register a command to Bukkit.
     *
     * @param plugin  Name of the plugin that the command belongs to.
     * @param command {@link Command} to register.
     */
    void registerCommand(String plugin, Command command);

    /**
     * Set the total experience of a player.
     *
     * @param player     Player to update.
     * @param experience Number of experience to set.
     */
    void setTotalExperience(Player player, int experience);

    /**
     * Get the Bukkit experience required for one level.
     *
     * @param level Level to get the experience of.
     * @return number of experience needed for that level.
     */
    int getExpAtLevel(int level);

    /**
     * Get the header and footer of the tablist group of the player.
     *
     * @param player Player to check.
     * @return Array of {@link StringBuilder} with the Header and Footer, null when not found.
     */
    StringBuilder[] determinePlayerTablist(Player player);

    /**
     * Get a sublist of an array as a string, joined by a space.
     *
     * @param array String array to join.
     * @param start Start index to start joining from (inclusive).
     * @param end   End index to stop joining at (exlusive).
     * @return All array sublist items joined by a space.
     */
    String getArrayFrom(String[] array, int start, int end);

    /**
     * Get a sublist of an array as a string, joined by a space.
     *
     * @param array String array to join.
     * @param start Start index to start joining from (inclusive).
     * @return All array sublist items joined by a space.
     */
    String getArrayFrom(String[] array, int start);

}
