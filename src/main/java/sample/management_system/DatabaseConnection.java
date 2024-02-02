package sample.management_system;

import java.sql.*;
import java.util.*;

public class DatabaseConnection
{
    private final String userName;
    private final String password;
    private final String serverName;
    private final int portNumber;
    private Connection connection;

    public DatabaseConnection()
    {
        userName = "root"; // You can change this
        password = ""; // You can change this
        serverName = "localhost";
        portNumber = 3306;
        connection = null; // Do no change this
    }

    public Connection getConnection(String databaseName)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties userCredentials = new Properties();
            userCredentials.put("user", userName);
            userCredentials.put("password", password);
            connection =
                    DriverManager.getConnection("jdbc:mysql://" + serverName + ":" + portNumber + "/" + databaseName, userCredentials);
            System.out.println("Connected to " + databaseName + " successfully");
        }
        catch (SQLException | ClassNotFoundException exception)
        {
            exception.printStackTrace();
        }
        return connection;
    }
}
