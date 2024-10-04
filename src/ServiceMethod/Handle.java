/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceMethod;

import java.awt.Dimension;
import javax.swing.JPanel;

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
            menuPanel.setPreferredSize(new Dimension(1, 1));
            isOpenMenu = false;
        }

        menuPanel.repaint();
        menuPanel.revalidate();
    }
}
