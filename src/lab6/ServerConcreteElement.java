package lab6;

/**
 * Represents a server in the network.
 */
public class ServerConcreteElement implements Element {
    private final String model; // Server model

    /**
     * Constructor to initialize the server model.
     */
    public ServerConcreteElement(String model) {
        this.model = model;
    }

    /**
     * Returns the model of the server.
     */
    public String getModel() {
        return model;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitServer(this);
    }
}
