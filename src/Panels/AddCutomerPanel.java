/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import raven.toast.Notifications;

/**
 *
 * @author User
 */
public class AddCutomerPanel extends javax.swing.JPanel {

    String globalUsername;
    String IP_ADDRESS;

    public AddCutomerPanel(String useranme,String IP_ADDRESS) {
        initComponents();
        this.globalUsername = useranme;
        this.IP_ADDRESS = IP_ADDRESS;
        
        String date = Tools.Date.getDate();
        expiration_label.setText("Expiration date(Valid ID) '" + date + "'");
        Notifications.getInstance().setJFrame(null);
        
    
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proceed_button = new javax.swing.JButton();
        expiration_date_field = new javax.swing.JTextField();
        user_id_field = new javax.swing.JTextField();
        amount_field = new javax.swing.JTextField();
        expiration_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        type_id_field = new javax.swing.JTextField();
        error_expiration_date = new javax.swing.JLabel();
        error_user_id = new javax.swing.JLabel();
        error_amount = new javax.swing.JLabel();
        errror_valid_id = new javax.swing.JLabel();
        success_label = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 450));
        setMinimumSize(new java.awt.Dimension(400, 450));
        setPreferredSize(new java.awt.Dimension(900, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proceed_button.setBackground(new java.awt.Color(0, 153, 0));
        proceed_button.setText("Proceed");
        proceed_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_buttonActionPerformed(evt);
            }
        });
        add(proceed_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 350, 40));

        expiration_date_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        expiration_date_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiration_date_fieldActionPerformed(evt);
            }
        });
        add(expiration_date_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 350, 40));

        user_id_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        user_id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_id_fieldActionPerformed(evt);
            }
        });
        user_id_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                user_id_fieldKeyTyped(evt);
            }
        });
        add(user_id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 350, 40));

        amount_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        amount_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_fieldActionPerformed(evt);
            }
        });
        amount_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amount_fieldKeyTyped(evt);
            }
        });
        add(amount_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 350, 40));

        expiration_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        expiration_label.setText("Expiration date(Valid ID)");
        add(expiration_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 350, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("User ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Amount will be borrowing:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Type of valid ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, 30));

        type_id_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        type_id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_id_fieldActionPerformed(evt);
            }
        });
        add(type_id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 350, 40));

        error_expiration_date.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_expiration_date.setForeground(new java.awt.Color(255, 0, 0));
        add(error_expiration_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 350, 30));

        error_user_id.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_user_id.setForeground(new java.awt.Color(255, 0, 0));
        add(error_user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 440, 30));

        error_amount.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_amount.setForeground(new java.awt.Color(255, 0, 0));
        add(error_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 350, 30));

        errror_valid_id.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        errror_valid_id.setForeground(new java.awt.Color(255, 0, 0));
        add(errror_valid_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 230, 30));

        success_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        success_label.setForeground(new java.awt.Color(0, 153, 0));
        add(success_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 350, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void amount_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_fieldActionPerformed
        addCustomer();
    }//GEN-LAST:event_amount_fieldActionPerformed

    private void proceed_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_buttonActionPerformed
        addCustomer();
    }//GEN-LAST:event_proceed_buttonActionPerformed

    private void user_id_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_id_fieldActionPerformed
        addCustomer();
    }//GEN-LAST:event_user_id_fieldActionPerformed

    private void type_id_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_id_fieldActionPerformed
        addCustomer();
    }//GEN-LAST:event_type_id_fieldActionPerformed

    private void expiration_date_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiration_date_fieldActionPerformed
        addCustomer();
    }//GEN-LAST:event_expiration_date_fieldActionPerformed

    private void amount_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amount_fieldKeyTyped
   ServiceMethod.Bann.Characters(evt);      
    }//GEN-LAST:event_amount_fieldKeyTyped

    private void user_id_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_id_fieldKeyTyped
     ServiceMethod.Bann.Characters(evt);
    }//GEN-LAST:event_user_id_fieldKeyTyped

    void addCustomer() {
        String user_id = user_id_field.getText().trim();
        String amount = amount_field.getText().trim();
        String type_id = type_id_field.getText().trim();
        String expiry_date = expiration_date_field.getText().trim();

        if (user_id.isEmpty() && amount.isEmpty() && type_id.isEmpty() && expiry_date.isEmpty()) {
            error_user_id.setText("User's ID is required");
            error_amount.setText("Amount is required");
            errror_valid_id.setText("Type of Valid ID is required");
            error_expiration_date.setText("Expiration date of ID is required");
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Please fill all the required fields");
            return;

        }
        if (user_id.isEmpty()) {
            error_user_id.setText("User's ID is required");
            return;
        }
        if (ServiceMethod.CheckExist.UserID(user_id, error_user_id) == false) {
            return;
        }
        if (amount.isEmpty()) {
            error_amount.setText("Amount is required");
            return;
        }
        if (type_id.isEmpty()) {
            errror_valid_id.setText("Type of Valid ID is required");
            return;
        }
        if (expiry_date.isEmpty()) {
            error_expiration_date.setText("Expiration date of ID is required");
            return;
        }
    Pages.Account account = new Pages.Account(globalUsername);
        Services.Manage.addCustomer(user_id, amount, type_id, expiry_date, success_label,IP_ADDRESS,account.getPhone());

        user_id_field.setText("");
        amount_field.setText("");
        type_id_field.setText("");
        expiration_date_field.setText("");

        error_expiration_date.setText("");
        error_amount.setText("");
        error_user_id.setText("");
        errror_valid_id.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount_field;
    private javax.swing.JLabel error_amount;
    private javax.swing.JLabel error_expiration_date;
    private javax.swing.JLabel error_user_id;
    private javax.swing.JLabel errror_valid_id;
    private javax.swing.JTextField expiration_date_field;
    private javax.swing.JLabel expiration_label;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton proceed_button;
    private javax.swing.JLabel success_label;
    private javax.swing.JTextField type_id_field;
    private javax.swing.JTextField user_id_field;
    // End of variables declaration//GEN-END:variables
}
