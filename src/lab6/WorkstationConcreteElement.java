package lab6;

/**
 * Represents a workstation in the network.
 */
public class WorkstationConcreteElement implements Element {
    private final String owner; // Owner of the workstation

    /**
     * Constructor to initialize the workstation owner.
     */
    public WorkstationConcreteElement(String owner) {
        this.owner = owner;
    }

    /**
     * Returns the owner of the workstation.
     */
    public String getOwner() {
        return owner;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitWorkstation(this);
    }
}
