package view.product;

import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RelationalPanel;
import interfaces.TableModel;
import interfaces.TablePanel;

public class ProductTablePanel extends javax.swing.JPanel implements RelationalPanel, TablePanel{
    private FiltersPanel productFiltersPanel;
    private PropertiesPanel productPropertiesPanel;
    
    public ProductTablePanel() {
        initComponents();
    }

    @Override
    public void setRelations(RelationalPanel productFiltersPanel, RelationalPanel productPropertiesPanel){
        this.productFiltersPanel = (FiltersPanel) productFiltersPanel;
        this.productPropertiesPanel = (PropertiesPanel) productPropertiesPanel;
    }
    
    @Override
    public TableModel getTableModel() {
        throw new UnsupportedOperationException("Not supported yet.");     }

    @Override
    public void updateTable() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void resizeScrollPanelTable(int firstDivider, int secondDivider) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void configureTable() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(73, 80, 87));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents



    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
