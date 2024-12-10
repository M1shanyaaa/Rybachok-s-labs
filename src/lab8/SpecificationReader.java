package lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The SpecificationReader class reads a specification file and delegates the construction process to the Director.
 */
public class SpecificationReader {

    private Director director;

    /**
     * Constructor initializes the Director with a Builder.
     */
    public SpecificationReader() {
        director = new Director();
    }

    /**
     * Reads a specification file and uses the Director to construct the Product.
     *
     * @param filePath path to the specification file
     * @return the constructed Product
     */
    public Product readSpecification(String filePath) {
        ConcreteBuilder builder = new ConcreteBuilder();
        director.setBuilder(builder);

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mishanya\\IdeaProjects\\untitled\\src\\lab8\\specification.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                director.buildFromSpecification(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.getResult();
    }
}

