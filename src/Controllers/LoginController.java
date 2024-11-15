package Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import raven.toast.Notifications;

public class LoginController {

    static Connection conn = Configurations.JavaConnection.getConnection();

    public static boolean authenticate(String username, String password, JLabel errorUsernameLabel) {
        String hashedPassword = Tools.Password.hashPassword(password);

        String query = "SELECT username, password, role FROM users WHERE username = ? AND password = ?";
        try (PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setString(1, username);
            pst.setString(2, hashedPassword);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String role = rs.getString("role");
                    if ("admin".equals(role)) {
                        new Pages.Debt(username).setVisible(true);
                    } else {
                        new Pages.Customer.Index().setVisible(true);
                    }
                    Pages.Account account = new Pages.Account(username);
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Welcome back! " +account.getName());
                    return true;
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Invalid credentials or account does not exist");
                    errorUsernameLabel.setText("");
                    return false;
                }
            }
        } catch (SQLException e) {
            errorUsernameLabel.setText("Database error. Please try again.");
           
        }

        return false;
    }
}
