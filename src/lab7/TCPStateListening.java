package lab7;

/**
 * Represents the LISTENING state of a TCP connection.
 * Handles actions for transitioning from the LISTENING state.
 */
public class TCPStateListening implements TCPState {

    /**
     * Opens the connection and transitions to the ESTABLISHED state.
     *
     * @param context the TCP connection context
     */
    @Override
    public void open(TCPConnectionContext context) {
        System.out.println("Opening the connection...");
        context.setState(new TCPStateEstablished());
    }

    /**
     * Closes the connection and transitions to the CLOSED state.
     *
     * @param context the TCP connection context
     */
    @Override
    public void close(TCPConnectionContext context) {
        System.out.println("Closing the connection...");
        context.setState(new TCPStateClosed());
    }

    /**
     * Handles the "listen" action. No transition occurs as the connection is already in the LISTENING state.
     *
     * @param context the TCP connection context
     */
    @Override
    public void listen(TCPConnectionContext context) {
        System.out.println("Connection is already in state: LISTENING.");
    }
}
