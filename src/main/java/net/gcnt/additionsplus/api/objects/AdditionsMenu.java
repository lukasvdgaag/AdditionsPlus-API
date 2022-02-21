package net.gcnt.additionsplus.api.objects;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;

/**
 * Custom AdditionsPlus menu class.
 */
public interface AdditionsMenu {

    /**
     * Get the item by its slot.
     *
     * @param slot Slot to get item of.
     * @return {@link AdditionsItem} when found, null otherwise.
     */
    AdditionsItem getItemBySlot(int slot);

    /**
     * Get the no-permission item by its slot.
     *
     * @param slot Slot to get item of.
     * @return {@link AdditionsItem} when found, null otherwise.
     */
    AdditionsItem getNoPermissionItemBySlot(int slot);

    /**
     * Get the identifier of this menu.
     *
     * @return Identifier of this menu.
     */
    String getName();

    /**
     * Get whether inventory hiding is enabled.
     *
     * @return True when enabled, false otherwise.
     */
    boolean isHideInventory();

    /**
     * Get the permission of this menu.
     *
     * @return Permission of this menu.
     */
    String getPermission();

    /**
     * Get the message that is sent when the player does not have the required permission.
     *
     * @return No permission message of this menu.
     */
    String getNoPermissionMessage();

    /**
     * Get a {@link List} of opening actions.
     *
     * @return {@link List} of opening actions.
     */
    List<String> getOpenActions();

    /**
     * Get a {@link List} of closing actions.
     *
     * @return {@link List} of closing actions.
     */
    List<String> getCloseActions();

    /**
     * Get the cooldown of this menu in ticks.
     *
     * @return Cooldown in ticks.
     */
    long getCooldown();

    /**
     * Get the message that is sent when the menu is on cooldown for a player.
     *
     * @return Cooldown message of this menu.
     */
    String getCooldownMessage();

    /**
     * Get the menu title.
     *
     * @return Title of the menu.
     */
    String getTitle();

    /**
     * Get the open command of this menu.
     *
     * @return Open command of this menu.
     */
    String getOpenCommand();

    /**
     * Get whether the open command should be registered to Bukkit.
     *
     * @return True when enabled, false otherwise.
     */
    boolean isRegisterOpenCommand();

    /**
     * Get the size of this custom menu.
     * Size could either be an {@link Integer}, a 'CRAFTING_TABLE', or any other {@link org.bukkit.event.inventory.InventoryType}.
     *
     * @return The size of the menu.
     */
    String getSize();

    /**
     * Get whether cancel click is enabled.
     *
     * @return True when enabled, false otherwise.
     */
    boolean isCancelClick();

    /**
     * Get whether cancel closing is enabled.
     *
     * @return True when enabled, false otherwise.
     */
    boolean isCancelClosing();

    /**
     * Get a {@link HashMap} with the {@link Integer} slot and the corresponding {@link ItemStack}.
     *
     * @return {@link HashMap} with the slots and its items.
     */
    HashMap<Integer, ItemStack> getStaticSlots();

    /**
     * Get a {@link List} of {@link AdditionsItem} that are in this menu.
     *
     * @return {@link List} of {@link AdditionsItem}.
     */
    List<AdditionsItem> getItems();

    /**
     * Open the custom menu for a player.
     *
     * @param player             Player to open for.
     * @param performOpenActions Whether to execute the open actions.
     */
    void openMenu(Player player, boolean performOpenActions);

    /**
     * Open the custom menu for a player.
     *
     * @param player              Player to open for.
     * @param performOpenActions  Whether to execute the open actions.
     * @param skipPermissionCheck Whether to skip the permission check.
     * @param skipCooldown        Whether to skip the cooldown check.
     */
    void openMenu(Player player, boolean performOpenActions, boolean skipPermissionCheck, boolean skipCooldown);

}
