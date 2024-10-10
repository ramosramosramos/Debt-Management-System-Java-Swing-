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

    public static void destroyDebts(String id) {
        try {
            PreparedStatement pst = conn.prepareStatement("Update debts set deleted_at=? where id=?");
            pst.setString(1, Tools.Date.getDate());
            pst.setString(2, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully move to trash");
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void restoreDebts(String id) {
        try {
            PreparedStatement pst = conn.prepareStatement("Update debts set deleted_at=? where id=?");
            pst.setString(1, "null");
            pst.setString(2, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully restored");
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void forceDelete(String id) {
        try {
            PreparedStatement pst = conn.prepareStatement("Delete from  debts where id=?");

            pst.setString(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Permanently deleted");
        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }
}
