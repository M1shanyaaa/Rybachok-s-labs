package lab8;

/**
 * The Director class manages the construction process of a product.
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
     * Builds parts of the product based on the specification line.
     *
     * @param specification a single line from the specification file
     */
    public void buildFromSpecification(String specification) {
        String[] parts = specification.split(" ");
        switch (parts[0]) {
            case "Primitive":
                String primitiveType = parts[1];
                String color = parts.length > 2 ? parts[2] : "default";
                int size = parts.length > 3 ? Integer.parseInt(parts[3]) : 3;
                builder.buildPartA(primitiveType, color, size);
                break;
            case "Composite":
                String compositeType = parts[1];
                int compositeSize = parts.length > 2 ? Integer.parseInt(parts[2]) : 3;
                builder.buildPartC(compositeType, compositeSize);
                break;
            default:
                System.out.println("Unknown specification: " + specification);
        }
    }
}
