package Pages;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.*;
import java.sql.Connection;
import javax.swing.JButton;

import javax.swing.JOptionPane;

public final class Debt extends javax.swing.JFrame {

    Connection conn = null;

    public Debt(String username) {
        initComponents();
        conn = Configurations.JavaConnection.getConnection();
        DesignComponents();
        dashboard_button.setBackground(new Color(51, 51, 51));
        if (username.isEmpty()) {
            username = "kent1";
        }
        setAccountDetails(username);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        menu_button = new Components.CustomButton(this);
        bottomPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dashboard_button = new Components.CustomButton(this);
        unpaid_button = new Components.CustomButton(this);
        paid_button = new Components.CustomButton(this);
        add_customer_button = new Components.CustomButton(this);
        transactions_button = new Components.CustomButton(this);
        users_button = new Components.CustomButton(this);
        export_import_button = new Components.CustomButton(this);
        settings_button = new Components.CustomButton(this);
        account_button = new Components.CustomButton(this);
        logout_button = new Components.CustomButton(this);
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dashboard_scrollPane = new javax.swing.JScrollPane();
        inner_dashboard = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        user_count_label = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        unverified_count_label = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        male__count_label = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        female_count_label = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_unpaid_debts = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_paid_debts = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_transactions = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_users = new javax.swing.JTable();
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
        jPanel17 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        account_name8 = new javax.swing.JLabel();
        account_panel_holder = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        phone_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        status_label = new javax.swing.JLabel();
        age_label = new javax.swing.JLabel();
        created_at_label = new javax.swing.JLabel();

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

        jPanel20.setPreferredSize(new java.awt.Dimension(190, 100));
        jPanel20.setRequestFocusEnabled(false);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Admin");
        jPanel20.add(jLabel9);

        menuPanel.add(jPanel20);

        dashboard_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        dashboard_button.setText("Dashboard");
        dashboard_button.setBorderPainted(false);
        dashboard_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
        unpaid_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
        paid_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        paid_button.setOpaque(false);
        paid_button.setPreferredSize(new java.awt.Dimension(190, 35));
        paid_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid_buttonActionPerformed(evt);
            }
        });
        menuPanel.add(paid_button);

        add_customer_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        add_customer_button.setText("Manage");
        add_customer_button.setBorderPainted(false);
        add_customer_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_customer_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add_customer_button.setOpaque(false);
        add_customer_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(add_customer_button);

        transactions_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        transactions_button.setText("Transactions");
        transactions_button.setBorderPainted(false);
        transactions_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transactions_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transactions_button.setOpaque(false);
        transactions_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(transactions_button);

        users_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        users_button.setText("Users");
        users_button.setBorderPainted(false);
        users_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        users_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        users_button.setOpaque(false);
        users_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(users_button);

        export_import_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        export_import_button.setText("Export/Import");
        export_import_button.setBorderPainted(false);
        export_import_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        export_import_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
        settings_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settings_button.setOpaque(false);
        settings_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(settings_button);

        account_button.setText("Account");
        account_button.setBorderPainted(false);
        account_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        account_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        account_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(account_button);

        logout_button.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        logout_button.setText("Logout");
        logout_button.setBorderPainted(false);
        logout_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logout_button.setOpaque(false);
        logout_button.setPreferredSize(new java.awt.Dimension(190, 35));
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        menuPanel.add(logout_button);

        bottomPanel.add(menuPanel, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Dashboard");
        jPanel3.add(jLabel2);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        inner_dashboard.setPreferredSize(new java.awt.Dimension(700, 1000));
        inner_dashboard.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        jPanel21.setPreferredSize(new java.awt.Dimension(250, 100));

        user_count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        user_count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_count_label.setText("No. of users:");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(user_count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setPreferredSize(new java.awt.Dimension(250, 100));

        unverified_count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        unverified_count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unverified_count_label.setText("No. of users:");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unverified_count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(unverified_count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.setPreferredSize(new java.awt.Dimension(250, 100));

        male__count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        male__count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        male__count_label.setText("No. of users:");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(male__count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(male__count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(jPanel23);

        jPanel27.setBackground(new java.awt.Color(51, 51, 51));
        jPanel27.setPreferredSize(new java.awt.Dimension(250, 100));

        female_count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        female_count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        female_count_label.setText("No. of users:");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(female_count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(female_count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(jPanel27);

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));
        jPanel25.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel25);

        jPanel30.setBackground(new java.awt.Color(51, 51, 51));
        jPanel30.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel30);

        jPanel29.setBackground(new java.awt.Color(51, 51, 51));
        jPanel29.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel29);

        jPanel32.setBackground(new java.awt.Color(51, 51, 51));
        jPanel32.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel32);

        jPanel34.setBackground(new java.awt.Color(51, 51, 51));
        jPanel34.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel34);

        jPanel35.setBackground(new java.awt.Color(51, 51, 51));
        jPanel35.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel35);

        jPanel36.setBackground(new java.awt.Color(51, 51, 51));
        jPanel36.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel36);

        jPanel28.setBackground(new java.awt.Color(51, 51, 51));
        jPanel28.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel28);

        jPanel26.setBackground(new java.awt.Color(51, 51, 51));
        jPanel26.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel26);

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel24);

        jPanel33.setBackground(new java.awt.Color(51, 51, 51));
        jPanel33.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inner_dashboard.add(jPanel33);

        dashboard_scrollPane.setViewportView(inner_dashboard);

        jPanel1.add(dashboard_scrollPane, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Dashboard", jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Unpaid Customer");
        jPanel10.add(jLabel1);

        jPanel2.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        table_unpaid_debts.setModel(new javax.swing.table.DefaultTableModel(
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
        table_unpaid_debts.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table_unpaid_debts);
        if (table_unpaid_debts.getColumnModel().getColumnCount() > 0) {
            table_unpaid_debts.getColumnModel().getColumn(0).setResizable(false);
            table_unpaid_debts.getColumnModel().getColumn(1).setResizable(false);
            table_unpaid_debts.getColumnModel().getColumn(2).setResizable(false);
            table_unpaid_debts.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Unpaid Customer", jPanel2);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Paid Customer");
        jPanel11.add(jLabel3);

        jPanel4.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        table_paid_debts.setModel(new javax.swing.table.DefaultTableModel(
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
        table_paid_debts.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(table_paid_debts);
        if (table_paid_debts.getColumnModel().getColumnCount() > 0) {
            table_paid_debts.getColumnModel().getColumn(0).setResizable(false);
            table_paid_debts.getColumnModel().getColumn(1).setResizable(false);
            table_paid_debts.getColumnModel().getColumn(2).setResizable(false);
            table_paid_debts.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Paid Customer", jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Manage");
        jPanel12.add(jLabel6);

        jPanel5.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("Add Customer");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, 40));

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("Add Cutomer");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 330, 40));

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setText("Edit Cutomer");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 330, 40));

        jPanel5.add(jPanel13, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Add Customer", jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Transactions");
        jPanel14.add(jLabel4);

        jPanel6.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        table_transactions.setModel(new javax.swing.table.DefaultTableModel(
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
        table_transactions.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(table_transactions);
        if (table_transactions.getColumnModel().getColumnCount() > 0) {
            table_transactions.getColumnModel().getColumn(0).setResizable(false);
            table_transactions.getColumnModel().getColumn(1).setResizable(false);
            table_transactions.getColumnModel().getColumn(2).setResizable(false);
            table_transactions.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel6.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Transactions", jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Users");
        jPanel15.add(jLabel5);

        jPanel7.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        table_users.setModel(new javax.swing.table.DefaultTableModel(
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
        table_users.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(table_users);
        if (table_users.getColumnModel().getColumnCount() > 0) {
            table_users.getColumnModel().getColumn(0).setResizable(false);
            table_users.getColumnModel().getColumn(1).setResizable(false);
            table_users.getColumnModel().getColumn(2).setResizable(false);
            table_users.getColumnModel().getColumn(3).setResizable(false);
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

        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel37.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        account_name8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        account_name8.setText("Account");
        jPanel37.add(account_name8);

        jPanel17.add(jPanel37, java.awt.BorderLayout.PAGE_START);

        account_panel_holder.setPreferredSize(new java.awt.Dimension(700, 40));

        name_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        name_label.setText("Name");
        name_label.setPreferredSize(new java.awt.Dimension(700, 40));
        account_panel_holder.add(name_label);

        username_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        username_label.setText("Username");
        username_label.setPreferredSize(new java.awt.Dimension(700, 40));
        account_panel_holder.add(username_label);

        phone_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        phone_label.setText("Phone number");
        phone_label.setPreferredSize(new java.awt.Dimension(700, 40));
        account_panel_holder.add(phone_label);

        city_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        city_label.setText("City");
        city_label.setPreferredSize(new java.awt.Dimension(700, 40));
        account_panel_holder.add(city_label);

        address_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        address_label.setText("Address");
        address_label.setPreferredSize(new java.awt.Dimension(700, 40));
        account_panel_holder.add(address_label);

        status_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        status_label.setText("Status:");
        status_label.setPreferredSize(new java.awt.Dimension(700, 40));
        account_panel_holder.add(status_label);

        age_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        age_label.setText("Age");
        age_label.setPreferredSize(new java.awt.Dimension(700, 40));
        account_panel_holder.add(age_label);

        created_at_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        created_at_label.setText("Account created at:");
        created_at_label.setPreferredSize(new java.awt.Dimension(700, 40));
        account_panel_holder.add(created_at_label);

        jPanel17.add(account_panel_holder, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Accounts", jPanel17);

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

    }//GEN-LAST:event_export_import_buttonActionPerformed

    private void paid_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid_buttonActionPerformed

    }//GEN-LAST:event_paid_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        logout();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        onGlass();
        JOptionPane.showMessageDialog(null, new Panels.AddCutomerPanel(), "Add Customer", JOptionPane.DEFAULT_OPTION);
        offGlass();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Debt("").setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account_button;
    private javax.swing.JLabel account_name8;
    private javax.swing.JPanel account_panel_holder;
    private javax.swing.JButton add_customer_button;
    private javax.swing.JLabel address_label;
    private javax.swing.JLabel age_label;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel city_label;
    private javax.swing.JLabel created_at_label;
    private javax.swing.JButton dashboard_button;
    private javax.swing.JScrollPane dashboard_scrollPane;
    private javax.swing.JButton export_import_button;
    private javax.swing.JLabel female_count_label;
    private javax.swing.JPanel inner_dashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
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
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton logout_button;
    private javax.swing.JLabel male__count_label;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton menu_button;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton paid_button;
    private javax.swing.JLabel phone_label;
    private javax.swing.JButton settings_button;
    private javax.swing.JLabel status_label;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable table_paid_debts;
    private javax.swing.JTable table_transactions;
    private javax.swing.JTable table_unpaid_debts;
    private javax.swing.JTable table_users;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton transactions_button;
    private javax.swing.JButton unpaid_button;
    private javax.swing.JLabel unverified_count_label;
    private javax.swing.JLabel user_count_label;
    private javax.swing.JLabel username_label;
    private javax.swing.JButton users_button;
    // End of variables declaration//GEN-END:variables

    void setAccountDetails(String username) {
        Pages.Account details = new Pages.Account(username);
        name_label.setText("Name: " + details.getName());
        username_label.setText("Username: " + username);
        city_label.setText("City: " + details.getCity());
        phone_label.setText("Phone number: " + details.getPhone());
        age_label.setText("Age: " + details.getAge());
        address_label.setText("Address: " + details.getAddress());
        created_at_label.setText("Created at: " + details.getCreated_at());
        status_label.setText("Status: "+details.getPhone_verified_at());
    }

    void DesignComponents() {

        menuPanel.setPreferredSize(new Dimension(1, 1));
        Components.CustomTabbedPane.Design(tabbedPane);

        Components.CustomeGlassPane.putGlassPane(rootPane);
        
        updateDebts();

        JButton buttons[]
                = {
                    dashboard_button,
                    unpaid_button,
                    paid_button,
                    add_customer_button,
                    transactions_button,
                    users_button,
                    export_import_button,
                    settings_button,
                    account_button};
        ServiceMethod.Handle.HoverAndSelectTabbePane(buttons, tabbedPane, this);

    }

    void logout() {
        onGlass();
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure?", "Logout", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            new Pages.Authentication.Login().setVisible(true);
            dispose();
        }
        offGlass();
    }

    void updateDebts() {
        Services.Debts.UnpaidDebts(table_unpaid_debts);
        Services.Debts.PaidDebts(table_paid_debts);
        Services.Users.Users(table_users);
        Services.Transactions.History(table_transactions);
        Components.CustomTable.Design(table_paid_debts);
        Components.CustomTable.Design(table_unpaid_debts);
        Components.CustomTable.Design(table_users);
        Components.CustomTable.Design(table_transactions);
       
        Services.DashBoard dashboard = new Services.DashBoard();
        user_count_label.setText("No. of users: "+dashboard.getCountUser());
        unverified_count_label.setText("No. of unverified: "+dashboard.getCountUnverified());
        male__count_label.setText("No. of Male: "+dashboard.getCountMale());
        female_count_label.setText("No. of Female: "+dashboard.getCountFemale());
        
    }

    void onGlass() {
        Components.CustomeGlassPane.onGlassPane(rootPane);
    }

    void offGlass() {
        Components.CustomeGlassPane.offGlassPane(rootPane);
    }

}
