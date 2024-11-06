package lab4;

/**
 * The SubClassDirectory class implements the DirectoryInterface and provides
 * specific implementations for creating and removing directories.
 */
public class SubClassDirectory implements DirectoryInterface {

    /**
     * Creates a directory at the specified path.
     * Prints a message indicating the creation of the directory.
     *
     */
    @Override
    public void create(String path) {
        System.out.println("Creating SubClassDirectory " + path);
    }

    /**
     * Removes the directory at the specified path.
     * Prints a message indicating the removal of the directory.
     *
     */
    @Override
    public void rmdir(String path) {
        System.out.println("Removing SubClassDirectory " + path);
    }
}
