package lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for storing and processing a collection of network elements.
 */
public class NetworkObjectStructure {
    private final List<Element> elements = new ArrayList<>();

    /**
     * Adds an element to the structure.
     */
    public void addElement(Element element) {
        elements.add(element);
    }

    /**
     * Accepts a visitor for all elements.
     */
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
