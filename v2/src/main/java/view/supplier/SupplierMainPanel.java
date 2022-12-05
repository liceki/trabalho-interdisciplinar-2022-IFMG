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
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1200, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void configurePanel() {
        this.supplierFiltersPanel = new SupplierFiltersPanel();
        this.supplierTablePanel = new SupplierTablePanel();
        this.supplierPropertiesPanel = new SupplierPropertiesPanel();
        
        this.add(supplierFiltersPanel);
        supplierFiltersPanel.setBounds(0, 0, 300, 800);
        
        this.add(supplierTablePanel);
        supplierTablePanel.setBounds(300, 0, 600, 800);
        
        this.add(supplierPropertiesPanel);
        supplierPropertiesPanel.setBounds(900, 0, 300, 800);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
