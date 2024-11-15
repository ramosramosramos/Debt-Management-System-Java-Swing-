/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Message;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

/**
 *
 * @author User
 */
public class Alert {

    static InputStream inputStream = null;

    public static void Admin(String IP_ADDRESS, String SEND_TO, String MESSSAGE, boolean appear) {

        String FINAL_MESSAGE = MESSSAGE.replaceAll("\\s", "+");
        try {

            String link = "http://" + IP_ADDRESS + ":8080/v1/sms/send/?phone=" + SEND_TO
                    + "&message=" + FINAL_MESSAGE;
            URL url = new URL(link);
            inputStream = url.openStream();
            inputStream.close();
            if (appear == true) {

                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_LEFT, "Message to admin has been sent");
            }

        } catch (IOException | HeadlessException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void Borrower(String IP_ADDRESS, String SEND_TO, String MESSSAGE, boolean appear) {

        String FINAL_MESSAGE = MESSSAGE.replaceAll("\\s", "+");
        try {

            String link = "http://" + IP_ADDRESS + ":8080/v1/sms/send/?phone=" + SEND_TO
                    + "&message=" + FINAL_MESSAGE;
            URL url = new URL(link);
            inputStream = url.openStream();
            inputStream.close();
            if (appear == true) {
              Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_LEFT, "Message to admin has been sent");
            }

        } catch (IOException | HeadlessException e) {
            System.err.println(e.getMessage());
        }
    }

}
