package Configurations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CreateTable {

    public static void users(Connection conn) {
        try {
            try (PreparedStatement create_table_users = conn.prepareStatement("Create table if not exists users("
                    + "id int primary key auto_increment,"
                    + " name varchar(255) not null,"
                    + "username varchar(255) unique ,"
                    + "password varchar(255)not null,"
                    + " phone varchar(255) unique,"
                    + "address varchar(255) not null,"
                    + " city varchar(255) not null,"
                    + "role varchar(20) default 'customer' ,"
                    + "gender varchar(255),"
                    + "age int,"
                    + "phone_verified_at varchar(255),"
                    + "created_at varchar(255) not null"
                    + " )")) {
                create_table_users.execute();
                insertUser(conn, "Alice Johnson", "alicej", "password123", "555-1235", "456 Oak St", "Sample City",
                        "customer", "female", 28, null, "2024-11-08 12:34:56");

                insertUser(conn, "Bob Smith", "bobsmith", "securepass", "555-1236", "789 Pine St", "Sample City",
                        "customer", "male", 34, null, "2024-11-08 12:35:56");

                insertUser(conn, "Cathy Lee", "cathylee", "mypassword", "555-1237", "321 Maple St", "Sample City",
                        "admin", "female", 29, "2024-11-08 10:20:30", "2024-11-08 12:36:56");

                insertUser(conn, "David Brown", "davidb", "abc123", "555-1238", "654 Elm St", "Sample City",
                        "customer", "male", 42, null, "2024-11-08 12:37:56");

                insertUser(conn, "Eve Wilson", "evewilson", "evesecret", "555-1239", "987 Cedar St", "Sample City",
                        "manager", "female", 35, "2024-11-08 09:00:00", "2024-11-08 12:38:56");

                insertUser(conn, "Frank Harris", "frankh", "frankpass", "555-1240", "135 Birch St", "Sample City",
                        "customer", "male", 27, null, "2024-11-08 12:39:56");

                insertUser(conn, "Grace Kim", "gracekim", "grace1234", "555-1241", "246 Ash St", "Sample City",
                        "staff", "female", 31, null, "2024-11-08 12:40:56");

                insertUser(conn, "Henry Scott", "henryscott", "henrypass", "555-1242", "369 Walnut St", "Sample City",
                        "customer", "male", 40, "2024-11-08 11:15:00", "2024-11-08 12:41:56");

                insertUser(conn, "Isabella White", "isabellaw", "bella2023", "555-1243", "579 Spruce St", "Sample City",
                        "customer", "female", 26, null, "2024-11-08 12:42:56");

                insertUser(conn, "Jack Nguyen", "jackn", "password789", "555-1244", "864 Poplar St", "Sample City",
                        "customer", "male", 33, null, "2024-11-08 12:43:56");

                create_table_users.close();
            }

//            System.out.println("Created users table");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void debts(Connection conn) {
        try {
            try (PreparedStatement create_table_debts = conn.prepareStatement("Create table if not exists debts("
                    + "id int primary key auto_increment,"
                    + "user_id int not null,"
                    + "creditor varchar(255) default 'Debt Company',"
                    + "amount decimal(10,2) not null ,"
                    + "amount_paid decimal(10,2) not null,"
                    + "status varchar(255) default 'Uncomplete', "
                    + "created_at varchar(255) not null,"
                    + "deleted_at varchar(255) default 'null',"
                    + "foreign key (user_id) references users(id) on delete cascade"
                    + ")")) {
                create_table_debts.execute();
                create_table_debts.close();
            }

//            System.out.println("Created table debts");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

public static void insertUser(Connection conn, String name, String username, String password, String phone,
                              String address, String city, String role, String gender, int age,
                              String phoneVerifiedAt, String createdAt) {
    try {
        // Check if the username already exists
        String checkSql = "SELECT COUNT(*) FROM users WHERE username = ?";
        try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                System.out.println("Username " + username + " already exists. Skipping insertion.");
                return;
            }
        }
        
        // Proceed with insertion if username is unique
        String sql = "INSERT INTO users (name, username, password, phone, address, city, role, gender, age, phone_verified_at, created_at) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement insertUserStmt = conn.prepareStatement(sql)) {
            insertUserStmt.setString(1, name);
            insertUserStmt.setString(2, username);
            insertUserStmt.setString(3, password);
            insertUserStmt.setString(4, phone);
            insertUserStmt.setString(5, address);
            insertUserStmt.setString(6, city);
            insertUserStmt.setString(7, role != null ? role : "customer");
            insertUserStmt.setString(8, gender);
            insertUserStmt.setInt(9, age);
            insertUserStmt.setString(10, phoneVerifiedAt);
            insertUserStmt.setString(11, createdAt);

            insertUserStmt.executeUpdate();
            System.out.println("User " + username + " inserted successfully.");
        }
    } catch (Exception e) {
        System.out.println("Error inserting user: " + e.getMessage());
    }
}


    public static void validations(Connection conn) {
        try {

            try (PreparedStatement create_table_validations = conn.prepareStatement("create table if not exists validations("
                    + " id int primary key auto_increment,"
                    + "user_id int not null,"
                    + "type varchar(255) not null,"
                    + "expiry_date varchar(255) not null,"
                    + "created_at varchar(255) not null,"
                    + "foreign key (user_id) references users(id) on delete cascade)")) {
                create_table_validations.execute();
                create_table_validations.close();
            }
//            System.out.println("Created table validations");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void transactions(Connection conn) {
        try {

            try (PreparedStatement create_table_transactions = conn.prepareStatement("create table if not exists transactions("
                    + " id int primary key auto_increment,"
                    + "user_id int not null,"
                    + "debt_id int not null,"
                    + "amount_paid decimal(10,2) not null,"
                    + "balance decimal(10,2),"
                    + "created_at varchar(255) not null,"
                    + "deleted_at varchar(255) default 'null',"
                    + "foreign key (user_id) references users(id) on delete cascade,"
                    + "foreign key (debt_id) references debts(id) on delete cascade )")) {
                create_table_transactions.execute();
                create_table_transactions.close();

            }
//            System.out.println("Created table transactions");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
