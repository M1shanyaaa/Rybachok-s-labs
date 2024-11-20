package lab6;

/**
 * Represents a cable in the network.
 */
public class CableConcreteElement implements Element {
    private final int length; // Cable length in meters

    /**
     * Constructor to initialize the cable length.
     */
    public CableConcreteElement(int length) {
        this.length = length;
    }

    /**
     * Returns the length of the cable.
     */
    public int getLength() {
        return length;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCable(this);
    }
}
