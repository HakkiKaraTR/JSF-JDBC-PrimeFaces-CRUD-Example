package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    public Connection connect() {
        Connection connection = null;
        try {
            Class.forName ("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?user=root&password=123456");
            System.out.println ("Database connection established");
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}