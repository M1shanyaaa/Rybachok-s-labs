package lab6;

public class Main {
    public static void main(String[] args) {
        NetworkObjectStructure network = new NetworkObjectStructure();
        network.addElement(new CableConcreteElement(200)); // Cabel 200 m.
        network.addElement(new ServerConcreteElement("My personal server"));
        network.addElement(new WorkstationConcreteElement("Zvena station"));

        CostEstimationVisitor costVisitor = new CostEstimationVisitor();
        network.accept(costVisitor);

        System.out.println("Cost of my Network: " + costVisitor.getTotalCost() + " hryvnias");
    }
}
