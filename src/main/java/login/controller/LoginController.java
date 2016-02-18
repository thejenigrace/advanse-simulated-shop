package login.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import login.DriverMain;

/**
 * Created by Jennica on 18/02/2016.
 */
public class LoginController {

    private login.DriverMain driverMain;

    @FXML
    private Button btnLogin;

    public void setDriver(DriverMain mainApp) {
        this.driverMain = mainApp;
    }

    @FXML
    private void handleLogin(ActionEvent event) {
        driverMain.showUserOrder();
    }
}
