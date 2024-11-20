package lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас для зберігання та обробки колекції елементів мережі.
 */
public class NetworkObjectStructure {
    private List<Element> elements = new ArrayList<>();

    /**
     * Додає елемент до структури.
     */
    public void addElement(Element element) {
        elements.add(element);
    }

    /**
     * Приймає відвідувача для всіх елементів.
     */
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
