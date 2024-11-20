package lab6;

/**
 * Відвідувач, що визначає кошторис мережевої структури.
 */
public class CostEstimationVisitor implements Visitor {
    private int totalCost = 0;

    @Override
    public void visitCable(CableConcreteElement cable) {
        int cost = cable.getLength() * 10; // 10 hryvnias for metr
        System.out.println("Cable: " + cable.getLength() + " m.; Cost: " + cost + " hryvnias");
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
        int cost = 3000; // Fixed cost of workstation
        System.out.println("Workstation (" + workstation.getOwner() + "), Cost: " + cost + " hryvnias");
        totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }
}