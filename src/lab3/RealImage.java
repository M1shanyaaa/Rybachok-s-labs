package lab3;

/**
 * RealImage class that implements the {@link Image} interface.
 *
 * <p>This class represents the real object that performs the actual image manipulation.
 * When the {@code ManipulateImage} method is called, it outputs the provided coordinates
 * or parameters to the console.
 *
 * @see Image
 */
public class RealImage implements Image {

    /**
     * Implements the {@code ManipulateImage} method from the {@link Image} interface.
     *
     * <p>This method simply prints the provided coordinates or parameters to the console.
     *
     * @param x the first parameter for manipulation (e.g., x-coordinate)
     * @param y the second parameter for manipulation (e.g., y-coordinate)
     */
    @Override
    public void ManipulateImage(int x, int y) {
        System.out.println("Cords: " + x + ", " + y);

    }
}
