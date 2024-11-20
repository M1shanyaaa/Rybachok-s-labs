package lab6;

/**
 * Visitor that calculates the cost estimation of the network structure.
 */
public class CostEstimationVisitor implements Visitor {
    private int totalCost = 0;

    @Override
    public void visitCable(CableConcreteElement cable) {
        int cost = cable.getLength() * 10; // 10 hryvnias per meter
        System.out.println("Cable: " + cable.getLength() + " m; Cost: " + cost + " hryvnias");
        totalCost += cost;
    }

    @Override
    public void visitServer(ServerConcreteElement server) {
        int cost = 5000; // Fixed server cost
        System.out.println("Server (" + server.getModel() + "), Cost: " + cost + " hryvnias");
        totalCost += cost;
    }

    @Override
    public void visitWorkstation(WorkstationConcreteElement workstation) {
        int cost = 3000; // Fixed workstation cost
        System.out.println("Workstation (" + workstation.getOwner() + "), Cost: " + cost + " hryvnias");
        totalCost += cost;
    }

    /**
     * Returns the total cost of the network structure.
     */
    public int getTotalCost() {
        return totalCost;
    }
}
