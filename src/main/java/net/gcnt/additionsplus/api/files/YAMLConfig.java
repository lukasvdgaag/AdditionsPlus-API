package net.gcnt.additionsplus.api.files;

public interface YAMLConfig extends YAMLSection {

    /**
     * Get the identifier of this YAML file.
     *
     * @return Identifier of this YAML file.
     */
    String getId();

    /**
     * Get the name of this YAML file.
     *
     * @return Name of this YAML file.
     */
    String getName();

    /**
     * Load all data in this config.
     */
    void loadData();

}
