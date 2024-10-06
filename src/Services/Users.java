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
public class Users {

    static Connection conn = Configurations.JavaConnection.getConnection();

    public static void Users(JTable table) {
        try {
            PreparedStatement pst = conn.prepareStatement("Select"
                    + " users.id as 'ID',"
                    + "users.name as 'Name', "
                    + "users.role as 'Role',"
                    + "validations.type as 'Valid ID' "
                    + "from users join validations  on users.id=validations.user_id");
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
       
    }
    public static void main(String[] args) {
        new Pages.Debt("kent1").setVisible(true);
    }
    
}
