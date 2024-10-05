package Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            PreparedStatement create_database = conn.prepareStatement("Create database if not exists debt_database");
            create_database.execute();
            System.out.println(create_database.toString());
            System.out.println("Created debt_database");

            PreparedStatement use_database = conn.prepareCall("use debt_database");
            use_database.execute();
   
            
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
