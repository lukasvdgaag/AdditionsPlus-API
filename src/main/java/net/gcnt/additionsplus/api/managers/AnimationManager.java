package net.gcnt.additionsplus.api.managers;

import net.gcnt.additionsplus.api.utils.AdditionsAnimation;

import java.util.List;

/**
 * Additions Animation Manager.
 * Handles the registrations of {@link AdditionsAnimation} and the updating of the animation frames.
 *
 * @since 1.0.3
 */
public interface AnimationManager {

    /**
     * Get a list of all animations.
     *
     * @return {@link List<AdditionsAnimation>} of all animations.
     */
    List<AdditionsAnimation> getAnimations();

    /**
     * Get an animation by its id.
     *
     * @param id The id of the animation.
     * @return {@link AdditionsAnimation} when found, null otherwise.
     */
    AdditionsAnimation getAnimation(String id);

    /**
     * Create a new animation.
     *
     * @param id       The id of the animation.
     * @param frames   The frames of the animation.
     * @param interval The update interval of the animation.
     * @return The created {@link AdditionsAnimation} or null when failed.
     */
    AdditionsAnimation createAnimation(String id, List<String> frames, int interval);

    /**
     * Create a new animation.
     *
     * @param id          The id of the animation.
     * @param staticFrame The static frame of the animation.
     * @param interval    The update interval of the animation.
     * @return The created {@link AdditionsAnimation} or null when failed.
     */
    AdditionsAnimation createAnimation(String id, String staticFrame, int interval);

    /**
     * Register an animation;
     * @param animation Animation to register.
     */
    void registerAnimation(AdditionsAnimation animation);

    /**
     * Remove an animation by its id.
     *
     * @param id The id of the animation.
     */
    void removeAnimation(String id);

    /**
     * Start the Bukkit task to update the animations.
     */
    void start();

    /**
     * Get the bukkit task id of the animation manager.
     *
     * @return The bukkit task id.
     */
    int getBukkitTaskId();

}
