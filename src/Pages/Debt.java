package Pages;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.*;
import java.sql.Connection;
import javax.swing.JButton;

public final class Debt extends javax.swing.JFrame {

    Connection conn = null;

    public Debt() {
        initComponents();
        DesignComponents();
        conn = Configuration.JavaConnection.getConnection();
        dashboard_button.setBackground(new Color(51, 51, 51));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        menu_button = new Components.CustomButton(this);
        bottomPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        dashboard_button = new Components.CustomButton(this);
        unpaid_button = new Components.CustomButton(this);
        paid_button = new Components.CustomButton(this);
        add_customer_button = new Components.CustomButton(this);
        transactions_button = new Components.CustomButton(this);
        users_button = new Components.CustomButton(this);
        export_import_button = new Components.CustomButton(this);
        settings_button = new Components.CustomButton(this);
        logout_button = new Components.CustomButton(this);
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_dashboard = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_dashboard1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_dashboard2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_dashboard3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_dashboard4 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new java.awt.BorderLayout());

        topPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

        menu_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        menu_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        menu_button.setBorderPainted(false);
        menu_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buttonActionPerformed(evt);
            }
        });
        topPanel.add(menu_button);

        background.add(topPanel, java.awt.BorderLayout.PAGE_START);

        bottomPanel.setLayout(new java.awt.BorderLayout());

        menuPanel.setPreferredSize(new java.awt.Dimension(200, 567));

        dashboard_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        dashboard_button.setText("Dashboard");
        dashboard_button.setBorderPainted(false);
        dashboard_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard_button.setOpaque(false);
        dashboard_button.setPreferredSize(new java.awt.Dimension(190, 35));
        dashboard_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard_buttonActionPerformed(evt);
            }
        });
        menuPanel.add(dashboard_button);

        unpaid_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        unpaid_button.setText("Unpaid customer");
        unpaid_button.setBorderPainted(false);
        unpaid_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unpaid_button.setOpaque(false);
        unpaid_button.setPreferredSize(new java.awt.Dimension(190, 35));
        unpaid_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unpaid_buttonActionPerformed(evt);
            }
        });
        menuPanel.add(unpaid_button);

        paid_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        paid_button.setText("Paid cutomer");
        paid_button.setBorderPainted(false);
        paid_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paid_button.setOpaque(false);
        paid_button.setPreferredSize(new java.awt.Dimension(190, 35));
        paid_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid_buttonActionPerformed(evt);
            }
        });
        menuPanel.add(paid_button);

        add_customer_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        add_customer_button.setText("Add customer");
        add_customer_button.setBorderPainted(false);
        add_customer_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_customer_button.setOpaque(false);
        add_customer_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(add_customer_button);

        transactions_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        transactions_button.setText("Transactions");
        transactions_button.setBorderPainted(false);
        transactions_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transactions_button.setOpaque(false);
        transactions_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(transactions_button);

        users_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        users_button.setText("Users");
        users_button.setBorderPainted(false);
        users_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        users_button.setOpaque(false);
        users_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(users_button);

        export_import_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        export_import_button.setText("Export/Import");
        export_import_button.setBorderPainted(false);
        export_import_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        export_import_button.setOpaque(false);
        export_import_button.setPreferredSize(new java.awt.Dimension(190, 35));
        export_import_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_import_buttonActionPerformed(evt);
            }
        });
        menuPanel.add(export_import_button);

        settings_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        settings_button.setText("Settings");
        settings_button.setBorderPainted(false);
        settings_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings_button.setOpaque(false);
        settings_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(settings_button);

        logout_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        logout_button.setText("Logout");
        logout_button.setBorderPainted(false);
        logout_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_button.setOpaque(false);
        logout_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(logout_button);

        bottomPanel.add(menuPanel, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Dashboard");
        jPanel3.add(jLabel2);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        table_dashboard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_dashboard.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_dashboard);
        if (table_dashboard.getColumnModel().getColumnCount() > 0) {
            table_dashboard.getColumnModel().getColumn(0).setResizable(false);
            table_dashboard.getColumnModel().getColumn(1).setResizable(false);
            table_dashboard.getColumnModel().getColumn(2).setResizable(false);
            table_dashboard.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Dashboard", jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Unpaid Customer");
        jPanel10.add(jLabel1);

        jPanel2.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        table_dashboard1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_dashboard1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table_dashboard1);
        if (table_dashboard1.getColumnModel().getColumnCount() > 0) {
            table_dashboard1.getColumnModel().getColumn(0).setResizable(false);
            table_dashboard1.getColumnModel().getColumn(1).setResizable(false);
            table_dashboard1.getColumnModel().getColumn(2).setResizable(false);
            table_dashboard1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Unpaid Customer", jPanel2);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Paid Customer");
        jPanel11.add(jLabel3);

        jPanel4.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        table_dashboard2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_dashboard2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(table_dashboard2);
        if (table_dashboard2.getColumnModel().getColumnCount() > 0) {
            table_dashboard2.getColumnModel().getColumn(0).setResizable(false);
            table_dashboard2.getColumnModel().getColumn(1).setResizable(false);
            table_dashboard2.getColumnModel().getColumn(2).setResizable(false);
            table_dashboard2.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Paid Customer", jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Add Customer");
        jPanel12.add(jLabel6);

        jPanel5.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 290, 40));
        jPanel13.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 290, 40));
        jPanel13.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 40));
        jPanel13.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 40));

        jPanel5.add(jPanel13, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Add Customer", jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Transactions");
        jPanel14.add(jLabel4);

        jPanel6.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        table_dashboard3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_dashboard3.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(table_dashboard3);
        if (table_dashboard3.getColumnModel().getColumnCount() > 0) {
            table_dashboard3.getColumnModel().getColumn(0).setResizable(false);
            table_dashboard3.getColumnModel().getColumn(1).setResizable(false);
            table_dashboard3.getColumnModel().getColumn(2).setResizable(false);
            table_dashboard3.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel6.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Transactions", jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Users");
        jPanel15.add(jLabel5);

        jPanel7.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        table_dashboard4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_dashboard4.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(table_dashboard4);
        if (table_dashboard4.getColumnModel().getColumnCount() > 0) {
            table_dashboard4.getColumnModel().getColumn(0).setResizable(false);
            table_dashboard4.getColumnModel().getColumn(1).setResizable(false);
            table_dashboard4.getColumnModel().getColumn(2).setResizable(false);
            table_dashboard4.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel7.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Users", jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Export / Import");
        jPanel16.add(jLabel7);

        jPanel8.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel18.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 290, 40));
        jPanel18.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 290, 40));
        jPanel18.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 40));
        jPanel18.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 40));

        jPanel8.add(jPanel18, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Export/Import", jPanel8);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Settings");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabbedPane.addTab("Settings", jPanel9);

        bottomPanel.add(tabbedPane, java.awt.BorderLayout.CENTER);

        background.add(bottomPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1016, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buttonActionPerformed
        ServiceMethod.Handle.ToggleMenu(menuPanel);
    }//GEN-LAST:event_menu_buttonActionPerformed

    private void dashboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_buttonActionPerformed


    }//GEN-LAST:event_dashboard_buttonActionPerformed

    private void unpaid_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unpaid_buttonActionPerformed


    }//GEN-LAST:event_unpaid_buttonActionPerformed

    private void export_import_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_import_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_export_import_buttonActionPerformed

    private void paid_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paid_buttonActionPerformed

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Debt().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_customer_button;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton dashboard_button;
    private javax.swing.JButton export_import_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton menu_button;
    private javax.swing.JButton paid_button;
    private javax.swing.JButton settings_button;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable table_dashboard;
    private javax.swing.JTable table_dashboard1;
    private javax.swing.JTable table_dashboard2;
    private javax.swing.JTable table_dashboard3;
    private javax.swing.JTable table_dashboard4;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton transactions_button;
    private javax.swing.JButton unpaid_button;
    private javax.swing.JButton users_button;
    // End of variables declaration//GEN-END:variables

    void DesignComponents() {
        Components.CustomTable.Design(table_dashboard);
        menuPanel.setPreferredSize(new Dimension(1, 1));
        Components.CustomTabbedPane.Design(tabbedPane);

        JButton buttons[]
                = {
                    dashboard_button,
                    unpaid_button,
                    paid_button,
                    add_customer_button,
                    transactions_button,
                    users_button,
                    export_import_button,
                    settings_button,};
        ServiceMethod.Handle.HoverAndSelectTabbePane(buttons, tabbedPane, this);

    }

}