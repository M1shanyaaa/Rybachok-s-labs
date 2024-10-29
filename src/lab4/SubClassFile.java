package lab4;

public class SubClassFile implements FileInterface {


    @Override
    public void open(String path, boolean createIfNotExist) {
        System.out.println("Opening file: " + path);
    }

    @Override
    public void close() {
        System.out.println("File closed");
    }

    @Override
    public void delete(String path) {
        System.out.println("File "+ path + " deleted");
    }
}
