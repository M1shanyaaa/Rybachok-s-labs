package lab8ProVersionGUI;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CircleGraphic implements Drawable {
    private final double centerX, centerY, radius;
    private final String color;

    public CircleGraphic(double centerX, double centerY, double radius, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.web(color));
        gc.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }
}
