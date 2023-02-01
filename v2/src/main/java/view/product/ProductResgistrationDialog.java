package view.product;

import controller.ProductController;
import controller.SupplierController;
import interfaces.RegistrationDialog;
import interfaces.TablePanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Product;
import model.Supplier;

public class ProductResgistrationDialog extends javax.swing.JDialog implements RegistrationDialog{
    private final ProductController productController;
    private final SupplierController supplierController;
    private final TablePanel productTablePanel;
    
    private DefaultListModel<String> supplierListModel;
    
    private DefaultComboBoxModel<String> categoryComboBoxModel;
    private DefaultComboBoxModel<String> subCategoryComboBoxModel;
    private DefaultComboBoxModel<String> sizesComboBoxModel;
    
    public ProductResgistrationDialog(java.awt.Frame parent, boolean modal, TablePanel supplierTablePanel) {
        super(parent, modal);
        initComponents();
        
        this.productController = new ProductController();
        this.supplierController = new SupplierController();
        this.productTablePanel = supplierTablePanel;
        
        configureSupplierList();
        configureComboBoxes();
        
    }
    
    private void configureSupplierList(){
        supplierListModel = new DefaultListModel<>();
        listSupplier.setModel(supplierListModel);
        
        for(Supplier s: supplierController.getAllSuppliers()){
            supplierListModel.addElement(s.getId() + " - " + s.getCnpj() + " - " + s.getCorporateName());
        }
    }
    
    private void configureComboBoxes(){       
        categoryComboBoxModel = new DefaultComboBoxModel<>();
        subCategoryComboBoxModel = new DefaultComboBoxModel<>();
        sizesComboBoxModel = new DefaultComboBoxModel<>();
        
        comboBoxCategory.setModel(categoryComboBoxModel);
        comboBoxSubCategory.setModel(subCategoryComboBoxModel);
        comboBoxSize.setModel(sizesComboBoxModel);
        
        for(String category: Product.CATEGORIES){
            categoryComboBoxModel.addElement(category);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogScrollPane = new my_components.MyScrollPane1();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldProductName = new my_components.MyTextField1();
        jLabel3 = new javax.swing.JLabel();
        checkBoxAvailableInStock = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFieldSellingPrice = new my_components.MyTextField1();
        jLabel9 = new javax.swing.JLabel();
        txtFieldCostPrice = new my_components.MyTextField1();
        jLabel10 = new javax.swing.JLabel();
        btnRegisterProduct1 = new my_components.MyButton1();
        comboBoxCategory = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        comboBoxSubCategory = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        comboBoxSize = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        supplierListScrollPane16 = new my_components.MyScrollPane1();
        jPanel20 = new javax.swing.JPanel();
        listSupplier = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        txtFieldSupplierCorporateName = new my_components.MyTextField1();
        searchSupplier = new my_components.MyButton1();
        txtFieldSupplierCnpj = new my_components.MyTextField1();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRATION - SUPPLIER");
        setMaximumSize(new java.awt.Dimension(600, 800));
        setMinimumSize(new java.awt.Dimension(600, 800));

        dialogScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(52, 58, 64));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 1000));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 1000));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(152, 158, 164));
        jLabel2.setText("PRODUCT REGISTRATION");

        txtFieldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldProductNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(152, 158, 164));
        jLabel3.setText("Product Name:");

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

        btnRegisterProduct1.setText("REGISTER");
        btnRegisterProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterProduct1ActionPerformed(evt);
            }
        });

        comboBoxCategory.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxCategory.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoryActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(152, 158, 164));
        jLabel13.setText("Category:");

        comboBoxSubCategory.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxSubCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxSubCategory.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxSubCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(152, 158, 164));
        jLabel14.setText("Sub Category:");

        comboBoxSize.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxSize.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxSize.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSizeActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(152, 158, 164));
        jLabel15.setText("Size:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(152, 158, 164));
        jLabel16.setText("Supplier:");

        jPanel19.setBackground(new java.awt.Color(52, 58, 64));
        jPanel19.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(152, 158, 164)));

        supplierListScrollPane16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(152, 158, 154)));
        supplierListScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listSupplier.setBackground(new java.awt.Color(52, 58, 64));
        listSupplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listSupplier.setForeground(new java.awt.Color(152, 158, 164));
        listSupplier.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSupplier.setSelectionBackground(new java.awt.Color(40, 46, 58));
        listSupplier.setValueIsAdjusting(true);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 3000, Short.MAX_VALUE)
        );

        supplierListScrollPane16.setViewportView(jPanel20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(152, 158, 164));
        jLabel12.setText("Corporate Name:");

        txtFieldSupplierCorporateName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSupplierCorporateNameActionPerformed(evt);
            }
        });

        searchSupplier.setText("SEARCH");
        searchSupplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSupplierActionPerformed(evt);
            }
        });

        txtFieldSupplierCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSupplierCnpjActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(152, 158, 164));
        jLabel11.setText("CNPJ:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldSupplierCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldSupplierCorporateName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(supplierListScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(supplierListScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFieldSupplierCorporateName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtFieldSupplierCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13)
                                .addComponent(jLabel3)
                                .addComponent(txtFieldProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkBoxAvailableInStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtFieldCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtFieldSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(comboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addComponent(comboBoxSubCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addComponent(comboBoxSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnRegisterProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFieldCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFieldSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(51, 51, 51)
                .addComponent(checkBoxAvailableInStock)
                .addGap(50, 50, 50)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnRegisterProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        dialogScrollPane.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(null);

        setSize(new java.awt.Dimension(616, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldProductNameActionPerformed

    private void searchSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSupplierActionPerformed
        supplierListModel.clear();
        for(Supplier s: supplierController.getFilteredSuppliers(txtFieldSupplierCorporateName.getText(), txtFieldSupplierCnpj.getText(), "")){
            System.out.println(s.getCorporateName());
            supplierListModel.addElement(s.getId() + "   -   " + s.getCnpj() + "   -   " + s.getCorporateName());
        }
    }//GEN-LAST:event_searchSupplierActionPerformed

    private void checkBoxAvailableInStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAvailableInStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAvailableInStockActionPerformed

    private void txtFieldSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSellingPriceActionPerformed

    private void txtFieldCostPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCostPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCostPriceActionPerformed

    private void txtFieldSupplierCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSupplierCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSupplierCnpjActionPerformed

    private void txtFieldSupplierCorporateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSupplierCorporateNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSupplierCorporateNameActionPerformed

    private void btnRegisterProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterProduct1ActionPerformed
        int idSelectedSupplier = Integer.parseInt(listSupplier.getSelectedValue().split("-")[0].trim());

        Product p = productController.saveProduct(
                txtFieldProductName.getText(), // name
                txtFieldSellingPrice.getText(), // sellingPrice
                txtFieldCostPrice.getText(), // costPrice
                checkBoxAvailableInStock.isSelected(), // availableInStock
                (String) comboBoxCategory.getSelectedItem(), // category
                (String) comboBoxSubCategory.getSelectedItem(), // subcategory
                (String) comboBoxSize.getSelectedItem(), // size
                supplierController.getSupplierById(idSelectedSupplier) // supplier
        );
        
        int option = JOptionPane.showConfirmDialog(
                this, 
                "Wanna register another product?", 
                "PRODUCT REGISTERED SUCCESSFULLY!", 
                JOptionPane.YES_NO_OPTION);
        
        if(option != JOptionPane.YES_OPTION){
            this.dispose();
        } else{
            clearFields();
        }
        this.productTablePanel.getTableModel().addObject(p);
        this.productTablePanel.updateTable();
    }//GEN-LAST:event_btnRegisterProduct1ActionPerformed

    private void comboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoryActionPerformed
        subCategoryComboBoxModel.removeAllElements();
        sizesComboBoxModel.removeAllElements();
        
        if(((String) comboBoxCategory.getSelectedItem()).contains("CLOTHES")){
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private my_components.MyButton1 btnRegisterProduct1;
    private javax.swing.JCheckBox checkBoxAvailableInStock;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JComboBox<String> comboBoxSize;
    private javax.swing.JComboBox<String> comboBoxSubCategory;
    private my_components.MyScrollPane1 dialogScrollPane;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JList<String> listSupplier;
    private my_components.MyButton1 searchSupplier;
    private my_components.MyScrollPane1 supplierListScrollPane16;
    private my_components.MyTextField1 txtFieldCostPrice;
    private my_components.MyTextField1 txtFieldProductName;
    private my_components.MyTextField1 txtFieldSellingPrice;
    private my_components.MyTextField1 txtFieldSupplierCnpj;
    private my_components.MyTextField1 txtFieldSupplierCorporateName;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtFieldProductName.setText("");
        txtFieldCostPrice.setText("");
        txtFieldSellingPrice.setText("");
    }
}
