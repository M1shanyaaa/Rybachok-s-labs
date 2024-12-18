package lab8;

/**
 * ConcreteBuilder is a concrete implementation of the Builder interface.
 * It assembles parts of the Product based on the provided parameters.
 */
public class ConcreteBuilder implements Builder {

    private final Product product = new Product();

    /**
     * Builds a primitive part (e.g., line or circle) and adds it to the product.
     *
     * @param type  the part type (e.g., "Line", "Circle")
     * @param color the color of the part
     * @param size  the size of the part
     */
    @Override
    public void buildPartA(String type, String color, int size) {
        product.add("Part Primitive (" + type + ") with color: " + color + ", size: " + size);
    }

    /**
     * Builds a composite part (e.g., rectangle, triangle) and adds it to the product.
     *
     * @param type the part type (e.g., "Rectangle", "Triangle")
     * @param size the size of the part
     */
    @Override
    public void buildPartC(String type, int size) {
        product.add("Part Composite (" + type + ") with size: " + size);
    }

    /**
     * Returns the built product.
     *
     * @return the constructed Product
     */
    @Override
    public Product getResult() {
        return product;
    }
}
