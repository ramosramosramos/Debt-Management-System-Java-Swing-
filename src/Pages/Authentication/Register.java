package Pages.Authentication;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import raven.toast.Notifications;

public final class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        designComponents();
        Notifications.getInstance().setJFrame(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        link_label = new javax.swing.JLabel();
        pane = new javax.swing.JScrollPane();
        form = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        error_panel = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        error_name_label = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        error_panel5 = new javax.swing.JPanel();
        name_label5 = new javax.swing.JLabel();
        error_city_label = new javax.swing.JLabel();
        city_field = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        error_panel1 = new javax.swing.JPanel();
        name_label1 = new javax.swing.JLabel();
        error_username_label = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        error_panel6 = new javax.swing.JPanel();
        name_label6 = new javax.swing.JLabel();
        error_address = new javax.swing.JLabel();
        address_field = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        error_panel2 = new javax.swing.JPanel();
        name_label2 = new javax.swing.JLabel();
        error_password_label = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        jPanel21 = new javax.swing.JPanel();
        error_panel7 = new javax.swing.JPanel();
        name_label7 = new javax.swing.JLabel();
        error_phone_label = new javax.swing.JLabel();
        phone_number_field = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        error_panel3 = new javax.swing.JPanel();
        name_label3 = new javax.swing.JLabel();
        error_confirm_pasword_label = new javax.swing.JLabel();
        confirm_password_field = new javax.swing.JPasswordField();
        jPanel26 = new javax.swing.JPanel();
        error_panel8 = new javax.swing.JPanel();
        name_label8 = new javax.swing.JLabel();
        error_age_label = new javax.swing.JLabel();
        age_field = new javax.swing.JSpinner();
        jPanel27 = new javax.swing.JPanel();
        error_panel4 = new javax.swing.JPanel();
        name_label4 = new javax.swing.JLabel();
        error_gender_label = new javax.swing.JLabel();
        gender_field = new javax.swing.JComboBox();
        jPanel28 = new javax.swing.JPanel();
        address_label1 = new javax.swing.JLabel();
        register_button = new javax.swing.JButton();

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

        link_label.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        link_label.setText("Already have an account? Login");
        link_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        link_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                link_labelMousePressed(evt);
            }
        });
        jPanel4.add(link_label);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        form.setLayout(new java.awt.GridLayout(6, 100, 40, 5));

        jPanel19.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel19.setLayout(new java.awt.GridLayout(2, 0, 0, 2));

        error_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label.setText("Name");
        name_label.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        error_name_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_name_label.setForeground(new java.awt.Color(255, 0, 0));
        error_name_label.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel.add(error_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 330, 40));

        jPanel19.add(error_panel);

        name_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        name_field.setPreferredSize(new java.awt.Dimension(400, 35));
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });
        jPanel19.add(name_field);

        form.add(jPanel19);

        jPanel20.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel20.setLayout(new java.awt.GridLayout(2, 0));

        error_panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_label5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label5.setText("City");
        name_label5.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel5.add(name_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        error_city_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_city_label.setForeground(new java.awt.Color(255, 0, 0));
        error_city_label.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel5.add(error_city_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 340, 40));

        jPanel20.add(error_panel5);

        city_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        city_field.setPreferredSize(new java.awt.Dimension(400, 35));
        city_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_fieldActionPerformed(evt);
            }
        });
        jPanel20.add(city_field);

        form.add(jPanel20);

        jPanel22.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel22.setLayout(new java.awt.GridLayout(2, 0));

        error_panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_label1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label1.setText("Username");
        name_label1.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel1.add(name_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        error_username_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_username_label.setForeground(new java.awt.Color(255, 0, 0));
        error_username_label.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel1.add(error_username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 300, 40));

        jPanel22.add(error_panel1);

        username_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        username_field.setPreferredSize(new java.awt.Dimension(400, 35));
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });
        jPanel22.add(username_field);

        form.add(jPanel22);

        jPanel24.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel24.setLayout(new java.awt.GridLayout(2, 0));

        error_panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_label6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label6.setText("Address");
        name_label6.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel6.add(name_label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        error_address.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_address.setForeground(new java.awt.Color(255, 0, 0));
        error_address.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel6.add(error_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 310, 40));

        jPanel24.add(error_panel6);

        address_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        address_field.setPreferredSize(new java.awt.Dimension(400, 35));
        address_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_fieldActionPerformed(evt);
            }
        });
        jPanel24.add(address_field);

        form.add(jPanel24);

        jPanel23.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel23.setLayout(new java.awt.GridLayout(2, 0));

        error_panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_label2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label2.setText("Password");
        name_label2.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel2.add(name_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        error_password_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_password_label.setForeground(new java.awt.Color(255, 0, 0));
        error_password_label.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel2.add(error_password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 300, 40));

        jPanel23.add(error_panel2);

        password_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        jPanel23.add(password_field);

        form.add(jPanel23);

        jPanel21.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel21.setLayout(new java.awt.GridLayout(2, 0));

        error_panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_label7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label7.setText("Phone number");
        name_label7.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel7.add(name_label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        error_phone_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_phone_label.setForeground(new java.awt.Color(255, 0, 0));
        error_phone_label.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel7.add(error_phone_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 280, 40));

        jPanel21.add(error_panel7);

        phone_number_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        phone_number_field.setPreferredSize(new java.awt.Dimension(400, 35));
        phone_number_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_number_fieldActionPerformed(evt);
            }
        });
        phone_number_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone_number_fieldKeyTyped(evt);
            }
        });
        jPanel21.add(phone_number_field);

        form.add(jPanel21);

        jPanel25.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel25.setLayout(new java.awt.GridLayout(2, 0));

        error_panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_label3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label3.setText("Confirm Password");
        name_label3.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel3.add(name_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        error_confirm_pasword_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_confirm_pasword_label.setForeground(new java.awt.Color(255, 0, 0));
        error_confirm_pasword_label.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel3.add(error_confirm_pasword_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 260, 40));

        jPanel25.add(error_panel3);

        confirm_password_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        confirm_password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_password_fieldActionPerformed(evt);
            }
        });
        jPanel25.add(confirm_password_field);

        form.add(jPanel25);

        jPanel26.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel26.setLayout(new java.awt.GridLayout(2, 0));

        error_panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_label8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label8.setText("Age");
        name_label8.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel8.add(name_label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        error_age_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_age_label.setForeground(new java.awt.Color(255, 0, 0));
        error_age_label.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel8.add(error_age_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 320, 40));

        jPanel26.add(error_panel8);

        age_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        age_field.setModel(new javax.swing.SpinnerNumberModel(18, 18, 300, 1));
        jPanel26.add(age_field);

        form.add(jPanel26);

        jPanel27.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel27.setLayout(new java.awt.GridLayout(2, 0));

        error_panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_label4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_label4.setText("Gender");
        name_label4.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel4.add(name_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        error_gender_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_gender_label.setForeground(new java.awt.Color(255, 0, 0));
        error_gender_label.setPreferredSize(new java.awt.Dimension(400, 30));
        error_panel4.add(error_gender_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 320, 40));

        jPanel27.add(error_panel4);

        gender_field.setBackground(new java.awt.Color(51, 51, 51));
        gender_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        gender_field.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select none", "Male", "Female", " " }));
        jPanel27.add(gender_field);

        form.add(jPanel27);

        jPanel28.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel28.setLayout(new java.awt.GridLayout(2, 0));

        address_label1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        address_label1.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel28.add(address_label1);

        register_button.setBackground(new java.awt.Color(255, 102, 0));
        register_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        register_button.setText("Create");
        register_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_button.setPreferredSize(new java.awt.Dimension(400, 40));
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });
        jPanel28.add(register_button);

        form.add(jPanel28);

        pane.setViewportView(form);

        getContentPane().add(pane, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1005, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        register();

    }//GEN-LAST:event_register_buttonActionPerformed

    private void link_labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_link_labelMousePressed
        new Pages.Authentication.Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_link_labelMousePressed

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        register();
    }//GEN-LAST:event_name_fieldActionPerformed

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        register();
    }//GEN-LAST:event_username_fieldActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        register();
    }//GEN-LAST:event_password_fieldActionPerformed

    private void confirm_password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_password_fieldActionPerformed
        register();
    }//GEN-LAST:event_confirm_password_fieldActionPerformed

    private void city_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_fieldActionPerformed
        register();
    }//GEN-LAST:event_city_fieldActionPerformed

    private void address_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_fieldActionPerformed
        register();
    }//GEN-LAST:event_address_fieldActionPerformed

    private void phone_number_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_number_fieldActionPerformed
        register();
    }//GEN-LAST:event_phone_number_fieldActionPerformed

    private void phone_number_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_number_fieldKeyTyped
        ServiceMethod.Bann.Characters(evt);
    }//GEN-LAST:event_phone_number_fieldKeyTyped

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_field;
    private javax.swing.JLabel address_label1;
    private javax.swing.JSpinner age_field;
    private javax.swing.JTextField city_field;
    private javax.swing.JPasswordField confirm_password_field;
    private javax.swing.JLabel error_address;
    private javax.swing.JLabel error_age_label;
    private javax.swing.JLabel error_city_label;
    private javax.swing.JLabel error_confirm_pasword_label;
    private javax.swing.JLabel error_gender_label;
    private javax.swing.JLabel error_name_label;
    private javax.swing.JPanel error_panel;
    private javax.swing.JPanel error_panel1;
    private javax.swing.JPanel error_panel2;
    private javax.swing.JPanel error_panel3;
    private javax.swing.JPanel error_panel4;
    private javax.swing.JPanel error_panel5;
    private javax.swing.JPanel error_panel6;
    private javax.swing.JPanel error_panel7;
    private javax.swing.JPanel error_panel8;
    private javax.swing.JLabel error_password_label;
    private javax.swing.JLabel error_phone_label;
    private javax.swing.JLabel error_username_label;
    private javax.swing.JPanel form;
    private javax.swing.JComboBox gender_field;
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
    private javax.swing.JLabel link_label;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel name_label1;
    private javax.swing.JLabel name_label2;
    private javax.swing.JLabel name_label3;
    private javax.swing.JLabel name_label4;
    private javax.swing.JLabel name_label5;
    private javax.swing.JLabel name_label6;
    private javax.swing.JLabel name_label7;
    private javax.swing.JLabel name_label8;
    private javax.swing.JScrollPane pane;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JTextField phone_number_field;
    private javax.swing.JButton register_button;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables

    void register() {

        String name = name_field.getText().trim();
        String username = username_field.getText().trim();
        String password = new String(password_field.getPassword()).trim();
        String confirm_password = new String(confirm_password_field.getPassword()).trim();
        String gender = gender_field.getSelectedItem().toString().trim();
        String city = city_field.getText().trim();
        String address = address_field.getText().trim();
        String phone = phone_number_field.getText().trim();
        String age = age_field.getValue().toString().trim();

        if (name.isEmpty() && username.isEmpty() && password.isEmpty() && gender.equals("Select none") && city.isEmpty()
                && address.isEmpty() && phone.isEmpty()) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Please fill all required fields");
            Components.CustomeField.DesignErrorField(name_field);
            Components.CustomeField.DesignErrorField(username_field);
            Components.CustomeField.DesignErrorField(password_field);
            Components.CustomeField.DesignErrorField(confirm_password_field);

            Components.CustomeField.DesignErrorField(city_field);
            Components.CustomeField.DesignErrorField(address_field);
            Components.CustomeField.DesignErrorField(phone_number_field);
            return;
        }

        if (name.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Name is required");

            Components.CustomeField.DesignErrorField(name_field);
            return;
        }
        if (username.isEmpty()) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Username is required");
            Components.CustomeField.DesignErrorField(username_field);
            return;
        }
        if (Tools.Validator.isValidUsername(username) == false) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Not a valid username, please add some numbers");
            Components.CustomeField.DesignErrorField(username_field);
            return;
        }
        if (ServiceMethod.CheckUnique.username(username) == true) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "This username is already exists,please try another");
            Components.CustomeField.DesignErrorField(username_field);
            return;
        }

        if (password.isEmpty()) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Password is required");
            Components.CustomeField.DesignErrorField(password_field);
            return;
        }
        if (confirm_password.isEmpty()) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Password confirmation is required");
            Components.CustomeField.DesignErrorField(confirm_password_field);
            return;
        }
        if (!password.equals(confirm_password)) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Password does not match");
            Components.CustomeField.DesignErrorField(password_field);
            return;
        }
        if (gender.contains("Select none")) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Gender is required");
            return;
        }
        if (city.isEmpty()) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "City is required");
            Components.CustomeField.DesignErrorField(city_field);
            return;
        }
        if (address.isEmpty()) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Address is required");
            Components.CustomeField.DesignErrorField(address_field);
            return;
        }
        if (phone.isEmpty()) {

            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Phone number is required");
            Components.CustomeField.DesignErrorField(phone_number_field);
            return;
        }
        if (ServiceMethod.CheckUnique.phone(phone) == true) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Phone number is already exist,please try another");

            Components.CustomeField.DesignErrorField(phone_number_field);
            return;
        }
        if (Integer.valueOf(age) < 18) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Only 18 years above is required");

            return;
        }
        boolean isAllowed = Controllers.RegisterController.authenticate(name, username, password, gender, city, address, phone, age);

        if (isAllowed == true) {
            clearFields();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "         You are now successfully registerd         ");
        }
    }

    void designComponents() {
        ServiceMethod.Handle.HoverLink(link_label);
        ServiceMethod.Handle.resetErrorField(name_field, error_name_label);
        ServiceMethod.Handle.resetErrorField(username_field, error_username_label);
        ServiceMethod.Handle.resetErrorField(password_field, error_password_label);
        ServiceMethod.Handle.resetErrorField(confirm_password_field, error_confirm_pasword_label);
        ServiceMethod.Handle.resetErrorField(city_field, error_city_label);
        ServiceMethod.Handle.resetErrorField(address_field, error_address);
        ServiceMethod.Handle.resetErrorField(phone_number_field, error_phone_label);
        ServiceMethod.Handle.resetErrorComboBox(gender_field, error_gender_label);
    }

    void clearFields() {
        name_field.setText("");
        username_field.setText("");
        password_field.setText("");
        confirm_password_field.setText("");
        gender_field.setSelectedItem("Select none");
        city_field.setText("");
        address_field.setText("");
        phone_number_field.setText("");
        age_field.setValue(18);
    }
}
