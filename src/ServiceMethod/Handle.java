/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceMethod;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Handle {

    static boolean isOpenMenu = false;
    static String search = "";
    public static Pages.Debt debt = new Pages.Debt("");

    public static void ToggleMenu(JPanel menuPanel) {

        if (isOpenMenu == false) {
            menuPanel.setPreferredSize(new Dimension(200, Integer.MAX_VALUE));
            isOpenMenu = true;
        } else {
            menuPanel.setPreferredSize(new Dimension(1 - 1, 1));
            isOpenMenu = false;
        }

        menuPanel.repaint();
        menuPanel.revalidate();
    }

    public static void HoverAndSelectTabbePane(JButton[] buttons, JTabbedPane tabbedPane, JFrame frame, JTextField shortcutField) {

        // Map button actions to their respective tabs
        for (int buttonIndex = 0; buttonIndex < buttons.length; buttonIndex++) {
            int finalIndex = buttonIndex; // Capture the loop variable
            buttons[buttonIndex].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    selectTab(finalIndex, buttons, tabbedPane, frame);
                    shortcutField.setText("");
                }
            });
        }

        // Key listener for the shortcut field
        shortcutField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                String search = shortcutField.getText().toLowerCase().trim();
                isOpenMenu = true;
                if (search.contains("da")) {
                    selectTab(0, buttons, tabbedPane, frame);

                } else if (search.contains("un")) {
                    selectTab(1, buttons, tabbedPane, frame);

                } else if (search.contains("p")) {
                    selectTab(2, buttons, tabbedPane, frame);
                } else if (search.contains("m")) {
                    selectTab(3, buttons, tabbedPane, frame);
                } else if (search.contains("tr")) {
                    selectTab(4, buttons, tabbedPane, frame);
                } else if (search.contains("us")) {
                    selectTab(5, buttons, tabbedPane, frame);
                } else if (search.contains("ar")) {
                    selectTab(6, buttons, tabbedPane, frame);
                } else if (search.contains("dev")) {
                    selectTab(7, buttons, tabbedPane, frame);
                } else if (search.contains("ac")) {
                    selectTab(8, buttons, tabbedPane, frame);

                }
            }

        });
    }

// Custom function to reset and highlight button
    private static void selectTab(int tabIndex, JButton[] buttons, JTabbedPane tabbedPane, JFrame frame) {
        for (JButton btn : buttons) {
            btn.setBackground(frame.getBackground());
        }
        buttons[tabIndex].setBackground(new Color(51, 51, 51));
        tabbedPane.setSelectedIndex(tabIndex);
    }

    public static void HoverLink(JLabel link_label) {
        link_label.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                link_label.setForeground(new Color(0, 153, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                link_label.setForeground(new Color(240, 240, 240));
            }

        });

    }

    public static void resetErrorField(JTextField field, JLabel error) {
        field.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                error.setText("");
                Components.CustomeField.RemoveDesignErrorField(field);
            }

        });

    }

    public static void resetErrorComboBox(JComboBox field, JLabel error) {
        field.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                error.setText("");

            }

        });

    }

}
