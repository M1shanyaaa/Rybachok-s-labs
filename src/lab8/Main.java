package lab8;

/**
 * Main class for testing the implementation of the Builder pattern.
 * This class reads a specification file, uses the Builder pattern to
 * construct a product, and then displays the result.
 */
public class Main {

    /**
     * Main method that executes the Builder pattern functionality.
     * It reads the specification file, builds the product using
     * the SpecificationReader, and displays the product details.
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
