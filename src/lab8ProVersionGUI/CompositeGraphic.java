package lab8ProVersionGUI;

import javafx.scene.canvas.GraphicsContext;
import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Product {
    private final List<Product> elements = new ArrayList<>();

    public void add(Product element) {
        elements.add(element);
    }

    public void remove(Product element) {
        elements.remove(element);
    }

    @Override
    public void draw(GraphicsContext gc) {
        for (Product element : elements) {
            element.draw(gc);
        }
    }
}
