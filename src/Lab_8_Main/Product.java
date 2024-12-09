package Lab_8_Main;

/**
 * Product представляє завершений об'єкт.
 */
public class Product {
    private CompositeGraphic graphic;

    public Product(CompositeGraphic graphic) {
        this.graphic = graphic;
    }

    public void display() {
        graphic.draw();
    }
}