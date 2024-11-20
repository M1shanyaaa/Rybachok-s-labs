package lab7;

public class TCPStateListening implements TCPState {
    @Override
    public void open(TCPConnectionContext context) {
        System.out.println("Opening the connection...");
        context.setState(new TCPStateEstablished());
    }

    @Override
    public void close(TCPConnectionContext context) {
        System.out.println("Closing the connection...");
        context.setState(new TCPStateClosed());
    }

    @Override
    public void listen(TCPConnectionContext context) {
        System.out.println("Connection is already in state: LISTENING");
    }
}
