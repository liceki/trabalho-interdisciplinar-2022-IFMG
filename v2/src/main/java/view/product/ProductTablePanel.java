package view.product;

import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RegistrationDialog;
import interfaces.RelationalPanel;
import interfaces.TableModel;
import interfaces.TablePanel;
import java.awt.Dimension;
import javax.swing.event.ListSelectionEvent;
import table_model.ProductTableModel;

public class ProductTablePanel extends javax.swing.JPanel implements RelationalPanel, TablePanel{
    private FiltersPanel productFiltersPanel;
    private PropertiesPanel productPropertiesPanel;
    
    private RegistrationDialog registrationDialog;
    private TableModel tableModel;
    
    public ProductTablePanel() {
        initComponents();
        
        configureTable();
    }

    @Override
    public void setRelations(RelationalPanel productFiltersPanel, RelationalPanel productPropertiesPanel){
        this.productFiltersPanel = (FiltersPanel) productFiltersPanel;
        this.productPropertiesPanel = (PropertiesPanel) productPropertiesPanel;
    }
    
    @Override
    public TableModel getTableModel() {
        return this.tableModel;
    }

    @Override
    public void updateTable() {
        this.tableProducts.updateUI();
    }

    @Override
    public void resizeScrollPanelTable(int firstDivider, int secondDivider) {
        int width = (secondDivider - firstDivider) - 80;
        this.jScrollPane7.setPreferredSize(new Dimension(width, jScrollPane7.getHeight()));    }

    @Override
    public void configureTable() {
        this.tableModel = new ProductTableModel();
        this.tableProducts.setModel((ProductTableModel) tableModel);
        
        
//        tableProduct.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
//            productPropertiesPanel.showProperties(tableProduct.getSelectedRow(),
//                    tableModel.getObjectAtRowIndex(tableProduct.getSelectedRow()));
//        });
//        
//        this.tableProduct.getColumnModel().getColumn(0).setPreferredWidth(100);
//        this.tableProduct.getColumnModel().getColumn(1).setPreferredWidth(300);
//        this.tableProduct.getColumnModel().getColumn(2).setPreferredWidth(150);
//        this.tableProduct.getColumnModel().getColumn(3).setPreferredWidth(350);
//        this.tableProduct.getColumnModel().getColumn(4).setPreferredWidth(100);
        
 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JButton();
        scrollPanelTable = new my_components.MyScrollPane1();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        btnRefreshTable = new javax.swing.JButton();

        setBackground(new java.awt.Color(73, 80, 87));

        jPanel1.setBackground(new java.awt.Color(73, 80, 87));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 158, 164));
        jLabel1.setText("TABLE");

        btnAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddProduct.setText("ADD PRODUCT");
        btnAddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        scrollPanelTable.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPanelTable.setMinimumSize(new java.awt.Dimension(16, 20));

        tableProducts.setAutoCreateRowSorter(true);
        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tableProducts.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableProducts.setFillsViewportHeight(true);
        tableProducts.setFocusCycleRoot(true);
        tableProducts.setMaximumSize(new java.awt.Dimension(1000, 999999));
        tableProducts.setMinimumSize(new java.awt.Dimension(1000, 800));
        tableProducts.setPreferredSize(new java.awt.Dimension(1000, 800));
        tableProducts.setSelectionBackground(new java.awt.Color(52, 58, 64));
        tableProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableProducts.setShowGrid(true);
        jScrollPane7.setViewportView(tableProducts);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollPanelTable.setViewportView(jPanel2);

        btnRefreshTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefreshTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddProduct)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addComponent(scrollPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 972, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        this.registrationDialog = new ProductResgistrationDialog(ProductMainPanel.parent, true, this);

        this.registrationDialog.setVisible(true);

    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshTableActionPerformed



    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnRefreshTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane7;
    private my_components.MyScrollPane1 scrollPanelTable;
    private javax.swing.JTable tableProducts;
    // End of variables declaration//GEN-END:variables
}
