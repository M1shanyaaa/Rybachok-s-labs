package Lab_8_Main;

/**
 * Абстрактний Builder для створення графічних об'єктів.
 */
public abstract class Builder {
    protected CompositeGraphic product;

    public Builder() {
        product = new CompositeGraphic();
    }

    public abstract void buildPrimitive(String name);
    public abstract void buildComposite();

    public CompositeGraphic getProduct() {
        return product;
    }
}
