package view.product;

import controller.ProductController;
import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RelationalPanel;
import interfaces.TablePanel;
import javax.swing.DefaultComboBoxModel;
import model.Product;

public class ProductPropertiesPanel extends javax.swing.JPanel implements RelationalPanel, PropertiesPanel{
    private FiltersPanel productFiltersPanel;
    private TablePanel productTablePanel; 
    
    private DefaultComboBoxModel<String> categoryComboBoxModel;
    private DefaultComboBoxModel<String> subCategoryComboBoxModel;
    private DefaultComboBoxModel<String> sizesComboBoxModel;
    
    private ProductController controller;
    private Product selectedProduct;
    private int rowIndex;
    
    public ProductPropertiesPanel() {
        initComponents();
        
        configureComponents();
    }
    
    private void configureComponents(){
        categoryComboBoxModel = new DefaultComboBoxModel<>();
        subCategoryComboBoxModel = new DefaultComboBoxModel<>();
        sizesComboBoxModel = new DefaultComboBoxModel<>();
        
        comboBoxCategory.setModel(sizesComboBoxModel);
        comboBoxSubCategory.setModel(subCategoryComboBoxModel);
        comboBoxSize.setModel(sizesComboBoxModel);
        
        for(String category: Product.CATEGORIES){
            categoryComboBoxModel.addElement(category);
        }
    }

    @Override
    public void setRelations(RelationalPanel productFiltersPanel, RelationalPanel productTablePanel) {
        this.productFiltersPanel = (FiltersPanel) productFiltersPanel;
        this.productTablePanel = (TablePanel) productTablePanel;
    }

    @Override
    public void showProperties(int rowIndex, Object obj) {
        this.rowIndex = rowIndex;
        
        this.selectedProduct = (Product) obj;
        labelId.setText(selectedProduct.getId()+"");
        txtFieldProductName.setText(selectedProduct.getName());
        txtFieldCostPrice.setText(selectedProduct.getCostPrice()+"");
        txtFieldSellingPrice.setText(selectedProduct.getSellingPrice()+"");
        
        checkBoxAvailableInStock.setSelected(selectedProduct.isAvailableInStock());
        
        comboBoxCategory.setSelectedItem(selectedProduct.getCategory());
        comboBoxSubCategory.setSelectedItem(selectedProduct.getSubCategory());
        comboBoxSize.setSelectedItem(selectedProduct.getSize());
        
        labelSupplier.setText(selectedProduct.getSupplier().getCnpj() + " -> " + selectedProduct.getSupplier().getCorporateName());
        
        enableButtons();   
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldProductName = new my_components.MyTextField1();
        jLabel6 = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        btnDeleteProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtFieldCostPrice = new my_components.MyTextField1();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFieldSellingPrice = new my_components.MyTextField1();
        checkBoxAvailableInStock = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        comboBoxCategory = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        comboBoxSubCategory = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        comboBoxSize = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        labelSupplier = new javax.swing.JLabel();

        setBackground(new java.awt.Color(52, 58, 64));

        jPanel1.setBackground(new java.awt.Color(52, 58, 64));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 158, 164));
        jLabel1.setText("PROPERTIES");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(152, 158, 164));
        jLabel3.setText("ID:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(152, 158, 164));
        jLabel6.setText("Product Name:");

        labelId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelId.setForeground(new java.awt.Color(255, 255, 255));

        btnDeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteProduct.setText("DELETE");
        btnDeleteProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnDeleteProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteProduct.setPreferredSize(new java.awt.Dimension(80, 40));
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        btnUpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateProduct.setText("UPDATE");
        btnUpdateProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnUpdateProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateProduct.setPreferredSize(new java.awt.Dimension(80, 40));
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(152, 158, 164));
        jLabel9.setText("Cost Price:");

        txtFieldCostPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCostPriceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(152, 158, 164));
        jLabel10.setText("R$");

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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(152, 158, 164));
        jLabel13.setText("Category:");

        comboBoxCategory.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxCategory.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoryActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(152, 158, 164));
        jLabel14.setText("Sub Category:");

        comboBoxSubCategory.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxSubCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxSubCategory.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxSubCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(152, 158, 164));
        jLabel15.setText("Size:");

        comboBoxSize.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxSize.setEditable(true);
        comboBoxSize.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxSize.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSizeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(152, 158, 164));
        jLabel11.setText("SUPPLIER:");

        labelSupplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSupplier.setForeground(new java.awt.Color(152, 158, 164));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBoxSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(50, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtFieldProductName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFieldCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel9))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFieldSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(checkBoxAvailableInStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11)
                        .addComponent(comboBoxSize, 0, 300, Short.MAX_VALUE)
                        .addComponent(labelSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFieldCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFieldSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(38, 38, 38)
                .addComponent(checkBoxAvailableInStock)
                .addGap(29, 29, 29)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(292, 292, 292))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        controller.removeProduct(this.selectedProduct);

        this.productTablePanel.getTableModel().removeObjectAtRowIndex(this.rowIndex);
        this.productTablePanel.updateTable();
        clearFields();
        disableButtonsIfNeeded();
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
//        this.selectedProduct.setCorporateName(txtFieldCorporateName.getText());
//        this.selectedProduct.setCnpj(txtFieldCnpj.getText());
//        this.selectedProduct.setEmail(txtFieldEmail.getText());

        controller.updateProduct(this.selectedProduct);
        this.productTablePanel.updateTable();
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    private void txtFieldCostPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCostPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCostPriceActionPerformed

    private void txtFieldSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSellingPriceActionPerformed

    private void checkBoxAvailableInStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAvailableInStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAvailableInStockActionPerformed

    private void comboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoryActionPerformed
        subCategoryComboBoxModel.removeAllElements();
        sizesComboBoxModel.removeAllElements();

        if(((String) comboBoxCategory.getSelectedItem()).contains("CLOTHES") 
                || comboBoxCategory.getSelectedItem() == null){
            comboBoxSubCategory.setEnabled(true);
            comboBoxSize.setEnabled(true);

            for(String subCategory: Product.SUB_CATEGORIES_CLOTHES){
                subCategoryComboBoxModel.addElement(subCategory);
            }

            for(String size: Product.SIZES_CLOTHES){
                sizesComboBoxModel.addElement(size);
            }

        } else{
            comboBoxSubCategory.setEnabled(false);
            comboBoxSize.setEnabled(false);
        }
    }//GEN-LAST:event_comboBoxCategoryActionPerformed

    private void comboBoxSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSizeActionPerformed

    private void disableButtonsIfNeeded(){
        if(labelId.getText().equals("")){
            btnDeleteProduct.setEnabled(false);
            btnUpdateProduct.setEnabled(false);
        }
    }
    
    private void enableButtons(){
        btnDeleteProduct.setEnabled(true);
        btnUpdateProduct.setEnabled(true);
    }
    
    private void clearFields(){
        labelId.setText("");
        txtFieldProductName.setText("");
        txtFieldCostPrice.setText("");
        txtFieldSellingPrice.setText("");
        checkBoxAvailableInStock.setSelected(false);
        comboBoxCategory.setSelectedIndex(-1);
        comboBoxSubCategory.setSelectedIndex(-1);
        comboBoxSize.setSelectedIndex(-1);
        labelSupplier.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JCheckBox checkBoxAvailableInStock;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JComboBox<String> comboBoxSize;
    private javax.swing.JComboBox<String> comboBoxSubCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelSupplier;
    private my_components.MyTextField1 txtFieldCostPrice;
    private my_components.MyTextField1 txtFieldProductName;
    private my_components.MyTextField1 txtFieldSellingPrice;
    // End of variables declaration//GEN-END:variables
}
