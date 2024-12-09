package lab8;

/**
 * The Builder interface defines methods for constructing parts of a product.
 */
public interface Builder {

    /**
     * Builds a primitive part (e.g., line) and adds it to the product.
     *
     * @param type the part type (e.g., "Line")
     * @param color the color of the part
     * @param size the size of the part
     */
    void buildPartA(String type, String color, int size);

    //    void buildPartB(String color, int size); // Для кола

    /**
     * Builds a composite part (e.g., rectangle or triangle) and adds it to the product.
     *
     * @param type the part type (e.g., "Rectangle")
     * @param size the size of the part
     */
    void buildPartC(String type, int size);

    /**
     * Returns the final product.
     *
     * @return the constructed product
     */
    Product getResult();
}
