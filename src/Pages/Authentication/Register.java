package Pages.Authentication;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;


/**
 *
 * @author User
 */
public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pane = new javax.swing.JScrollPane();
        form = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        city_label = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        useranme_label = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        address_label = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        password_label = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        phone_number_label = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        confirm_password_label = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        age_label = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel27 = new javax.swing.JPanel();
        gender_label = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel28 = new javax.swing.JPanel();
        address_label1 = new javax.swing.JLabel();
        login_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("DEBT COMPANY");
        jPanel3.add(jLabel1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(989, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 989, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        form.setLayout(new java.awt.GridLayout(5, 100, 40, 5));

        jPanel19.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel19.setLayout(new java.awt.GridLayout(2, 0, 0, 2));

        name_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label.setText("Name");
        name_label.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel19.add(name_label);

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel19.add(jTextField2);

        form.add(jPanel19);

        jPanel20.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel20.setLayout(new java.awt.GridLayout(2, 0));

        city_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        city_label.setText("City");
        city_label.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel20.add(city_label);

        jTextField7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField7.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel20.add(jTextField7);

        form.add(jPanel20);

        jPanel22.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel22.setLayout(new java.awt.GridLayout(2, 0));

        useranme_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        useranme_label.setText("Username");
        useranme_label.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel22.add(useranme_label);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel22.add(jTextField1);

        form.add(jPanel22);

        jPanel24.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel24.setLayout(new java.awt.GridLayout(2, 0));

        address_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        address_label.setText("Address");
        address_label.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel24.add(address_label);

        jTextField6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel24.add(jTextField6);

        form.add(jPanel24);

        jPanel23.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel23.setLayout(new java.awt.GridLayout(2, 0));

        password_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        password_label.setText("Password");
        password_label.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel23.add(password_label);

        jTextField3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel23.add(jTextField3);

        form.add(jPanel23);

        jPanel21.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel21.setLayout(new java.awt.GridLayout(2, 0));

        phone_number_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        phone_number_label.setText("Phone Number");
        phone_number_label.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel21.add(phone_number_label);

        jTextField5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel21.add(jTextField5);

        form.add(jPanel21);

        jPanel25.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel25.setLayout(new java.awt.GridLayout(2, 0));

        confirm_password_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        confirm_password_label.setText("Confirm Password");
        confirm_password_label.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel25.add(confirm_password_label);

        jTextField4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel25.add(jTextField4);

        form.add(jPanel25);

        jPanel26.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel26.setLayout(new java.awt.GridLayout(2, 0));

        age_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        age_label.setText("Age");
        age_label.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel26.add(age_label);

        jSpinner1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jPanel26.add(jSpinner1);

        form.add(jPanel26);

        jPanel27.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel27.setLayout(new java.awt.GridLayout(2, 0));

        gender_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        gender_label.setText("Gender");
        jPanel27.add(gender_label);

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select none", "Male", "Female", " " }));
        jPanel27.add(jComboBox1);

        form.add(jPanel27);

        jPanel28.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel28.setLayout(new java.awt.GridLayout(2, 0));

        address_label1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        address_label1.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel28.add(address_label1);

        login_button.setBackground(new java.awt.Color(255, 102, 0));
        login_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        login_button.setText("Register");
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_button.setPreferredSize(new java.awt.Dimension(400, 40));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel28.add(login_button);

        form.add(jPanel28);

        pane.setViewportView(form);

        getContentPane().add(pane, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1005, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        new Pages.Debt().setVisible(true);
        dispose();
    }//GEN-LAST:event_login_buttonActionPerformed

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JLabel address_label1;
    private javax.swing.JLabel age_label;
    private javax.swing.JLabel city_label;
    private javax.swing.JLabel confirm_password_label;
    private javax.swing.JPanel form;
    private javax.swing.JPanel form_panel;
    private javax.swing.JPanel form_panel1;
    private javax.swing.JPanel form_panel2;
    private javax.swing.JLabel gender_label;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel name_label;
    private javax.swing.JScrollPane pane;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel phone_number_label;
    private javax.swing.JLabel useranme_label;
    // End of variables declaration//GEN-END:variables
}
