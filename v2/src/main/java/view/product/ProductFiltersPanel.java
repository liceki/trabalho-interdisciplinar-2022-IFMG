package view.product;

import controller.ProductController;
import controller.SupplierController;
import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RelationalPanel;
import interfaces.TablePanel;
import java.math.BigDecimal;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import model.Product;
import model.Supplier;

public class ProductFiltersPanel extends javax.swing.JPanel implements RelationalPanel, FiltersPanel {
    private TablePanel productTablePanel;
    private PropertiesPanel productPropertiesPanel;
    
    private ProductController productController;
    private SupplierController supplierController;
    
    private DefaultListModel<String> supplierListModel;
    
    private DefaultComboBoxModel<String> categoryComboBoxModel;
    private DefaultComboBoxModel<String> subCategoryComboBoxModel;
    private DefaultComboBoxModel<String> sizesComboBoxModel;
    
    public ProductFiltersPanel() {
        initComponents();
        
        this.supplierController = new SupplierController();
        this.productController = new ProductController();
        
        configureSupplierList();
        configureComboBoxes();
        
        System.out.println("\n"+comboBoxCategory.getSelectedIndex());
        System.out.println(comboBoxCategory.getSelectedItem()+"\n");
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
        
        comboBoxCategory.setSelectedIndex(-1);
        comboBoxSubCategory.setSelectedIndex(-1);
        comboBoxSize.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFilterResultsProduct = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        comboBoxSize = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboBoxSubCategory = new javax.swing.JComboBox<>();
        comboBoxCategory = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        checkBoxAvailableInStock = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldProductName = new my_components.MyTextField1();
        jLabel9 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        supplierListScrollPane16 = new my_components.MyScrollPane1();
        jPanel20 = new javax.swing.JPanel();
        listSupplier = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        txtFieldSupplierCorporateName = new my_components.MyTextField1();
        searchSupplier = new my_components.MyButton1();
        txtFieldSupplierCnpj = new my_components.MyTextField1();
        jLabel17 = new javax.swing.JLabel();
        sliderMinCostPrice = new javax.swing.JSlider();
        jLabel10 = new javax.swing.JLabel();
        sliderMaxCostPrice = new javax.swing.JSlider();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        sliderMinSellingPrice = new javax.swing.JSlider();
        jLabel26 = new javax.swing.JLabel();
        sliderMaxSellingPrice = new javax.swing.JSlider();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        sliderMinProfit = new javax.swing.JSlider();
        jLabel33 = new javax.swing.JLabel();
        sliderMaxProfit = new javax.swing.JSlider();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        labelMinCostPrice = new javax.swing.JLabel();
        labelMinSellingPrice = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        labelMinProfit = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        labelMaxCostPrice = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        labelMaxSellingPrice = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        labelMaxProfit = new javax.swing.JLabel();

        setBackground(new java.awt.Color(52, 58, 64));

        btnFilterResultsProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFilterResultsProduct.setText("FILTER RESULTS");
        btnFilterResultsProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnFilterResultsProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFilterResultsProduct.setPreferredSize(new java.awt.Dimension(80, 40));
        btnFilterResultsProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterResultsProductActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(152, 158, 164));
        jLabel11.setText("SUPPLIER:");

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

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(152, 158, 164));
        jLabel14.setText("Sub Category:");

        comboBoxSubCategory.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxSubCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxSubCategory.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxSubCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 158, 164));
        jLabel1.setText("FILTERS");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(152, 158, 164));
        jLabel6.setText("Product Name:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(152, 158, 164));
        jLabel9.setText("Cost Price:");

        jPanel19.setBackground(new java.awt.Color(52, 58, 64));
        jPanel19.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(152, 158, 164)));

        supplierListScrollPane16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(152, 158, 154)));
        supplierListScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listSupplier.setBackground(new java.awt.Color(52, 58, 64));
        listSupplier.setForeground(new java.awt.Color(204, 204, 204));
        listSupplier.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSupplier.setSelectionBackground(new java.awt.Color(40, 46, 58));
        listSupplier.setValueIsAdjusting(true);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(listSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 2443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(152, 158, 164));
        jLabel17.setText("CNPJ:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtFieldSupplierCorporateName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(supplierListScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
            .addComponent(txtFieldSupplierCnpj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(searchSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(supplierListScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(10, 10, 10)
                .addComponent(txtFieldSupplierCorporateName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldSupplierCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(searchSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sliderMinCostPrice.setBackground(new java.awt.Color(52, 58, 64));
        sliderMinCostPrice.setMaximum(500);
        sliderMinCostPrice.setValue(0);
        sliderMinCostPrice.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderMinCostPriceMouseDragged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(152, 158, 164));
        jLabel10.setText("Min: R$");

        sliderMaxCostPrice.setBackground(new java.awt.Color(52, 58, 64));
        sliderMaxCostPrice.setMaximum(500);
        sliderMaxCostPrice.setValue(500);
        sliderMaxCostPrice.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderMaxCostPriceMouseDragged(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(152, 158, 164));
        jLabel18.setText("0");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(152, 158, 164));
        jLabel19.setText("0");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(152, 158, 164));
        jLabel20.setText("500");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(152, 158, 164));
        jLabel21.setText("500");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(152, 158, 164));
        jLabel22.setText("Selling Price:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(152, 158, 164));
        jLabel24.setText("0");

        sliderMinSellingPrice.setBackground(new java.awt.Color(52, 58, 64));
        sliderMinSellingPrice.setMaximum(500);
        sliderMinSellingPrice.setValue(0);
        sliderMinSellingPrice.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderMinSellingPriceMouseDragged(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(152, 158, 164));
        jLabel26.setText("0");

        sliderMaxSellingPrice.setBackground(new java.awt.Color(52, 58, 64));
        sliderMaxSellingPrice.setMaximum(500);
        sliderMaxSellingPrice.setValue(500);
        sliderMaxSellingPrice.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderMaxSellingPriceMouseDragged(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(152, 158, 164));
        jLabel27.setText("500");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(152, 158, 164));
        jLabel28.setText("500");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(152, 158, 164));
        jLabel29.setText("Profit");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(152, 158, 164));
        jLabel31.setText("0");

        sliderMinProfit.setBackground(new java.awt.Color(52, 58, 64));
        sliderMinProfit.setMaximum(500);
        sliderMinProfit.setValue(0);
        sliderMinProfit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderMinProfitMouseDragged(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(152, 158, 164));
        jLabel33.setText("0");

        sliderMaxProfit.setBackground(new java.awt.Color(52, 58, 64));
        sliderMaxProfit.setMaximum(500);
        sliderMaxProfit.setValue(500);
        sliderMaxProfit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderMaxProfitMouseDragged(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(152, 158, 164));
        jLabel34.setText("500");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(152, 158, 164));
        jLabel35.setText("500");

        labelMinCostPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMinCostPrice.setForeground(new java.awt.Color(152, 158, 164));
        labelMinCostPrice.setText("0");

        labelMinSellingPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMinSellingPrice.setForeground(new java.awt.Color(152, 158, 164));
        labelMinSellingPrice.setText("0");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(152, 158, 164));
        jLabel36.setText("Min: R$");

        labelMinProfit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMinProfit.setForeground(new java.awt.Color(152, 158, 164));
        labelMinProfit.setText("0");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(152, 158, 164));
        jLabel37.setText("Min: R$");

        labelMaxCostPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMaxCostPrice.setForeground(new java.awt.Color(152, 158, 164));
        labelMaxCostPrice.setText("500");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(152, 158, 164));
        jLabel38.setText("Max: R$");

        labelMaxSellingPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMaxSellingPrice.setForeground(new java.awt.Color(152, 158, 164));
        labelMaxSellingPrice.setText("500");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(152, 158, 164));
        jLabel39.setText("Max: R$");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(152, 158, 164));
        jLabel40.setText("Max: R$");

        labelMaxProfit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMaxProfit.setForeground(new java.awt.Color(152, 158, 164));
        labelMaxProfit.setText("500");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFieldProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(checkBoxAvailableInStock, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(comboBoxSize, 0, 300, Short.MAX_VALUE)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(comboBoxSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel13)
                                            .addComponent(btnFilterResultsProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelMinCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel19)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sliderMaxCostPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel18)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sliderMinCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel26)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sliderMaxSellingPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel24)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sliderMinSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel22)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel33)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sliderMaxProfit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel31)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sliderMinProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel29)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel36)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelMinSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel37)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelMinProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel38)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelMaxCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel39)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelMaxSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel40)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelMaxProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMinCostPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sliderMinCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMaxCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sliderMaxCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addGap(30, 30, 30)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMinSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sliderMinSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel28))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMaxSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sliderMaxSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addGap(30, 30, 30)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMinProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sliderMinProfit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel35))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMaxProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sliderMaxProfit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGap(30, 30, 30)
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
                .addGap(75, 75, 75)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnFilterResultsProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxAvailableInStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAvailableInStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAvailableInStockActionPerformed

    private void comboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoryActionPerformed
        subCategoryComboBoxModel.removeAllElements();
        sizesComboBoxModel.removeAllElements();

        if(comboBoxCategory.getSelectedItem() == null) return;
        
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

    private void btnFilterResultsProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterResultsProductActionPerformed
        int idSelectedSupplier = 0;
        
        if(!listSupplier.isSelectionEmpty()){
            idSelectedSupplier = Integer.parseInt(listSupplier.getSelectedValue().split("-")[0].trim());
        }

        productTablePanel.getTableModel().setResults(
            productController.getFilteredProducts(
                    sliderMinCostPrice.getValue(), 
                    sliderMaxCostPrice.getValue(), 
                    sliderMinSellingPrice.getValue(), 
                    sliderMaxSellingPrice.getValue(), 
                    sliderMinProfit.getValue(), 
                    sliderMaxProfit.getValue(), 
                    
                    txtFieldProductName.getText(), 
                    checkBoxAvailableInStock.isSelected(), 
                    
                    comboBoxCategory.getSelectedItem(), 
                    comboBoxSubCategory.getSelectedItem(), 
                    comboBoxSize.getSelectedItem(), 
                    
                    idSelectedSupplier
            )
        );

        
        this.productTablePanel.updateTable();
    }//GEN-LAST:event_btnFilterResultsProductActionPerformed

    private void txtFieldSupplierCorporateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSupplierCorporateNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSupplierCorporateNameActionPerformed

    private void searchSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSupplierActionPerformed
        supplierListModel.clear();
        for(Supplier s: supplierController.getFilteredSuppliers(txtFieldSupplierCorporateName.getText(), txtFieldSupplierCnpj.getText(), "")){
            System.out.println(s.getCorporateName());
            supplierListModel.addElement(s.getId() + "   -   " + s.getCnpj() + "   -   " + s.getCorporateName());
        }
    }//GEN-LAST:event_searchSupplierActionPerformed

    private void txtFieldSupplierCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSupplierCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSupplierCnpjActionPerformed

    private void sliderMinCostPriceMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMinCostPriceMouseDragged
        int minCostPrice = sliderMinCostPrice.getValue();
        int maxCostPrice = sliderMaxCostPrice.getValue();
        if(minCostPrice >= maxCostPrice){
            sliderMinCostPrice.setValue(maxCostPrice);
        }else{
            labelMinCostPrice.setText(""+minCostPrice);
        }
    }//GEN-LAST:event_sliderMinCostPriceMouseDragged

    private void sliderMaxCostPriceMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMaxCostPriceMouseDragged
        int minCostPrice = sliderMinCostPrice.getValue();
        int maxCostPrice = sliderMaxCostPrice.getValue();
        
        if(minCostPrice >= maxCostPrice){
            sliderMaxCostPrice.setValue(minCostPrice);
        }else{
            labelMaxCostPrice.setText(""+maxCostPrice);
        }
    }//GEN-LAST:event_sliderMaxCostPriceMouseDragged

    private void sliderMinSellingPriceMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMinSellingPriceMouseDragged
        int minSellingPrice = sliderMinSellingPrice.getValue();
        int maxSellingPrice = sliderMaxSellingPrice.getValue();
        if(minSellingPrice >= maxSellingPrice){
            sliderMinSellingPrice.setValue(maxSellingPrice);
        }else{
            labelMinSellingPrice.setText(""+minSellingPrice);
        }
    }//GEN-LAST:event_sliderMinSellingPriceMouseDragged

    private void sliderMaxSellingPriceMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMaxSellingPriceMouseDragged
        int minSellingPrice = sliderMinSellingPrice.getValue();
        int maxSellingPrice = sliderMaxSellingPrice.getValue();
        
        if(minSellingPrice >= maxSellingPrice){
            sliderMaxSellingPrice.setValue(minSellingPrice);
        }else{
            labelMaxSellingPrice.setText(""+maxSellingPrice);
        }
    }//GEN-LAST:event_sliderMaxSellingPriceMouseDragged

    private void sliderMinProfitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMinProfitMouseDragged
        int minProfit = sliderMinProfit.getValue();
        int maxProfit = sliderMaxProfit.getValue();
        if(minProfit >= maxProfit){
            sliderMinProfit.setValue(maxProfit);
        }else{
            labelMinProfit.setText(""+minProfit);
        }
    }//GEN-LAST:event_sliderMinProfitMouseDragged

    private void sliderMaxProfitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMaxProfitMouseDragged
        int minProfit = sliderMinProfit.getValue();
        int maxProfit = sliderMaxProfit.getValue();
        
        if(minProfit >= maxProfit){
            sliderMaxProfit.setValue(minProfit);
        }else{
            labelMaxProfit.setText(""+maxProfit);
        }
    }//GEN-LAST:event_sliderMaxProfitMouseDragged

    @Override
    public void setRelations(RelationalPanel productTablePanel, RelationalPanel productPropertiesPanel) {
        this.productTablePanel = (TablePanel) productTablePanel;
        this.productPropertiesPanel = (PropertiesPanel) productPropertiesPanel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilterResultsProduct;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JLabel labelMaxCostPrice;
    private javax.swing.JLabel labelMaxProfit;
    private javax.swing.JLabel labelMaxSellingPrice;
    private javax.swing.JLabel labelMinCostPrice;
    private javax.swing.JLabel labelMinProfit;
    private javax.swing.JLabel labelMinSellingPrice;
    private javax.swing.JList<String> listSupplier;
    private my_components.MyButton1 searchSupplier;
    private javax.swing.JSlider sliderMaxCostPrice;
    private javax.swing.JSlider sliderMaxProfit;
    private javax.swing.JSlider sliderMaxSellingPrice;
    private javax.swing.JSlider sliderMinCostPrice;
    private javax.swing.JSlider sliderMinProfit;
    private javax.swing.JSlider sliderMinSellingPrice;
    private my_components.MyScrollPane1 supplierListScrollPane16;
    private my_components.MyTextField1 txtFieldProductName;
    private my_components.MyTextField1 txtFieldSupplierCnpj;
    private my_components.MyTextField1 txtFieldSupplierCorporateName;
    // End of variables declaration//GEN-END:variables
}
