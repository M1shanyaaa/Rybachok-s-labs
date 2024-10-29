package lab2;

/**
 * The {@code lab2.Interface2} interface extends {@link Interface3} and adds a new method {@link #method2()}.
 * <p>
 * Classes that implement this interface must provide an implementation
 * for the {@link #method2()} method.
 * </p>
 */

public interface Interface2 extends Interface3{
    /**
     * Describes the {@code method2} that must be implemented by classes that implement this interface.
     * <p>
     * This method can be used to perform specific actions that must be defined in the implementation.
     * </p>
     */
    void method2();
}
