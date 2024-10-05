package Configurations;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
                create_table_users.close();
            }

            System.out.println("Created users table");
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

            System.out.println("Created table debts");
        } catch (Exception e) {
            System.err.println(e.getMessage());
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
                    + "foreign key (user_id) references users(id))")) {
                create_table_validations.execute();
                create_table_validations.close();
            }
            System.out.println("Created table validations");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
