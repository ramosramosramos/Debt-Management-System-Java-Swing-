package Components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;



public class CustomTable {

    public static void Design(JTable table) {
        table.getTableHeader().setFont(new Font("Sanserif", Font.BOLD, 14));
        table.getColumnModel().getColumn(0).setMaxWidth(60);

        table.setSelectionBackground(new Color(51, 51, 51));
     
        table.setRowHeight(30);
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                 super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
                 setHorizontalAlignment(SwingConstants.CENTER);
     
                 return this;
            }
        
        });
        
        table.setDefaultEditor(Object.class, null);
       
   
    
    }
    
   

}
