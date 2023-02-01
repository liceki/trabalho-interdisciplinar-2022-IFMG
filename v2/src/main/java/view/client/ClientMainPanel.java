package view.client;

import interfaces.MainPanel;
import interfaces.RelationalPanel;
import interfaces.TablePanel;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import my_components.MyScrollPane1;
import my_components.MySplitPane1;
import view.client.ClientFiltersPanel;
import view.client.ClientPropertiesPanel;
import view.client.ClientTablePanel;

public class ClientMainPanel extends javax.swing.JPanel implements MainPanel{
    public static JFrame parent;
    
    RelationalPanel filtersPanel;
    RelationalPanel tablePanel;
    RelationalPanel propertiesPanel;
    
    MySplitPane1 splitPaneFiltersTable;
    MySplitPane1 splitPaneFiltersTableProperties;
    
    
public ClientMainPanel(JFrame parent) {
        this.parent = parent;
        
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
        // inicializing the panels
        this.filtersPanel = new ClientFiltersPanel();
        this.tablePanel = new ClientTablePanel();
        this.propertiesPanel = new ClientPropertiesPanel();
        
        // setting relations between the panels
        filtersPanel.setRelations(tablePanel, propertiesPanel);
        tablePanel.setRelations(filtersPanel, propertiesPanel);
        propertiesPanel.setRelations(filtersPanel, tablePanel);
        
        // creating JSplitPane 1
        this.splitPaneFiltersTable = new MySplitPane1(
                this, 
                JSplitPane.HORIZONTAL_SPLIT, 
                new MyScrollPane1((JPanel) filtersPanel), 
                (JPanel) this.tablePanel);          
        this.splitPaneFiltersTable.setDividerLocation(400);
        
        // creating JSplitPane 2
        this.splitPaneFiltersTableProperties = new MySplitPane1(
                this, 
                JSplitPane.HORIZONTAL_SPLIT, splitPaneFiltersTable, 
                new MyScrollPane1((JPanel) propertiesPanel));           
        this.splitPaneFiltersTableProperties.setDividerLocation(1280);
        
        // adding the JSplitPane to the main panel
        this.add(splitPaneFiltersTableProperties);
        
        //validate();
    }
    
    @Override
    public void resizeComponents(){
        if(this.splitPaneFiltersTableProperties == null) return;
            
        int firstDividerLocation = this.splitPaneFiltersTable.getDividerLocation();
        int secondDividerLocation = this.splitPaneFiltersTableProperties.getDividerLocation();
        
        ((TablePanel)tablePanel).resizeScrollPanelTable(firstDividerLocation, secondDividerLocation);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
