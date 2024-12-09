package Lab_8_Main;

/**
 * Клас Primitive представляє базовий графічний елемент.
 */
public class Primitive implements Graphic {
    private String name;

    public Primitive(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing primitive: " + name);
    }
}