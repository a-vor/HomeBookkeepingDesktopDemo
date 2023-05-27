package avor.homebookkeepingdesktopdemo;

import avor.homebookkeepingdesktopdemo.models.User;
import avor.homebookkeepingdesktopdemo.viewsControllers.AuthController;
import avor.homebookkeepingdesktopdemo.viewsControllers.MainFormController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    User user;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader authLoader = new FXMLLoader(Main.class.getResource("auth.fxml"));
        Parent authRoot = authLoader.load();
        AuthController authController = authLoader.getController();
        user = new User();
        authController.setUser(user);
        Scene authScene = new Scene(authRoot);
        primaryStage.setScene(authScene);
        primaryStage.show();
        authController.setOnAuthSuccessListener(() -> {
            try {
                System.out.println("after : " + user.toString());
                FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("main.fxml"));
                Parent mainRoot = mainLoader.load();
                MainFormController mainController = mainLoader.getController();
                mainController.setUser(user);
                Scene mainScene = new Scene(mainRoot);
                primaryStage.setScene(mainScene);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}