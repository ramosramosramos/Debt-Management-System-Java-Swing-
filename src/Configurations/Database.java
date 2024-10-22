package Configurations;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Database {

    public static void createDatabase(Connection conn) {
        try {
            try (PreparedStatement create_database = conn.prepareStatement("Create database if not exists debt_database")) {
                create_database.execute();
                create_database.close();
            }
//            System.out.println("Created debt_database");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void useDatabase(Connection conn){
        try {
            
            try (PreparedStatement use_database = conn.prepareCall("use debt_database")) {
                use_database.execute();
                use_database.close();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
