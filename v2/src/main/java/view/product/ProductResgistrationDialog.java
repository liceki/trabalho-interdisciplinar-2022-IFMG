package view.product;

import controller.ProductController;
import interfaces.RegistrationDialog;
import interfaces.TablePanel;

public class ProductResgistrationDialog extends javax.swing.JDialog implements RegistrationDialog{

    private final ProductController controller;
    private final TablePanel productTablePanel;
    
    public ProductResgistrationDialog(java.awt.Frame parent, boolean modal, TablePanel supplierTablePanel) {
        super(parent, modal);
        initComponents();
        this.controller = new ProductController();
        this.productTablePanel= supplierTablePanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myScrollPane11 = new my_components.MyScrollPane1();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRegisterProduct = new my_components.MyButton1();
        txtFieldProductName = new my_components.MyTextField1();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFieldCostPrice = new my_components.MyTextField1();
        checkBoxAvailableInStock = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFieldSellingPrice = new my_components.MyTextField1();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRATION - SUPPLIER");
        setMaximumSize(new java.awt.Dimension(600, 800));
        setMinimumSize(new java.awt.Dimension(600, 800));

        myScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(52, 58, 64));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 1000));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 1000));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(152, 158, 164));
        jLabel2.setText("PRODUCT REGISTRATION");

        btnRegisterProduct.setText("REGISTER");
        btnRegisterProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterProductActionPerformed(evt);
            }
        });

        txtFieldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldProductNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(152, 158, 164));
        jLabel3.setText("Product Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(152, 158, 164));
        jLabel4.setText("Cost Price:");

        txtFieldCostPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCostPriceActionPerformed(evt);
            }
        });

        checkBoxAvailableInStock.setBackground(new java.awt.Color(52, 58, 64));
        checkBoxAvailableInStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkBoxAvailableInStock.setForeground(new java.awt.Color(152, 158, 164));
        checkBoxAvailableInStock.setText("Available in Stock");
        checkBoxAvailableInStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBoxAvailableInStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAvailableInStockActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(152, 158, 164));
        jLabel6.setText("R$");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(152, 158, 164));
        jLabel7.setText("Selling Price:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(152, 158, 164));
        jLabel8.setText("R$");

        txtFieldSellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSellingPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(100, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txtFieldProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkBoxAvailableInStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFieldCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtFieldSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegisterProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFieldSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtFieldCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(87, 87, 87))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(129, 129, 129)))
                .addComponent(checkBoxAvailableInStock)
                .addGap(167, 167, 167)
                .addComponent(btnRegisterProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        myScrollPane11.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(null);

        setSize(new java.awt.Dimension(616, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldProductNameActionPerformed

    private void txtFieldCostPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCostPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCostPriceActionPerformed

    private void btnRegisterProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterProductActionPerformed
        productTablePanel.getTableModel().addObject(
                controller.saveProduct(txtFieldProductName.getName(), txtFieldSellingPrice.getText(), 
                        txtFieldCostPrice.getText(), checkBoxAvailableInStock.isSelected()));
        productTablePanel.updateTable();
        
        //clearFields();
    }//GEN-LAST:event_btnRegisterProductActionPerformed

    private void checkBoxAvailableInStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAvailableInStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAvailableInStockActionPerformed

    private void txtFieldSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSellingPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private my_components.MyButton1 btnRegisterProduct;
    private javax.swing.JCheckBox checkBoxAvailableInStock;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private my_components.MyScrollPane1 myScrollPane11;
    private my_components.MyTextField1 txtFieldCostPrice;
    private my_components.MyTextField1 txtFieldProductName;
    private my_components.MyTextField1 txtFieldSellingPrice;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtFieldProductName.setText("");
        txtFieldCostPrice.setText("");
        txtFieldSellingPrice.setText("");
    }
}
