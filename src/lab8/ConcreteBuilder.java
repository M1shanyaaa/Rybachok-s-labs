package lab8;

/**
 * ConcreteBuilder is a concrete implementation of the Builder interface.
 * It assembles parts of the Product based on the provided parameters.
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    /**
     * Builds a primitive part (e.g., line) and adds it to the product.
     *
     * @param type the part type (e.g., "Line")
     * @param color the color of the part
     * @param size the size of the part
     */
    @Override
    public void buildPartA(String type, String color, int size) {
        product.add("Part Primitive ( " + type + " ) with color: " + color + ", size: " + size);
    }

    //    @Override
    //    public void buildPartB(String color, int size) {
    //        product.add("Part Primitive (Circle) with color: " + color + ", size: " + size);
    //    }

    /**
     * Builds a composite part (e.g., rectangle) and adds it to the product.
     *
     * @param type the part type (e.g., "Rectangle")
     * @param size the size of the part
     */
    @Override
    public void buildPartC(String type, int size) {
        product.add("Part Composite (" + type + ") with size: " + size);
    }

    /**
     * Returns the built product.
     *
     * @return the constructed product
     */
    @Override
    public Product getResult() {
        return product;
    }
}

