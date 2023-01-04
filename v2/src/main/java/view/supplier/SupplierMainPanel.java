package view.supplier;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import my_components.MyScrollPane1;


public class SupplierMainPanel extends javax.swing.JPanel {
    MyScrollPane1 supplierFiltersPanel;
    MyScrollPane1 supplierTablePanel;
    MyScrollPane1 supplierPropertiesPanel;
    
    JSplitPane splitPaneFiltersTable;
    JSplitPane splitPaneFiltersTableProperties;
    
    
    public SupplierMainPanel() {
        initComponents();
        
        this.setLayout(new BorderLayout());
        
        configurePanel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(51, 255, 0));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

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
        this.supplierFiltersPanel = new MyScrollPane1(new SupplierFiltersPanel());
        this.supplierTablePanel = new MyScrollPane1(new SupplierTablePanel());
        this.supplierPropertiesPanel = new MyScrollPane1(new SupplierPropertiesPanel());
        
        this.splitPaneFiltersTable = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT, this.supplierFiltersPanel, this.supplierTablePanel);           
        this.splitPaneFiltersTable.setDividerLocation(400);
        
        this.splitPaneFiltersTableProperties = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT, splitPaneFiltersTable, this.supplierPropertiesPanel);           
        this.splitPaneFiltersTableProperties.setDividerLocation(1280);
        
        this.add(splitPaneFiltersTableProperties);
        
        //validate();
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
