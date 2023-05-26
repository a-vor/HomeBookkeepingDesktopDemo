package avor.homebookkeepingdesktopdemo.viewsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainFormController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void addObject() {
        System.out.println("Добавить!");
    }
    @FXML
    protected void changeObject() {
        System.out.println("Изменить!");
    }
    @FXML
    protected void deleteObject() {
        System.out.println("Удалить!");
    }
}