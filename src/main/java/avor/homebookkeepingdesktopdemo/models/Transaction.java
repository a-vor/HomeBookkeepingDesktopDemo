package avor.homebookkeepingdesktopdemo.models;

import javafx.beans.property.*;

public class Transaction {
    private IntegerProperty n;
    private StringProperty account;
    private DoubleProperty expense;
    private DoubleProperty income;
    private DoubleProperty otherOperations;
    private DoubleProperty balance;
    private StringProperty note;

    public Transaction(int n, String account, double expense, double income, double otherOperations, double balance, String note) {
        this.n = new SimpleIntegerProperty(n);
        this.account = new SimpleStringProperty(account);
        this.expense = new SimpleDoubleProperty(expense);
        this.income = new SimpleDoubleProperty(income);
        this.otherOperations = new SimpleDoubleProperty(otherOperations);
        this.balance = new SimpleDoubleProperty(balance);
        this.note = new SimpleStringProperty(note);
    }

    public int getN() {
        return n.get();
    }

    public IntegerProperty nProperty() {
        return n;
    }

    public String getAccount() {
        return account.get();
    }

    public StringProperty accountProperty() {
        return account;
    }

    public double getExpense() {
        return expense.get();
    }

    public DoubleProperty expenseProperty() {
        return expense;
    }

    public double getIncome() {
        return income.get();
    }

    public DoubleProperty incomeProperty() {
        return income;
    }

    public double getOtherOperations() {
        return otherOperations.get();
    }

    public DoubleProperty otherOperationsProperty() {
        return otherOperations;
    }

    public double getBalance() {
        return balance.get();
    }

    public DoubleProperty balanceProperty() {
        return balance;
    }

    public String getNote() {
        return note.get();
    }

    public StringProperty noteProperty() {
        return note;
    }
}
