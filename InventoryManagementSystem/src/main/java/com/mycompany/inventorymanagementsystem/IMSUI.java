/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author onad
 */
public class IMSUI extends javax.swing.JFrame {

    /**
     * Creates new form IMS_UI
     */
    public IMSUI() {
        initComponents();
        addRowToData();
    }

    class Customer {

        String customerNO, name, phoneNo, eMail;

        public Customer(String customerNO, String name, String phoneNo, String eMail) {
            this.customerNO = customerNO;
            this.name = name;
            this.phoneNo = phoneNo;
            this.eMail = eMail;
        }

    }

    public ArrayList listProduct() {
        ArrayList<Product> lista = new ArrayList<>();
        lista.add(new Product("100", "hotdog", "tender", 12, 20));
        lista.add(new Product("101", "egg", "small", 9, 20));
        lista.add(new Product("102", "footlong", " tender", 15, 20));
        lista.add(new Product("103", "brake", "barakoII", 10, 20));
        lista.add(new Product("104", "egg", "small", 19, 20));
        lista.add(new Product("104", "Karne Norte", "medium", 25, 20));
        return lista;
    }

    public ArrayList listProduct1() {
        ArrayList<Customer> lista = new ArrayList<>();
        lista.add(new Customer("201", "Alexander", "09123456", "ar@email.com"));
        lista.add(new Customer("202", "Black", "09213456", "bk@email.com"));
        lista.add(new Customer("203", "Dalton", "09312456", "dn@email.com"));
        return lista;
    }

    public void addRowToData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

        ArrayList<Product> list = listProduct();
        Object rowdata[] = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            rowdata[0] = list.get(i).id;
            rowdata[1] = list.get(i).name;
            rowdata[2] = list.get(i).description;
            rowdata[3] = list.get(i).price;
            rowdata[4] = list.get(i).quantity;

            model.addRow(rowdata);
            model2.addRow(rowdata);
        }
        DefaultTableModel customerModel = (DefaultTableModel) jTable3.getModel();
        ArrayList<Customer> list1 = listProduct1();
        Object rowdata1[] = new Object[4];
        for (int i = 0; i < list1.size(); i++) {
            rowdata1[0] = list1.get(i).customerNO;
            rowdata1[1] = list1.get(i).name;
            rowdata1[2] = list1.get(i).phoneNo;
            rowdata1[3] = list1.get(i).eMail;
            customerModel.addRow(rowdata1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnEdit1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        tfCustomerNo = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfPhoneNo = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLable1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCustomerEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "desc", "qty", "price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tfSearch.setColumns(12);
        tfSearch.setToolTipText("type product id...");
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnEdit1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnEdit1.setText("Logout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnEdit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit)
                        .addComponent(btnEdit1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Inventory", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "desc", "qty", "price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Order", jPanel2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer no.", "Name", "Phone no.", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        tfCustomerNo.setColumns(12);
        tfCustomerNo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        tfName.setColumns(12);
        tfName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        tfPhoneNo.setColumns(12);
        tfPhoneNo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        tfPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneNoActionPerformed(evt);
            }
        });

        tfEmail.setColumns(12);
        tfEmail.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        jLable1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLable1.setText("Customer no.");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Phone no.");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("E-mail");

        btnCustomerEdit.setText("edit");
        btnCustomerEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerEditActionPerformed(evt);
            }
        });

        btnClear.setText("clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton3.setText("remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLable1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addGap(28, 28, 28)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfName)
                    .addComponent(tfEmail)
                    .addComponent(tfPhoneNo)
                    .addComponent(tfCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCustomerEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLable1))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCustomerEdit)
                            .addComponent(btnClear)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Customer", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        int tableRowCount = model.getRowCount();
//        int tableColumnCount = model.getColumnCount();
//        Object[][] obj2 = new Object[tableRowCount][tableColumnCount];
//        int cnt = 1;
//        int i;
//
//        for (i = 0; i < tableRowCount; i++) {
//
//            if (model.getValueAt(i, 0).equals(tfSearch)) {
//                obj2[i][0] = model.getValueAt(i, 0);
//                obj2[i][1] = model.getValueAt(i, 1);
//                obj2[i][2] = model.getValueAt(i, 2);
//                obj2[i][3] = model.getValueAt(i, 3);
//                cnt++;
//            }
//        }
//        Object[] obj = new Object[4];
//        System.out.println(cnt);
//        model.setRowCount(cnt);
//        for (i = 0; i < cnt; i++) {
//            obj[0] = obj2[i][0];
//            obj[1] = obj2[i][0];
//            obj[2] = obj2[i][0];
//            obj[3] = obj2[i][0];
//            model.addRow(obj);
//        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        addRowToData();
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here
        new EditFormUI().show();
        btnEdit.setEnabled(false);

    }//GEN-LAST:event_btnEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:        
        int selectedRow = jTable1.getSelectedRow();
        EditFormUI.tfId.setText(jTable1.getValueAt(selectedRow, 0).toString());
        EditFormUI.tfName.setText(jTable1.getValueAt(selectedRow, 1).toString());
        EditFormUI.tfDesc.setText(jTable1.getValueAt(selectedRow, 2).toString());
        EditFormUI.tfQty.setText(jTable1.getValueAt(selectedRow, 3).toString());
        EditFormUI.tfPrice.setText(jTable1.getValueAt(selectedRow, 4).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable2MouseClicked

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneNoActionPerformed

    private void btnCustomerEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerEditActionPerformed
        if (tfCustomerNo.getText().trim().isEmpty() || tfName.getText().trim().isEmpty() || tfPhoneNo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog((null), "Customer no., Name, and Phone no. should not be empty.");
            return;
        }
        int selectedRow = jTable3.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();

        model.setValueAt(tfCustomerNo.getText(), selectedRow, 0);
        model.setValueAt(tfName.getText(), selectedRow, 1);
        model.setValueAt(tfPhoneNo.getText(), selectedRow, 2);
        model.setValueAt(tfEmail.getText(), selectedRow, 3);
    }//GEN-LAST:event_btnCustomerEditActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        int selectedRow = jTable3.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setValueAt("", selectedRow, 0);
        model.setValueAt("", selectedRow, 1);
        model.setValueAt("", selectedRow, 2);
        model.setValueAt("", selectedRow, 3);
        tfCustomerNo.setText(jTable3.getValueAt(selectedRow, 0).toString());
        tfName.setText(jTable3.getValueAt(selectedRow, 1).toString());
        tfEmail.setText(jTable3.getValueAt(selectedRow, 2).toString());
        tfPhoneNo.setText(jTable3.getValueAt(selectedRow, 3).toString());

    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (tfCustomerNo.getText().trim().isEmpty() || tfName.getText().trim().isEmpty() || tfPhoneNo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog((null), "Customer no., Name, and Phone no. should not be empty.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        Object[] obj = new Object[4];
        obj[0] = tfCustomerNo.getText();
        obj[1] = tfName.getText();
        obj[2] = tfPhoneNo.getText();
        obj[3] = tfEmail.getText();
        model.addRow(obj);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int selectedRow = jTable3.getSelectedRow();

        tfCustomerNo.setText(jTable3.getValueAt(selectedRow, 0).toString());
        tfName.setText(jTable3.getValueAt(selectedRow, 1).toString());
        tfEmail.setText(jTable3.getValueAt(selectedRow, 2).toString());
        tfPhoneNo.setText(jTable3.getValueAt(selectedRow, 3).toString());


    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTable3.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Table is empty.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        int selectedRow = jTable3.getSelectedRow();
        model.removeRow(selectedRow);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(IMSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMSUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCustomerEdit;
    public static javax.swing.JButton btnEdit;
    public static javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLable1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable2;
    public static javax.swing.JTable jTable3;
    private javax.swing.JTextField tfCustomerNo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhoneNo;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
