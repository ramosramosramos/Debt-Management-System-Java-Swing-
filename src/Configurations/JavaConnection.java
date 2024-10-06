package Configurations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            Configurations.Database.createDatabase(conn);
            Configurations.Database.useDatabase(conn);

            
            Configurations.CreateTable.users(conn);
            Configurations.CreateTable.debts(conn);
            Configurations.CreateTable.validations(conn);
            Configurations.CreateTable.transactions(conn);
            return conn;

        } catch (ClassNotFoundException | SQLException e) {

            System.err.println(e.getMessage());
        }

        return null;

    }
}
