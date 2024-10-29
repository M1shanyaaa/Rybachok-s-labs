package lab4;

public class Main {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.create("scr/lab4");
        facade.destroy("scr/lab4");
    }
}
