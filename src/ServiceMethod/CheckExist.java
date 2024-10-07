package ServiceMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;

public class CheckExist {

    static Connection conn = Configurations.JavaConnection.getConnection();

    public static Boolean UserID(String user_id, JLabel error_user_id) {

        try {
            PreparedStatement pst = conn.prepareStatement("Select id from users where id=?");
            pst.setString(1, user_id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                error_user_id.setText("");
                return true;

            }
            error_user_id.setText("User ID is not exist please register the customer first");
            return false;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;

    }
}
