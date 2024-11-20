package lab6;

/**
 * Представляє сервер у мережі.
 */
public class ServerConcreteElement implements Element {
    private final String model;

    public ServerConcreteElement(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitServer(this);
    }
}