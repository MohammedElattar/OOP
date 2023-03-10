
import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OOP Team
 */
public class resturant extends javax.swing.JFrame {

    /**
     * Creates new resturant form
     */
    private Connection c;
    private String user = "root";
    private String password = "";
    private String con = "jdbc:mysql://localhost:3306/resturant";
    private HashMap<String, JTextField> values = new HashMap<String, JTextField>();
    private HashMap<String, JTextField> totals = new HashMap<String, JTextField>();

    public resturant() {
        initComponents();
        showOrders();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title_panel = new javax.swing.JPanel();
        title_label = new javax.swing.JLabel();
        drinks_panel = new javax.swing.JPanel();
        drinks = new javax.swing.JLabel();
        sobia_label = new javax.swing.JLabel();
        asb_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        asb_text = new javax.swing.JTextField();
        sobia_text = new javax.swing.JTextField();
        mango_text = new javax.swing.JTextField();
        mango_label = new javax.swing.JLabel();
        meals_panel = new javax.swing.JPanel();
        meals = new javax.swing.JLabel();
        falafel_label = new javax.swing.JLabel();
        fool_label = new javax.swing.JLabel();
        eggs_label = new javax.swing.JLabel();
        fool_text = new javax.swing.JTextField();
        falafel_text = new javax.swing.JTextField();
        eggs_text = new javax.swing.JTextField();
        additional_total_panel = new javax.swing.JPanel();
        additional_total = new javax.swing.JLabel();
        tebs_text = new javax.swing.JTextField();
        tebs_label = new javax.swing.JLabel();
        total_panel = new javax.swing.JPanel();
        total = new javax.swing.JLabel();
        total_drinks = new javax.swing.JLabel();
        final_total_label = new javax.swing.JLabel();
        final_total_text = new javax.swing.JTextField();
        total_meals_text = new javax.swing.JTextField();
        drinks_text = new javax.swing.JTextField();
        total_meals = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        total_btn = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        scroll_panel = new javax.swing.JScrollPane();
        orders = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("?????????? ????????");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));

        title_label.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title_label.setText("???????????? ?????????? ????????");

        javax.swing.GroupLayout title_panelLayout = new javax.swing.GroupLayout(title_panel);
        title_panel.setLayout(title_panelLayout);
        title_panelLayout.setHorizontalGroup(
            title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_panelLayout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addComponent(title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        title_panelLayout.setVerticalGroup(
            title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_panelLayout.createSequentialGroup()
                .addComponent(title_label)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        getContentPane().add(title_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 80));

        drinks_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        drinks.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        drinks.setText("??????????????????");

        sobia_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sobia_label.setText("??????????");

        asb_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        asb_label.setText("??????");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        asb_text.setText("0");
        asb_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asb_textActionPerformed(evt);
            }
        });

        sobia_text.setText("0");
        sobia_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobia_textActionPerformed(evt);
            }
        });

        mango_text.setText("0");
        mango_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mango_textActionPerformed(evt);
            }
        });

        mango_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mango_label.setText("??????????");

        javax.swing.GroupLayout drinks_panelLayout = new javax.swing.GroupLayout(drinks_panel);
        drinks_panel.setLayout(drinks_panelLayout);
        drinks_panelLayout.setHorizontalGroup(
            drinks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drinks_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(drinks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(asb_text)
                    .addComponent(sobia_text, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(mango_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(drinks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drinks_panelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(drinks_panelLayout.createSequentialGroup()
                        .addGroup(drinks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sobia_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asb_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mango_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(drinks_panelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(drinks)
                .addGap(0, 110, Short.MAX_VALUE))
        );
        drinks_panelLayout.setVerticalGroup(
            drinks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinks_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drinks)
                .addGap(10, 10, 10)
                .addGroup(drinks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asb_label)
                    .addComponent(asb_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(drinks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobia_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sobia_label))
                .addGap(15, 15, 15)
                .addGroup(drinks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mango_label)
                    .addComponent(mango_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(drinks_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 320, 200));

        meals_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        meals.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        meals.setText("?????????????? ??????????????");

        falafel_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        falafel_label.setText("??????????");

        fool_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fool_label.setText("??????");

        eggs_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        eggs_label.setText("??????");

        fool_text.setText("0");
        fool_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fool_textActionPerformed(evt);
            }
        });

        falafel_text.setText("0");
        falafel_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                falafel_textActionPerformed(evt);
            }
        });

        eggs_text.setText("0");
        eggs_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eggs_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout meals_panelLayout = new javax.swing.GroupLayout(meals_panel);
        meals_panel.setLayout(meals_panelLayout);
        meals_panelLayout.setHorizontalGroup(
            meals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meals_panelLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(meals)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meals_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(meals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fool_text, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(falafel_text, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eggs_text, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(meals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(falafel_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eggs_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fool_label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        meals_panelLayout.setVerticalGroup(
            meals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meals_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meals)
                .addGap(10, 10, 10)
                .addGroup(meals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fool_label)
                    .addComponent(fool_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(meals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(falafel_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(falafel_label))
                .addGap(12, 12, 12)
                .addGroup(meals_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eggs_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eggs_label))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(meals_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 320, 200));

        additional_total_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        additional_total.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        additional_total.setText("???????????? ????????????");

        tebs_text.setText("0");
        tebs_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tebs_textActionPerformed(evt);
            }
        });

        tebs_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tebs_label.setText("??????");
        tebs_label.setToolTipText("");

        javax.swing.GroupLayout additional_total_panelLayout = new javax.swing.GroupLayout(additional_total_panel);
        additional_total_panel.setLayout(additional_total_panelLayout);
        additional_total_panelLayout.setHorizontalGroup(
            additional_total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additional_total_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tebs_text, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tebs_label, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, additional_total_panelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(additional_total)
                .addGap(52, 52, 52))
        );
        additional_total_panelLayout.setVerticalGroup(
            additional_total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additional_total_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(additional_total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(additional_total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tebs_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tebs_label))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        getContentPane().add(additional_total_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 320, 200));

        total_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        total.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        total.setText("??????????????");

        total_drinks.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        total_drinks.setText("??????????????????");

        final_total_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        final_total_label.setText("????????????????");

        final_total_text.setEditable(false);
        final_total_text.setText("0");
        final_total_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_total_textActionPerformed(evt);
            }
        });

        total_meals_text.setEditable(false);
        total_meals_text.setText("0");
        total_meals_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_meals_textActionPerformed(evt);
            }
        });

        drinks_text.setEditable(false);
        drinks_text.setText("0");
        drinks_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinks_textActionPerformed(evt);
            }
        });

        total_meals.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        total_meals.setText("??????????????");
        total_meals.setToolTipText("");

        javax.swing.GroupLayout total_panelLayout = new javax.swing.GroupLayout(total_panel);
        total_panel.setLayout(total_panelLayout);
        total_panelLayout.setHorizontalGroup(
            total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, total_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(final_total_text, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_meals_text, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinks_text, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, total_panelLayout.createSequentialGroup()
                        .addComponent(final_total_label)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, total_panelLayout.createSequentialGroup()
                        .addComponent(total_drinks)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, total_panelLayout.createSequentialGroup()
                        .addComponent(total_meals, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(total_panelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(total)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        total_panelLayout.setVerticalGroup(
            total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_meals, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(total_meals_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_drinks)
                    .addComponent(drinks_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(final_total_label)
                    .addComponent(final_total_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(total_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 320, 200));

        reset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        reset.setText("?????????? ??????????");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 170, 30));

        total_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        total_btn.setText("????????????????");
        total_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_btnActionPerformed(evt);
            }
        });
        getContentPane().add(total_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 160, 30));

        confirm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        confirm.setText("??????????");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 170, 30));

        orders.setAutoCreateRowSorter(true);
        orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????????? ????????????????", "????????????????", "??????????????"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll_panel.setViewportView(orders);

        getContentPane().add(scroll_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 100, 410, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void total_btnActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("This is the total");
        this.setValues();
        boolean areValid = this.validateData();
        if (areValid) {
            int drinks = 0;
            int meals = 0;
            for (Map.Entry<String, JTextField> val : this.values.entrySet()) {
                String key = val.getKey();
                if (key == "mango" || key == "sobia" || key == "asb") {
                    drinks += Integer.parseInt(val.getValue().getText());
                } else {
                    meals += Integer.parseInt(val.getValue().getText());
                }
            }
            this.total_meals_text.setText(meals + "");
            this.drinks_text.setText(drinks + "");
            this.final_total_text.setText(drinks + meals + Integer.parseInt(this.tebs_text.getText()) + "");
        }
    }

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        this.setValues();
        boolean areValid = this.validateData();
        if (areValid) {
            int res = JOptionPane.showConfirmDialog(this, "?????????? ?????????? ?? ");
            if (res == 0) {
                if (this.c != null) {
                    // Get total
                    int total = 0;
                    for (Map.Entry<String, JTextField> v : this.values.entrySet()) {
                        total += Integer.parseInt(v.getValue().getText());
                    }
                    try {
                        var stmt = this.c.prepareStatement("INSERT INTO orders (total) VALUES(?)");
                        stmt.setString(1, total + "");
                        stmt.executeUpdate();
                        this.showOrders();
                        JOptionPane.showMessageDialog(this, "?????? ?????????? ?????????? ??????????");
                        this.resetInputs();
                    } catch (SQLException ex) {
                        Logger.getLogger(resturant.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }
    }// GEN-LAST:event_confirmActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetActionPerformed
        this.resetInputs();
    }// GEN-LAST:event_resetActionPerformed
    /**
     * This method is used to show all orders in our table
     */
    private void showOrders() {
        int columns_cnt;
        try {
            // Get connection variable
            this.c = DriverManager.getConnection(this.con, this.user, this.password);

            // initialize the query
            var stmt = this.c.prepareStatement("SELECT * FROM orders");

            // Execute the query
            ResultSet res = stmt.executeQuery();

            // Get records in iterable
            var res_in_meta_data = res.getMetaData();
            // Columns count to loop over it
            columns_cnt = res_in_meta_data.getColumnCount();

            // Get default table model that uses vector of vectors to sotre data in it
            var dft = (DefaultTableModel) this.orders.getModel();
            dft.setRowCount(0);
            while (res.next()) {

                // Initialize a new vector for one raw
                var vc = new Vector();
                // Loop to add each cell in each raw
                for (int i = 0; i < columns_cnt; i++) {
                    vc.add(res.getString("id"));
                    vc.add(res.getDouble("total"));
                    vc.add(res.getString("date"));
                }
                // Add the row to our table
                dft.addRow(vc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(resturant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean validateData() {
        this.setValues();
        int validInpts = 0;
        // Loop over the values to validate them
        for (Map.Entry<String, JTextField> value : this.values.entrySet()) {
            String key = value.getKey();
            JTextField val = value.getValue();
            if ("".equals(val.getText())) {
                JOptionPane.showMessageDialog(this, key + " Cannot Be Empty");
                return false;
            } else {
                try {
                    double x = Double.parseDouble(val.getText());
                    if (x < 0) {
                        JOptionPane.showMessageDialog(this, key + " Cannot Be Smaller Than Zero");
                        return false;
                    }
                    if (!"tebs".equals(key) && x > 0) {
                        validInpts++;
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, key + " Is Not A Valid Number");
                    return false;
                }
            }

        }
        if (validInpts == 0) {
            JOptionPane.showMessageDialog(this, "???? ???? ???? ???????? ???????? ???????? ?????? ?????????? ???????? ???? ??????");
            return false;
        }
        return true;
    }

    private void setValues() {
        this.values.put("fool", this.fool_text);
        this.values.put("falafel", this.falafel_text);
        this.values.put("egg", this.eggs_text);
        this.values.put("sobia", this.sobia_text);
        this.values.put("asb", this.asb_text);
        this.values.put("mango", this.mango_text);
        this.totals.put("total_meals", this.total_meals_text);
        this.totals.put("total_drinks", this.drinks_text);
        this.totals.put("total", this.final_total_text);
        this.values.put("tebs", this.tebs_text);
    }

    private void resetInputs() {
        for (Map.Entry<String, JTextField> v : this.values.entrySet()) {
            v.getValue().setText("0");
        }
        for (Map.Entry<String, JTextField> v : this.totals.entrySet()) {
            v.getValue().setText("0");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resturant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel additional_total;
    private javax.swing.JPanel additional_total_panel;
    private javax.swing.JLabel asb_label;
    private javax.swing.JTextField asb_text;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel drinks;
    private javax.swing.JPanel drinks_panel;
    private javax.swing.JTextField drinks_text;
    private javax.swing.JLabel eggs_label;
    private javax.swing.JTextField eggs_text;
    private javax.swing.JLabel falafel_label;
    private javax.swing.JTextField falafel_text;
    private javax.swing.JLabel final_total_label;
    private javax.swing.JTextField final_total_text;
    private javax.swing.JLabel fool_label;
    private javax.swing.JTextField fool_text;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel mango_label;
    private javax.swing.JTextField mango_text;
    private javax.swing.JLabel meals;
    private javax.swing.JPanel meals_panel;
    private javax.swing.JTable orders;
    private javax.swing.JButton reset;
    private javax.swing.JScrollPane scroll_panel;
    private javax.swing.JLabel sobia_label;
    private javax.swing.JTextField sobia_text;
    private javax.swing.JLabel tebs_label;
    private javax.swing.JTextField tebs_text;
    private javax.swing.JLabel title_label;
    private javax.swing.JPanel title_panel;
    private javax.swing.JLabel total;
    private javax.swing.JButton total_btn;
    private javax.swing.JLabel total_drinks;
    private javax.swing.JLabel total_meals;
    private javax.swing.JTextField total_meals_text;
    private javax.swing.JPanel total_panel;
    // End of variables declaration//GEN-END:variables
}
