package view.supplier;

import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RegistrationDialog;
import interfaces.RelationalPanel;
import java.awt.Dimension;
import javax.swing.event.ListSelectionEvent;
import interfaces.TableModel;
import interfaces.TablePanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import table_model.SupplierTableModel;

public class SupplierTablePanel extends javax.swing.JPanel implements RelationalPanel, TablePanel{
    //relations with other panels
    private FiltersPanel supplierFiltersPanel;
    private PropertiesPanel supplierPropertiesPanel;
    
    private RegistrationDialog registrationDialog;
    private TableModel tableModel;
   
    public SupplierTablePanel() {
        initComponents();
        configureTable();
        System.out.println(getClass());
        btnRefreshTable.setIcon(new ImageIcon(getClass().getResource("/images/refresh-icon.png")));
    }
    
    @Override
    public void setRelations(RelationalPanel supplierFiltersPanel, RelationalPanel supplierPropertiesPanel){
        this.supplierFiltersPanel = (FiltersPanel) supplierFiltersPanel;
        this.supplierPropertiesPanel = (PropertiesPanel) supplierPropertiesPanel;
    }
    
    @Override
    public TableModel getTableModel() {
        return this.tableModel;
    }

    @Override
    public void updateTable() {
        this.tableSupplier.revalidate();
        this.tableSupplier.updateUI();
    }

    @Override
    public void resizeScrollPanelTable(int firstDivider, int secondDivider){
        if(jScrollPane7.getPreferredSize().getWidth() == tableSupplier.getPreferredSize().getWidth()) return;
        int width = (secondDivider - firstDivider) - 80;
        this.jScrollPane7.setPreferredSize(new Dimension(width, jScrollPane7.getHeight()));
    }
    
    @Override
    public void configureTable(){
        tableSupplier.getTableHeader().setBackground(new Color(52,58,64));
        
        this.tableModel = new SupplierTableModel();
        this.tableSupplier.setModel((SupplierTableModel) tableModel);
        
        
        tableSupplier.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            supplierPropertiesPanel.showProperties(tableSupplier.getSelectedRow(),
                    tableModel.getObjectAtRowIndex(tableSupplier.getSelectedRow()));
        });
        
        this.tableSupplier.getColumnModel().getColumn(0).setPreferredWidth(100);
        this.tableSupplier.getColumnModel().getColumn(1).setPreferredWidth(300);
        this.tableSupplier.getColumnModel().getColumn(2).setPreferredWidth(150);
        this.tableSupplier.getColumnModel().getColumn(3).setPreferredWidth(350);
        this.tableSupplier.getColumnModel().getColumn(4).setPreferredWidth(100);
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAddSupplier = new javax.swing.JButton();
        btnRefreshTable = new javax.swing.JButton();
        scrollPanelTable = new my_components.MyScrollPane1();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableSupplier = new javax.swing.JTable();

        setBackground(new java.awt.Color(52, 58, 64));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 158, 164));
        jLabel1.setText("TABLE");

        btnAddSupplier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddSupplier.setText("ADD SUPPLIER");
        btnAddSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });

        btnRefreshTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefreshTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableActionPerformed(evt);
            }
        });

        scrollPanelTable.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPanelTable.setMinimumSize(new java.awt.Dimension(16, 20));

        jScrollPane7.setViewportView(tableSupplier);

        tableSupplier.setAutoCreateRowSorter(true);
        tableSupplier.setBackground(new java.awt.Color(73, 80, 87));
        tableSupplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableSupplier.setForeground(new java.awt.Color(255, 255, 255));
        tableSupplier.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSupplier.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableSupplier.setFillsViewportHeight(true);
        tableSupplier.setFocusCycleRoot(true);
        tableSupplier.setMaximumSize(new java.awt.Dimension(1000, 999999));
        tableSupplier.setMinimumSize(new java.awt.Dimension(1000, 800));
        tableSupplier.setPreferredSize(new java.awt.Dimension(1000, 800));
        tableSupplier.setSelectionBackground(new java.awt.Color(52, 58, 64));
        tableSupplier.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSupplier.setShowGrid(true);
        tableSupplier.setShowHorizontalLines(false);
        jScrollPane7.setViewportView(tableSupplier);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        scrollPanelTable.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 517, Short.MAX_VALUE)
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddSupplier)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAddSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        this.registrationDialog = new SupplierResgistrationDialog(SupplierMainPanel.parent, true, this);
        
        this.registrationDialog.setVisible(true);
        
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void btnRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableActionPerformed
        this.tableModel.loadObjects();
        tableSupplier.updateUI();
    }//GEN-LAST:event_btnRefreshTableActionPerformed
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnRefreshTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane7;
    private my_components.MyScrollPane1 scrollPanelTable;
    private javax.swing.JTable tableSupplier;
    // End of variables declaration//GEN-END:variables
}
