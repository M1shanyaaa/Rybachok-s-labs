package lab3;

/**
 * Proxy class that controls access to the {@link RealImage} object.
 *
 * <p>This class implements the {@link Image} interface and serves as a proxy to the {@link RealImage} class.
 * It performs validation on the input coordinates before delegating the manipulation to the real image object.
 * If the coordinates are outside the allowed bounds, it prevents manipulation and outputs an error message.
 *
 * @see Image
 * @see RealImage
 */
public class Proxy implements Image {

    /** The real image object that performs actual manipulations. */
    private final RealImage realImage;

    /** Boundaries for the allowed x and y coordinates. */
    private int x1, x2, y1, y2;

    /**
     * Constructor for the Proxy class.
     *
     * <p>This constructor initializes the boundaries and creates an instance of the {@link RealImage} class.
     * The x and y boundaries define the valid range for the coordinates that can be manipulated.
     *
     * @param x1 the minimum allowed value for the x-coordinate
     * @param x2 the maximum allowed value for the x-coordinate
     * @param y1 the minimum allowed value for the y-coordinate
     * @param y2 the maximum allowed value for the y-coordinate
     */
    public Proxy(int x1, int x2, int y1, int y2) {
        this.realImage = new RealImage();
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /**
     * Implements the {@code ManipulateImage} method from the {@link Image} interface.
     *
     * <p>This method checks if the provided coordinates are within the valid boundaries.
     * If the coordinates are out of bounds, it prints an error message. Otherwise, it
     * delegates the manipulation to the {@link RealImage} object.
     *
     * @param x the x-coordinate for manipulation
     * @param y the y-coordinate for manipulation
     */
    @Override
    public void ManipulateImage(int x, int y) {
        if (x < x1 || x > x2 || y < y1 || y > y2) {
            System.out.println("Naahhh.. Fail: coordinates out of bounds");
        } else {
            realImage.ManipulateImage(x, y);
        }
    }
}
