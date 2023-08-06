/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author onad
 */
public class EditFormUI extends javax.swing.JFrame {

    /**
     * Creates new form AddProductForm
     */
    public EditFormUI() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        tfId = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfDesc = new javax.swing.JTextField();
        tfQty = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSet = new javax.swing.JButton();
        btnFormOkay = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 0));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel6.setText("Form");
        jPanel2.add(jLabel6);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        tfId.setColumns(12);
        tfId.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(tfId, gridBagConstraints);

        tfName.setColumns(12);
        tfName.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(tfName, gridBagConstraints);

        tfDesc.setColumns(12);
        tfDesc.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        tfDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(tfDesc, gridBagConstraints);

        tfQty.setColumns(12);
        tfQty.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        tfQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQtyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(tfQty, gridBagConstraints);

        tfPrice.setColumns(12);
        tfPrice.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        tfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPriceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(tfPrice, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Id");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(jLabel4, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Quantity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(jLabel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Price");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel6.add(jLabel5, gridBagConstraints);

        jPanel3.add(jPanel6);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(4, 0, 2, 2));

        btnAdd.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd);

        btnSet.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnSet.setText("SET");
        btnSet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });
        jPanel4.add(btnSet);

        btnFormOkay.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnFormOkay.setText("OKAY");
        btnFormOkay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFormOkay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormOkayActionPerformed(evt);
            }
        });
        jPanel4.add(btnFormOkay);

        btnRemove.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel4.add(btnRemove);

        jPanel1.add(jPanel4, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed

    private void tfQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQtyActionPerformed

    private void tfDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescActionPerformed

    private void tfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPriceActionPerformed

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        // TODO add your handling code here:
        if (IMSUI.jTableInventory.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No row is selected");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) IMSUI.jTableInventory.getModel();

        int selectedRow = IMSUI.jTableInventory.getSelectedRow();

        model.setValueAt(tfId.getText(), selectedRow, 0);
        model.setValueAt(tfName.getText(), selectedRow, 1);
        model.setValueAt(tfDesc.getText(), selectedRow, 2);
        model.setValueAt(tfQty.getText(), selectedRow, 3);
        model.setValueAt(tfPrice.getText(), selectedRow, 4);

        DefaultTableModel model1 = (DefaultTableModel) IMSUI.jTableOrderProduct.getModel();
        model1.setValueAt(tfId.getText(), selectedRow, 0);
        model1.setValueAt(tfName.getText(), selectedRow, 1);
        model1.setValueAt(tfDesc.getText(), selectedRow, 2);
        model1.setValueAt(tfQty.getText(), selectedRow, 3);
        model1.setValueAt(tfPrice.getText(), selectedRow, 4);
    }//GEN-LAST:event_btnSetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (tfDesc.getText().trim().isEmpty() && tfId.getText().trim().isEmpty() && tfName.getText().trim().isEmpty() && tfName.getText().trim().isEmpty() && tfPrice.getText().trim().isEmpty() && tfQty.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields should not be empty.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) IMSUI.jTableInventory.getModel();
        DefaultTableModel model2 = (DefaultTableModel) IMSUI.jTableOrderProduct.getModel();
        Object[] obj = new Object[5];
        obj[0] = tfId.getText();
        obj[1] = tfName.getText();
        obj[2] = tfDesc.getText();
        obj[3] = tfQty.getText();
        obj[4] = tfPrice.getText();
        model.addRow(obj);
        model2.addRow(obj);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFormOkayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormOkayActionPerformed
        // TODO add your handling code here:
        this.hide();
        IMSUI.btnEdit.setEnabled(true);

    }//GEN-LAST:event_btnFormOkayActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) IMSUI.jTableInventory.getModel();
        DefaultTableModel model2 = (DefaultTableModel) IMSUI.jTableOrderProduct.getModel();
        int selectedRow = IMSUI.jTableInventory.getSelectedRow();

        if (IMSUI.jTableInventory.getSelectedRowCount() == 1) {
            model.removeRow(selectedRow);
            model2.removeRow(selectedRow);
        } else if (IMSUI.jTableInventory.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No Row Is Selected");
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(EditFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFormUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFormOkay;
    public javax.swing.JButton btnRemove;
    public javax.swing.JButton btnSet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JTextField tfDesc;
    public static javax.swing.JTextField tfId;
    public static javax.swing.JTextField tfName;
    public static javax.swing.JTextField tfPrice;
    public static javax.swing.JTextField tfQty;
    // End of variables declaration//GEN-END:variables
}
