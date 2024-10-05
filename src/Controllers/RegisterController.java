package Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterController {

    static Connection conn = Configurations.JavaConnection.getConnection();
    static PreparedStatement pst;

    public static Boolean authenticate(String name, String username, String password, String gender, String city,
            String address, String phone, String age) {
        String hashPassword = Tools.Password.hashPassword(password);
        String date = Tools.Date.getDate();
        try {
            pst = conn.prepareStatement("Insert into users (name,username,password,gender,city,address,phone,age,created_at)"
                    + "values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, username);
            pst.setString(3, hashPassword);
            pst.setString(4, gender);
            pst.setString(5, city);
            pst.setString(6, address);
            pst.setString(7, phone);
            pst.setString(8, age);
            pst.setString(9, date);

            int affect = pst.executeUpdate();
            return affect > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
}
