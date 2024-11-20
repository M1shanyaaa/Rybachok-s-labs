package lab7;

public class TCPConnectionContext {
    private TCPState state;

    public TCPConnectionContext() {
        this.state = null; // Початковий стан відсутній
    }

    public void setState(TCPState state) {
        this.state = state;
        System.out.println("State changed to: " + (state != null ? state.getClass().getSimpleName() : "NULL") + "\n");
    }

    public void open() {
        if (state != null) {
            state.open(this);
        } else {
            System.out.println("Помилка: стан не встановлено!");
        }
    }

    public void close() {
        if (state != null) {
            state.close(this);
        } else {
            System.out.println("Помилка: стан не встановлено!");
        }
    }

    public void listen() {
        if (state != null) {
            state.listen(this);
        } else {
            System.out.println("Помилка: стан не встановлено!");
        }
    }
}
