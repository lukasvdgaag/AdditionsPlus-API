package net.gcnt.additionsplus.api.items;

/**
 * Additional options that can be added to items.
 */
public enum ItemOption {

    /**
     * When added, it will NOT be possible to drop this item.
     */
    DISABLE_DROP,
    /**
     * When added, it will NOT be possible to move this item in the inventory.
     */
    DISABLE_INVENTORY_MOVING,
    /**
     * When added, it will NOT be possible to PvP with this item in the hand.
     * All damage will be cancelled.
     */
    DISABLE_PVP,
    /**
     * When added, it will NOT be possible to place this block.
     */
    DISABLE_BLOCK_PLACE,
    /**
     * When added, it will NOT be possible to break blocks with this item in the hand.
     */
    DISABLE_BLOCK_BREAK,
    /**
     * When added, player will NOT be able to consume (eat/drink) this item.
     */
    DISABLE_CONSUME

}
