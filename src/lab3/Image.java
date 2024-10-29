package lab3;

/**
 * Image interface for defining image manipulation methods.
 *
 * <p>This interface declares a method {@code ManipulateImage} that is intended to be implemented by classes
 * which will define specific behavior for image manipulation.
 *
 * <p>The {@code ManipulateImage} method takes two parameters that can represent coordinates, dimensions,
 * or other values required for image manipulation.
 */
public interface Image {

    /**
     * Manipulates the image using the provided parameters.
     *
     * <p>This method is intended to perform some form of image manipulation, with the specifics
     * to be determined by the implementing class.
     *
     * @param x the first parameter for manipulation (e.g., x-coordinate or width)
     * @param y the second parameter for manipulation (e.g., y-coordinate or height)
     */
    void ManipulateImage(int x, int y);

}
