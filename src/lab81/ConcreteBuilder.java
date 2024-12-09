package lab81;

/**
 * ConcreteBuilder є конкретною реалізацією інтерфейсу Builder.
 * Він створює і збирає частини об'єкта Product.
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA(String type, String color, int size) {
        product.add("Part Primitive ( "+ type +" ) with color: " + color + ", size: " + size);
    }

//    @Override
//    public void buildPartB(String color, int size) {
//        product.add("Part Primitive (Circle) with color: " + color + ", size: " + size);
//    }

    @Override
    public void buildPartC(String type, int size) {
        product.add("Part Composite (" + type + ") with size: " + size);
    }

    @Override
    public Product getResult() {
        return product;
    }
}


