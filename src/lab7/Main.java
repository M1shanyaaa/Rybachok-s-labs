package lab7;

public class Main {
    public static void main(String[] args) {
        TCPConnectionContext connection = new TCPConnectionContext();

        System.out.println("=== Встановлюємо початковий стан: CLOSED ===");
        connection.setState(new TCPStateClosed());

        connection.close();
        connection.listen();
        connection.listen();
        connection.open();
        connection.listen();
        connection.close();

    }
}
