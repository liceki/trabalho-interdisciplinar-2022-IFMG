package view.product;

import controller.ProductController;
import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RelationalPanel;
import interfaces.TablePanel;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import model.Product;
import view.MainFrame;

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
        
        controller = new ProductController();
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
        
        labelCnpjSupplier.setText(selectedProduct.getSupplier().getCnpj());
        labelCorporateNameSupplier.setText(selectedProduct.getSupplier().getCorporateName());
        
        enableButtons();   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldProductName = new my_components.MyTextField1();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFieldCostPrice = new my_components.MyTextField1();
        txtFieldSellingPrice = new my_components.MyTextField1();
        checkBoxAvailableInStock = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        comboBoxCategory = new javax.swing.JComboBox<>();
        comboBoxSubCategory = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        comboBoxSize = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelCnpjSupplier = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelCorporateNameSupplier = new javax.swing.JLabel();
        btnUpdateProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        labelId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(52, 58, 64));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 158, 164));
        jLabel1.setText("PROPERTIES");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(152, 158, 164));
        jLabel3.setText("ID:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(152, 158, 164));
        jLabel6.setText("Product Name:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(152, 158, 164));
        jLabel9.setText("Cost Price:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(152, 158, 164));
        jLabel7.setText("Selling Price:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(152, 158, 164));
        jLabel10.setText("R$");

        txtFieldCostPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCostPriceActionPerformed(evt);
            }
        });

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

        comboBoxSubCategory.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxSubCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxSubCategory.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxSubCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(152, 158, 164));
        jLabel14.setText("Sub Category:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(152, 158, 164));
        jLabel15.setText("Size:");

        comboBoxSize.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxSize.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxSize.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSizeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(152, 158, 164));
        jLabel8.setText("R$");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(152, 158, 164));
        jLabel11.setText("SUPPLIER:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(152, 158, 164));
        jLabel12.setText("CNPJ:");

        labelCnpjSupplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCnpjSupplier.setForeground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(152, 158, 164));
        jLabel16.setText("Corporate Name:");

        labelCorporateNameSupplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCorporateNameSupplier.setForeground(new java.awt.Color(255, 255, 255));

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

        labelId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelId.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldProductName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFieldCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFieldSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(checkBoxAvailableInStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(comboBoxSize, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboBoxSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCnpjSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelCorporateNameSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel13)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFieldCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCnpjSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCorporateNameSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
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
        labelCnpjSupplier.setText("");
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelCnpjSupplier;
    private javax.swing.JLabel labelCorporateNameSupplier;
    private javax.swing.JLabel labelId;
    private my_components.MyTextField1 txtFieldCostPrice;
    private my_components.MyTextField1 txtFieldProductName;
    private my_components.MyTextField1 txtFieldSellingPrice;
    // End of variables declaration//GEN-END:variables

    
}
