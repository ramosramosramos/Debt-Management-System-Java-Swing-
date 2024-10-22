package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.JTextArea;
import net.proteanit.sql.DbUtils;

public class DeveloperMode {

    static Connection conn = Configurations.JavaConnection.getConnection();

    public static void Execute(JTable table_query, JTextArea query_output_field, String sql) {
        try {
            String query = sql.toLowerCase();
            if (sql.toLowerCase().contains("select") || query.contains("show tables")) {
                PreparedStatement pst = conn.prepareStatement(query);
                ResultSet rs = pst.executeQuery();
                table_query.setModel(DbUtils.resultSetToTableModel(rs));
                System.out.println("contains select query");
                query_output_field.setText("Query executed");
            } else {
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                if (query.contains("update transactions") || query.contains("delete from transactions")) {
                    SelectTransactions(table_query, query_output_field);
                }
                if (query.contains("update debts") || query.contains("delete from debts")) {
                    SelectDebts(table_query, query_output_field);
                }
                if (query.contains("update users") || query.contains("delete from users")) {

                    SelectUsers(table_query, query_output_field);
                }
                query_output_field.setText("Query executed :" + pst.toString());

            }

        } catch (Exception e) {
            query_output_field.setText(e.getMessage());
        }
    }

    public static void SelectTransactions(JTable table_query, JTextArea query_output_field) {
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from transactions");
            ResultSet rs = pst.executeQuery();
            table_query.setModel(DbUtils.resultSetToTableModel(rs));

            query_output_field.setText("Query executed :" + pst.toString());
        } catch (Exception e) {
            query_output_field.setText(e.getMessage());
        }
    }

    public static void SelectDebts(JTable table_query, JTextArea query_output_field) {
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from debts");
            ResultSet rs = pst.executeQuery();
            table_query.setModel(DbUtils.resultSetToTableModel(rs));

            query_output_field.setText("Query executed :" + pst.toString());
        } catch (Exception e) {
            query_output_field.setText(e.getMessage());
        }
    }

    public static void SelectUsers(JTable table_query, JTextArea query_output_field) {
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from users");
            ResultSet rs = pst.executeQuery();
            table_query.setModel(DbUtils.resultSetToTableModel(rs));

            query_output_field.setText("Query executed :" + pst.toString());
        } catch (Exception e) {
            query_output_field.setText(e.getMessage());
        }
    }

}
