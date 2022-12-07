package view.product;

public class ProductMainPanel extends javax.swing.JPanel {
    ProductFiltersPanel productFiltersPanel;
    ProductTablePanel productTablePanel;
    ProductPropertiesPanel productPropertiesPanel;

    public ProductMainPanel() {
        initComponents();
        configurePanel();
    }

    private void configurePanel() {
        this.productFiltersPanel = new ProductFiltersPanel();
        this.productTablePanel = new ProductTablePanel();
        this.productPropertiesPanel = new ProductPropertiesPanel();

        this.add(productFiltersPanel);
        productFiltersPanel.setBounds(0, 0, 300, 800);

        this.add(productTablePanel);
        productTablePanel.setBounds(300, 0, 600, 800);

        this.add(productPropertiesPanel);
        productPropertiesPanel.setBounds(900, 0, 300, 800);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
