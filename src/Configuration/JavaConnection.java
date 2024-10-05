package Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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

            PreparedStatement create_table_users = conn.prepareStatement("Create table if not exists users("
                    + "id int primary key auto_increment,"
                    + " name varchar(255) not null,"
                    + "username varchar(255) unique ,"
                    + " phone varchar(255) unique,"
                    + "address varchar(255) not null,"
                    + " city varchar(255) not null,"
                    + "role varchar(20) default 'customer' ,"
                    + "phone_verified_at varchar(255),"
                    + "created_at varchar(255) not null"
                    + " )");
            create_table_users.execute();
            System.out.println(create_table_users.toString());
            create_table_users.close();

            System.out.println("Created users table");

            PreparedStatement create_table_debts = conn.prepareStatement("Create table if not exists debts("
                    + "id int primary key auto_increment,"
                    + "user_id int not null,"
                    + "creditor varchar(255) default 'Debt Company',"
                    + "amount decimal(10,2) not null ,"
                    + "amount_paid decimal(10,2) not null,"
                    + "status varchar(255) default 'Uncomplete', "
                    + "created_at varchar(255) not null,"
                    + "deleted_at varchar(255) default 'null',"
                    + "foreign key (user_id) references users(id) on delete cascade"
                    + ")");

            create_table_debts.execute();
            System.out.println(create_table_debts.toString());
            create_table_debts.close();

            System.out.println("Created table debts");

        } catch (ClassNotFoundException | SQLException e) {

            System.err.println(e.getMessage());
        }

        return null;

    }
}
