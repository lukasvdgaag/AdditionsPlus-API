package net.gcnt.additionsplus.api.objects;

import java.util.List;

/**
 * Custom AdditionsPlus interval class.
 * Used to periodically execute a list of actions.
 */
public interface AdditionsInterval {

    /**
     * Get the identifier of this interval.
     *
     * @return Identifier of this interval.
     */
    String getIdentifier();

    /**
     * Get a {@link List} of actions.
     *
     * @return {@link List} of actions.
     */
    List<String> getActions();

}
