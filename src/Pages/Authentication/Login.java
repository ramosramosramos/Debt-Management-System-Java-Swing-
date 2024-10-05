package Pages.Authentication;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        ServiceMethod.Handle.resetErrorField(username_field, error_username_label);
        ServiceMethod.Handle.resetErrorField(password_field, error_password_label);
        ServiceMethod.Handle.HoverLink(link_label);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        error_username_label = new javax.swing.JLabel();
        password_label2 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        password_label1 = new javax.swing.JLabel();
        error_password_label = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        login_button = new javax.swing.JButton();
        link_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("DEBT COMPANY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 30));

        getContentPane().add(jPanel1);

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error_username_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_username_label.setForeground(new java.awt.Color(255, 0, 0));
        error_username_label.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel4.add(error_username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 330, 30));

        password_label2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        password_label2.setText("Username");
        password_label2.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel4.add(password_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel2.add(jPanel4);

        username_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        username_field.setPreferredSize(new java.awt.Dimension(400, 35));
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });
        jPanel2.add(username_field);

        jPanel5.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password_label1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        password_label1.setText("Password");
        password_label1.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel5.add(password_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        error_password_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_password_label.setForeground(new java.awt.Color(255, 0, 0));
        error_password_label.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel5.add(error_password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 330, 30));

        jPanel2.add(jPanel5);

        password_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        password_field.setPreferredSize(new java.awt.Dimension(400, 35));
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        jPanel2.add(password_field);

        getContentPane().add(jPanel2);

        login_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        login_button.setText("Login");
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_button.setPreferredSize(new java.awt.Dimension(400, 40));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel3.add(login_button);

        link_label.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        link_label.setText("Don't have an account? Register");
        link_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        link_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                link_labelMousePressed(evt);
            }
        });
        jPanel3.add(link_label);

        getContentPane().add(jPanel3);

        setSize(new java.awt.Dimension(445, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        login();
    }//GEN-LAST:event_login_buttonActionPerformed

    private void link_labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_link_labelMousePressed
        new Pages.Authentication.Register().setVisible(true);
        dispose();
    }//GEN-LAST:event_link_labelMousePressed

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        login();
    }//GEN-LAST:event_username_fieldActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        login();
    }//GEN-LAST:event_password_fieldActionPerformed

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error_password_label;
    private javax.swing.JLabel error_username_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel link_label;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel password_label1;
    private javax.swing.JLabel password_label2;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables

    void login() {
        String username = username_field.getText().trim();
        String password = new String(password_field.getPassword()).trim();

        if (username.isEmpty() && password.isEmpty()) {
            error_username_label.setText("Username is required");
            error_password_label.setText("Password is required");
            return;
        }
        if (username.isEmpty()) {
            error_username_label.setText("Username is required");
            return;

        }
        if (password.isEmpty()) {
            error_password_label.setText("Password is required");
            return;

        }
        if (Controllers.LoginController.authenticate(username, password, error_username_label)) {
            new Pages.Debt(username).setVisible(true);
            dispose();
        }

    }

}
