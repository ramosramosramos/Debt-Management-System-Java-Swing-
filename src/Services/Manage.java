package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        String MESSAGEBORROWER = "Hello user,Thank you for borrowing in our company:"
                + "Amount: " + amount + ", "
                + "time: " + date;
        String BorrowerPhone = "";
        try {
            PreparedStatement pstGetBorrowersNumber = conn.prepareCall("select phone from users where id =?");
            pstGetBorrowersNumber.setString(1, user_id);
            ResultSet borrower = pstGetBorrowersNumber.executeQuery();
            if(borrower.next()){
                BorrowerPhone =borrower.getString("phone");
            }
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

            Message.Alert.Admin(IP_ADDRESS, SEND_TO, MESSAGE, true);
            Message.Alert.Borrower(IP_ADDRESS,BorrowerPhone, MESSAGEBORROWER, false);

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
                    = conn.prepareStatement("Update debts set amount =? , amount_paid=? , created_at =?  where id=?");

            updateDebts.setString(1, amount);
            updateDebts.setString(2, amount_paid);
            updateDebts.setString(3, date_borrowed);
            updateDebts.setString(4, debts_id);
            updateDebts.executeUpdate();

            success_label.setText("Successfully updated.");
            Message.Alert.Admin(IP_ADDRESS, SEND_TO, MESSAGE, true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static double balance = 0.0;

    public static void createTransactions(String debt_id, String user_id, String amount_paid, double balance, String IP_ADDRESS, String SEND_TO) {
        String date = Tools.Date.getDate();
        String MESSAGE = "Hello Admin,new transactions has been created:"
                + "Debt ID:" + debt_id + ", "
                + "User ID: " + user_id + ", "
                + "Amount paid: " + amount_paid + ", "
                + "Balance:" + balance + ", "
                + "Time: " + date;
        Message.Alert.Admin(IP_ADDRESS, SEND_TO, MESSAGE, false);

        try {
            PreparedStatement pst = conn.prepareStatement("Insert into transactions(user_id,debt_id,amount_paid,balance,created_at)"
                    + "values(?,?,?,?,?)");
            pst.setString(1, user_id);
            pst.setString(2, debt_id);
            pst.setString(3, amount_paid);
            pst.setDouble(4, balance);
            pst.setString(5, date);
            pst.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
