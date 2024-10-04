package Components;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;



public class CustomTable {

    public static void Design(JTable table) {
        table.getTableHeader().setFont(new Font("Sanserif", Font.BOLD, 14));
        table.getColumnModel().getColumn(0).setMaxWidth(60);
        table.getColumnModel().getColumn(3).setMaxWidth(100);
        table.setSelectionBackground(new Color(51, 51, 51));
     
        table.setRowHeight(30);
    }

}
