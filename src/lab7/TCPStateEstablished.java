package lab7;

public class TCPStateEstablished implements TCPState {

    @Override
    public void open(TCPConnectionContext context) {
        System.out.println("The connection is already done.");
    }

    @Override
    public void close(TCPConnectionContext context) {
        System.out.println("Closing the connection...");
        context.setState(new TCPStateClosed());
    }

    @Override
    public void listen(TCPConnectionContext context) {
        System.out.println("Unable to transition to LISTENING from ESTABLISHED state");
    }
}
