package ServiceMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckUnique {

    static Connection conn = Configurations.JavaConnection.getConnection();
    static ResultSet rs;
    static PreparedStatement pst;

    public static Boolean username(String username) {

        try {
            
            pst = conn.prepareStatement("Select username from users where username=?");
            pst.setString(1, username);
            rs = pst.executeQuery();
            return rs.next();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;

    }
    public static Boolean phone(String phone) {

        try {
            
            pst = conn.prepareStatement("Select phone from users where phone=?");
            pst.setString(1, phone);
            rs = pst.executeQuery();
            return rs.next();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;

    }

}
