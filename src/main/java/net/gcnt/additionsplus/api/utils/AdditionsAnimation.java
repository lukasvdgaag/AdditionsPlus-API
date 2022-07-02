package net.gcnt.additionsplus.api.utils;

import java.util.List;
import java.util.function.Consumer;

/**
 * Additions Animation.
 * Contains all information about an animation, used for tablists and other periodically updated text.
 *
 * @since 1.0.3
 */
public interface AdditionsAnimation {

    /**
     * Get the unique identifier of this animation.
     *
     * @return The unique identifier of this animation.
     */
    String getId();

    /**
     * Get all frames of this animation.
     *
     * @return {@link List<String>} of all frames.
     */
    List<String> getFrames();

    /**
     * Whether this animation is static text or an animation.
     * Static text is a single frame, while an animation is a list of frames.
     *
     * @return True if this animation is static, false otherwise.
     */
    boolean isStatic();

    /**
     * Get the update interval.
     *
     * @return Update interval in ticks.
     */
    int getInterval();

    /**
     * Set the update interval of this animation.
     *
     * @param interval New update interval in ticks.
     */
    void setInterval(int interval);

    /**
     * Get the current frame value of this animation.
     *
     * @return The current frame value.
     */
    String getCurrentFrame();

    /**
     * Get the current frame index of this animation.
     *
     * @return The current frame index.
     */
    int getCurrentFrameIndex();

    /**
     * Set the current frame of the animation.
     *
     * @param index New frame index.
     */
    void setCurrentFrameIndex(int index);

    /**
     * Select the next frame of the animation.
     */
    void nextFrame();

    /**
     * Set the optional action that is executed when the animation is updated.
     * @param consumer The action to execute.
     */
    void setOnUpdate(Consumer<AdditionsAnimation> consumer);

    /**
     * Get the optional action that is executed when the animation is updated.
     */
    Consumer<AdditionsAnimation> getOnUpdate();

}
