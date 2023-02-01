package view.client;

import controller.ClientController;
import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RelationalPanel;
import interfaces.TablePanel;

public class ClientFiltersPanel extends javax.swing.JPanel implements RelationalPanel, FiltersPanel{
    //relations with other panels
    private TablePanel clientTablePanel;
    private PropertiesPanel clientPropertiesPanel;
    
    private ClientController controller;

    public ClientFiltersPanel() {  
        this.controller = new ClientController();
        
        initComponents();
    }

     @Override
    public void setRelations(RelationalPanel clientTablePanel, RelationalPanel clientPropertiesPanel){
        this.clientTablePanel = (TablePanel) clientTablePanel;
        this.clientPropertiesPanel = (PropertiesPanel) clientPropertiesPanel;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(52, 58, 64));
        setForeground(new java.awt.Color(51, 255, 204));
        setMinimumSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
