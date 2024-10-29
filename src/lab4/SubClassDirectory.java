package lab4;

public class SubClassDirectory implements DirectoryInterface{
    @Override
    public void create(String path) {
        System.out.println("Creating SubClassDirectory " + path);
    }

    @Override
    public void rmdir(String path) {
        System.out.println("Removing SubClassDirectory " + path);
    }
}
