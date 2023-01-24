package view.supplier;

import controller.SupplierController;
import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RelationalPanel;
import interfaces.TablePanel;
import model.Supplier;

public class SupplierPropertiesPanel extends javax.swing.JPanel implements RelationalPanel, PropertiesPanel{
    private FiltersPanel supplierFiltersPanel;
    private TablePanel supplierTablePanel;
    
    private SupplierController controller;
    private Supplier selectedSupplier;
    
    public SupplierPropertiesPanel() {
        initComponents();
        controller = new SupplierController();
    }
    
    @Override
    public void setRelations(RelationalPanel supplierFiltersPanel, RelationalPanel supplierTablePanel){
        this.supplierFiltersPanel = (FiltersPanel) supplierFiltersPanel;
        this.supplierTablePanel = (TablePanel) supplierTablePanel;
    }

    @Override
    public void showProperties(Object obj) {
        this.selectedSupplier = (Supplier) obj;
        labelId.setText(selectedSupplier.getId()+"");
        txtFieldCorporateName.setText(selectedSupplier.getCorporateName());
        txtFieldCnpj.setText(selectedSupplier.getCnpj());
        txtFieldEmail.setText(selectedSupplier.getEmail());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldCorporateName = new my_components.MyTextField1();
        jLabel4 = new javax.swing.JLabel();
        txtFieldCnpj = new my_components.MyTextField1();
        jLabel5 = new javax.swing.JLabel();
        txtFieldEmail = new my_components.MyTextField1();
        jLabel6 = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        btnDeleteSupllier = new javax.swing.JButton();
        btnUpdateSupllier1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(52, 58, 64));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 158, 164));
        jLabel1.setText("PROPERTIES");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(152, 158, 164));
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(152, 158, 164));
        jLabel4.setText("CNPJ:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(152, 158, 164));
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(152, 158, 164));
        jLabel6.setText("Corporate Name:");

        labelId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelId.setForeground(new java.awt.Color(255, 255, 255));

        btnDeleteSupllier.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteSupllier.setText("DELETE");
        btnDeleteSupllier.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnDeleteSupllier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteSupllier.setPreferredSize(new java.awt.Dimension(80, 40));
        btnDeleteSupllier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSupllierActionPerformed(evt);
            }
        });

        btnUpdateSupllier1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateSupllier1.setText("UPDATE");
        btnUpdateSupllier1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnUpdateSupllier1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateSupllier1.setPreferredSize(new java.awt.Dimension(80, 40));
        btnUpdateSupllier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSupllier1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnUpdateSupllier1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDeleteSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFieldCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFieldCorporateName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldCorporateName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateSupllier1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(638, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteSupllierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSupllierActionPerformed
        controller.removeSupplier(this.selectedSupplier);
        this.supplierTablePanel.updateTable();
    }//GEN-LAST:event_btnDeleteSupllierActionPerformed

    private void btnUpdateSupllier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSupllier1ActionPerformed
        this.supplierTablePanel.updateTable();
    }//GEN-LAST:event_btnUpdateSupllier1ActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteSupllier;
    private javax.swing.JButton btnUpdateSupllier1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelId;
    private my_components.MyTextField1 txtFieldCnpj;
    private my_components.MyTextField1 txtFieldCorporateName;
    private my_components.MyTextField1 txtFieldEmail;
    // End of variables declaration//GEN-END:variables

}
