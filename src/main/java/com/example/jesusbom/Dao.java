package com.example.jesusbom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:BD_icaro.db";
        return DriverManager.getConnection(url);
    }
}