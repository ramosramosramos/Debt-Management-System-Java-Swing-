
package ServiceMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class Update {
    static Connection conn = Configurations.JavaConnection.getConnection();
   
    public static void UpdateDebts(JTable table){

        try {
            PreparedStatement pst = conn.prepareStatement("Select "
                    + " debts.id as 'ID',"
                    + " users.name as 'Name',"
                    + "debts.amount as 'Amount Borrowed',"
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
    

}
