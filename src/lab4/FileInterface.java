package lab4;

public interface FileInterface {

    void open(String path, boolean createIfNotExist);
    void close();
    void delete(String path);
}
