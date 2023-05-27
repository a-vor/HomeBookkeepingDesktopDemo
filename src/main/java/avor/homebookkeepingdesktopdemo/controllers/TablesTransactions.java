package avor.homebookkeepingdesktopdemo.controllers;

import avor.homebookkeepingdesktopdemo.models.TransactionScores;
import avor.homebookkeepingdesktopdemo.models.User;
import javafx.beans.Observable;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public abstract class TablesTransactions {
    public abstract ObservableList<TransactionScores> getAllScoresByUserId(User user);
}
