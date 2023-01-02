package view.supplier;

public class SupplierMainPanel extends javax.swing.JPanel {
    SupplierFiltersPanel supplierFiltersPanel;
    SupplierTablePanel supplierTablePanel;
    SupplierPropertiesPanel supplierPropertiesPanel;
    
    
    public SupplierMainPanel() {
        initComponents();
        configurePanel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1600, 1000));
        setMinimumSize(new java.awt.Dimension(1600, 1000));
        setPreferredSize(new java.awt.Dimension(1600, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void configurePanel() {
        this.supplierFiltersPanel = new SupplierFiltersPanel();
        this.supplierTablePanel = new SupplierTablePanel();
        this.supplierPropertiesPanel = new SupplierPropertiesPanel();
        
        this.add(supplierFiltersPanel);
        supplierFiltersPanel.setBounds(0, 0, 400, 1000);
        
        this.add(supplierTablePanel);
        supplierTablePanel.setBounds(400, 0, 800, 1000);
        
        this.add(supplierPropertiesPanel);
        supplierPropertiesPanel.setBounds(1200, 0, 400, 1000);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
