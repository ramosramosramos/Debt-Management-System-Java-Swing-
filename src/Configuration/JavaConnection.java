package Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            Configuration.Database.createDatabase(conn);
            Configuration.Database.useDatabase(conn);

            Configuration.CreateTable.users(conn);
            Configuration.CreateTable.debts(conn);
            Configuration.CreateTable.validations(conn);
            return conn;

        } catch (ClassNotFoundException | SQLException e) {

            System.err.println(e.getMessage());
        }

        return null;

    }
}
