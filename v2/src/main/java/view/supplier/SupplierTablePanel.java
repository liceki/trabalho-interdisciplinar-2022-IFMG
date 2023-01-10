package view.supplier;

import table_model.SupplierTableModel;

public class SupplierTablePanel extends javax.swing.JPanel {
    //relations with other panels
    private SupplierFiltersPanel supplierFiltersPanel;
    private SupplierPropertiesPanel supplierPropertiesPanel;
    
    private SupplierResgistrationDialog supplierRegistrationPane;
    SupplierTableModel tableModel;
   
    public SupplierTablePanel() {
        initComponents();
        configureTable();
    }
    
    public void setRelations(SupplierFiltersPanel supplierFiltersPanel, SupplierPropertiesPanel supplierPropertiesPanel){
        this.supplierFiltersPanel = supplierFiltersPanel;
        this.supplierPropertiesPanel = supplierPropertiesPanel;
    }
    
    private void configureTable(){
        this.tableModel = new SupplierTableModel();
        this.tableSupplier.setModel(tableModel);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSupplier = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(73, 80, 87));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 158, 164));
        jLabel1.setText("TABLE");

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
        jScrollPane1.setViewportView(tableSupplier);
        if (tableSupplier.getColumnModel().getColumnCount() > 0) {
            tableSupplier.getColumnModel().getColumn(0).setMinWidth(80);
            tableSupplier.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableSupplier.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("ADD SUPPLIER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.supplierRegistrationPane = new SupplierResgistrationDialog(
                SupplierMainPanel.parent, true, this.tableModel, this.tableSupplier);
        this.supplierRegistrationPane.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable tableSupplier;
    // End of variables declaration//GEN-END:variables
}
