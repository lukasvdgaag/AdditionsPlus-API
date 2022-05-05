package net.gcnt.additionsplus.api.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * The message class used for processing messages from the config and sending them as chat or title messages.
 */
public interface Message {

    /**
     * Set whether colors codes should be parsed when sending this message.
     *
     * @param parse Whether color codes should be parsed.
     * @return The current {@link Message}.
     */
    Message colors(boolean parse);

    /**
     * Replace a part of the message with something else.
     *
     * @param search  {@link String} to search for.
     * @param replace {@link String} to replace it with.
     * @return The current {@link Message}.
     */
    Message replace(String search, String replace);

    /**
     * Send this message in the chat.
     *
     * @param senders List of command senders to send the message to.
     */
    void send(CommandSender... senders);

    /**
     * Send this message as a title.
     *
     * @param players A list of players to send the title to.
     */
    void sendTitle(Player... players);

    /**
     * Set whether placeholders should be parsed.
     *
     * @param parse Whether placeholders should be parsed.
     * @return Current {@link Message}.
     */
    Message placeholders(boolean parse);

    /**
     * Set the player for whom the placeholders should be parsed.
     * Set this to null to keep the players you're sending the message to.
     *
     * @param owner The player for whom the placeholders should be parsed.
     * @return Current {@link Message}.
     */
    Message placeholderOwner(Player owner);

    /**
     * Send this message as a title.
     *
     * @param in      The fade-in time in ticks.
     * @param stay    The stay time in ticks.
     * @param out     The fade-out time in ticks.
     * @param players A list of players to send the title to.
     */
    void sendTitle(int in, int stay, int out, Player... players);

}
