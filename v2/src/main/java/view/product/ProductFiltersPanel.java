package view.product;

import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RelationalPanel;
import interfaces.TablePanel;

public class ProductFiltersPanel extends javax.swing.JPanel implements RelationalPanel, FiltersPanel {
    private TablePanel productTablePanel;
    private PropertiesPanel productPropertiesPanel;
    
    public ProductFiltersPanel() {
        initComponents();
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

    @Override
    public void setRelations(RelationalPanel productTablePanel, RelationalPanel productPropertiesPanel) {
        this.productTablePanel = (TablePanel) productTablePanel;
        this.productPropertiesPanel = (PropertiesPanel) productPropertiesPanel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
