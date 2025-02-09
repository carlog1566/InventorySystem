module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens Application to javafx.fxml;
    exports Application;
    exports Application.Controllers;
    opens Application.Controllers to javafx.fxml;
}