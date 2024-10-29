package lab4;

public class Facade {
    private SubClassFile file1, file2, file3;
    private SubClassDirectory directory1, directory2;

    public Facade() {
        this.directory1 = new SubClassDirectory();
        this.directory2 = new SubClassDirectory();
        this.file1 = new SubClassFile();
        this.file2 = new SubClassFile();
        this.file3 = new SubClassFile();
    }
    void create(String path){
        file1.open("file1.txt",true);
        file2.open("file2.txt",true);
        file3.open("file3.txt",true);
        directory1.create("directory1.txt");
        directory2.create("directory2.txt");
    }

    void destroy(String path){
        file1.delete("file1.txt");
        file2.delete("file2.txt");
        file3.delete("file3.txt");
        directory1.rmdir("directory1.txt");
        directory2.rmdir("directory2.txt");
    }

}
