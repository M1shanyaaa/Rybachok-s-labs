package lab8DemoTestLearning;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        try {
            // Зчитуємо інструкції з файлу
            String[] instructions = FileReaderUtil.readFile("instructions.txt");

            // Конструюємо об'єкт згідно з інструкціями
            director.construct(instructions);

            // Отримуємо результат
            Product product = new Product(builder.getProduct());
            product.display();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

