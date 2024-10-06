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
public class Users {

    static Connection conn = Configurations.JavaConnection.getConnection();

    public static void Users(JTable table) {
        try {
            PreparedStatement pst = conn.prepareStatement("Select"
                    + " id as 'ID',"
                    + "name as 'Name', "
                    + "role as 'Role'"
                    + "from users");
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
