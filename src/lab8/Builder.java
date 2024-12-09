package lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Builder {
    public CompositeGraphic buildFromFile(String fileName) {
        CompositeGraphic root = new CompositeGraphic();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                switch (parts[0]) {
                    case "CIRCLE" -> {
                        double x = Double.parseDouble(parts[1]);
                        double y = Double.parseDouble(parts[2]);
                        double radius = Double.parseDouble(parts[3]);
                        String color = parts[4];
                        root.add(new Primitive(new CircleGraphic(x, y, radius, color)));
                    }
                    case "RECTANGLE" -> {
                        double x = Double.parseDouble(parts[1]);
                        double y = Double.parseDouble(parts[2]);
                        double width = Double.parseDouble(parts[3]);
                        double height = Double.parseDouble(parts[4]);
                        String color = parts[5];
                        root.add(new Primitive(new RectangleGraphic(x, y, width, height, color)));
                    }
                    case "LINE" -> {
                        double x1 = Double.parseDouble(parts[1]);
                        double y1 = Double.parseDouble(parts[2]);
                        double x2 = Double.parseDouble(parts[3]);
                        double y2 = Double.parseDouble(parts[4]);
                        String color = parts[5];
                        root.add(new Primitive(new LineGraphic(x1, y1, x2, y2, color)));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return root;
    }
}
