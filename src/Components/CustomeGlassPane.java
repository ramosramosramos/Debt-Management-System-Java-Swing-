/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JRootPane;

/**
 *
 * @author User
 */
public class CustomeGlassPane {
       public static void putGlassPane(JRootPane rootPane) {
        rootPane.setGlassPane(new JComponent() {

            @Override
            protected void paintComponent(Graphics g) {

                g.setColor(new Color(0, 0, 0, 200));
                g.fillRect(0, 0, getWidth(), getHeight());
            }

        });

    }
       
       public static   void onGlassPane(JRootPane rootPane) {
        rootPane.getGlassPane().setVisible(true);
    }
       public static   void offGlassPane(JRootPane rootPane) {
        rootPane.getGlassPane().setVisible(false);
    }
}
