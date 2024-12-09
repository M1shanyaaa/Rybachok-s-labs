package lab8ProVersionGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Vector Graphic Editor");

        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Завантаження зображення з файлу
        Builder builder = new Builder();
        CompositeGraphic rootGraphic = builder.buildFromFile("C:\\Users\\Mishanya\\IdeaProjects\\untitled\\src\\lab8\\specification.txt");

        // Малювання зображення
        rootGraphic.draw(gc);

        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
