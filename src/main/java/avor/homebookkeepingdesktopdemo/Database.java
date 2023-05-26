package avor.homebookkeepingdesktopdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String url = "jdbc:sqlite:./db.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url);
    }
}