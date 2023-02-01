package view.client;

import controller.ClientController;
import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RelationalPanel;
import interfaces.TablePanel;
import model.Client;

public class ClientPropertiesPanel extends javax.swing.JPanel implements RelationalPanel, PropertiesPanel{
    private FiltersPanel clientFiltersPanel;
    private TablePanel clientTablePanel;
    
    private ClientController controller;
    private Client selectedClient;
    private int rowIndex;
   
    
    public ClientPropertiesPanel() {
        initComponents();
        
        controller = new ClientController();
    }
    
    @Override
    public void setRelations(RelationalPanel clientFiltersPanel, RelationalPanel clientTablePanel){
        this.clientFiltersPanel = (FiltersPanel) clientFiltersPanel;
        this.clientTablePanel = (TablePanel) clientTablePanel;
    }

    @Override
    public void showProperties(int rowIndex, Object obj) {
        this.rowIndex = rowIndex;
        
        this.selectedClient = (Client) obj;
 
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(52, 58, 64));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
