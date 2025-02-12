package Application.Controllers;

import Application.InventoryManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class DashboardSceneController {
    @FXML
    private Button signOutButton;

    public void signOutAction(ActionEvent event) throws IOException {
        signOut();
    }

    private void signOut() throws IOException {
        InventoryManager m = new InventoryManager();
        m.changeScene("/Application/LoginScene/LoginScene.fxml", "application.css");
    }
}
