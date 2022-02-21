package net.gcnt.additionsplus.api.objects;

import net.gcnt.additionsplus.api.items.ItemOption;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;

import java.util.HashMap;
import java.util.List;

/**
 * Custom AdditionsPlus book.
 * With pages, item flags and options, enchantments, and more.
 */
public interface AdditionsBook {

    /**
     * Get the identifier of this book.
     *
     * @return Identifier of this book.
     */
    String getName();

    /**
     * Get a {@link List} of {@link ItemFlag} of this book.
     *
     * @return Get a {@link List} of {@link ItemFlag}.
     */
    List<ItemFlag> getItemFlags();

    /**
     * Get a {@link HashMap} of {@link Enchantment} and their strengths of this book.
     *
     * @return {@link HashMap} of {@link Enchantment} and their strengths.
     */
    HashMap<Enchantment, Integer> getEnchantments();

    /**
     * Get a {@link List} of {@link ItemOption} of this book.
     *
     * @return {@link List} of {@link ItemOption}.
     */
    List<ItemOption> getItemOptions();

    /**
     * Get the name of the book.
     *
     * @return Name of the book.
     */
    String getBookName();

    /**
     * Get the author of the book.
     *
     * @return Author of the book.
     */
    String getAuthor();

    /**
     * Get the title of the book.
     *
     * @return Title of the book.
     */
    String getTitle();

    /**
     * Get the generation of the book.
     *
     * @return Generation of the book.
     */
    String getGeneration();

    /**
     * Get a {@link List} of page contents for this book.
     *
     * @return {@link List} of page contents.
     */
    List<String> getPages();

    /**
     * Get the slot of this item.
     *
     * @return Slot of this item.
     */
    int getSlot();

    /**
     * Get the display name of this item.
     *
     * @return The display name of this item.
     * @deprecated
     */
    @Deprecated
    String getDisplayName();

    /**
     * Get a {@link List} of lore lines.
     *
     * @return {@link List} of lore lines.
     */
    List<String> getLore();

    /**
     * Give the book to a player.
     *
     * @param player Player to give the book to.
     */
    void giveBook(Player player);

}
