package lab8ProVersionGUI;

public class Primitive implements Product {
    private final Drawable drawable;

    public Primitive(Drawable drawable) {
        this.drawable = drawable;
    }

    @Override
    public void draw(javafx.scene.canvas.GraphicsContext gc) {
        drawable.draw(gc);
    }
}
