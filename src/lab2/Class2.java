package lab2;
/**
 * The {@code lab2.Class2} class implements the {@link Interface2} interface and extends the {@link Class3} class.
 * <p>
 * This class provides an implementation of the {@link #method2()} method to perform a specific operation defined in {@link Interface2}.
 * </p>
 */
public class Class2 extends Class3 implements Interface2 {
    /**
     * The {@code class2} field is a reference to an object that implements {@link Interface3}.
     * This field can be used to store and interact with an {@link Interface3} instance.
     */
    Interface3 interface3;
    /**
     * Implementation of the {@link Interface2 method2()} method.
     * <p>
     * This method prints a message to the console.
     * </p>
     */
    public void method2() {
        System.out.println("Class2.method2");
    }
    /**
     * Implementation of the {@link Interface3 method3()} method.
     * <p>
     * This method prints a message to the console.
     * </p>
     */
    public void method3() {
        System.out.println("Class2.method3");
    }
}
