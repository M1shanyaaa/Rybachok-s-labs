package lab81;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * SpecificationReader зчитує файл специфікації для створення графічного об'єкта.
 */
public class SpecificationReader {
    private Director director;
    private ConcreteBuilder builder;

    public SpecificationReader() {
        director = new Director();
        builder = new ConcreteBuilder();
        director.setBuilder(builder);
    }

    /**
     * Зчитує файл специфікації та будує продукт.
     * @param filePath шлях до файлу специфікації
     */
    public Product readSpecification(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mishanya\\IdeaProjects\\untitled\\src\\lab81\\specification.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Processing: " + line);

                // Поділ рядка на частини для отримання параметрів
                String[] parts = line.split(" ");
                if (parts[0].equals("Primitive")) {
                    String type = parts[1]; // Тип (Line або Circle)
                    String color = parts.length > 2 ? parts[2] : "default"; // Колір
                    int size = parts.length > 3 ? Integer.parseInt(parts[3]) : 3; // Розмір (за замовчуванням 3)
                    builder.buildPartA(type, color, size);

                } else if (parts[0].equals("Composite")) {
                    String type = parts[1]; // Тип (Rectangle або Triangle)
                    int size = parts.length > 2 ? Integer.parseInt(parts[2]) : 3; // Розмір (за замовчуванням 3)
                    builder.buildPartC(type, size);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.getResult();
    }
}

