package lab5;

import java.util.List;

/**
 * Concrete implementation of the Iterator interface for iterating over a collection of items.
 * Supports both forward and reverse iteration.
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> items;
    private int position = 0;
    private boolean reverse = false;  // Track whether reverse iteration is enabled

    /**
     * Constructs an iterator with the specified collection and iteration direction.
     */
    public ConcreteIterator(List<T> items, boolean reverse) {
        this.items = items;
        this.reverse = reverse;
        if (reverse) {
            position = items.size() - 1;  // Start from the last element if reverse
        }
    }

    @Override
    public boolean hasNext() {
        if (reverse) {
            return position >= 0;
        }
        return position < items.size();
    }

    @Override
    public T next() {
        if (reverse) {
            return items.get(position--);  // Move backwards
        }
        return items.get(position++);
    }

    @Override
    public boolean hasPrevious() {
        return position > 0;  // Check if there's a previous element
    }

    @Override
    public T previous() {
        return items.get(position--);  // Move to the previous element
    }
}
