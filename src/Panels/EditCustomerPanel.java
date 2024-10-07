/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

/**
 *
 * @author User
 */
public class EditCustomerPanel extends javax.swing.JPanel {

    String globalUsername;
    String IP_ADDRESS;
    Object[] user;
    public EditCustomerPanel(String useranme, String IP_ADDRESS,Object[] user) {
        initComponents();
        this.globalUsername = useranme;
        this.IP_ADDRESS = IP_ADDRESS;
        this.user = user;
        
        debt_id_field.setText(user[0].toString());
        amount_field.setText(user[1].toString());
        amount_paid_field.setText(user[2].toString());
        date_borrowed_field.setText(user[3].toString());
        String date = Tools.Date.getDate();
        expiration_label.setText("Expiration date(Valid ID) '" + date + "'");

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proceed_button = new javax.swing.JButton();
        date_borrowed_field = new javax.swing.JTextField();
        debt_id_field = new javax.swing.JTextField();
        amount_field = new javax.swing.JTextField();
        expiration_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        amount_paid_field = new javax.swing.JTextField();
        error_date_borrowed = new javax.swing.JLabel();
        error_user_id = new javax.swing.JLabel();
        error_amount = new javax.swing.JLabel();
        errror_amount_paid = new javax.swing.JLabel();
        success_label = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 450));
        setMinimumSize(new java.awt.Dimension(400, 450));
        setPreferredSize(new java.awt.Dimension(900, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proceed_button.setText("Save");
        proceed_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_buttonActionPerformed(evt);
            }
        });
        add(proceed_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 350, 40));

        date_borrowed_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        date_borrowed_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_borrowed_fieldActionPerformed(evt);
            }
        });
        add(date_borrowed_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 350, 40));

        debt_id_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        debt_id_field.setFocusable(false);
        debt_id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debt_id_fieldActionPerformed(evt);
            }
        });
        add(debt_id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 350, 40));

        amount_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        amount_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_fieldActionPerformed(evt);
            }
        });
        add(amount_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 350, 40));

        expiration_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        expiration_label.setText("Date borrowed");
        add(expiration_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 350, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Debts ID :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Amount will be borrowing :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Amount paid :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, 30));

        amount_paid_field.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        amount_paid_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_paid_fieldActionPerformed(evt);
            }
        });
        add(amount_paid_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 350, 40));

        error_date_borrowed.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_date_borrowed.setForeground(new java.awt.Color(255, 0, 0));
        add(error_date_borrowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 350, 30));

        error_user_id.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_user_id.setForeground(new java.awt.Color(255, 0, 0));
        add(error_user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 440, 30));

        error_amount.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        error_amount.setForeground(new java.awt.Color(255, 0, 0));
        add(error_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 350, 30));

        errror_amount_paid.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        errror_amount_paid.setForeground(new java.awt.Color(255, 0, 0));
        add(errror_amount_paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 230, 30));

        success_label.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        success_label.setForeground(new java.awt.Color(0, 153, 0));
        add(success_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 350, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void amount_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_fieldActionPerformed
        updateCustomerDebts();
    }//GEN-LAST:event_amount_fieldActionPerformed

    private void proceed_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_buttonActionPerformed
        updateCustomerDebts();
    }//GEN-LAST:event_proceed_buttonActionPerformed

    private void debt_id_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debt_id_fieldActionPerformed
        updateCustomerDebts();
    }//GEN-LAST:event_debt_id_fieldActionPerformed

    private void amount_paid_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_paid_fieldActionPerformed
        updateCustomerDebts();
    }//GEN-LAST:event_amount_paid_fieldActionPerformed

    private void date_borrowed_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_borrowed_fieldActionPerformed
        updateCustomerDebts();
    }//GEN-LAST:event_date_borrowed_fieldActionPerformed

    void updateCustomerDebts() {
        String debt_id = debt_id_field.getText().trim();
        String amount = amount_field.getText().trim();
        String amount_paid = amount_paid_field.getText().trim();
        String date_borrowed = date_borrowed_field.getText().trim();

        if (debt_id.isEmpty() && amount.isEmpty() && amount_paid.isEmpty() && date_borrowed.isEmpty()) {
            error_user_id.setText("Debts's ID is required");
            error_amount.setText("Amount is required");
            errror_amount_paid.setText("Type of Valid ID is required");
            error_date_borrowed.setText("Expiration date of ID is required");
            return;

        }

        if (amount.isEmpty()) {
            error_amount.setText("Amount is required");
            return;
        }
        if (amount_paid.isEmpty()) {
            errror_amount_paid.setText("Amount paid is required");
            return;
        }
        if (date_borrowed.isEmpty()) {
            error_date_borrowed.setText(" Date borrowed  is required");
            return;
        }
        Pages.Account account = new Pages.Account(globalUsername);
        Services.Manage.updateCustomerDebts(debt_id, amount, amount_paid, date_borrowed, success_label, IP_ADDRESS, account.getPhone());

        debt_id_field.setText("");
        amount_field.setText("");
        amount_paid_field.setText("");
        date_borrowed_field.setText("");

        error_date_borrowed.setText("");
        error_amount.setText("");
        error_user_id.setText("");
        errror_amount_paid.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount_field;
    private javax.swing.JTextField amount_paid_field;
    private javax.swing.JTextField date_borrowed_field;
    private javax.swing.JTextField debt_id_field;
    private javax.swing.JLabel error_amount;
    private javax.swing.JLabel error_date_borrowed;
    private javax.swing.JLabel error_user_id;
    private javax.swing.JLabel errror_amount_paid;
    private javax.swing.JLabel expiration_label;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton proceed_button;
    private javax.swing.JLabel success_label;
    // End of variables declaration//GEN-END:variables
}
