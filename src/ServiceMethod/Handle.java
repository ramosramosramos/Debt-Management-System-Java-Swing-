/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceMethod;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author User
 */
public class Handle {

    static boolean isOpenMenu = false;

    public static void ToggleMenu(JPanel menuPanel) {
        if (isOpenMenu == false) {
            menuPanel.setPreferredSize(new Dimension(200, Integer.MAX_VALUE));
            isOpenMenu = true;
        } else {
            menuPanel.setPreferredSize(new Dimension(1-1, 1));
            isOpenMenu = false;
        }

        menuPanel.repaint();
        menuPanel.revalidate();
    }
    
    public static void HoverAndSelectTabbePane(JButton[] buttons,JTabbedPane tabbedPane,JFrame frame){
          for (JButton button : buttons) {
            button.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    // Reset all button backgrounds
                    for (JButton btn : buttons) {
                        btn.setBackground(frame.getBackground());
                    }

                    // Perform action based on button text
                    String buttonText = button.getText().toLowerCase();
                    if (buttonText.contains("dashboard")) {
                        tabbedPane.setSelectedIndex(0);
                        buttons[0].setBackground(new Color(51, 51, 51));
                    } else if (buttonText.contains("unpaid")) {
                        tabbedPane.setSelectedIndex(1);
                        buttons[1].setBackground(new Color(51, 51, 51));

                    } else if (buttonText.contains("paid")) {
                        tabbedPane.setSelectedIndex(2);
                        buttons[2].setBackground(new Color(51, 51, 51));
                    } else if (buttonText.contains("add")) {
                        tabbedPane.setSelectedIndex(3);
                        buttons[3].setBackground(new Color(51, 51, 51));
                    } else if (buttonText.contains("transactions")) {
                        tabbedPane.setSelectedIndex(4);
                        buttons[4].setBackground(new Color(51, 51, 51));
                    } else if (buttonText.contains("users")) {
                        tabbedPane.setSelectedIndex(5);
                        buttons[5].setBackground(new Color(51, 51, 51));
                    } else if (buttonText.contains("export")) {
                        tabbedPane.setSelectedIndex(6);
                        buttons[6].setBackground(new Color(51, 51, 51));
                    } else if (buttonText.contains("settings")) {
                        tabbedPane.setSelectedIndex(7);
                        buttons[7].setBackground(new Color(51, 51, 51));
                    }
                   else if (buttonText.contains("account")) {
                        tabbedPane.setSelectedIndex(8);
                        buttons[8].setBackground(new Color(51, 51, 51));
                    }
                    button.revalidate();
                }

            });
        }
    }
}
