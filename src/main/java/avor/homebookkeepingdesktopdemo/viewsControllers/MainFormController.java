package avor.homebookkeepingdesktopdemo.viewsControllers;

import avor.homebookkeepingdesktopdemo.models.ScoresTableModel;
import avor.homebookkeepingdesktopdemo.models.Transaction;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFormController {
    @FXML
    private Label welcomeText;

    @FXML
    private TableView<Transaction> tableView;
    @FXML
    private TableColumn<Transaction, Integer> columnN;
    @FXML
    private TableColumn<Transaction, String> columnAccount;
    @FXML
    private TableColumn<Transaction, Double> columnExpense;
    @FXML
    private TableColumn<Transaction, Double> columnIncome;
    @FXML
    private TableColumn<Transaction, Double> columnOtherOperations;
    @FXML
    private TableColumn<Transaction, Double> columnBalance;
    @FXML
    private TableColumn<Transaction, String> columnNote;

    public void initialize() {
        // Создаем коллекцию ObservableList для хранения данных таблицы
        ObservableList<Transaction> transactions = FXCollections.observableArrayList();

        // Добавляем данные в коллекцию
        transactions.add(new Transaction(1, "Счет 1", 100.0, 0.0, 0.0, 100.0, "Примечание 1"));
        transactions.add(new Transaction(2, "Счет 2", 0.0, 50.0, 0.0, 50.0, "Примечание 2"));
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

}