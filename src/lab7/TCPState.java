package lab7;

/**
 * Interface for TCP connection states.
 * Defines actions (open, close, listen) for each state.
 */
public interface TCPState {

    /**
     * Handles the "open" action for the current state.
     *
     * @param context the TCP connection context
     */
    void open(TCPConnectionContext context);

    /**
     * Handles the "close" action for the current state.
     *
     * @param context the TCP connection context
     */
    void close(TCPConnectionContext context);

    /**
     * Handles the "listen" action for the current state.
     *
     * @param context the TCP connection context
     */
    void listen(TCPConnectionContext context);
}
