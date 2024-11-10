package lab5;

/**
 * Interface representing a collection that can create an iterator.
 */
public interface Aggregate<T> {

    /**
     * Creates and returns an iterator for the collection.
     */
    Iterator<T> createIterator();
}
