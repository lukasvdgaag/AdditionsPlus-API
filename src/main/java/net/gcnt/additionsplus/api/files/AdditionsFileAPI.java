package net.gcnt.additionsplus.api.files;

import net.gcnt.additionsplus.api.managers.AdditionsPlayerManager;

public interface AdditionsFileAPI {

    /**
     * Get the book folder.
     *
     * @return Current {@link YAMLFolder} folder.
     */
    YAMLFolder getBookFile();

    /**
     * Set the book folder.
     *
     * @param folder New {@link YAMLFolder} folder.
     */
    void setBookFile(YAMLFolder folder);

    /**
     * Get the commands file.
     *
     * @return Current {@link YAMLConfig} file.
     */
    YAMLConfig getCommandFile();

    /**
     * Set the commands file.
     *
     * @param config New {@link YAMLConfig} file.
     */
    void setCommandFile(YAMLConfig config);

    /**
     * Get the events file.
     *
     * @return Current {@link YAMLConfig} file.
     */
    YAMLConfig getEventsFile();

    /**
     * Set the events file.
     *
     * @param config New {@link YAMLConfig} file.
     */
    void setEventsFile(YAMLConfig config);

    /**
     * Get the items file.
     *
     * @return Current {@link YAMLConfig} file.
     */
    YAMLConfig getItemsFile();

    /**
     * Set the items file.
     *
     * @param config New {@link YAMLConfig} file.
     */
    void setItemsFile(YAMLConfig config);

    /**
     * Get the interval actions file.
     *
     * @return Current {@link YAMLConfig} file.
     */
    YAMLConfig getIntervalActionsFile();

    /**
     * Set the interval actions file.
     *
     * @param config New {@link YAMLConfig} file.
     */
    void setIntervalActionsFile(YAMLConfig config);

    /**
     * Get the signs file.
     *
     * @return Current {@link YAMLConfig} file.
     */
    YAMLConfig getSignsFile();

    /**
     * Set the signs file.
     *
     * @param config New {@link YAMLConfig} file.
     */
    void setSignsFile(YAMLConfig config);

    /**
     * Get the menu folder.
     *
     * @return Current {@link YAMLFolder} folder.
     */
    YAMLFolder getMenuFile();

    /**
     * Set the menus folder.
     *
     * @param folder New {@link YAMLFolder} folder.
     */
    void setMenuFile(YAMLFolder folder);

    /**
     * Get the scoreboards file.
     *
     * @return Current {@link YAMLConfig} file.
     */
    YAMLConfig getScoreboardFile();

    /**
     * Set the scoreboards file.
     *
     * @param config New {@link YAMLConfig} file.
     */
    void setScoreboardFile(YAMLConfig config);

    /**
     * Get the nametags file.
     *
     * @return Current {@link YAMLConfig} file.
     */
    YAMLConfig getNameTagsFile();

    /**
     * Set the nametags file.
     *
     * @param config New {@link YAMLConfig} file.
     */
    void setNameTagsFile(YAMLConfig config);

    /**
     * Get the players file.
     *
     * @return Current {@link YAMLConfig} file.
     */
    AdditionsPlayerManager getPlayerFile();

    /**
     * Set the players file.
     *
     * @param config New {@link YAMLConfig} file.
     */
    void setPlayerFile(AdditionsPlayerManager config);

    /**
     * Get the tablists file.
     *
     * @return Current {@link YAMLConfig} file.
     */
    YAMLConfig getTablistsFile();

    /**
     * Set the tablists file.
     *
     * @param config New {@link YAMLConfig} file.
     */
    void setTablistsFile(YAMLConfig config);

}