package lab8;

/**
 * The Builder interface defines methods for constructing parts of a Product.
 */
public interface Builder {

    /**
     * Builds a primitive part (e.g., line, circle) and adds it to the product.
     *
     * @param type  the part type (e.g., "Line", "Circle")
     * @param color the color of the part
     * @param size  the size of the part
     */
    void buildPartA(String type, String color, int size);

    /**
     * Builds a composite part (e.g., rectangle, triangle) and adds it to the product.
     *
     * @param type the part type (e.g., "Rectangle", "Triangle")
     * @param size the size of the part
     */
    void buildPartC(String type, int size);

    /**
     * Returns the final product.
     *
     * @return the constructed Product
     */
    Product getResult();
}
