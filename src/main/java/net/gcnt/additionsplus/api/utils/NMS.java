package net.gcnt.additionsplus.api.utils;

import net.gcnt.additionsplus.api.objects.AdditionsNameTag;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Interface class for handling version based Minecraft methods.
 */
public interface NMS {

    /**
     * Get the version number of the Bukkit API that has been detected.
     * Version format is as follows: '1.16' = 16, '1.8' = 8.
     *
     * @return {@link Integer} - version of the server API used
     */
    int getVersion();

    /**
     * Send a title to a player.
     * This sends a title with default times of 20,50,20.
     *
     * @param player   Player to display the title to.
     * @param title    {@link String} Main title to be sent.
     * @param subtitle {@link String} Subtitle to be sent.
     * @deprecated This method has been deprecated since Minecraft 1.10, use {@link #sendTitle(Player, String, String, int, int, int)} instead.
     */
    @Deprecated
    void sendTitle(Player player, String title, String subtitle);

    /**
     * Send a timed title to a player.
     *
     * @param player   Player to display the title to.
     * @param title    {@link String} Main title to be sent.
     * @param subtitle {@link String} Subtitle to be sent.
     * @param fadeIn   {@link Integer} Fade-in time in ticks.
     * @param stay     {@link Integer} Stay time in ticks.
     * @param fadeOut  {@link Integer} Fade-out time in ticks.
     */
    void sendTitle(Player player, String title, String subtitle, int fadeIn, int stay, int fadeOut);

    /**
     * Send an actionbar message to a player.
     *
     * @param player  Player to send the actionbar to.
     * @param message {@link String} text to be displayed.
     */
    void sendActionbar(Player player, String message);

    /**
     * Send a raw JSON message to a player.
     *
     * @param player Player to send the raw JSON message to.
     * @param json   {@link String} JSON text to be displayed.
     */
    void sendMessage(Player player, String json);

    /**
     * Update the tablist of a player, according to AdditionsPlus configurations.
     *
     * @param player Player to update the tablist for.
     */
    void changeTab(Player player);

    /**
     * Update the player's name tag.
     * @param player Player to update tag of.
     * @param nametag NameTag to apply.
     * @param value Current tag value to apply.
     */
    void updatePlayerNameTag(Player player, AdditionsNameTag nametag, String value);

    /**
     * Check if an ItemStack is a custom AdditionsPlus item.
     *
     * @param itemStack ItemStack to check.
     * @return {@link String} name of custom item when detected, null if no custom item was found.
     */
    String getCustomItem(ItemStack itemStack);

    /**
     * Check if an ItemStack is a custom AdditionsPlus book.
     *
     * @param itemStack ItemStack to check.
     * @return {@link String} name of custom book when detected, null if no custom book was found.
     */
    String getCustomBook(ItemStack itemStack);

    /**
     * Adds a custom NBT-Tag to the ItemStack of a custom book to handle future events.
     *
     * @param itemStack Book ItemStack to modify.
     * @param book      {@link String} Identifier of the custom book.
     * @return ItemStack with an additional NBT tag.
     */
    ItemStack setCustomBook(ItemStack itemStack, String book);

    /**
     * Adds a custom NBT-Tag to the ItemStack of a custom item to handle future events.
     *
     * @param itemStack Custom item ItemStack to modify.
     * @param item      {@link String} Identifier of the custom item.
     * @return ItemStack with an additional NBT tag.
     */
    ItemStack setCustomItem(ItemStack itemStack, String item);

    /**
     * Adds a custom Integer NBT-Tag to an ItemStack.
     *
     * @param itemStack ItemStack to add the NBT-Tag to.
     * @param key       {@link String} key of the NBT-Tag
     * @param value     {@link Integer} value of the NBT-Tag
     * @return ItemStack with the added NBT-Tag.
     */
    ItemStack addNBTTag(ItemStack itemStack, String key, Integer value);

    /**
     * Adds a custom String NBT-Tag to an ItemStack.
     *
     * @param itemStack ItemStack to add the NBT-Tag to.
     * @param key       {@link String} key of the NBT-Tag
     * @param value     {@link String} value of the NBT-Tag
     * @return ItemStack with the added NBT-Tag.
     */
    ItemStack addNBTTag(ItemStack itemStack, String key, String value);


}