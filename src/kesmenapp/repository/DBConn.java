/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesmenapp.repository;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dimas Haafizh Rahman
 */
public class DBConn {
    private static DBConn dbconnection;
    private static Connection connection;

    private DBConn() {
        try {
            // Load the JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Define the database URL
            String url = "jdbc:sqlite:KesMenAppDB";

            // Establish the connection
            connection = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection failed.");
            e.printStackTrace();
        }
    }
    
    public static DBConn getInstance() {
        if (dbconnection == null) {
            dbconnection = new DBConn();
        }
        return dbconnection;
    }
    
    public Connection getConnection() {
        return connection;
    }
} 
