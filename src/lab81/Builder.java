package lab81;

/**
 * Інтерфейс Builder описує методи для створення частин продукту.
 */
public interface Builder {
    void buildPartA(String type, String color, int size); // Для лінії  та лінії
//    void buildPartB(String color, int size); // Для кола
    void buildPartC(String type, int size); // Для композитів (прямокутник, трикутник)
    Product getResult();
}

