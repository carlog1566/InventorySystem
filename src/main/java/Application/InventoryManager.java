package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryManager extends Application {
    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stg = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Application/LoginScene/LoginScene.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);


        primaryStage.setTitle("InventoryManager");
        Image icon = new Image("InventoryIcon.png");
        primaryStage.getIcons().add(icon);

        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.widthProperty().addListener((o, oldValue, newValue)->{
            if(newValue.intValue() < 1550.0) {
                primaryStage.setResizable(false);
                primaryStage.setWidth(1550);
                primaryStage.setResizable(true);
            }
        });

        primaryStage.heightProperty().addListener((o, oldValue, newValue)->{
            if(newValue.intValue() < 600.0) {
                primaryStage.setResizable(false);
                primaryStage.setHeight(600);
                primaryStage.setResizable(true);
            }
        });

    }

    public void changeScene(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        Parent pane = loader.load();
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}
