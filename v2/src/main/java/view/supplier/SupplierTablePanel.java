package view.supplier;

import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RegistrationDialog;
import interfaces.RelationalPanel;
import java.awt.Dimension;
import javax.swing.event.ListSelectionEvent;
import interfaces.TableModel;
import interfaces.TablePanel;
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
        int width = (secondDivider - firstDivider) - 80;
        this.jScrollPane7.setPreferredSize(new Dimension(width, jScrollPane7.getHeight()));
    }
    
    @Override
    public void configureTable(){
        this.tableModel = new SupplierTableModel();
        this.tableSupplier.setModel((SupplierTableModel) tableModel);
        
        
        tableSupplier.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            supplierPropertiesPanel.showProperties(tableModel.getObjectAtRowIndex(tableSupplier.getSelectedRow()));
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
        jButton1 = new javax.swing.JButton();
        scrollPanelTable = new my_components.MyScrollPane1();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableSupplier = new javax.swing.JTable();

        setBackground(new java.awt.Color(73, 80, 87));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 158, 164));
        jLabel1.setText("TABLE");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("ADD SUPPLIER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        scrollPanelTable.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPanelTable.setMinimumSize(new java.awt.Dimension(16, 20));

        tableSupplier.setAutoCreateRowSorter(true);
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
        jScrollPane7.setViewportView(tableSupplier);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollPanelTable.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.registrationDialog = new SupplierResgistrationDialog(SupplierMainPanel.parent, true, this);
        
        this.registrationDialog.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane7;
    private my_components.MyScrollPane1 scrollPanelTable;
    private javax.swing.JTable tableSupplier;
    // End of variables declaration//GEN-END:variables
}
