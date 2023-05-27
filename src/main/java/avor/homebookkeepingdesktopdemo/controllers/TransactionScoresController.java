package avor.homebookkeepingdesktopdemo.controllers;

import avor.homebookkeepingdesktopdemo.Database;
import avor.homebookkeepingdesktopdemo.models.TransactionScores;
import avor.homebookkeepingdesktopdemo.models.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionScoresController{

//    @Override
    public static ObservableList<TransactionScores> getAllScoresByUserId(User user){
        try {
            Connection connection = Database.getConnection();
            final String sql ="SELECT * FROM Scores WHERE userId =";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet.toString());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return FXCollections.observableArrayList();
    }
}
