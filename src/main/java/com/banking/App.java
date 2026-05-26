package com.banking;

import com.banking.util.DataBaseConnection;

import java.sql.SQLException;


public class App 
{
    public static void main( String[] args )
    {
        try {
            if (DataBaseConnection.getConnection()!=null){
                System.out.println("Connection Successful");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
