package lab6;

/**
 * Interface for a visitor that performs operations on network elements.
 */
public interface Visitor {
    /**
     * Visits a cable element.
     */
    void visitCable(CableConcreteElement cable);

    /**
     * Visits a server element.
     */
    void visitServer(ServerConcreteElement server);

    /**
     * Visits a workstation element.
     */
    void visitWorkstation(WorkstationConcreteElement workstation);
}
