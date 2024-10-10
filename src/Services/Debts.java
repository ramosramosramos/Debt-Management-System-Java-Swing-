package Services;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Debts {

    static Connection conn = Configurations.JavaConnection.getConnection();

    public static void UnpaidDebts(JTable table) {

        try {
            PreparedStatement pst = conn.prepareStatement("Select "
                    + " debts.id as 'ID',"
                    + " debts.user_id as 'User ID',"
                    + " users.name as 'Name',"
                    + "debts.amount as 'Borrowed',"
                    + "debts.amount_paid as 'Amount Paid',"
                    + "debts.created_at as 'Date Borrowed',"
                    + "debts.status as 'Status'"
                    + " from debts join users on debts.user_id=users.id"
                    + "  where debts.status =? and debts.deleted_at =?");
            pst.setString(1, "Uncomplete");
            pst.setString(2, "null");
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ArchiveDebts(JTable table) {

        try {
            PreparedStatement pst = conn.prepareStatement("Select "
                    + " debts.id as 'ID',"
                    + " users.name as 'Name',"
                    + "debts.amount as 'Borrowed',"
                    + "debts.amount_paid as 'Amount Paid',"
                    + "debts.created_at as 'Date Borrowed',"
                    + "debts.status as 'Status',"
                    + "debts.deleted_at as 'Date deleted'"
                    + " from debts join users on debts.user_id=users.id"
                    + "  where debts.deleted_at !=?");

            pst.setString(1, "null");
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void PaidDebts(JTable table) {

        try {
            PreparedStatement statusInsert = conn.prepareStatement("Update debts set status =? where amount_paid>=amount");
            statusInsert.setString(1, "Fully paid");
            statusInsert.execute();

            PreparedStatement pst = conn.prepareStatement("Select "
                    + " debts.id as 'ID',"
                    + " users.name as 'Name',"
                    + "debts.amount as 'Amount Borrowed',"
                    + "debts.amount_paid as 'Amount Paid',"
                    + "debts.created_at as 'Date Borrowed',"
                    + "debts.status as 'Status'"
                    + " from debts join users on debts.user_id=users.id"
                    + "  where debts.amount_paid>=amount and debts.deleted_at=?");

            pst.setString(1, "null");
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void destroyDebts(String id, String username, Pages.Debt frame) {
        try {

            String askPassword = JOptionPane.showInputDialog("Enter your password");
            String hashPassword = Tools.Password.hashPassword(askPassword);
            Pages.Account account = new Pages.Account(username);

            if (hashPassword.equals(account.getPassword())) {
                PreparedStatement pst = conn.prepareStatement("Update debts set deleted_at=? where id=?");
                pst.setString(1, Tools.Date.getDate());
                pst.setString(2, id);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully move to archives");

            } else {
                InvalidPassword();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            frame.offGlass();
        }
    }

    public static void restoreDebts(String id, String username, Pages.Debt frame) {
        try {
            String askPassword = JOptionPane.showInputDialog("Enter your password");
            String hashPassword = Tools.Password.hashPassword(askPassword);
            Pages.Account account = new Pages.Account(username);
            if (hashPassword.equals(account.getPassword())) {

                PreparedStatement pst = conn.prepareStatement("Update debts set deleted_at=? where id=?");
                pst.setString(1, "null");
                pst.setString(2, id);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully restored");

            } else {
                InvalidPassword();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            frame.offGlass();
        }

    }

    public static void forceDelete(String id, String username, Pages.Debt frame) {
        try {
            String askPassword = JOptionPane.showInputDialog("Enter your password");
            String hashPassword = Tools.Password.hashPassword(askPassword);
            Pages.Account account = new Pages.Account(username);

            String MESSAGE = "New debt's customer has been force delete. ID: " + id;
            if (hashPassword.equals(account.getPassword())) {

                PreparedStatement pst = conn.prepareStatement("Delete from  debts where id=?");
                pst.setString(1, id);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Permanently deleted");
                Notifications.Alert.Admin(Tools.IP.getIPAddress(), account.getPhone(), MESSAGE, true);

            } else {
                InvalidPassword();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            frame.offGlass();
        }

    }

    public static void deleteAllUnpaid(String username, Pages.Debt frame) {
        try {
            String askPassword = JOptionPane.showInputDialog("Enter your password");
            String hashPassword = Tools.Password.hashPassword(askPassword);
            Pages.Account account = new Pages.Account(username);
            String date = Tools.Date.getDate();
            String MESSAGE = "All debt's customer has move to archives.";
            if (hashPassword.equals(account.getPassword())) {
                PreparedStatement pst = conn.prepareStatement("Update debts set deleted_at=? where status=?");
                pst.setString(1, date);
                pst.setString(2, "Uncomplete");
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully move all to archives");
                Notifications.Alert.Admin(Tools.IP.getIPAddress(), account.getPhone(), MESSAGE, true);
            } else {
                InvalidPassword();
            }

        } catch (NullPointerException | SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
            frame.offGlass();

        }
    }
    
    
      public static void restoreAllArchiveDebts(String username, Pages.Debt frame) {
        try {
            String askPassword = JOptionPane.showInputDialog("Enter your password");
            String hashPassword = Tools.Password.hashPassword(askPassword);
            Pages.Account account = new Pages.Account(username);
               String MESSAGE = "All debt's customer in archives has been restored.";
            if (hashPassword.equals(account.getPassword())) {

                PreparedStatement pst = conn.prepareStatement("Update debts set deleted_at=? where deleted_at !=?");
                pst.setString(1, "null");
                pst.setString(2, "null");
                pst.execute();
                JOptionPane.showMessageDialog(null, "All debt's customer in archives has been restored.");
                   Notifications.Alert.Admin(Tools.IP.getIPAddress(), account.getPhone(), MESSAGE, true);
            } else {
                InvalidPassword();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            frame.offGlass();
        }

    }

    public static void InvalidPassword() {
        JOptionPane.showMessageDialog(null, "Unauthorized: Invalid Password.");
    }
}
