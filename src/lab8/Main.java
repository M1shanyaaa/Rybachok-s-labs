package lab8;

/**
 * Main class for testing the implementation of the Builder pattern.
 */
public class Main {

    /**
     * Main method that reads a specification file, constructs a product, and displays it.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a specification reader
        SpecificationReader reader = new SpecificationReader();

        // Read the specification and build the product
        Product product = reader.readSpecification("specification.txt");

        // Output the result
        product.show();
    }
}
