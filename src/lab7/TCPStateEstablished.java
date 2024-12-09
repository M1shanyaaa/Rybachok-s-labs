package lab7;

/**
 * Represents the ESTABLISHED state of a TCP connection.
 * Handles actions for transitioning from the ESTABLISHED state.
 */
public class TCPStateEstablished implements TCPState {

    /**
     * Handles the "open" action. No transition occurs as the connection is already established.
     *
     * @param context the TCP connection context
     */
    @Override
    public void open(TCPConnectionContext context) {
        System.out.println("The connection is already established.");
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
     * Handles the "listen" action. Transition to LISTENING is not allowed from the ESTABLISHED state.
     *
     * @param context the TCP connection context
     */
    @Override
    public void listen(TCPConnectionContext context) {
        System.out.println("Unable to transition to LISTENING from the ESTABLISHED state.");
    }
}
