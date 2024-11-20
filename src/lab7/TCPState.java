package lab7;

public interface TCPState {
    void open(TCPConnectionContext context);
    void close(TCPConnectionContext context);
    void listen(TCPConnectionContext context);
}
