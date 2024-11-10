package lab5;

/**
 * Interface for iterating over a collection in both forward and reverse directions.
 */
public interface Iterator<T> {

    /**
     * Checks if there is a next element in the iteration.
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration.
     */
    T next();

    /**
     * Checks if there is a previous element in the iteration.
     */
    boolean hasPrevious();

    /**
     * Returns the previous element in the iteration.
     */
    T previous();
}
