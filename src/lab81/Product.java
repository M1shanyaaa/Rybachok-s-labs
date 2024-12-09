package lab81;

import java.util.ArrayList;
import java.util.List;

/**
 * Product є класом, який представляє об'єкт, що будується.
 */
public class Product {
    private List<String> parts = new ArrayList<>();

    /**
     * Додає частину до продукту.
     * @param part опис частини продукту
     */
    public void add(String part) {
        parts.add(part);
    }

    /**
     * Виводить усі частини продукту.
     */
    public void show() {
        System.out.println("Product parts:");
        for (String part : parts) {
            System.out.println("- " + part);
        }
    }
}

