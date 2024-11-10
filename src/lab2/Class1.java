package lab2;
/**
 * The {@code lab2.Class1} class implements the {@link Interface1} interface.
 * <p>
 * This class provides an implementation of the {@link #method1()} method to perform a specific operation defined in {@link Interface1}.
 * </p>
 */
public class Class1 implements Interface1{
    /**
     * The {@code class1} field is a reference to an object that implements {@link Class3}.
     * This field can be used to store and interact with an {@link Class3} instance.
     */
    Class3 class3;
    /**
     * Implementation of the {@link Interface1 method1()} method.
     * <p>
     * This method prints a message to the console.
     * </p>
     */


    /**
     * Implementation of the {@link Class3 method3()} method.
     * <p>
     * This method prints a message to the console.
     * </p>
     */
    @Override
    public void method3() {
        System.out.println("Class1.method3");
    }

    @Override
    public void method1() {

    }
}
