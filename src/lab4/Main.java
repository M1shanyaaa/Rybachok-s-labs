package lab4;

/**
 * The Main class is the entry point of the application.
 * It demonstrates the use of the Facade design pattern by invoking
 * its methods to create and destroy resources or perform actions
 * related to the given directory path.
 */
public class Main {

    /**
     * The main method is the starting point of the program.
     * It creates an instance of the Facade class and uses its methods
     * to create and destroy resources located at a specified directory.
     *
     */
    public static void main(String[] args) {

        Facade facade = new Facade();

        facade.create("scr/lab4");

        facade.destroy("scr/lab4");
    }
}