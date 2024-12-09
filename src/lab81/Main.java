package lab81;

/**
 * Main клас для тестування реалізації шаблону Builder.
 */
public class Main {
    public static void main(String[] args) {
        // Створення читача специфікації
        SpecificationReader reader = new SpecificationReader();

        // Зчитування специфікації та побудова продукту
        Product product = reader.readSpecification("specification.txt");

        // Виведення результату
        product.show();
    }
}

