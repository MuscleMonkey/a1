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

    class Product {

        public String id, name, description;
        public int price, quantity;

        public Product() {
        }

        public Product(String id, String name, String description, int quantity, int price) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.quantity = quantity;
            this.price = price;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getPrice() {
            return price;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setPrice(int price) {
            this.price = price;
        }

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
        DefaultTableModel model = (DefaultTableModel) jTableInventory.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTableOrderProduct.getModel();

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
        DefaultTableModel customerModel = (DefaultTableModel) jTableCustomer.getModel();
        DefaultTableModel orderModel1 = (DefaultTableModel) jTableOrderCustomer.getModel();

        ArrayList<Customer> list1 = listProduct1();
        Object rowdata1[] = new Object[4];
        for (int i = 0; i < list1.size(); i++) {
            rowdata1[0] = list1.get(i).customerNO;
            rowdata1[1] = list1.get(i).name;
            rowdata1[2] = list1.get(i).phoneNo;
            rowdata1[3] = list1.get(i).eMail;
            customerModel.addRow(rowdata1);
            orderModel1.addRow(rowdata1);
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
        jTableInventory = new javax.swing.JTable();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableOrderProduct = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableOrder = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableOrderCustomer = new javax.swing.JTable();
        btnOrderAdd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCustomer = new javax.swing.JTable();
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
        btnCustomerAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jTableInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "desc", "stocks", "price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInventoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInventory);

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
        btnEdit.setText("Buttons");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
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
                        .addComponent(btnLogout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Inventory", jPanel1);

        jTableOrderProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "desc", "stocks", "price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableOrderProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOrderProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableOrderProduct);

        jTableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact", "Product", "Quantity", "Price"
            }
        ));
        jScrollPane4.setViewportView(jTableOrder);

        jTableOrderCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer no", "Name", "Mobile no", "Email"
            }
        ));
        jScrollPane5.setViewportView(jTableOrderCustomer);

        btnOrderAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOrderAdd.setText("Add");
        btnOrderAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnOrderAdd))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnOrderAdd)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Order", jPanel2);

        jTableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer no.", "Name", "Phone no.", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCustomer.getTableHeader().setReorderingAllowed(false);
        jTableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCustomerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCustomer);

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

        btnCustomerEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCustomerEdit.setText("edit");
        btnCustomerEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerEditActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setText("clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnCustomerAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCustomerAdd.setText("Add");
        btnCustomerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(tfEmail))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLable1)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(btnClear)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCustomerAdd)
                                    .addGap(10, 10, 10)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPhoneNo)
                            .addComponent(tfName)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnCustomerEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLable1))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomerEdit)
                    .addComponent(btnClear)
                    .addComponent(jButton3)
                    .addComponent(btnCustomerAdd))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Customer", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
        DefaultTableModel model = (DefaultTableModel) jTableInventory.getModel();
        model.setRowCount(0);
        addRowToData();
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here
        new EditFormUI().show();
        btnEdit.setEnabled(false);

    }//GEN-LAST:event_btnEditActionPerformed

    private void jTableInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInventoryMouseClicked
        // TODO add your handling code here:        
        int selectedRow = jTableInventory.getSelectedRow();
        EditFormUI.tfId.setText(jTableInventory.getValueAt(selectedRow, 0).toString());
        EditFormUI.tfName.setText(jTableInventory.getValueAt(selectedRow, 1).toString());
        EditFormUI.tfDesc.setText(jTableInventory.getValueAt(selectedRow, 2).toString());
        EditFormUI.tfQty.setText(jTableInventory.getValueAt(selectedRow, 3).toString());
        EditFormUI.tfPrice.setText(jTableInventory.getValueAt(selectedRow, 4).toString());


    }//GEN-LAST:event_jTableInventoryMouseClicked

    private void jTableOrderProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOrderProductMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableOrderProductMouseClicked

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
        int selectedRow = jTableCustomer.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableCustomer.getModel();

        model.setValueAt(tfCustomerNo.getText(), selectedRow, 0);
        model.setValueAt(tfName.getText(), selectedRow, 1);
        model.setValueAt(tfEmail.getText(), selectedRow, 2);
        model.setValueAt(tfPhoneNo.getText(), selectedRow, 3);
    }//GEN-LAST:event_btnCustomerEditActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        int selectedRow = jTableCustomer.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableCustomer.getModel();
        DefaultTableModel model1 = (DefaultTableModel) jTableOrderCustomer.getModel();
        model.setValueAt("", selectedRow, 0);
        model.setValueAt("", selectedRow, 1);
        model.setValueAt("", selectedRow, 2);
        model.setValueAt("", selectedRow, 3);
        tfCustomerNo.setText(jTableCustomer.getValueAt(selectedRow, 0).toString());
        tfName.setText(jTableCustomer.getValueAt(selectedRow, 1).toString());
        tfEmail.setText(jTableCustomer.getValueAt(selectedRow, 2).toString());
        tfPhoneNo.setText(jTableCustomer.getValueAt(selectedRow, 3).toString());
        model1.setValueAt("", selectedRow, 0);
        model1.setValueAt("", selectedRow, 1);
        model1.setValueAt("", selectedRow, 2);
        model1.setValueAt("", selectedRow, 3);

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCustomerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerAddActionPerformed
        // TODO add your handling code here:
        if (tfCustomerNo.getText().trim().isEmpty() || tfName.getText().trim().isEmpty() || tfPhoneNo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog((null), "Customer no., Name, and Phone no. should not be empty.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableCustomer.getModel();
        DefaultTableModel model1 = (DefaultTableModel) jTableOrderCustomer.getModel();
        Object[] obj = new Object[4];
        obj[0] = tfCustomerNo.getText();
        obj[1] = tfName.getText();
        obj[2] = tfPhoneNo.getText();
        obj[3] = tfEmail.getText();
        model1.addRow(obj);
        model.addRow(obj);
    }//GEN-LAST:event_btnCustomerAddActionPerformed

    private void jTableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerMouseClicked
        int selectedRow = jTableCustomer.getSelectedRow();

        tfCustomerNo.setText(jTableCustomer.getValueAt(selectedRow, 0).toString());
        tfName.setText(jTableCustomer.getValueAt(selectedRow, 1).toString());
        tfEmail.setText(jTableCustomer.getValueAt(selectedRow, 2).toString());
        tfPhoneNo.setText(jTableCustomer.getValueAt(selectedRow, 3).toString());


    }//GEN-LAST:event_jTableCustomerMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTableCustomer.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Table is empty.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableCustomer.getModel();
        int selectedRow = jTableCustomer.getSelectedRow();
        model.removeRow(selectedRow);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int confirmDialog = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", null, JOptionPane.YES_NO_OPTION);
        if (confirmDialog == JOptionPane.YES_OPTION) {
            this.hide();
            new InventoryManagementSystem();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnOrderAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderAddActionPerformed
        // TODO add your handling code here:
        if (jTableOrderProduct.getSelectedRowCount() == 1 && jTableOrderCustomer.getSelectedRowCount() == 1) {
            DefaultTableModel model1 = (DefaultTableModel) jTableOrderProduct.getModel();//product
            DefaultTableModel model2 = (DefaultTableModel) jTableOrder.getModel();
            DefaultTableModel model3 = (DefaultTableModel) jTableOrderCustomer.getModel();//customer
            DefaultTableModel model4 = (DefaultTableModel) jTableInventory.getModel();//inventor table
            int productSelectedRow = jTableOrderProduct.getSelectedRow();
            int customerSelectedRow = jTableOrderCustomer.getSelectedRow();
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many? "));
            if (quantity > (int) model1.getValueAt(productSelectedRow, 3)) {
                JOptionPane.showMessageDialog(null, "Not Enough Stocks!");
                return;
            } else {
                int stocksLeft = (int) model1.getValueAt(productSelectedRow, 3) - quantity;
                model1.setValueAt(stocksLeft, productSelectedRow, 3);
                model4.setValueAt(stocksLeft, productSelectedRow, 3);
            }

            Object[] rowData3 = new Object[5];
            rowData3[0] = model3.getValueAt(customerSelectedRow, 1);
            rowData3[1] = model3.getValueAt(customerSelectedRow, 2);
            rowData3[2] = model1.getValueAt(productSelectedRow, 1);
            rowData3[3] = quantity;
            rowData3[4] = (int) model1.getValueAt(productSelectedRow, 4) * quantity;
            model2.addRow(rowData3);

        } else {

        }
    }//GEN-LAST:event_btnOrderAddActionPerformed

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
    private javax.swing.JButton btnCustomerAdd;
    private javax.swing.JButton btnCustomerEdit;
    public static javax.swing.JButton btnEdit;
    public static javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrderAdd;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JTable jTableCustomer;
    public static javax.swing.JTable jTableInventory;
    private javax.swing.JTable jTableOrder;
    private javax.swing.JTable jTableOrderCustomer;
    public static javax.swing.JTable jTableOrderProduct;
    private javax.swing.JTextField tfCustomerNo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhoneNo;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
