package com.banking.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/banking_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "0000";
    public static  Connection getConnection() throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return conn;
    }
}
