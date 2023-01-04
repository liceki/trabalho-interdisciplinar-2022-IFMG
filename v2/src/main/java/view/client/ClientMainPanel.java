package view.client;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class ClientMainPanel extends javax.swing.JPanel {
    JScrollPane clientFiltersPanel;
    JScrollPane clientTablePanel;
    JScrollPane clientPropertiesPanel;
    
    
    public ClientMainPanel() {
        initComponents();
        
        this.setLayout(new BorderLayout());
        
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
        this.clientFiltersPanel = new JScrollPane(new ClientFiltersPanel());
        this.clientTablePanel = new JScrollPane(new ClientTablePanel());
        this.clientPropertiesPanel = new JScrollPane(new ClientPropertiesPanel());
        
        this.add(clientFiltersPanel);
        clientFiltersPanel.setBounds(0, 0, 400, 1000);
        
        this.add(clientTablePanel);
        clientTablePanel.setBounds(400, 0, 800, 1000);
        
        this.add(clientPropertiesPanel);
        clientPropertiesPanel.setBounds(1200, 0, 400, 1000);
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
