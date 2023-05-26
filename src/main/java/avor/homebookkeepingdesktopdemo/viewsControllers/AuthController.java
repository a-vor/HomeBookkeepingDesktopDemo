package avor.homebookkeepingdesktopdemo.viewsControllers;

import avor.homebookkeepingdesktopdemo.controllers.UserController;
import avor.homebookkeepingdesktopdemo.middleware.PasswordCheck;
import avor.homebookkeepingdesktopdemo.models.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AuthController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button authButton;

    @FXML
    private Label registerLabel;

    private User user;
    private Runnable onAuthSuccessListener;
    public void initialize() {
        authButton.setOnAction(event -> {
            final String login = usernameField.getText().trim();
            final String password = passwordField.getText().trim();
            user.setLogin(login);
            user.setPassword(PasswordCheck.hashPassword(password));
            System.out.println(user.toString());
            try {
                user = UserController.isValidUser(user);
                if (user.getId() != 0) {
                    System.out.println(user.toString());
                    if (onAuthSuccessListener != null) {
                        onAuthSuccessListener.run();
                    }
                } else {
                    System.out.println(" Неверный логин или пароль");
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        });
    }
    public void setOnAuthSuccessListener(Runnable listener) {
        this.onAuthSuccessListener = listener;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
