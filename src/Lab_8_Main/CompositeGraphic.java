package Lab_8_Main;

import java.util.ArrayList;
import java.util.List;

/**
 * CompositeGraphic дозволяє об'єднувати кілька Graphic елементів у структуру.
 */
public class CompositeGraphic implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void draw() {
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}