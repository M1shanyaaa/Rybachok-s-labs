package lab4;

/**
 * The SubClassFile class implements the FileInterface and provides
 * specific implementations for opening, closing, and deleting files.
 */
public class SubClassFile implements FileInterface {

    /**
     * Opens a file at the specified path.
     * Prints a message indicating the file is being opened.
     *
     */
    @Override
    public void open(String path, boolean createIfNotExist) {
        System.out.println("Opening file: " + path);
    }

    /**
     * Closes the currently opened file.
     * Prints a message indicating the file has been closed.
     */
    @Override
    public void close(String path) {
        System.out.println("File " + path + " closed");
    }

    /**
     * Deletes the file at the specified path.
     * Prints a message indicating the file has been deleted.
     *
     */
    @Override
    public void delete(String path) {
        System.out.println("File " + path + " deleted");
    }
}
