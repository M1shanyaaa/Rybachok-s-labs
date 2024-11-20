package lab6;

/**
 * Представляє робочу станцію у мережі.
 */
public class WorkstationConcreteElement implements Element {
    private final String owner;

    public WorkstationConcreteElement(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitWorkstation(this);
    }
}
