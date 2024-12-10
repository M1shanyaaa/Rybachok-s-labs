package TEST1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The SpecificationReader class reads a specification file to build a graphical object.
 */
public class SpecificationReader {
    private Director director;
    private ConcreteBuilder builder;

    /**
     * Constructor that initializes the Director and Builder objects.
     */
    public SpecificationReader() {
        director = new Director();
        builder = new ConcreteBuilder();
        director.setBuilder(builder);
    }

    /**
     * Reads a specification file and constructs a product based on the file's contents.
     *
     * @param filePath path to the specification file
     * @return the constructed Product
     */
    public Product readSpecification(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mishanya\\IdeaProjects\\untitled\\src\\lab8\\specification.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Processing: " + line);

                // Split the line into parts to extract parameters
                String[] parts = line.split(" ");
                if (parts[0].equals("Primitive")) {
                    String type = parts[1]; // Type (Line or Circle)
                    String color = parts.length > 2 ? parts[2] : "default"; // Color
                    int size = parts.length > 3 ? Integer.parseInt(parts[3]) : 3; // Size (default is 3)
                    builder.buildPartA(type, color, size);

                } else if (parts[0].equals("Composite")) {
                    String type = parts[1]; // Type (Rectangle or Triangle)
                    int size = parts.length > 2 ? Integer.parseInt(parts[2]) : 3; // Size (default is 3)
                    builder.buildPartC(type, size);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.getResult();
    }
}
