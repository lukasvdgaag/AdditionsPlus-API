package net.gcnt.additionsplus.api.files;

import java.io.File;
import java.util.List;

public interface YAMLFolder {

    /**
     * Load all data in this folder.
     */
    void loadData();

    /**
     * Get the name of this folder.
     *
     * @return Name of this folder.
     */
    String getName();

    /**
     * Get the parent file.
     *
     * @return Parent file.
     */
    File getParent();

    /**
     * Get the folder location.
     *
     * @return Location of the folder.
     */
    File getLocation();

    /**
     * Get a {@link List} of all YAML files in this folder.
     *
     * @return {@link List} of {@link YAMLConfig} in this folder.
     */
    List<YAMLConfig> getYAMLFiles();

    /**
     * Get a {@link List} of {@link File} that are in this folder.
     *
     * @return {@link List} of {@link File} in this folder.
     */
    List<File> getAllFiles();

    /**
     * Check if the folder exists.
     *
     * @return True if exists, false otherwise.
     */
    boolean exists();

}
