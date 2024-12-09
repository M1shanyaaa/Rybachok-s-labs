package lab8;

/**
 * The Director class manages the construction process of a product.
 * It defines the order in which Builder methods are called to create the full Product object.
 */
public class Director {
    private Builder builder;

    /**
     * Sets the builder to be used for creating the product.
     *
     * @param builder the specific builder to be used
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * Manages the construction of a simple product.
     */
    public void constructSimpleProduct() {
        builder.buildPartA("Circle", "default", 3); // Circle with default color and size 3
        //        builder.buildPartB("default", 3); // Коло з кольором "default" і розміром 3
        builder.buildPartC("Rectangle", 3); // Composite Rectangle with size 3
    }

    /**
     * Manages the construction of a more complex product.
     */
    public void constructComplexProduct() {
        builder.buildPartA("Circle", "red", 5); // Circle with red color and size 5
        //        builder.buildPartB("green", 4); // Коло із зеленим кольором і розміром 4
        builder.buildPartC("Triangle", 2); // Composite Triangle with size 2
    }
}

