package net.gcnt.additionsplus.api.objects;

/**
 * A custom Discord webhook.
 * This class holds data about a webhook to send messages from.
 */
public interface DiscordWebhook {

    /**
     * Get the identifier of this webhook.
     *
     * @return Identifier of the webhook.
     */
    String getId();

    /**
     * Get the host link of the AdditionsPlus webhook handler.
     *
     * @return Host link of the webhook handler.
     */
    String getHost();

    /**
     * Get the link of the webhook.
     *
     * @return Link of the webhook.
     */
    String getLink();

    /**
     * Get the name of the webhook.
     *
     * @return Name of the webhook.
     */
    String getName();

    /**
     * Get the link to the icon image.
     *
     * @return Link of the icon.
     */
    String getIcon();

}
