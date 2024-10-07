
package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Debts {
        static Connection conn = Configurations.JavaConnection.getConnection();
   
    public static void UnpaidDebts(JTable table){

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
                    + "  where debts.status =?");
            pst.setString(1, "Uncomplete");
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void PaidDebts(JTable table){
        
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
                    + "  where debts.amount_paid>=amount");
     
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
