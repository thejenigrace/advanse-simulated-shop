package login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import login.controller.LoginController;

/**
 * Created by Jennica on 18/02/2016.
 */
public class DriverMain extends Application {

    public static Stage primaryStage;
    private Parent root;
    private FXMLLoader loader;
    private int d = 4;

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            this.primaryStage = primaryStage;
            this.primaryStage.setTitle("CALVIS SHOP");

            initRootLayout();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showUserOrder() {
        try {
            // Load root layout from fxml file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/user_order_page.fxml"));
            Parent userOrderLayout = (BorderPane) loader.load();

            primaryStage.setScene(new Scene(userOrderLayout));
            primaryStage.setTitle("CALVIS USER ORDER");
            primaryStage.setResizable(false);
            primaryStage.show();

//            WorkspaceController workspaceController = loader.getController();
//            EnvironmentConfigurator environment = environmentConfigurator;
//            workspaceController.buildSystem(environment);
//            workspaceController.displayDefaultWindows();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initialize the root layout
     */
    public void initRootLayout() {
        try {
            loadPrimaryStageController();
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadPrimaryStageController() {
        try {
            // Load root layout from fxml file
            loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/login_page.fxml"));
            root = (BorderPane) loader.load();

            // Give the controller access to the main app
//            configController = loader.getController();
//            configController.setMainApp(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LoginController loginController = new LoginController();
        launch(args);
    }
}
