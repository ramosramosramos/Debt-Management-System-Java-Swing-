/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class Date {

    public static String getDate() {
        java.util.Date now = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("MMMM-dd-YYYY");
        String date = format.format(now);
 
        return date;
    }
}
