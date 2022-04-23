package net.gcnt.additionsplus.api.files;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.BufferedReader;
import java.io.File;

public interface YAMLManager {

    /**
     * Get a YAMLConfig from a file.
     *
     * @param file {@link File} to get the YAML from.
     * @param id   Identifier of the file.
     * @return {@link YAMLConfig} of the given {@link File}.
     */
    YAMLConfig getConfig(File file, String id);

    /**
     * Load a Bukkit configuration section as Additions YAMLSection.
     * The {@link YAMLSection} that is returned using this method cannot be used to save the file using {@link YAMLSection#save()}.
     * If you wish to save the file too, please use {@link #getConfigSection(File, FileConfiguration, ConfigurationSection)}.
     *
     * @param section Bukkit section to load.
     * @return {@link YAMLSection} when successful, null otherwise.
     */
    YAMLSection getConfigSection(ConfigurationSection section);

    /**
     * Load a Bukkit configuration section as Additions YAMLSection.
     *
     * @param file File to load from.
     * @param baseYAML Bukkit base file configuration of the section.
     * @param section  Bukkit section to load.
     * @return {@link YAMLSection} when successful, null otherwise.
     */
    YAMLSection getConfigSection(File file, FileConfiguration baseYAML, ConfigurationSection section);

    /**
     * Load config or create it if nonexistent
     *
     * @param id        The internal ID of the config
     * @param directory The sub-directory in which to place the config file when created
     * @param fileName  The name of the file placed in the previously mentioned directory
     * @return A YAMLConfig instance based on the arguments provided
     */
    YAMLConfig loadConfig(String id, File directory, String fileName);

    /**
     * Load config or create it if nonexistent
     *
     * @param id        The internal ID of the config
     * @param directory The subdirectory in which to place the config file when created
     * @param fileName  The name of the file placed in the previously mentioned directory
     * @return A YAMLConfig instance based on the arguments provided
     */
    YAMLConfig loadConfig(String id, String directory, String fileName);

    /**
     * Load config or create it if nonexistent
     *
     * @param id         The internal ID of the config
     * @param directory  The subdirectory in which to place the config file when created
     * @param fileName   The name of the file placed in the previously mentioned directory
     * @param defaultDir The internal directory from which to fetch the default file
     * @return A YAMLConfig instance based on the arguments provided
     */
    YAMLConfig loadConfig(String id, File directory, String fileName, String defaultDir);

    /**
     * Load config or create it if nonexistent
     *
     * @param id         The internal ID of the config
     * @param directory  The sub-directory in which to place the config file when created
     * @param fileName   The name of the file placed in the previously mentioned directory
     * @param defaultDir The internal directory from which to fetch the default file
     * @return A YAMLConfig instance based on the arguments provided
     */
    YAMLConfig loadConfig(String id, String directory, String fileName, String defaultDir);

    /**
     * Get a previously initialized config file by config ID
     *
     * @param configId The internal config ID of the config
     * @return The YAMLConfig instance with the ID provided or null if no YAMLConfig exists with that ID
     */
    YAMLConfig getConfig(String configId);

    /**
     * Copy the default file contents into the new file.
     *
     * @param file            File to copy contents to.
     * @param fileName        The name of the file to use as the default file.
     * @param defaultFilePath Location of the default file.
     * @return True when succeeded, false otherwise.
     */
    boolean copyDefaultFile(File file, String fileName, String defaultFilePath);

    /**
     * Get the {@link org.bukkit.configuration.file.FileConfiguration} for the file name specified
     *
     * @param fileName        The name of the file to use as the default file
     * @param defaultFilePath Location of the default file
     * @return {@link BufferedReader} with the default file contents.
     */
    BufferedReader getDefaultFileReader(String fileName, String defaultFilePath);

}
