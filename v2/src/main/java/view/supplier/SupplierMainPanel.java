package view.supplier;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import my_components.MyScrollPane1;


public class SupplierMainPanel extends javax.swing.JPanel {
    public static JFrame parent;
    
    MyScrollPane1 supplierFiltersScrollPane;
    MyScrollPane1 supplierTableScrollPane;
    MyScrollPane1 supplierPropertiesScrollPane;
    
    JSplitPane splitPaneFiltersTable;
    JSplitPane splitPaneFiltersTableProperties;
    
    
    public SupplierMainPanel(JFrame parent) {
        this.parent = parent;
        
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
        SupplierFiltersPanel supplierFiltersPanel = new SupplierFiltersPanel();
        SupplierTablePanel supplierTablePanel = new SupplierTablePanel();
        SupplierPropertiesPanel supplierPropertiesPanel = new SupplierPropertiesPanel();
        
        
        supplierFiltersPanel.setRelations(supplierTablePanel, supplierPropertiesPanel);
        supplierTablePanel.setRelations(supplierFiltersPanel, supplierPropertiesPanel);
        supplierPropertiesPanel.setRelations(supplierFiltersPanel, supplierTablePanel);
        
        this.supplierFiltersScrollPane = new MyScrollPane1(supplierFiltersPanel);
        this.supplierTableScrollPane = new MyScrollPane1(supplierTablePanel);
        this.supplierPropertiesScrollPane = new MyScrollPane1(supplierPropertiesPanel);
        
        this.splitPaneFiltersTable = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT, this.supplierFiltersScrollPane, this.supplierTableScrollPane);           
        this.splitPaneFiltersTable.setDividerLocation(400);
        
        this.splitPaneFiltersTableProperties = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT, splitPaneFiltersTable, this.supplierPropertiesScrollPane);           
        this.splitPaneFiltersTableProperties.setDividerLocation(1280);
        
        this.add(splitPaneFiltersTableProperties);
        
        //validate();
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
