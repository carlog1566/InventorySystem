package Application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class InvetoryManager extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.WHITE);
        stage.setMaximized(true);

        Image icon = new Image("InvetoryIcon.png");
        stage.getIcons().add(icon);
        stage.setTitle("InvetoryManager");

        Text text = new Text();
        text.setText("Invetory Manager");
        text.setX(20);
        text.setY(75);
        text.setFont(Font.font("Verdana", 70));
        text.setStyle("-fx-font-weight: bold");

        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}