package lab8DemoTestLearning;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String[] instructions) {
        for (String instruction : instructions) {
            String[] parts = instruction.split(" ");
            String type = parts[0]; // "Primitive" або "Composite"
            String name = parts[1]; // Назва примітиву або компонента

            if (type.equals("Primitive")) {
                builder.buildPrimitive(name);
            } else if (type.equals("Composite")) {
                builder.buildComposite();
            }
        }
    }
}

