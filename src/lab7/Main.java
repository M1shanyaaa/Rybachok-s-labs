package lab7;

/**
 * Main class demonstrating the TCP connection state pattern.
 * Uses different states (e.g., CLOSED) to manage behavior dynamically.
 */
public class Main {

    /**
     * Entry point of the program.
     * Demonstrates changing TCP connection states via method calls.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        TCPConnectionContext connection = new TCPConnectionContext();

        System.out.println("=== Setting initial state: CLOSED ===");
        connection.setState(new TCPStateClosed());

        connection.close();
        connection.listen();
        connection.listen();
        connection.open();
        connection.listen();
        connection.close();
    }
}
