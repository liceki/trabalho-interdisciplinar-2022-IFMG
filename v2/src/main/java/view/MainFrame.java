package view;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JPanel;
import view.client.ClientMainPanel;
import view.product.ProductMainPanel;
import view.supplier.SupplierMainPanel;

public class MainFrame extends javax.swing.JFrame {
    private ClientMainPanel clientMainPanel;
    private ProductMainPanel productMainPanel;
    private SupplierMainPanel supplierMainPanel;
    
    private Container content;
    
    public MainFrame() {
        initComponents();
        
        this.setLayout(new BorderLayout());
        this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        this.content = this.getContentPane();
        
        this.supplierMainPanel = new SupplierMainPanel(this);
        this.clientMainPanel = new ClientMainPanel();
        this.productMainPanel = new ProductMainPanel(this);
        
        changeContent(this.supplierMainPanel);
        
    }
    
    
    public void changeContent(JPanel panel){
        content.removeAll();
        
        //talvez o painel seja maior que o frame
        //entao vamos add barras de rolagem
        //JScrollPane painelBarraRolagem = new JScrollPane(painelNovo);
        
        content.add(panel);
        
        //refresh da interf. gráfica
        validate();
        //painel setado como visivel
        panel.setVisible(true);
        //render da tela como um todo.
        content.repaint();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemSuppliers = new javax.swing.JMenuItem();
        menuItemProducts = new javax.swing.JMenuItem();
        menuItemClients = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("interdisciplinar");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1600, 1000));
        setName("mainFrame"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1680, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("WINDOW");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuItemSuppliers.setText("SUPPLIERS");
        menuItemSuppliers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSuppliersActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSuppliers);

        menuItemProducts.setText("PRODUCTS");
        menuItemProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProductsActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemProducts);

        menuItemClients.setText("CLIENTS");
        menuItemClients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientsActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemClients);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProductsActionPerformed
        changeContent(this.productMainPanel);
    }//GEN-LAST:event_menuItemProductsActionPerformed

    private void menuItemSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSuppliersActionPerformed
        changeContent(this.supplierMainPanel);
    }//GEN-LAST:event_menuItemSuppliersActionPerformed

    private void menuItemClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientsActionPerformed
        changeContent(this.clientMainPanel);
    }//GEN-LAST:event_menuItemClientsActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuItemClients;
    private javax.swing.JMenuItem menuItemProducts;
    private javax.swing.JMenuItem menuItemSuppliers;
    // End of variables declaration//GEN-END:variables
}
