package lab8;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RectangleGraphic implements Drawable {
    private final double x, y, width, height;
    private final String color;

    public RectangleGraphic(double x, double y, double width, double height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.web(color));
        gc.fillRect(x, y, width, height);
    }
}
