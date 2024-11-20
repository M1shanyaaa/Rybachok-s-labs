package lab7;

public class TCPStateClosed implements TCPState{
    @Override
    public void open(TCPConnectionContext context) {
        System.out.println("Opening the connection...\n");
        context.setState(new TCPStateEstablished());
    }

    @Override
    public void close(TCPConnectionContext context) {
        System.out.println("The connection is already closed");
    }

    @Override
    public void listen(TCPConnectionContext context) {
        System.out.println("Move on to the state: LISTENING...");
        context.setState(new TCPStateListening());
    }
}
