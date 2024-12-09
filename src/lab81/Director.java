package lab81;

/**
 * Director керує процесом побудови об'єкта.
 * Він визначає порядок виклику методів Builder для створення повного об'єкта Product.
 */
public class Director {
    private Builder builder;

    /**
     * Встановлює Builder для створення об'єкта.
     * @param builder конкретний будівник, який буде використовуватися
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * Керує процесом побудови стандартного продукту.
     */
    public void constructSimpleProduct() {
        builder.buildPartA("Circle","default", 3); // Лінія з кольором "default" і розміром 3
//        builder.buildPartB("default", 3); // Коло з кольором "default" і розміром 3
        builder.buildPartC("Rectangle", 3); // Композит "Rectangle" розміром 3
    }

    /**
     * Керує процесом побудови більш складного продукту.
     */
    public void constructComplexProduct() {
        builder.buildPartA("Circle","red", 5); // Лінія з червоним кольором і розміром 5
//        builder.buildPartB("green", 4); // Коло із зеленим кольором і розміром 4
        builder.buildPartC("Triangle", 2); // Композит "Triangle" розміром 2
    }
}


