package Application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class InvetoryApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("InvetoryIcon.png");
        stage.getIcons().add(icon);
        stage.setTitle("InvetoryApp");
        stage.setMaximized(true);


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}