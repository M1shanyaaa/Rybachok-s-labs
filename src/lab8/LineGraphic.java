package lab8;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class LineGraphic implements Drawable {
    private final double startX, startY, endX, endY;
    private final String color;

    public LineGraphic(double startX, double startY, double endX, double endY, String color) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(Color.web(color));
        gc.setLineWidth(2);
        gc.strokeLine(startX, startY, endX, endY);
    }
}
