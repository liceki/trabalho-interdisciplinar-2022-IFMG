package view.client;

import interfaces.FiltersPanel;
import interfaces.PropertiesPanel;
import interfaces.RegistrationDialog;
import interfaces.RelationalPanel;
import interfaces.TableModel;
import interfaces.TablePanel;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import table_model.ClientTableModel;

public class ClientTablePanel extends javax.swing.JPanel implements RelationalPanel, TablePanel{

    private FiltersPanel clientFiltersPanel;
    private PropertiesPanel clientPropertiesPanel;
    
    private RegistrationDialog registrationDialog;
    private TableModel tableModel;
    
    public ClientTablePanel() {
        initComponents();
        
        configureTable();
        btnRefreshTable.setIcon(new ImageIcon(getClass().getResource("/images/refresh-icon.png")));
    }

    @Override
    public void setRelations(RelationalPanel clientFiltersPanel, RelationalPanel clientPropertiesPanel){
        this.clientFiltersPanel = (FiltersPanel) clientFiltersPanel;
        this.clientPropertiesPanel = (PropertiesPanel) clientPropertiesPanel;
    }
    
    @Override
    public TableModel getTableModel() {
        return this.tableModel;
    }

    @Override
    public void updateTable() {
        this.tableClient.updateUI();
    }

    @Override
    public void resizeScrollPanelTable(int firstDivider, int secondDivider) {
        int width = (secondDivider - firstDivider) - 80;
        this.jScrollPane7.setPreferredSize(new Dimension(width, jScrollPane7.getHeight()));    }

    @Override
    public void configureTable() {
        this.tableModel = new ClientTableModel();
        this.tableClient.setModel((ClientTableModel) tableModel);
        
        
        tableClient.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            clientPropertiesPanel.showProperties(tableClient.getSelectedRow(),
                    tableModel.getObjectAtRowIndex(tableClient.getSelectedRow()));
        });
        
        this.tableClient.getColumnModel().getColumn(0).setPreferredWidth(70);
        this.tableClient.getColumnModel().getColumn(1).setPreferredWidth(250);
        this.tableClient.getColumnModel().getColumn(2).setPreferredWidth(100);
        this.tableClient.getColumnModel().getColumn(3).setPreferredWidth(250);
        this.tableClient.getColumnModel().getColumn(4).setPreferredWidth(100);
        this.tableClient.getColumnModel().getColumn(5).setPreferredWidth(100);
        this.tableClient.getColumnModel().getColumn(6).setPreferredWidth(100);
        this.tableClient.getColumnModel().getColumn(7).setPreferredWidth(100);
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAddClient = new javax.swing.JButton();
        scrollPanelTable = new my_components.MyScrollPane1();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        btnRefreshTable = new javax.swing.JButton();

        setBackground(new java.awt.Color(52, 58, 64));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(450, 800));
        setMinimumSize(new java.awt.Dimension(300, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 158, 164));
        jLabel1.setText("TABLE");

        btnAddClient.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddClient.setText("ADD CLIENT");
        btnAddClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClientActionPerformed(evt);
            }
        });

        scrollPanelTable.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPanelTable.setMinimumSize(new java.awt.Dimension(16, 20));

        tableClient.setAutoCreateRowSorter(true);
        tableClient.setBackground(new java.awt.Color(73, 80, 87));
        tableClient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableClient.setForeground(new java.awt.Color(255, 255, 255));
        tableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tableClient.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableClient.setFillsViewportHeight(true);
        tableClient.setFocusCycleRoot(true);
        tableClient.setMaximumSize(new java.awt.Dimension(1000, 999999));
        tableClient.setMinimumSize(new java.awt.Dimension(1000, 800));
        tableClient.setPreferredSize(new java.awt.Dimension(1000, 800));
        tableClient.setSelectionBackground(new java.awt.Color(52, 58, 64));
        tableClient.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableClient.setShowGrid(true);
        tableClient.setShowHorizontalLines(false);
        jScrollPane7.setViewportView(tableClient);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );

        scrollPanelTable.setViewportView(jPanel2);

        btnRefreshTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefreshTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddClient)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAddClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addComponent(scrollPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClientActionPerformed
        this.registrationDialog = new ClientResgistrationDialog(ClientMainPanel.parent, true, this);

        this.registrationDialog.setVisible(true);
    }//GEN-LAST:event_btnAddClientActionPerformed

    private void btnRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableActionPerformed
        this.tableModel.loadObjects();
        tableClient.updateUI();
    }//GEN-LAST:event_btnRefreshTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClient;
    private javax.swing.JButton btnRefreshTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane7;
    private my_components.MyScrollPane1 scrollPanelTable;
    private javax.swing.JTable tableClient;
    // End of variables declaration//GEN-END:variables
}
