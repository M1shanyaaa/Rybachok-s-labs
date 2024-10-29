package lab2;

/**
 * The {@code lab2.Interface1} interface extends {@link Interface3} and adds a new method {@link #method1()}.
 * <p>
 * Classes that implement this interface must provide an implementation
 * for the {@link #method1()} method.
 * </p>
 */

public interface Interface1 extends Interface3 {
    /**
     * Describes the {@code method1} that must be implemented by classes that implement this interface.
     * <p>
     * This method can be used to perform specific actions that must be defined in the implementation.
     * </p>
     */
    void method1();
}
