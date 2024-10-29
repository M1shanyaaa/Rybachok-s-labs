package lab2;
/**
 * The {@code lab2.Class3} class implements the {@link Interface3} interface.
 * <p>
 * This class provides an implementation of the {@link #method3()} method to perform a specific operation defined in {@link Interface3}.
 * </p>
 */

public class Class3 implements Interface3 {
    /**
     * The {@code class3} field is a reference to an object that implements {@link Interface2}.
     * This field can be used to store and interact with an {@link Interface2} instance.
     */
    Interface2 interface2;

    /**
     * Implementation of the {@link Interface3 method3()} method.
     * <p>
     * This method prints a message to the console.
     * </p>
     */
    public void method3() {
        System.out.println("Class3.method3");
    }

}
