package avor.homebookkeepingdesktopdemo.viewsControllers;

import avor.homebookkeepingdesktopdemo.controllers.TransactionScoresController;
import avor.homebookkeepingdesktopdemo.models.TransactionScores;
import avor.homebookkeepingdesktopdemo.models.User;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainFormController {
    User user;
    @FXML
    private Label welcomeText;

    @FXML
    private TableView<TransactionScores> tableView;
    @FXML
    private TableColumn<TransactionScores, Integer> columnN;
    @FXML
    private TableColumn<TransactionScores, String> columnAccount;
    @FXML
    private TableColumn<TransactionScores, Double> columnExpense;
    @FXML
    private TableColumn<TransactionScores, Double> columnIncome;
    @FXML
    private TableColumn<TransactionScores, Double> columnOtherOperations;
    @FXML
    private TableColumn<TransactionScores, Double> columnBalance;
    @FXML
    private TableColumn<TransactionScores, String> columnNote;

    public void initialize() {
        // Создаем коллекцию ObservableList для хранения данных таблицы
        ObservableList<TransactionScores> transactions = FXCollections.observableArrayList();
//        System.out.println("ksdjf: " + user.toString());
        new TransactionScoresController().getAllScoresByUserId(user);
        // Добавляем данные в коллекцию
        transactions.add(new TransactionScores(1, "Счет 1", 100.0, 0.0, 0.0, 100.0, "Примечание 1"));
        transactions.add(new TransactionScores(2, "Счет 2", 0.0, 50.0, 0.0, 50.0, "Примечание 2"));
        columnN.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getN()).asObject());
        columnAccount.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAccount()));
        columnExpense.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getExpense()).asObject());
        columnIncome.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getIncome()).asObject());
        columnOtherOperations.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getOtherOperations()).asObject());
        columnBalance.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getBalance()).asObject());
        columnNote.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNote()));

        // Устанавливаем данные в таблицу
        tableView.setItems(transactions);
    }

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

    public void setUser(User user) {
        this.user = user;
    }
}