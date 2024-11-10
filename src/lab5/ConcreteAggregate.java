package lab5;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the Aggregate interface for managing a collection of items.
 * Provides methods for creating both forward and reverse iterators.
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> items = new ArrayList<>();

    /**
     * Adds an item to the collection.
     */
    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items, false);
    }

    /**
     * Creates and returns a reverse iterator for the collection.
     */
    public Iterator<T> createReverseIterator() {
        return new ConcreteIterator<>(items, true);
    }
}
