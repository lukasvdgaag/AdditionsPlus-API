package net.gcnt.additionsplus.api.utils;

/**
 * The official GCNT Updater that links to <a href="https://my.gcnt.net/plugins">My GCNT Plugins</a> to check if the plugin is up-to-date.
 *
 * @author GCNT Development
 */
public interface GCNTUpdater {

    /**
     * Get the URL of the newer version.
     *
     * @return URL that links to the update page.
     */
    String getUpdateURL();

    /**
     * Check for a new update.
     *
     * @return True when succeeded, false otherwise.
     */
    boolean checkForUpdate();

    /**
     * Get the update status.
     *
     * @return -1 on error<br>0 when up-to-date<br>1 when newer version found.
     */
    int getUpdateStatus();

    /**
     * Get the latest version (including betas) that was released on <a href="https://my.gcnt.net/plugins">My GCNT</a>.
     *
     * @return Latest (beta) version of this plugin.
     */
    String getLatestVersion();

    /**
     * Get the latest official version (non-beta) that was released on <a href="https://my.gcnt.net/plugins">My GCNT</a>.
     *
     * @return The latest official version of this plugin.
     */
    String getLatestOfficialVersion();

    /**
     * Get the name of this plugin.
     *
     * @return Name of this plugin.
     */
    String getPluginName();

    /**
     * Get the current version of this plugin.
     *
     * @return Current plugin version.
     */
    String getCurrentVersion();

}
