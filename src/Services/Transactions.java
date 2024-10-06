/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Transactions {
      static Connection conn = Configurations.JavaConnection.getConnection();
   
    public static void History(JTable table){

        try {
            PreparedStatement pst = conn.prepareStatement(""
                    + "Select "
                    + "transactions.id as 'ID',"
                    + "transactions.user_id as 'User ID',"
                    + "transactions.debt_id as 'Debt ID',"
                    + "transactions.amount_paid as 'Amount paid',"
                    + "transactions.balance as 'Balance',"
                    + "created_at as 'Date' from transactions");
        
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
