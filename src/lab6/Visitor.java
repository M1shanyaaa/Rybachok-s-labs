package lab6;

/**
 * Інтерфейс для відвідувача, що реалізує операції над елементами мережі.
 */
public interface Visitor {
    void visitCable(CableConcreteElement cable);
    void visitServer(ServerConcreteElement server);
    void visitWorkstation(WorkstationConcreteElement workstation);
}