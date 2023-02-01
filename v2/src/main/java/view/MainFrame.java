package view;

import interfaces.RegistrationDialog;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.User;
import view.client.ClientMainPanel;
import view.user.UserLogin;
import view.product.ProductMainPanel;
import view.supplier.SupplierMainPanel;
import view.user.UserResgistrationDialog;

public class MainFrame extends javax.swing.JFrame {
    private ClientMainPanel clientMainPanel;
    private ProductMainPanel productMainPanel;
    private SupplierMainPanel supplierMainPanel;
    
    private Container content;
    private User user;
    
    public MainFrame() {
        initComponents();
        
        this.content = this.getContentPane();
        this.setLayout(new BorderLayout());
        this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        changeContent(new UserLogin(this));
        
    }

    public User getUser() {
        return user;
    }

    public void login(User user){
        this.user = user;
        
        configureFrame();
        if(user.getLogin().equals("admin")){
            this.menuItemRegisterUser.setVisible(true);
        }

        changeContent(new WelcomePanel(this));
    }
    

    public void configureFrame(){
        this.supplierMainPanel = new SupplierMainPanel(this);
        this.clientMainPanel = new ClientMainPanel(this);
        this.productMainPanel = new ProductMainPanel(this);
        this.menuItemRegisterUser.setVisible(false);
        
        menuBar.setBackground(Color.red);
        menuMenu.setIcon(new ImageIcon(getClass().getResource("/images/menu-icon.png")));
        menuItemSignOut.setIcon(new ImageIcon(getClass().getResource("/images/sign-out-icon.png")));
        menuItemProducts.setIcon(new ImageIcon(getClass().getResource("/images/product-icon.png")));
        menuItemSuppliers.setIcon(new ImageIcon(getClass().getResource("/images/supplier-icon.png")));
        menuItemRegisterUser.setIcon(new ImageIcon(getClass().getResource("/images/user-icon.png")));
        menuItemClients.setIcon(new ImageIcon(getClass().getResource("/images/client-icon.png")));
        menuItemInvoices.setIcon(new ImageIcon(getClass().getResource("/images/invoice-icon.png")));
    }
    
    
    public void changeContent(JPanel newPanel){
        menuBar.setVisible(true);
        
        if(newPanel instanceof UserLogin) menuBar.setVisible(false);;
        
        content.removeAll();
        
        content.add(newPanel);
        
        validate();
        newPanel.setVisible(true);
        content.repaint();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuMenu = new javax.swing.JMenu();
        menuItemRegisterUser = new javax.swing.JMenuItem();
        menuItemSignOut = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuItemSuppliers = new javax.swing.JMenuItem();
        menuItemProducts = new javax.swing.JMenuItem();
        menuItemClients = new javax.swing.JMenuItem();
        menuItemInvoices = new javax.swing.JMenuItem();

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

        menuMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuItemRegisterUser.setText("REGISTER USER");
        menuItemRegisterUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegisterUserActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemRegisterUser);

        menuItemSignOut.setText("SIGN OUT");
        menuItemSignOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSignOutActionPerformed(evt);
            }
        });
        menuMenu.add(menuItemSignOut);

        menuBar.add(menuMenu);

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

        menuItemInvoices.setText("INVOICES");
        menuItemInvoices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.add(menuItemInvoices);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

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

    private void menuItemSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSignOutActionPerformed
        this.menuBar.setVisible(false);
        changeContent(new UserLogin(this));
    }//GEN-LAST:event_menuItemSignOutActionPerformed

    private void menuItemRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegisterUserActionPerformed
        RegistrationDialog registrationDialog = new UserResgistrationDialog(this, true);
        registrationDialog.setVisible(true);
    }//GEN-LAST:event_menuItemRegisterUserActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemClients;
    private javax.swing.JMenuItem menuItemInvoices;
    private javax.swing.JMenuItem menuItemProducts;
    private javax.swing.JMenuItem menuItemRegisterUser;
    private javax.swing.JMenuItem menuItemSignOut;
    private javax.swing.JMenuItem menuItemSuppliers;
    private javax.swing.JMenu menuMenu;
    // End of variables declaration//GEN-END:variables
}
