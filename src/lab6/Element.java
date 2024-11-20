package lab6;

/**
 * Interface for a network element.
 * Defines the accept() method for accepting a visitor.
 */
public interface Element {
    void accept(Visitor visitor);
}
