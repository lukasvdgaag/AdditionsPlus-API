package net.gcnt.additionsplus.api.objects;

import net.gcnt.additionsplus.api.items.ItemOption;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;

/**
 * Custom AdditionsPlus Item class.
 * Allows the creation of custom items with left and right click actions and full customization.
 */
public interface AdditionsItem {

    /**
     * Get the identifier of this custom menu.
     *
     * @return Identifier of this menu.
     */
    String getName();

    /**
     * Get the cost of this item interaction.
     *
     * @return Cost of the interaction.
     */
    int getItemCostOnInteraction();

    /**
     * Set the cost of this item interaction.
     *
     * @param amount Cost of the interaction.
     */
    void setItemCostOnInteraction(int amount);

    /**
     * Get the not enough items message.
     *
     * @return Not enough items message.
     */
    String getNotEnoughItemsMessage();

    /**
     * Set the not enough items message.
     *
     * @param message Message to send.
     */
    void setNotEnoughItemsMessage(String message);

    /**
     * Set the cached item stack.
     *
     * @param itemStack {@link ItemStack} to cache.
     */
    void setItemStack(ItemStack itemStack);

    /**
     * Get the inventory slot of this item.
     *
     * @return Inventory slot of this item.
     */
    int getSlot();

    /**
     * Set the inventory slot of this item.
     *
     * @param slot Slot of this item.
     */
    void setSlot(int slot);

    /**
     * Get the cooldown in ticks.
     *
     * @return Cooldown in ticks.
     */
    long getCooldown();

    /**
     * Set the cooldown in ticks.
     *
     * @param cooldown Cooldown in ticks.
     */
    void setCooldown(long cooldown);

    /**
     * Get the on-cooldown message of this item.
     *
     * @return Cooldown message.
     */
    String getCooldownMessage();

    /**
     * Set the on-cooldown message of this item.
     *
     * @param cooldownMessage Message to send.
     */
    void setCooldownMessage(String cooldownMessage);

    /**
     * Get the required Bukkit permission of this item.
     *
     * @return Required Bukkit permission.
     */
    String getPermission();

    /**
     * Set the permission of this item.
     *
     * @param permission Bukkit permission.
     */
    void setPermission(@Nullable String permission);

    /**
     * Get the message that is sent to the player when they do not have permission for this item.
     *
     * @return No permission message to send.
     */
    String getNoPermissionMessage();

    /**
     * Set the message that is sent to the player when they do not have permission for this item.
     *
     * @param message Message to send.
     */
    void setNoPermissionMessage(String message);

    /**
     * Get the non left-right click actions of this item.
     *
     * @return {@link List} of actions.
     */
    List<String> getActions();

    /**
     * Set the non left-right click actions of this item.
     *
     * @param actions {@link List} of actions.
     */
    void setActions(List<String> actions);

    /**
     * Get the left click actions of this item.
     *
     * @return {@link List} of actions.
     */
    List<String> getLeftClickActions();

    /**
     * Set the left click actions of this item.
     *
     * @param actions {@link List} of actions.
     */
    void setLeftClickActions(List<String> actions);

    /**
     * Get the right click actions of this item.
     *
     * @return {@link List} of actions.
     */
    List<String> getRightClickActions();

    /**
     * Set the right click actions of this item.
     *
     * @param actions {@link List} of actions.
     */
    void setRightClickActions(List<String> actions);

    /**
     * Get a {@link List} of {@link ItemOption} of this item.
     *
     * @return {@link List} of {@link ItemOption}.
     */
    List<ItemOption> getItemOptions();

    /**
     * Set a {@link List} of {@link ItemOption}.
     *
     * @param options {@link List} of {@link ItemOption}.
     */
    void setItemOptions(List<ItemOption> options);

    /**
     * Get the display name of this item.
     *
     * @return Display name of this item.
     */
    String getDisplayName();

    /**
     * Set the display name of this item.
     *
     * @param displayName Display name of this item.
     */
    void setDisplayName(String displayName);

    /**
     * Get the material of this item.
     *
     * @return Material of this item.
     */
    String getMaterial();

    /**
     * Set the material of this item.
     *
     * @param material Material of this item.
     */
    void setMaterial(String material);

    /**
     * <p>Get the data of this item.<br>
     * This is used in legacy versions of Minecraft to differentiate different versions of an item (such as wool colors),
     * but was later replaced with individual material names.</p>
     *
     * @return {@link Byte} data.
     */
    byte getData();

    /**
     * <p>Set the data of this item.<br>
     * This is used in legacy versions of Minecraft to differentiate different versions of an item (such as wool colors),
     * but was later replaced with individual material names.</p>
     *
     * @param data {@link Byte} data.
     */
    void setData(byte data);

    /**
     * Get the item amount.
     *
     * @return Amount of items.
     */
    int getAmount();

    /**
     * Set the item amount.
     *
     * @param amount Amount of items.
     */
    void setAmount(int amount);

    /**
     * Get the durability of this item.
     * Durability is the number of useful actions an item can perform which depletes on item use.
     *
     * @return {@link Short} durability.
     */
    short getDurability();

    /**
     * Set the durability of this item.
     * Durability is the number of useful actions an item can perform which depletes on item use.
     *
     * @param durability {@link Short} durability.
     */
    void setDurability(short durability);

    /**
     * Get the lore of this item.
     *
     * @return {@link List} of lore lines.
     */
    List<String> getLore();

    /**
     * Set the lore of this item.
     *
     * @param lore {@link List} of lore lines.
     */
    void setLore(List<String> lore);

    /**
     * Get the item flags of this item.
     *
     * @return {@link List} of {@link ItemFlag}.
     */
    List<ItemFlag> getItemFlags();

    /**
     * Set the item flags of this item.
     *
     * @param flags {@link List} of {@link ItemFlag}.
     */
    void setItemFlags(List<ItemFlag> flags);

    /**
     * Get a list of the enchantments and their strengths.
     *
     * @return {@link HashMap} of {@link Enchantment} and their strength
     */
    HashMap<Enchantment, Integer> getEnchantments();

    /**
     * Set the enchantments of this item.
     *
     * @param enchantments {@link HashMap} of {@link Enchantment} and their strength.
     */
    void setEnchantments(HashMap<Enchantment, Integer> enchantments);

    /**
     * Get whether this item should be unbreakable.
     *
     * @return True when enabled, false otherwise.
     */
    boolean isUnbreakable();

    /**
     * Set whether this item should be unbreakable.
     *
     * @param unbreakable Unbreakable.
     */
    void setUnbreakable(boolean unbreakable);

    /**
     * Get the custom model data of this item.
     * This is often used in texture packs.
     *
     * @return Custom model data.
     */
    int getCustomModelData();

    /**
     * Set the custom model data of this item.
     * This is often used in texture packs.
     *
     * @param customModelData Custom model data.
     */
    void setCustomModelData(int customModelData);

    /**
     * Get the HEX armor color.
     *
     * @return HEX armor color.
     */
    String getArmorColor();

    /**
     * Set the armor color of this item.
     *
     * @param color HEX armor color.
     */
    void setArmorColor(String color);

    /**
     * Determine the base material of this item based on the player in case of any placeholder usage.
     *
     * @param player Placeholder owner.
     * @return Base {@link ItemStack}.
     */
    ItemStack determineMaterial(Player player);

    /**
     * Give this custom item to a player.
     *
     * @param player Player to apply data to.
     * @param give   Whether to add it to their inventory.
     * @return {@link ItemStack} with the player's data applied to this item.
     */
    ItemStack giveItem(Player player, boolean give);

    /**
     * Get whether this potion is extended.
     *
     * @return True if enabled, false otherwise.
     */
    boolean isExtendedPotion();

    /**
     * Set whether this potion is extended.
     *
     * @param extendedPotion Extended potion.
     */
    void setExtendedPotion(boolean extendedPotion);

    /**
     * Get whether this potion is upgraded.
     *
     * @return True if enabled, false otherwise.
     */
    boolean isUpgradedPotion();

    /**
     * Set whether this potion is upgraded.
     *
     * @param upgradedPotion Upgraded potion.
     */
    void setUpgradedPotion(boolean upgradedPotion);

    /**
     * Get the potion color in HEX.
     *
     * @return HEX potion color when found, null otherwise.
     */
    String getPotionColor();

    /**
     * Set the potion color in HEX.
     *
     * @param color HEX potion color.
     */
    void setPotionColor(String color);

    /**
     * Get the potion type.
     *
     * @return Type of potion when found, null otherwise.
     */
    String getPotionType();

    /**
     * Set the type of potion.
     *
     * @param type Potion type.
     */
    void setPotionType(String type);

}
