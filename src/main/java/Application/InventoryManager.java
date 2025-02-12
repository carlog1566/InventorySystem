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
    private static Scene scn;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stg = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Application/LoginScene/LoginScene.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scn = scene;
        scene.getStylesheets().add(getClass().getResource("/Application/application.css").toExternalForm());

        primaryStage.setTitle("InventoryManager");
        Image icon = new Image("InventoryIcon.png");
        primaryStage.getIcons().add(icon);


        primaryStage.setResizable(false);
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();

        /*primaryStage.widthProperty().addListener((o, oldValue, newValue)->{
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
        });*/

    }

    public void changeScene(String fxml, String css) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        Parent pane = loader.load();
        scn.getStylesheets().add(getClass().getResource("/Application/" + css).toExternalForm());
        scn.setRoot(pane);
        stg.setScene(scn);
    }

    public static void main(String[] args) {
        launch();
    }
}
