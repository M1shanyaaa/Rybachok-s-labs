package lab4;

/**
 * The Facade class provides a simplified interface for creating and
 * destroying files and directories. It interacts with various
 * subclasses to manage the operations on files and directories.
 */
public class Facade {

    private SubClassFile file1, file2, file3;
    private SubClassDirectory directory1, directory2;

    /**
     * Constructs a new Facade instance, initializing the necessary
     * file and directory objects.
     */
    public Facade() {
        this.directory1 = new SubClassDirectory();
        this.directory2 = new SubClassDirectory();
        this.file1 = new SubClassFile();
        this.file2 = new SubClassFile();
        this.file3 = new SubClassFile();
    }

    /**
     * Creates files and directories by calling appropriate methods
     * to open and create files, and to create directories.
     *
     */
    void create(String path) {
        file1.open("file1.txt", true);
        file2.open("file2.txt", true);
        file3.open("file3.txt", true);
        directory1.create("directory1.txt");
        directory2.create("directory2.txt");
        file1.close("file1.txt");
        file2.close("file2.txt");
        file3.close("file3.txt");
    }

    /**
     * Destroys (deletes) the files and directories by calling the
     * delete method for files and the remove method for directories.
     *
     */
    void destroy(String path) {
        file1.delete("file1.txt");
        file2.delete("file2.txt");
        file3.delete("file3.txt");
        directory1.rmdir("directory1.txt");
        directory2.rmdir("directory2.txt");
    }
}
