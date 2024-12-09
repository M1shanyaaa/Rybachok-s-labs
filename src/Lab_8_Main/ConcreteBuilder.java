package Lab_8_Main;

/**
 * ConcreteBuilder реалізує створення примітивів та композитів.
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPrimitive(String name) {
        product.add(new Primitive(name));
    }

    @Override
    public void buildComposite() {
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(new Primitive("Default Composite Primitive"));
        product.add(composite);
    }
}
