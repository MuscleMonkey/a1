
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author onad
 */
public class exam extends javax.swing.JFrame {

    /**
     * Creates new form exam
     */
    public exam() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rb_flavor_hawaiian = new javax.swing.JRadioButton();
        rb_flavor_hamcheese = new javax.swing.JRadioButton();
        rb_flavor_peperroni = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rb_size_small = new javax.swing.JRadioButton();
        rb_size_large = new javax.swing.JRadioButton();
        lbl_price_medium = new javax.swing.JLabel();
        lbl_price_small = new javax.swing.JLabel();
        lbl_price_large = new javax.swing.JLabel();
        rb_size_medium = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        chkbox_xtra_cheese = new javax.swing.JCheckBox();
        chkbox_pepper = new javax.swing.JCheckBox();
        chkbox_onions = new javax.swing.JCheckBox();
        chkbox_olives = new javax.swing.JCheckBox();
        chkbox_green_peppers = new javax.swing.JCheckBox();
        button_createorder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtffield_payment_amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbl_display_change = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PIZZA ORDERING SYSTEM");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        buttonGroup1.add(rb_flavor_hawaiian);
        rb_flavor_hawaiian.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        rb_flavor_hawaiian.setSelected(true);
        rb_flavor_hawaiian.setText("HAWAIIAN");
        rb_flavor_hawaiian.setFocusable(false);
        rb_flavor_hawaiian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_flavor_hawaiianActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_flavor_hamcheese);
        rb_flavor_hamcheese.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        rb_flavor_hamcheese.setText("HAM AND CHEESE");
        rb_flavor_hamcheese.setFocusable(false);
        rb_flavor_hamcheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_flavor_hamcheeseActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_flavor_peperroni);
        rb_flavor_peperroni.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        rb_flavor_peperroni.setText("PEPERRONI");
        rb_flavor_peperroni.setFocusable(false);
        rb_flavor_peperroni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_flavor_peperroniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_flavor_hawaiian, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_flavor_hamcheese, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_flavor_peperroni, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(rb_flavor_hawaiian)
                .addGap(7, 7, 7)
                .addComponent(rb_flavor_hamcheese)
                .addGap(7, 7, 7)
                .addComponent(rb_flavor_peperroni)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        buttonGroup2.add(rb_size_small);
        rb_size_small.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        rb_size_small.setSelected(true);
        rb_size_small.setText("SMALL-SIZED");
        rb_size_small.setFocusable(false);
        rb_size_small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_size_smallActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_size_large);
        rb_size_large.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        rb_size_large.setText("LARGE-SIZED");
        rb_size_large.setFocusable(false);
        rb_size_large.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_size_largeActionPerformed(evt);
            }
        });

        lbl_price_medium.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_price_medium.setText("110.00");

        lbl_price_small.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_price_small.setText("90.00");

        lbl_price_large.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_price_large.setText("130.00");

        buttonGroup2.add(rb_size_medium);
        rb_size_medium.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        rb_size_medium.setText("MEDIUM-SIZED");
        rb_size_medium.setFocusable(false);
        rb_size_medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_size_mediumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_size_medium)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_price_medium, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 7, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rb_size_small)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_price_small, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rb_size_large)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_price_large, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_size_small)
                    .addComponent(lbl_price_small))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_size_medium)
                    .addComponent(lbl_price_medium))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_size_large)
                    .addComponent(lbl_price_large))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        chkbox_xtra_cheese.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        chkbox_xtra_cheese.setText("EXTRA CHEESE");
        chkbox_xtra_cheese.setFocusable(false);
        chkbox_xtra_cheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_xtra_cheeseActionPerformed(evt);
            }
        });

        chkbox_pepper.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        chkbox_pepper.setText("PEPPER");
        chkbox_pepper.setFocusable(false);
        chkbox_pepper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_pepperActionPerformed(evt);
            }
        });

        chkbox_onions.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        chkbox_onions.setText("ONIONS");
        chkbox_onions.setFocusable(false);
        chkbox_onions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_onionsActionPerformed(evt);
            }
        });

        chkbox_olives.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        chkbox_olives.setText("BLACK OLIVES");
        chkbox_olives.setFocusable(false);
        chkbox_olives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_olivesActionPerformed(evt);
            }
        });

        chkbox_green_peppers.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        chkbox_green_peppers.setText("GREEN PEPPERS");
        chkbox_green_peppers.setFocusable(false);
        chkbox_green_peppers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox_green_peppersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbox_pepper, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbox_onions, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbox_olives, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbox_green_peppers, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbox_xtra_cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkbox_pepper)
                .addGap(7, 7, 7)
                .addComponent(chkbox_onions)
                .addGap(7, 7, 7)
                .addComponent(chkbox_olives)
                .addGap(7, 7, 7)
                .addComponent(chkbox_green_peppers)
                .addGap(7, 7, 7)
                .addComponent(chkbox_xtra_cheese)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        button_createorder.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button_createorder.setText("CREATE ORDER");
        button_createorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_createorderActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        txtffield_payment_amount.setColumns(6);
        txtffield_payment_amount.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        txtffield_payment_amount.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtffield_payment_amount.setText("0");
        txtffield_payment_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtffield_payment_amountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel1.setText("Enter Payment Amount:");

        lbl_display_change.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        lbl_display_change.setText("Change is: ");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel3.setText("ORDER SUMMARY");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel2.setText("ADD-ONS");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel4.setText("FLAVOR");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel5.setText("FLAVOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(button_createorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_display_change, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtffield_payment_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtffield_payment_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(lbl_display_change)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_createorder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double pizza_price = 0, add_ons_fee = 0;
    String pizza_flavor = "HAWAIIAN", pizza_size = "SMALL", add_ons = "";
    private void rb_flavor_hawaiianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_flavor_hawaiianActionPerformed
        // TODO add your handling code here
        if (rb_flavor_hawaiian.isSelected()) {
            pizza_flavor = "HAWAIIAN";
            lbl_price_small.setText("90.00");
            lbl_price_medium.setText("110.00");
            lbl_price_large.setText("130.00");
        }
    }//GEN-LAST:event_rb_flavor_hawaiianActionPerformed

    private void rb_flavor_hamcheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_flavor_hamcheeseActionPerformed
        // TODO add your handling code here:
        if (rb_flavor_hamcheese.isSelected()) {
            pizza_flavor = "HAM AND CHEESE";
            lbl_price_small.setText("110.00");
            lbl_price_medium.setText("130.00");
            lbl_price_large.setText("150.00");
        }
    }//GEN-LAST:event_rb_flavor_hamcheeseActionPerformed

    private void rb_flavor_peperroniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_flavor_peperroniActionPerformed
        // TODO add your handling code here:
        if (rb_flavor_peperroni.isSelected()) {
            pizza_flavor = "PEPPERONI";
            lbl_price_small.setText("130.00");
            lbl_price_medium.setText("150.00");
            lbl_price_large.setText("170.00");
        }
    }//GEN-LAST:event_rb_flavor_peperroniActionPerformed

    private void button_createorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_createorderActionPerformed
        // TODO add your handling code here:
        if (rb_flavor_hawaiian.isSelected() && rb_size_small.isSelected()) {
            pizza_price = 90;
        }
        if (rb_flavor_hawaiian.isSelected() && rb_size_medium.isSelected()) {
            pizza_price = 110;
        }
        if (rb_flavor_hawaiian.isSelected() && rb_size_large.isSelected()) {
            pizza_price = 130;
        }
        if (rb_flavor_hamcheese.isSelected() && rb_size_small.isSelected()) {
            pizza_price = 110;
        }
        if (rb_flavor_hamcheese.isSelected() && rb_size_medium.isSelected()) {
            pizza_price = 130;
        }
        if (rb_flavor_hamcheese.isSelected() && rb_size_large.isSelected()) {
            pizza_price = 150;
        }
        if (rb_flavor_peperroni.isSelected() && rb_size_small.isSelected()) {
            pizza_price = 130;
        }
        if (rb_flavor_peperroni.isSelected() && rb_size_medium.isSelected()) {
            pizza_price = 150;
        }
        if (rb_flavor_peperroni.isSelected() && rb_size_large.isSelected()) {
            pizza_price = 170;
        }
        add_ons = "";
        if (chkbox_pepper.isSelected()) {
            add_ons = add_ons + "\n\tPEPPER";
        }
        if (chkbox_onions.isSelected()) {
            add_ons = add_ons + "\n\tONIONS";
        }
        if (chkbox_olives.isSelected()) {
            add_ons = add_ons + "\n\tBLACK OLIVES";
        }
        if (chkbox_green_peppers.isSelected()) {
            add_ons = add_ons + "\n\tGREEN PEPPERS";
        }
        if (chkbox_xtra_cheese.isSelected()) {
            add_ons = add_ons + "\n\tEXTRA CHEESE";
        }

        pizza_price = pizza_price + add_ons_fee;
        double payment_amount = Double.parseDouble(txtffield_payment_amount.getText());
        double change = payment_amount - pizza_price;
        jTextArea1.setText("PIZZA FLAVOR : " + pizza_flavor
                + "\n\n\nPIZZA SIZE : " + pizza_size
                + "\n\n\nADD ONS: " + add_ons
                + "\n\n\n\nTOTAL PRICE : " + pizza_price + " pesos");
        if (change < 0) {
            JOptionPane.showMessageDialog(null, "SORRY, INSUFFICIENT AMOUNT\n", null, JOptionPane.WARNING_MESSAGE);
            lbl_display_change.setText(" Change: ");
            System.out.println(change);
        } else if (change >= 0) {
            lbl_display_change.setText("Change : " + change);
            int confirmation = JOptionPane.showConfirmDialog(null, "CONFIRM ORDER", null, JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "YOU WILL ENJOY YOUR PIZZA IN A MINUTE! \nPLSS WAIT :)");
                txtffield_payment_amount.setText("0");
                jTextArea1.setText("");
                rb_flavor_hawaiian.setSelected(true);
                rb_size_small.setSelected(true);
                chkbox_green_peppers.setSelected(false);
                chkbox_olives.setSelected(false);
                chkbox_onions.setSelected(false);
                chkbox_pepper.setSelected(false);
                chkbox_xtra_cheese.setSelected(false);
                add_ons_fee = 0;
                pizza_price = 0;
                pizza_flavor = "HAWAIIAN";
                pizza_size = "SMALL";
                lbl_display_change.setText("Change : ");
            }
        }

    }//GEN-LAST:event_button_createorderActionPerformed

    private void rb_size_smallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_size_smallActionPerformed
        // TODO add your handling code here:
        pizza_size = "SMALL";
    }//GEN-LAST:event_rb_size_smallActionPerformed

    private void rb_size_mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_size_mediumActionPerformed
        // TODO add your handling code here:
        pizza_size = "MEDIUM";
    }//GEN-LAST:event_rb_size_mediumActionPerformed

    private void rb_size_largeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_size_largeActionPerformed
        // TODO add your handling code here:
        pizza_size = "LARGE";
    }//GEN-LAST:event_rb_size_largeActionPerformed

    private void chkbox_pepperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_pepperActionPerformed
        // TODO add your handling code here:
        if (chkbox_pepper.isSelected())
            add_ons_fee = add_ons_fee + 5;
        else
            add_ons_fee = add_ons_fee - 5;
    }//GEN-LAST:event_chkbox_pepperActionPerformed

    private void chkbox_onionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_onionsActionPerformed
        // TODO add your handling code here:
        if (chkbox_onions.isSelected())
            add_ons_fee = add_ons_fee + 10;
        else
            add_ons_fee = add_ons_fee - 10;
    }//GEN-LAST:event_chkbox_onionsActionPerformed

    private void chkbox_olivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_olivesActionPerformed
        // TODO add your handling code here:
        if (chkbox_olives.isSelected())
            add_ons_fee = add_ons_fee + 15;
        else
            add_ons_fee = add_ons_fee - 15;
    }//GEN-LAST:event_chkbox_olivesActionPerformed

    private void chkbox_green_peppersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_green_peppersActionPerformed
        // TODO add your handling code here:
        if (chkbox_green_peppers.isSelected())
            add_ons_fee = add_ons_fee + 20;
        else
            add_ons_fee = add_ons_fee - 20;
    }//GEN-LAST:event_chkbox_green_peppersActionPerformed

    private void chkbox_xtra_cheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox_xtra_cheeseActionPerformed
        // TODO add your handling code here:
        if (chkbox_xtra_cheese.isSelected())
            add_ons_fee = add_ons_fee + 25;
        else
            add_ons_fee = add_ons_fee - 25;
    }//GEN-LAST:event_chkbox_xtra_cheeseActionPerformed

    private void txtffield_payment_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtffield_payment_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtffield_payment_amountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton button_createorder;
    private javax.swing.JCheckBox chkbox_green_peppers;
    private javax.swing.JCheckBox chkbox_olives;
    private javax.swing.JCheckBox chkbox_onions;
    private javax.swing.JCheckBox chkbox_pepper;
    private javax.swing.JCheckBox chkbox_xtra_cheese;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_display_change;
    private javax.swing.JLabel lbl_price_large;
    private javax.swing.JLabel lbl_price_medium;
    private javax.swing.JLabel lbl_price_small;
    private javax.swing.JRadioButton rb_flavor_hamcheese;
    private javax.swing.JRadioButton rb_flavor_hawaiian;
    private javax.swing.JRadioButton rb_flavor_peperroni;
    private javax.swing.JRadioButton rb_size_large;
    private javax.swing.JRadioButton rb_size_medium;
    private javax.swing.JRadioButton rb_size_small;
    private javax.swing.JTextField txtffield_payment_amount;
    // End of variables declaration//GEN-END:variables
}
