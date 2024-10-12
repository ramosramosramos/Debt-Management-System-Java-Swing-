/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import static Services.Debts.conn;
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
public class Transactions {
    
    static Connection conn = Configurations.JavaConnection.getConnection();
    
    public static void History(JTable table) {
        
        try {
            PreparedStatement pst = conn.prepareStatement(""
                    + "Select "
                    + "transactions.id as 'ID',"
                    + "users.name as 'Name',"
                    + "transactions.amount_paid as 'Amount paid',"
                    + "transactions.balance as 'Balance',"
                    + "debts.amount 'Amount borrowed' ,"
                    + "transactions.created_at as 'Date' from transactions join debts on transactions.debt_id = debts.id"
                    + " join users on debts.user_id=users.id where transactions.deleted_at =?  ");
            pst.setString(1, "null");
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void ArchiveTransactions(JTable table) {
        
        try {
            PreparedStatement pst = conn.prepareStatement(""
                    + "Select "
                    + "transactions.id as 'ID',"
                    + "users.name as 'Name',"
                    + "transactions.amount_paid as 'Amount paid',"
                    + "transactions.balance as 'Balance',"
                    + "debts.amount 'Amount borrowed' ,"
                    + "transactions.created_at as 'Date' from transactions join debts on transactions.debt_id = debts.id"
                    + " join users on debts.user_id=users.id  where transactions.deleted_at !=? ");
            pst.setString(1, "null");
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void destroyTransactions(String id, String username, Pages.Debt frame) {
        try {
            
            String askPassword = JOptionPane.showInputDialog("Enter your password");
            String hashPassword = Tools.Password.hashPassword(askPassword);
            Pages.Account account = new Pages.Account(username);
            
            if (hashPassword.equals(account.getPassword())) {
                PreparedStatement pst = conn.prepareStatement("Update transactions set deleted_at=? where id=?");
                pst.setString(1, Tools.Date.getDate());
                pst.setString(2, id);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Trasnsaction is successfully move to archives");
                
            } else {
                InvalidPassword();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            frame.offGlass();
        }
    }
    
    public static void restoreTransactions(String id, String username, Pages.Debt frame) {
        try {
            String askPassword = JOptionPane.showInputDialog("Enter your password");
            String hashPassword = Tools.Password.hashPassword(askPassword);
            Pages.Account account = new Pages.Account(username);
            if (hashPassword.equals(account.getPassword())) {
                
                PreparedStatement pst = conn.prepareStatement("Update transactions set deleted_at=? where id=?");
                pst.setString(1, "null");
                pst.setString(2, id);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Transaction is successfully restored");
                
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
            
            String MESSAGE = "New transactions has been force delete. ID: " + id;
            if (hashPassword.equals(account.getPassword())) {
                
                PreparedStatement pst = conn.prepareStatement("Delete from  transactions where id=?");
                pst.setString(1, id);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Transaction is permanently deleted");
                Notifications.Alert.Admin(Tools.IP.getIPAddress(), account.getPhone(), MESSAGE, true);
                
            } else {
                InvalidPassword();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            frame.offGlass();
        }
        
    }
    
    public static void deleteAllTransactions(String username, Pages.Debt frame) {
        try {
            String askPassword = JOptionPane.showInputDialog("Enter your password");
            String hashPassword = Tools.Password.hashPassword(askPassword);
            Pages.Account account = new Pages.Account(username);
            String date = Tools.Date.getDate();
            String MESSAGE = "All transaction's  has been move to archives.";
            if (hashPassword.equals(account.getPassword())) {
                PreparedStatement pst = conn.prepareStatement("Update transactions set deleted_at=? where deleted_at =?");
                pst.setString(1, date);
                pst.setString(2, "null");
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
    
    public static void restoreAllTransactions(String username, Pages.Debt frame) {
        try {
            String askPassword = JOptionPane.showInputDialog("Enter your password");
            String hashPassword = Tools.Password.hashPassword(askPassword);
            Pages.Account account = new Pages.Account(username);
            String MESSAGE = "All transactions in archives has been restored.";
            if (hashPassword.equals(account.getPassword())) {
                
                PreparedStatement pst = conn.prepareStatement("Update transactions set deleted_at=? where deleted_at !=?");
                pst.setString(1, "null");
                pst.setString(2, "null");
                pst.execute();
                JOptionPane.showMessageDialog(null, "All transactions in archives has been restored.");
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
