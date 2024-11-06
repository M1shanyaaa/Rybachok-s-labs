package lab4;

/**
 * The FileInterface defines methods for basic file operations:
 * opening, closing, and deleting files or directories.
 */
public interface FileInterface {

    /**
     * Opens a file or directory. Optionally creates it if it doesn't exist.
     */
    void open(String path, boolean createIfNotExist);

    /**
     * Closes the currently opened file or directory.
     */
    void close(String path);

    /**
     * Deletes the specified file or directory.
     */
    void delete(String path);
}
