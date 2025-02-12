package Application.Controllers;

import Application.InventoryManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginSceneController {
    @FXML
    private Button signInButton;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void login(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        InventoryManager m = new InventoryManager();
        if(username.getText().equals("username") && password.getText().equals("password")) {
            wrongLogIn.setText("Success!");
            m.changeScene("/Application/DashboardScene/Dashboard.fxml", "application.css");
        }
        else if (username.getText().isEmpty() || password.getText().isEmpty()){
            wrongLogIn.setText("Please Enter Your Username and or Password.");
        }
        else {
            wrongLogIn.setText("Wrong username or password");
        }
    }
}
