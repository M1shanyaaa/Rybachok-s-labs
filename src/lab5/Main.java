package lab5;

/**
 * Main class to demonstrate forward and reverse iteration over a collection.
 */
public class Main {

    /**
     * Main method to demonstrate iteration functionality.
     * It creates a collection, adds items, and demonstrates both forward and reverse iteration.
     */
    public static void main(String[] args) {
        ConcreteAggregate<String> collection = new ConcreteAggregate<>();
        collection.add("Item 1");
        collection.add("Item 2");
        collection.add("Item 3");


        System.out.println("Forward iteration:");
        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nReverse iteration:");
        Iterator<String> reverseIterator = collection.createReverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
