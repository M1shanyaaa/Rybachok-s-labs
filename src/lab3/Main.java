package lab3;

/**
 * lab3.Image.Main class, which demonstrates the use of the Proxy pattern for image manipulation.
 *
 * <p>This class creates an instance of the {@link Proxy} class, which acts as a proxy for the {@link Image} interface.
 * It then calls the {@code ManipulateImage} method on the proxy to perform image manipulation operations.
 *
 * @see Image
 * @see Proxy
 */
public class Main {
    /**
     * The entry point of the program.
     *
     * <p>This method initializes a proxy object for image manipulation and calls the {@code ManipulateImage} method
     * multiple times with different parameters.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        /**
         * Creating a proxy object for manipulating images.
         * The parameters (2, 8, 2, 6) represent the coordinates or dimensions for image initialization.
         */
        Image proxy = new Proxy(2, 8, 2, 6);

        /**
         * Manipulate the image using the proxy. Each call manipulates the image with given parameters.
         *
         * @param x - first parameter for the manipulation
         * @param y - second parameter for the manipulation
         */
        proxy.ManipulateImage(2, 4);
        proxy.ManipulateImage(5, 4);
        proxy.ManipulateImage(1, 9);
    }
}
