package lab7;

/**
 * Context class for managing TCP connection states.
 * Delegates behavior to the current state and allows state transitions.
 */
public class TCPConnectionContext {
    private TCPState state;

    /**
     * Initializes the context with no state.
     */
    public TCPConnectionContext() {
        this.state = null; // Initial state is not set
    }

    /**
     * Sets the current state of the connection.
     *
     * @param state the new TCP state
     */
    public void setState(TCPState state) {
        this.state = state;
        System.out.println("State changed to: " + (state != null ? state.getClass().getSimpleName() : "NULL") + "\n");
    }

    /**
     * Executes the "open" action in the current state.
     * Prints an error if no state is set.
     */
    public void open() {
        if (state != null) {
            state.open(this);
        } else {
            System.out.println("Error: State not set!");
        }
    }

    /**
     * Executes the "close" action in the current state.
     * Prints an error if no state is set.
     */
    public void close() {
        if (state != null) {
            state.close(this);
        } else {
            System.out.println("Error: State not set!");
        }
    }

    /**
     * Executes the "listen" action in the current state.
     * Prints an error if no state is set.
     */
    public void listen() {
        if (state != null) {
            state.listen(this);
        } else {
            System.out.println("Error: State not set!");
        }
    }
}
