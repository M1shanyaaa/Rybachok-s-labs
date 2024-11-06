package lab4;

/**
 * The DirectoryInterface defines methods for basic directory operations:
 * creating and removing directories.
 */
public interface DirectoryInterface {

    /**
     * Creates a directory at the specified path.
     */
    void create(String path);

    /**
     * Removes the directory at the specified path.
     */
    void rmdir(String path);
}
