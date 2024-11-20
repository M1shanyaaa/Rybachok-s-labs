package lab6;

/**
 * Main class for demonstrating the Visitor design pattern.
 * Creates a network structure with various elements and calculates its total cost.
 */
public class Main {

    /**
     * Entry point of the program.
     * Initializes the network, adds elements, and uses a visitor to estimate the total cost.
     *
     */
    public static void main(String[] args) {
        NetworkObjectStructure network = new NetworkObjectStructure();
        network.addElement(new CableConcreteElement(200)); // Cable 200 m.
        network.addElement(new ServerConcreteElement("My personal server"));
        network.addElement(new WorkstationConcreteElement("Zvena station"));

        CostEstimationVisitor costVisitor = new CostEstimationVisitor();
        network.accept(costVisitor);

        System.out.println("Cost of my Network: " + costVisitor.getTotalCost() + " hryvnias");
    }
}
