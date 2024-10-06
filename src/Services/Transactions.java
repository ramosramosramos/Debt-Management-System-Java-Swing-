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
                    + " join users on debts.user_id=users.id  ");

            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
