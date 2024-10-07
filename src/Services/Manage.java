package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JLabel;

public class Manage {

    static Connection conn = Configurations.JavaConnection.getConnection();

    public static void addCustomer(String user_id, String amount, String type_id, String expiry_date, JLabel success_label, String IP_ADDRESS, String SEND_TO) {
        double amount_paid = 0.0;
        String date = Tools.Date.getDate();
        String MESSAGE = "Hello Admin, new customer has been added:"
                + "User ID:" + user_id + ", "
                + "Amount: " + amount + ", "
                + "time: " + date;

        try {
            PreparedStatement insertDebts
                    = conn.prepareStatement("Insert into debts(user_id,amount,amount_paid,created_at)values(?,?,?,?)");

            insertDebts.setString(1, user_id);
            insertDebts.setString(2, amount);
            insertDebts.setDouble(3, amount_paid);
            insertDebts.setString(4, date);
            insertDebts.executeUpdate();

            PreparedStatement insertValidations
                    = conn.prepareStatement("Insert into validations(user_id,type,expiry_date,created_at) values(?,?,?,?)");
            insertValidations.setString(1, user_id);
            insertValidations.setString(2, type_id);
            insertValidations.setString(3, expiry_date);
            insertValidations.setString(4, date);
            insertValidations.executeUpdate();
            success_label.setText("Successfully added.");
            Notifications.Alert.Admin(IP_ADDRESS, SEND_TO, MESSAGE);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateCustomerDebts(String debts_id, String amount, String amount_paid, String date_borrowed, JLabel success_label, String IP_ADDRESS, String SEND_TO) {

        String date = Tools.Date.getDate();
        String MESSAGE = "Hello Admin, new customer debts has been updated:"
                + "Debt ID:" + debts_id + ", "
                + "Amount: " + amount + ", "
                + "Amount paid: " + amount_paid + ", "
                + "Debt borrowed: " + date_borrowed + ", "
                + "time: " + date;

        try {
            PreparedStatement updateDebts
                    = conn.prepareStatement("Update debts set amount =? , amount_paid=? and created_at =?  where id=?");

            updateDebts.setString(1, amount);
            updateDebts.setString(2, amount_paid);
            updateDebts.setString(3, date_borrowed);
            updateDebts.setString(4, debts_id);
            updateDebts.executeUpdate();

            success_label.setText("Successfully updated.");
            Notifications.Alert.Admin(IP_ADDRESS, SEND_TO, MESSAGE);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
