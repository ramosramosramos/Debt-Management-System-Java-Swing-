package Pages;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.*;
import java.sql.Connection;
import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public final class Debt extends javax.swing.JFrame {

    Connection conn = null;
    String globalUsername;
    String IP_ADDRESS = null;
    Pages.Account details;
    boolean isChangeArhivesToTransactions = false;

    public Debt(String username) {
        initComponents();
        conn = Configurations.JavaConnection.getConnection();
        DesignComponents();
        this.globalUsername = username;
        dashboard_button.setBackground(new Color(51, 51, 51));
        IP_ADDRESS = Tools.IP.getIPAddress();

        if (username.isEmpty()) {

            username = "kent1";
            globalUsername = "kent1";
        }
        setAccountDetails(username);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unpaid_pop_menu = new javax.swing.JPopupMenu();
        update_unpaid_menuItem = new javax.swing.JMenuItem();
        delete_debts_menuItem = new javax.swing.JMenuItem();
        delete_all_unpaid_debts = new javax.swing.JMenuItem();
        arhives_popMenu = new javax.swing.JPopupMenu();
        restore_archive_menuItem = new javax.swing.JMenuItem();
        forceDestroy_archive_menuItem = new javax.swing.JMenuItem();
        restore_all_archive_debts = new javax.swing.JMenuItem();
        transactions_pop_menu = new javax.swing.JPopupMenu();
        update_transactions_menuItem1 = new javax.swing.JMenuItem();
        delete_transactions_menuItem = new javax.swing.JMenuItem();
        delete_all_transactions_debts = new javax.swing.JMenuItem();
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
        developer_button = new Components.CustomButton(this);
        account_button = new Components.CustomButton(this);
        logout_button = new Components.CustomButton(this);
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dashboard_scrollPane = new javax.swing.JScrollPane();
        inner_dashboard = new javax.swing.JPanel();
        count_users_panel = new javax.swing.JPanel();
        user_count_label = new javax.swing.JLabel();
        count_unverified_panel = new javax.swing.JPanel();
        unverified_count_label = new javax.swing.JLabel();
        count_male_panel = new javax.swing.JPanel();
        male__count_label = new javax.swing.JLabel();
        count_female_panel = new javax.swing.JPanel();
        female_count_label = new javax.swing.JLabel();
        count_unpaid_panel = new javax.swing.JPanel();
        unpaid_count_label = new javax.swing.JLabel();
        count_paid_panel = new javax.swing.JPanel();
        paid_count_label = new javax.swing.JLabel();
        count_transaction_panel = new javax.swing.JPanel();
        transaction_count_label = new javax.swing.JLabel();
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
        title_archives = new javax.swing.JLabel();
        open_debts_archives_button = new javax.swing.JButton();
        open_transactions_archives_button = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_archives_debts = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        query_field = new javax.swing.JTextArea();
        query_label = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        query_guides_button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_query = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        query_output_field = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
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

        update_unpaid_menuItem.setText("Edit");
        update_unpaid_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_unpaid_menuItemActionPerformed(evt);
            }
        });
        unpaid_pop_menu.add(update_unpaid_menuItem);

        delete_debts_menuItem.setText("Move to archives");
        delete_debts_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_debts_menuItemActionPerformed(evt);
            }
        });
        unpaid_pop_menu.add(delete_debts_menuItem);

        delete_all_unpaid_debts.setText("Move all to archives");
        delete_all_unpaid_debts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_all_unpaid_debtsActionPerformed(evt);
            }
        });
        unpaid_pop_menu.add(delete_all_unpaid_debts);

        restore_archive_menuItem.setText("Restore");
        restore_archive_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restore_archive_menuItemActionPerformed(evt);
            }
        });
        arhives_popMenu.add(restore_archive_menuItem);

        forceDestroy_archive_menuItem.setText("Delete Permanently");
        forceDestroy_archive_menuItem.setToolTipText("");
        forceDestroy_archive_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forceDestroy_archive_menuItemActionPerformed(evt);
            }
        });
        arhives_popMenu.add(forceDestroy_archive_menuItem);

        restore_all_archive_debts.setText("Restore all archives");
        restore_all_archive_debts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restore_all_archive_debtsActionPerformed(evt);
            }
        });
        arhives_popMenu.add(restore_all_archive_debts);

        update_transactions_menuItem1.setText("Edit");
        update_transactions_menuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_transactions_menuItem1ActionPerformed(evt);
            }
        });
        transactions_pop_menu.add(update_transactions_menuItem1);

        delete_transactions_menuItem.setText("Move to archives");
        delete_transactions_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_transactions_menuItemActionPerformed(evt);
            }
        });
        transactions_pop_menu.add(delete_transactions_menuItem);

        delete_all_transactions_debts.setText("Move all to archives");
        delete_all_transactions_debts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_all_transactions_debtsActionPerformed(evt);
            }
        });
        transactions_pop_menu.add(delete_all_transactions_debts);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

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

        dashboard_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        dashboard_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard.png"))); // NOI18N
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

        unpaid_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        unpaid_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/money.png"))); // NOI18N
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

        paid_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        paid_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cash.png"))); // NOI18N
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

        add_customer_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        add_customer_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/process.png"))); // NOI18N
        add_customer_button.setText("Manage");
        add_customer_button.setBorderPainted(false);
        add_customer_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_customer_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add_customer_button.setOpaque(false);
        add_customer_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(add_customer_button);

        transactions_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        transactions_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lending.png"))); // NOI18N
        transactions_button.setText("Transactions");
        transactions_button.setBorderPainted(false);
        transactions_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transactions_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transactions_button.setOpaque(false);
        transactions_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(transactions_button);

        users_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        users_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        users_button.setText("Users  (customers)");
        users_button.setBorderPainted(false);
        users_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        users_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        users_button.setOpaque(false);
        users_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(users_button);

        export_import_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        export_import_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/archive.png"))); // NOI18N
        export_import_button.setText("Archives");
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

        developer_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        developer_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/setting.png"))); // NOI18N
        developer_button.setText("Developer mode");
        developer_button.setBorderPainted(false);
        developer_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        developer_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        developer_button.setOpaque(false);
        developer_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(developer_button);

        account_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        account_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile.png"))); // NOI18N
        account_button.setText("Account");
        account_button.setBorderPainted(false);
        account_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        account_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        account_button.setPreferredSize(new java.awt.Dimension(190, 35));
        menuPanel.add(account_button);

        logout_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
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

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Dashboard");
        jPanel3.add(jLabel2);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        inner_dashboard.setPreferredSize(new java.awt.Dimension(700, 1000));
        inner_dashboard.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        count_users_panel.setBackground(new java.awt.Color(51, 51, 51));
        count_users_panel.setPreferredSize(new java.awt.Dimension(250, 100));

        user_count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        user_count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_count_label.setText("No. of users:");

        javax.swing.GroupLayout count_users_panelLayout = new javax.swing.GroupLayout(count_users_panel);
        count_users_panel.setLayout(count_users_panelLayout);
        count_users_panelLayout.setHorizontalGroup(
            count_users_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, count_users_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        count_users_panelLayout.setVerticalGroup(
            count_users_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(count_users_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(user_count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(count_users_panel);

        count_unverified_panel.setBackground(new java.awt.Color(51, 51, 51));
        count_unverified_panel.setPreferredSize(new java.awt.Dimension(250, 100));

        unverified_count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        unverified_count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unverified_count_label.setText("No. of unverified:");

        javax.swing.GroupLayout count_unverified_panelLayout = new javax.swing.GroupLayout(count_unverified_panel);
        count_unverified_panel.setLayout(count_unverified_panelLayout);
        count_unverified_panelLayout.setHorizontalGroup(
            count_unverified_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, count_unverified_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unverified_count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        count_unverified_panelLayout.setVerticalGroup(
            count_unverified_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(count_unverified_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(unverified_count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(count_unverified_panel);

        count_male_panel.setBackground(new java.awt.Color(51, 51, 51));
        count_male_panel.setPreferredSize(new java.awt.Dimension(250, 100));

        male__count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        male__count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        male__count_label.setText("No. of users:");

        javax.swing.GroupLayout count_male_panelLayout = new javax.swing.GroupLayout(count_male_panel);
        count_male_panel.setLayout(count_male_panelLayout);
        count_male_panelLayout.setHorizontalGroup(
            count_male_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, count_male_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(male__count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        count_male_panelLayout.setVerticalGroup(
            count_male_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(count_male_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(male__count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(count_male_panel);

        count_female_panel.setBackground(new java.awt.Color(51, 51, 51));
        count_female_panel.setPreferredSize(new java.awt.Dimension(250, 100));

        female_count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        female_count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        female_count_label.setText("No. of users:");

        javax.swing.GroupLayout count_female_panelLayout = new javax.swing.GroupLayout(count_female_panel);
        count_female_panel.setLayout(count_female_panelLayout);
        count_female_panelLayout.setHorizontalGroup(
            count_female_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, count_female_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(female_count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        count_female_panelLayout.setVerticalGroup(
            count_female_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(count_female_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(female_count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(count_female_panel);

        count_unpaid_panel.setBackground(new java.awt.Color(51, 51, 51));
        count_unpaid_panel.setPreferredSize(new java.awt.Dimension(250, 100));

        unpaid_count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        unpaid_count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unpaid_count_label.setText("No. of users:");

        javax.swing.GroupLayout count_unpaid_panelLayout = new javax.swing.GroupLayout(count_unpaid_panel);
        count_unpaid_panel.setLayout(count_unpaid_panelLayout);
        count_unpaid_panelLayout.setHorizontalGroup(
            count_unpaid_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, count_unpaid_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unpaid_count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        count_unpaid_panelLayout.setVerticalGroup(
            count_unpaid_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(count_unpaid_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(unpaid_count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(count_unpaid_panel);

        count_paid_panel.setBackground(new java.awt.Color(51, 51, 51));
        count_paid_panel.setPreferredSize(new java.awt.Dimension(250, 100));

        paid_count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        paid_count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paid_count_label.setText("No. of users:");

        javax.swing.GroupLayout count_paid_panelLayout = new javax.swing.GroupLayout(count_paid_panel);
        count_paid_panel.setLayout(count_paid_panelLayout);
        count_paid_panelLayout.setHorizontalGroup(
            count_paid_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, count_paid_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paid_count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        count_paid_panelLayout.setVerticalGroup(
            count_paid_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(count_paid_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(paid_count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(count_paid_panel);

        count_transaction_panel.setBackground(new java.awt.Color(51, 51, 51));
        count_transaction_panel.setPreferredSize(new java.awt.Dimension(250, 100));

        transaction_count_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        transaction_count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transaction_count_label.setText("No. of users:");

        javax.swing.GroupLayout count_transaction_panelLayout = new javax.swing.GroupLayout(count_transaction_panel);
        count_transaction_panel.setLayout(count_transaction_panelLayout);
        count_transaction_panelLayout.setHorizontalGroup(
            count_transaction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, count_transaction_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transaction_count_label, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        count_transaction_panelLayout.setVerticalGroup(
            count_transaction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(count_transaction_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(transaction_count_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        inner_dashboard.add(count_transaction_panel);

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

        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

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
        table_unpaid_debts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_unpaid_debtsMousePressed(evt);
            }
        });
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

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

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

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("Add Customer");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, 40));

        jPanel5.add(jPanel13, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Manage", jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

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
        table_transactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_transactionsMousePressed(evt);
            }
        });
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

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

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

        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10));

        title_archives.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title_archives.setText("Debt's archives");
        jPanel16.add(title_archives);

        open_debts_archives_button.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        open_debts_archives_button.setText("Debts is on");
        open_debts_archives_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_debts_archives_buttonActionPerformed(evt);
            }
        });
        jPanel16.add(open_debts_archives_button);

        open_transactions_archives_button.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        open_transactions_archives_button.setText("Transactions is off");
        open_transactions_archives_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_transactions_archives_buttonActionPerformed(evt);
            }
        });
        jPanel16.add(open_transactions_archives_button);

        jPanel8.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel18.setLayout(new java.awt.BorderLayout());

        table_archives_debts.setModel(new javax.swing.table.DefaultTableModel(
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
        table_archives_debts.getTableHeader().setReorderingAllowed(false);
        table_archives_debts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_archives_debtsMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(table_archives_debts);
        if (table_archives_debts.getColumnModel().getColumnCount() > 0) {
            table_archives_debts.getColumnModel().getColumn(0).setResizable(false);
            table_archives_debts.getColumnModel().getColumn(1).setResizable(false);
            table_archives_debts.getColumnModel().getColumn(2).setResizable(false);
            table_archives_debts.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel18.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel18, java.awt.BorderLayout.CENTER);

        tabbedPane.addTab("Archives", jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(3, 0));

        jPanel31.setLayout(new java.awt.BorderLayout());

        query_field.setColumns(20);
        query_field.setRows(5);
        jScrollPane8.setViewportView(query_field);

        jPanel31.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        query_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        query_label.setText("Query field");
        jPanel31.add(query_label, java.awt.BorderLayout.PAGE_START);

        jPanel19.setPreferredSize(new java.awt.Dimension(150, 162));

        query_guides_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        query_guides_button.setText("Guides");

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("Execute");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(query_guides_button))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(query_guides_button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel31.add(jPanel19, java.awt.BorderLayout.LINE_END);

        jPanel9.add(jPanel31);

        jPanel38.setLayout(new java.awt.BorderLayout());

        table_query.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        table_query.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(table_query);

        jPanel38.add(jScrollPane7, java.awt.BorderLayout.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Query results");
        jPanel38.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.add(jPanel38);

        jPanel39.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Output:");
        jPanel39.add(jLabel10, java.awt.BorderLayout.PAGE_START);

        query_output_field.setColumns(20);
        query_output_field.setRows(5);
        jScrollPane1.setViewportView(query_output_field);

        jPanel39.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setText("Note: This can handle sensitive data, please back up the data first or contact administrator  for more informations.");
        jPanel39.add(jLabel7, java.awt.BorderLayout.PAGE_END);

        jPanel9.add(jPanel39);

        tabbedPane.addTab("Developer", jPanel9);

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

        setSize(new java.awt.Dimension(1023, 646));
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
        JOptionPane.showMessageDialog(null, new Panels.AddCutomerPanel(globalUsername, IP_ADDRESS), "Add Customer", JOptionPane.DEFAULT_OPTION);
        offGlass();
        updateDebts();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        if (IP_ADDRESS == null || IP_ADDRESS.isEmpty()) {
            new Modals.DefaultGatewayModal(globalUsername).setVisible(true);
            dispose();

        }

    }//GEN-LAST:event_formWindowGainedFocus

    private void table_unpaid_debtsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_unpaid_debtsMousePressed
        handleTablePropMenu(evt, unpaid_pop_menu, table_unpaid_debts);
    }//GEN-LAST:event_table_unpaid_debtsMousePressed

    private void update_unpaid_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_unpaid_menuItemActionPerformed
        Object[] user = getTableDebtsUnPaid(table_unpaid_debts);
        onGlass();
        JOptionPane.showMessageDialog(null, new Panels.EditCustomerPanel(globalUsername, IP_ADDRESS, user), "Edit Customer", JOptionPane.DEFAULT_OPTION);
        offGlass();
        updateDebts();
    }//GEN-LAST:event_update_unpaid_menuItemActionPerformed

    private void delete_debts_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_debts_menuItemActionPerformed

        onGlass();
        Services.Debts.destroyDebts(getTableID(table_unpaid_debts), globalUsername, this);
        updateDebts();
        offGlass();
    }//GEN-LAST:event_delete_debts_menuItemActionPerformed

    private void table_archives_debtsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_archives_debtsMousePressed
        handleTablePropMenu(evt, arhives_popMenu, table_archives_debts);
    }//GEN-LAST:event_table_archives_debtsMousePressed

    private void restore_archive_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restore_archive_menuItemActionPerformed
        restoreArchivesDebtsOrTransactions();
    }//GEN-LAST:event_restore_archive_menuItemActionPerformed

    private void forceDestroy_archive_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forceDestroy_archive_menuItemActionPerformed
        forceDeleteArchivesDebtsOrTransactions();
    }//GEN-LAST:event_forceDestroy_archive_menuItemActionPerformed

    private void delete_all_unpaid_debtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_all_unpaid_debtsActionPerformed
        onGlass();
        Services.Debts.deleteAllUnpaid(globalUsername, this);
        updateDebts();
        offGlass();
    }//GEN-LAST:event_delete_all_unpaid_debtsActionPerformed

    private void restore_all_archive_debtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restore_all_archive_debtsActionPerformed
        restoreAllArchivesDebtsOrTransactions();
    }//GEN-LAST:event_restore_all_archive_debtsActionPerformed

    private void open_debts_archives_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_debts_archives_buttonActionPerformed
        isChangeArhivesToTransactions = false;
        title_archives.setText("Debt's archives");
        open_debts_archives_button.setText("Debts is on");
        open_transactions_archives_button.setText("Transactions is off");
        updateDebts();
    }//GEN-LAST:event_open_debts_archives_buttonActionPerformed

    private void open_transactions_archives_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_transactions_archives_buttonActionPerformed
        isChangeArhivesToTransactions = true;
        title_archives.setText("Transaction's archives");
        open_transactions_archives_button.setText("Transactions is on");
        open_debts_archives_button.setText("Debts is off");
        updateDebts();
    }//GEN-LAST:event_open_transactions_archives_buttonActionPerformed

    private void update_transactions_menuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_transactions_menuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_transactions_menuItem1ActionPerformed

    private void delete_transactions_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_transactions_menuItemActionPerformed
        onGlass();
        Services.Transactions.destroyTransactions(getTableID(table_transactions), globalUsername, this);
        updateDebts();
        offGlass();
    }//GEN-LAST:event_delete_transactions_menuItemActionPerformed

    private void delete_all_transactions_debtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_all_transactions_debtsActionPerformed
        onGlass();
        Services.Transactions.deleteAllTransactions(globalUsername, this);
        updateDebts();
        offGlass();
    }//GEN-LAST:event_delete_all_transactions_debtsActionPerformed

    private void table_transactionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_transactionsMousePressed
        handleTablePropMenu(evt, transactions_pop_menu, table_transactions);
    }//GEN-LAST:event_table_transactionsMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String sql = query_field.getText();
        Services.DeveloperMode.Execute(table_query, query_output_field, sql);
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JPopupMenu arhives_popMenu;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel city_label;
    private javax.swing.JPanel count_female_panel;
    private javax.swing.JPanel count_male_panel;
    private javax.swing.JPanel count_paid_panel;
    private javax.swing.JPanel count_transaction_panel;
    private javax.swing.JPanel count_unpaid_panel;
    private javax.swing.JPanel count_unverified_panel;
    private javax.swing.JPanel count_users_panel;
    private javax.swing.JLabel created_at_label;
    private javax.swing.JButton dashboard_button;
    private javax.swing.JScrollPane dashboard_scrollPane;
    private javax.swing.JMenuItem delete_all_transactions_debts;
    private javax.swing.JMenuItem delete_all_unpaid_debts;
    private javax.swing.JMenuItem delete_debts_menuItem;
    private javax.swing.JMenuItem delete_transactions_menuItem;
    private javax.swing.JButton developer_button;
    private javax.swing.JButton export_import_button;
    private javax.swing.JLabel female_count_label;
    private javax.swing.JMenuItem forceDestroy_archive_menuItem;
    private javax.swing.JPanel inner_dashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JButton logout_button;
    private javax.swing.JLabel male__count_label;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton menu_button;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton open_debts_archives_button;
    private javax.swing.JButton open_transactions_archives_button;
    private javax.swing.JButton paid_button;
    private javax.swing.JLabel paid_count_label;
    private javax.swing.JLabel phone_label;
    private javax.swing.JTextArea query_field;
    private javax.swing.JButton query_guides_button;
    private javax.swing.JLabel query_label;
    private javax.swing.JTextArea query_output_field;
    private javax.swing.JMenuItem restore_all_archive_debts;
    private javax.swing.JMenuItem restore_archive_menuItem;
    private javax.swing.JLabel status_label;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable table_archives_debts;
    private javax.swing.JTable table_paid_debts;
    private javax.swing.JTable table_query;
    private javax.swing.JTable table_transactions;
    private javax.swing.JTable table_unpaid_debts;
    private javax.swing.JTable table_users;
    private javax.swing.JLabel title_archives;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel transaction_count_label;
    private javax.swing.JButton transactions_button;
    private javax.swing.JPopupMenu transactions_pop_menu;
    private javax.swing.JButton unpaid_button;
    private javax.swing.JLabel unpaid_count_label;
    private javax.swing.JPopupMenu unpaid_pop_menu;
    private javax.swing.JLabel unverified_count_label;
    private javax.swing.JMenuItem update_transactions_menuItem1;
    private javax.swing.JMenuItem update_unpaid_menuItem;
    private javax.swing.JLabel user_count_label;
    private javax.swing.JLabel username_label;
    private javax.swing.JButton users_button;
    // End of variables declaration//GEN-END:variables

    void setAccountDetails(String username) {
        details = new Pages.Account(username);
        name_label.setText("Name: " + details.getName());
        username_label.setText("Username: " + username);
        city_label.setText("City: " + details.getCity());
        phone_label.setText("Phone number: " + details.getPhone());
        age_label.setText("Age: " + details.getAge());
        address_label.setText("Address: " + details.getAddress());
        created_at_label.setText("Created at: " + details.getCreated_at());
        status_label.setText("Status: " + details.getPhone_verified_at());
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
                    developer_button,
                    account_button};
        ServiceMethod.Handle.HoverAndSelectTabbePane(buttons, tabbedPane, this);
        
        Components.CustomePanel.HoverCountPanel(count_male_panel);
        Components.CustomePanel.HoverCountPanel(count_female_panel);
        Components.CustomePanel.HoverCountPanel(count_paid_panel);
        Components.CustomePanel.HoverCountPanel(count_unpaid_panel);
        Components.CustomePanel.HoverCountPanel(count_users_panel);
        Components.CustomePanel.HoverCountPanel(count_transaction_panel);
        Components.CustomePanel.HoverCountPanel(count_unverified_panel);

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

    public void updateDebts() {
        Services.Debts.UnpaidDebts(table_unpaid_debts);
        Services.Debts.PaidDebts(table_paid_debts);
        Services.Users.Users(table_users);
        Services.Transactions.History(table_transactions);
        if (isChangeArhivesToTransactions == false) {
            Services.Debts.ArchiveDebts(table_archives_debts);
        } else {
            Services.Transactions.ArchiveTransactions(table_archives_debts);
        }

        Components.CustomTable.Design(table_paid_debts);
        Components.CustomTable.Design(table_unpaid_debts);
        Components.CustomTable.Design(table_users);
        Components.CustomTable.Design(table_transactions);
        Components.CustomTable.Design(table_archives_debts);

        Services.DashBoard dashboard = new Services.DashBoard();
        user_count_label.setText("No. of users: " + dashboard.getCountUser());
        unverified_count_label.setText("No. of unverified: " + dashboard.getCountUnverified());
        male__count_label.setText("No. of Male: " + dashboard.getCountMale());
        female_count_label.setText("No. of Female: " + dashboard.getCountFemale());
        unpaid_count_label.setText("No. of unpaid: " + dashboard.getUnpaidUser());
        paid_count_label.setText("No of paid: " + dashboard.getPaidUser());
        transaction_count_label.setText("No. of transactions: " + dashboard.getTranctionCount());

    }

    public void restoreArchivesDebtsOrTransactions() {
        onGlass();
        if (isChangeArhivesToTransactions == false) {
            Services.Debts.restoreDebts(getTableID(table_archives_debts), globalUsername, this);
        } else {
            Services.Transactions.restoreTransactions(getTableID(table_archives_debts), globalUsername, this);
        }
        updateDebts();
        offGlass();
    }

    public void forceDeleteArchivesDebtsOrTransactions() {
        onGlass();
        if (isChangeArhivesToTransactions == false) {
            Services.Debts.forceDelete(getTableID(table_archives_debts), globalUsername, this);
        } else {
            Services.Transactions.forceDelete(getTableID(table_archives_debts), globalUsername, this);
        }
        updateDebts();
        offGlass();
    }

    public void restoreAllArchivesDebtsOrTransactions() {
        onGlass();
        if (isChangeArhivesToTransactions == false) {
            Services.Debts.restoreAllArchiveDebts(globalUsername, this);
        } else {
            Services.Transactions.restoreAllTransactions(globalUsername, this);
        }
        updateDebts();
        offGlass();
    }

    public void onGlass() {
        Components.CustomeGlassPane.onGlassPane(rootPane);
    }

    public void offGlass() {
        Components.CustomeGlassPane.offGlassPane(rootPane);
    }

    public void handleTablePropMenu(java.awt.event.MouseEvent evt, JPopupMenu popMenu, JTable table) {

        if (SwingUtilities.isRightMouseButton(evt)) {

            popMenu.show(table, evt.getX(), evt.getY());

        }

    }

    public Object[] getTableDebtsUnPaid(JTable table) {
        String id = table.getValueAt(table.getSelectedRow(), 0).toString();
        String amount = table.getValueAt(table.getSelectedRow(), 3).toString();
        String amount_paid = table.getValueAt(table.getSelectedRow(), 4).toString();
        String date_borrowed = table.getValueAt(table.getSelectedRow(), 5).toString();
        String user_id = table.getValueAt(table.getSelectedRow(), 1).toString();

        Object[] user = {id, amount, amount_paid, date_borrowed, user_id};

        return user;
    }

    public String getTableID(JTable table) {
        return table.getValueAt(table.getSelectedRow(), 0).toString();
    }

}
