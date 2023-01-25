package view.product;

import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RelationalPanel;
import interfaces.TablePanel;

public class ProductPropertiesPanel extends javax.swing.JPanel implements RelationalPanel, PropertiesPanel{
    private FiltersPanel productFiltersPanel;
    private TablePanel productTablePanel;
    
    public ProductPropertiesPanel() {
        initComponents();
    }

    @Override
    public void setRelations(RelationalPanel productFiltersPanel, RelationalPanel productTablePanel) {
        this.productFiltersPanel = (FiltersPanel) productFiltersPanel;
        this.productTablePanel = (TablePanel) productTablePanel;
    }

    @Override
    public void showProperties(int rowIndex, Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(52, 58, 64));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
