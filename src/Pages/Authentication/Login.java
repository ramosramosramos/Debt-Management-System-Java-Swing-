
package Pages.Authentication;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        username_label = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        password_field = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        login_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("DEBT COMPANY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 30));

        getContentPane().add(jPanel1);

        username_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        username_label.setText("Username");
        username_label.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel2.add(username_label);

        username_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        username_field.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel2.add(username_field);

        password_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        password_label.setText("Password");
        password_label.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel2.add(password_label);

        password_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        password_field.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel2.add(password_field);

        getContentPane().add(jPanel2);

        login_button.setBackground(new java.awt.Color(255, 102, 0));
        login_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        login_button.setText("Login");
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_button.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel3.add(login_button);

        getContentPane().add(jPanel3);

        setSize(new java.awt.Dimension(445, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login_button;
    private javax.swing.JTextField password_field;
    private javax.swing.JLabel password_label;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
