package view.client;

import java.awt.BorderLayout;

public class ClientMainPanel extends javax.swing.JPanel {
    ClientFiltersPanel clientFiltersPanel;
    ClientTablePanel clientTablePanel;
    ClientPropertiesPanel clientPropertiesPanel;
    
    
    public ClientMainPanel() {
        initComponents();
        configurePanel();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(0, 255, 204));
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
        this.clientFiltersPanel = new ClientFiltersPanel();
        this.clientTablePanel = new ClientTablePanel();
        this.clientPropertiesPanel = new ClientPropertiesPanel();
        
        this.add(clientFiltersPanel);
        clientFiltersPanel.setBounds(0, 0, 400, 800);
        
        this.add(clientTablePanel);
        clientTablePanel.setBounds(400, 0, 400, 800);
        
        this.add(clientPropertiesPanel);
        clientPropertiesPanel.setBounds(800, 0, 1200, 800);
        
        
        //this.clientTablePanel.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
