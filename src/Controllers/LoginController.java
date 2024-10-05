package Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;

public class LoginController {

    static Connection conn = Configurations.JavaConnection.getConnection();
    static PreparedStatement pst;
    static ResultSet rs;

    public static Boolean authenticate(String username, String password, JLabel error_username_label) {
        String hashedPassword = Tools.Password.hashPassword(password);
        try {
            pst = conn.prepareStatement("Select username,password from users where username=? and password =?");
            pst.setString(1, username);
            pst.setString(2, hashedPassword);
            rs = pst.executeQuery();
            if (rs.next()) {
                
                return true;
            } else {
                error_username_label.setText("Invalid credentials");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;

    }
    

}
