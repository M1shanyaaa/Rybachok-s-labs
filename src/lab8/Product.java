package lab8;

import java.util.ArrayList;
import java.util.List;

/**
 * The Product class represents the object being built.
 */
public class Product {
    private List<String> parts = new ArrayList<>();

    /**
     * Adds a part to the product.
     *
     * @param part description of the product part
     */
    public void add(String part) {
        parts.add(part);
    }

    /**
     * Displays all parts of the product.
     */
    public void show() {
        System.out.println("Product parts:");
        for (String part : parts) {
            System.out.println("- " + part);
        }
    }
}
