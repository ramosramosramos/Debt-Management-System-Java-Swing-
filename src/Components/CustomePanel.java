
package Components;

import java.awt.Color;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class CustomePanel{
    
    public static void HoverCountPanel(JPanel count_panel){
        count_panel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                count_panel.setBackground(new Color(0,153,0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
              count_panel.setBackground(new Color(51,51,51));
            }

        
        
        });
        
      
    }

    
    
}
