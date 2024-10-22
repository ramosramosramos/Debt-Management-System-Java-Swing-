
package Components;

import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicTabbedPaneUI;


public class CustomTabbedPane {

    public static void Design(JTabbedPane tabbedPane) {
      
        tabbedPane.setUI(new BasicTabbedPaneUI() {
            @Override
            protected int calculateTabAreaHeight(int tabPlacement, int horizRunCount, int maxTabHeight) {
                return 0; // Set tab area height to 0 to hide tabs
            }

        });
    }
}
