/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import com.formdev.flatlaf.ui.FlatBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

/**
 *
 * @author User
 */
public class CustomeField {

    public static void DesignErrorField(JTextField field) {
        field.setBorder(new MatteBorder(1, 1, 1, 1, Color.red));
    }

    public static void RemoveDesignErrorField(JTextField field) {
        field.setBorder(new FlatBorder());
    }

}
