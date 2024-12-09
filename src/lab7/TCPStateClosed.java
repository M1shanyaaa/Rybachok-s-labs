package lab7;

/**
 * Represents the CLOSED state of a TCP connection.
 * Handles actions for transitioning from the CLOSED state.
 */
public class TCPStateClosed implements TCPState {

    /**
     * Opens the connection and transitions to the ESTABLISHED state.
     *
     * @param context the TCP connection context
     */
    @Override
    public void open(TCPConnectionContext context) {
        System.out.println("Opening the connection...\n");
        context.setState(new TCPStateEstablished());
    }

    /**
     * Handles the "close" action. No transition occurs as the connection is already closed.
     *
     * @param context the TCP connection context
     */
    @Override
    public void close(TCPConnectionContext context) {
        System.out.println("The connection is already closed");
    }

    /**
     * Transitions to the LISTENING state.
     *
     * @param context the TCP connection context
     */
    @Override
    public void listen(TCPConnectionContext context) {
        System.out.println("Move on to the state: LISTENING...");
        context.setState(new TCPStateListening());
    }
}
