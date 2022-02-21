package net.gcnt.additionsplus.api.files;

import net.gcnt.additionsplus.api.items.ItemOption;
import net.gcnt.additionsplus.api.utils.Message;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Custom YAML section to handle all data retrieval from YAML files.
 */
public interface YAMLSection {

    /**
     * Save the cached YAML file to the file system.
     * This will get rid of the comments!
     */
    void save();

    /**
     * Get a string.
     *
     * @param property Property to get the value of.
     * @return {@link String} value.
     */
    String getString(String property);

    /**
     * Get a string.
     *
     * @param property     Property to get the value of.
     * @param defaultValue {@link String} default value.
     * @return {@link String} value.
     */
    String getString(String property, String defaultValue);

    /**
     * Get an integer.
     *
     * @param property Property to get the value of.
     * @return {@link Integer} value.
     */
    int getInt(String property);

    /**
     * Get an integer.
     *
     * @param property     Property to get the value of.
     * @param defaultValue {@link Integer} default value.
     * @return {@link Integer} value.
     */
    int getInt(String property, int defaultValue);

    /**
     * Get a long.
     *
     * @param property Property to get the value of.
     * @return {@link Long} value.
     */
    long getLong(String property);

    /**
     * Get a long.
     *
     * @param property     Property to get the value of.
     * @param defaultValue {@link Long} default value.
     * @return {@link Long} value.
     */
    long getLong(String property, long defaultValue);

    /**
     * Get a {@link List} of strings.
     *
     * @param property Property to get the value of.
     * @return {@link List} of strings.
     */
    List<String> getStringList(String property);

    /**
     * Get a string map.
     *
     * @param property Property to get the value of.
     * @return {@link Map} of the keys and their values.
     */
    Map<String, String> getStringMap(String property);

    /**
     * Get a double.
     *
     * @param property Property to get the value of.
     * @return {@link Double} value.
     */
    double getDouble(String property);

    /**
     * Get a double.
     *
     * @param property     Property to get the value of.
     * @param defaultValue {@link Double} default value.
     * @return {@link Double} value.
     */
    double getDouble(String property, double defaultValue);

    /**
     * Get a boolean.
     *
     * @param property Property to get the value of.
     * @return {@link Boolean} value.
     */
    boolean getBoolean(String property);

    /**
     * Get a boolean.
     *
     * @param property     Property to get the value of.
     * @param defaultValue {@link Boolean} default value.
     * @return {@link Boolean} value.
     */
    boolean getBoolean(String property, boolean defaultValue);

    /**
     * Get an object.
     *
     * @param property Property to get the value of.
     * @return {@link Object} value.
     */
    Object get(String property);

    /**
     * Get an object.
     *
     * @param property     Property to get the value of.
     * @param defaultValue Default {@link Object}
     * @return {@link Object} value.
     */
    Object get(String property, Object defaultValue);

    /**
     * Check whether a property has been set.
     *
     * @param property Property to check.
     * @return True when set, false otherwise.
     */
    boolean isSet(String property);

    /**
     * Check whether the config contains the property.
     *
     * @param property Property to check.
     * @return True on existence, false otherwise.
     */
    boolean contains(String property);

    /**
     * Get a {@link Set} of keys.
     *
     * @param property Property to get the value of.
     * @return {@link Set} of keys.
     */
    Set<String> getKeys(String property);

    /**
     * Get a message to send as chat/title.
     *
     * @param property Property to get the value of.
     * @return {@link Message} object with the message.
     */
    Message getMessage(String property);

    /**
     * Get a message to send as chat/title.
     *
     * @param property Property to get the value of.
     * @param def      Default value.
     * @return {@link Message} object with the message.
     */
    Message getMessage(String property, String def);

    /**
     * Get a message to send as chat/title.
     *
     * @param property Property to get the value of.
     * @param def      {@link List} Default value.
     * @return {@link Message} object with the message.
     */
    Message getMessage(String property, List<String> def);

    /**
     * Get a YAML section by key.
     *
     * @param property Property to get the section of.
     * @return YAML section when found, null otherwise.
     */
    YAMLSection getSection(String property);

    /**
     * Get a {@link HashMap} of {@link Enchantment} and their strengths.
     *
     * @param property Property to get the value of.
     * @return {@link HashMap} of {@link Enchantment} and their strengths.
     */
    HashMap<Enchantment, Integer> getEnchantments(String property);

    /**
     * Get a {@link List} of {@link ItemFlag}.
     *
     * @param property Property to get the value of.
     * @return {@link List} of {@link ItemFlag}.
     */
    List<ItemFlag> getItemFlags(String property);

    /**
     * Get a {@link List} of {@link ItemOption}.
     *
     * @param property Property to get the value of.
     * @return {@link List} of {@link ItemOption}.
     */
    List<ItemOption> getItemOptions(String property);

    /**
     * Set a value to a key in the yaml config
     *
     * @param property The key to save the data to.
     * @param value    The value to save.
     */
    void set(String property, Object value);

}
