package view.client;

import controller.AddressController;
import controller.ClientController;
import interfaces.RegistrationDialog;
import interfaces.TablePanel;
import javax.swing.JOptionPane;
import model.Address;
import model.Client;
import tools.CpfAndCnpjValidator;


public class ClientResgistrationDialog extends javax.swing.JDialog implements RegistrationDialog{
    private final ClientController clientController;
    private final AddressController addressController;
    private final TablePanel clientTablePanel;
    
    public ClientResgistrationDialog(java.awt.Frame parent, boolean modal, TablePanel clientTablePanel) {
        super(parent, modal);
        initComponents();
        
        this.clientController = new ClientController();
        this.addressController = new AddressController();
        this.clientTablePanel = clientTablePanel;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogScrollPane = new my_components.MyScrollPane1();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldClientName = new my_components.MyTextField1();
        jLabel3 = new javax.swing.JLabel();
        btnRegisterClient = new my_components.MyButton1();
        comboBoxGender = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFieldCpf = new my_components.MyTextField1();
        jLabel5 = new javax.swing.JLabel();
        txtFieldEmail = new my_components.MyTextField1();
        txtFieldPhoneNumber = new my_components.MyTextField1();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        comboBoxYear = new javax.swing.JComboBox<>();
        comboBoxMonth = new javax.swing.JComboBox<>();
        comboBoxDay = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFieldState = new my_components.MyTextField1();
        jLabel9 = new javax.swing.JLabel();
        txtFieldCity = new my_components.MyTextField1();
        jLabel10 = new javax.swing.JLabel();
        txtFieldNeighbourhood = new my_components.MyTextField1();
        jLabel11 = new javax.swing.JLabel();
        txtFieldStreet = new my_components.MyTextField1();
        jLabel12 = new javax.swing.JLabel();
        txtFieldNumber = new my_components.MyTextField1();
        txtFieldZipCode = new my_components.MyTextField1();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRATION - SUPPLIER");
        setMaximumSize(new java.awt.Dimension(600, 800));
        setMinimumSize(new java.awt.Dimension(600, 800));

        dialogScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(52, 58, 64));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 1000));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 1000));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(152, 158, 164));
        jLabel2.setText("CLIENT REGISTRATION");

        txtFieldClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldClientNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(152, 158, 164));
        jLabel3.setText("Full Name:");

        btnRegisterClient.setText("REGISTER");
        btnRegisterClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterClientActionPerformed(evt);
            }
        });

        comboBoxGender.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxGender.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        comboBoxGender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGenderActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(152, 158, 164));
        jLabel15.setText("Gender:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(152, 158, 164));
        jLabel4.setText("CPF:");

        txtFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCpfActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(152, 158, 164));
        jLabel5.setText("Email:");

        txtFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEmailActionPerformed(evt);
            }
        });

        txtFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPhoneNumberActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(152, 158, 164));
        jLabel6.setText("Phone Number:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(152, 158, 164));
        jLabel7.setText("ADDRESS");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(152, 158, 164));
        jLabel16.setText("Birthdate:");

        comboBoxYear.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxYear.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        comboBoxYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxYearActionPerformed(evt);
            }
        });

        comboBoxMonth.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxMonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxMonth.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        comboBoxMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMonthActionPerformed(evt);
            }
        });

        comboBoxDay.setBackground(new java.awt.Color(52, 58, 64));
        comboBoxDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxDay.setForeground(new java.awt.Color(52, 58, 64));
        comboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        comboBoxDay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDayActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(152, 158, 164));
        jLabel17.setText("Year:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(152, 158, 164));
        jLabel18.setText("Month:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(152, 158, 164));
        jLabel19.setText("Day:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(152, 158, 164));
        jLabel8.setText("State:");

        txtFieldState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldStateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(152, 158, 164));
        jLabel9.setText("City:");

        txtFieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCityActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(152, 158, 164));
        jLabel10.setText("Neighbourhood:");

        txtFieldNeighbourhood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNeighbourhoodActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(152, 158, 164));
        jLabel11.setText("Street:");

        txtFieldStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldStreetActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(152, 158, 164));
        jLabel12.setText("Number:");

        txtFieldNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNumberActionPerformed(evt);
            }
        });

        txtFieldZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldZipCodeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(152, 158, 164));
        jLabel13.setText("Zip code");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(comboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(comboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(comboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(txtFieldClientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15)
                                        .addComponent(comboBoxGender, 0, 418, Short.MAX_VALUE)
                                        .addComponent(txtFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(txtFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel16)
                                    .addComponent(txtFieldState, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtFieldNeighbourhood, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(txtFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(118, 118, 118)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addComponent(txtFieldZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txtFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegisterClient, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldState, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldNeighbourhood, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnRegisterClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        dialogScrollPane.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(null);

        setSize(new java.awt.Dimension(616, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldClientNameActionPerformed

    private void btnRegisterClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterClientActionPerformed
        String cpf = txtFieldCpf.getText();
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        
        if(!CpfAndCnpjValidator.isCpf(cpf)){
            JOptionPane.showMessageDialog(this, "This CPF is invalid, try it again.", "INVALID CPF!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Address address = addressController.saveAddress(
                txtFieldState.getText(), 
                txtFieldCity.getText(), 
                txtFieldNeighbourhood.getText(), 
                txtFieldStreet.getText(), 
                txtFieldZipCode.getText(), 
                txtFieldNumber.getText()
        );
        
        Client cliente = clientController.saveClient(
                cpf, 
                txtFieldClientName.getText(), 
                txtFieldEmail.getText(),
                txtFieldPhoneNumber.getText(), 
                comboBoxGender.getSelectedItem(), 
                comboBoxYear.getSelectedItem(),
                comboBoxMonth.getSelectedItem(),
                comboBoxDay.getSelectedItem()
        );
        
        address.setClient(cliente);
        cliente.setAddress(address);
        
        addressController.updateAddress(address);
        clientController.updateClient(cliente);
        
        int option = JOptionPane.showConfirmDialog(
                this, 
                "Wanna register another client?", 
                "CLIENT REGISTERED SUCCESSFULLY!", 
                JOptionPane.YES_NO_OPTION);
        
        if(option != JOptionPane.YES_OPTION){
            this.dispose();
        } else{
            clearFields();
        }
        this.clientTablePanel.getTableModel().addObject(cliente);
        this.clientTablePanel.updateTable();
    }//GEN-LAST:event_btnRegisterClientActionPerformed

    private void comboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxGenderActionPerformed

    private void txtFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCpfActionPerformed

    private void txtFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEmailActionPerformed

    private void txtFieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPhoneNumberActionPerformed

    private void comboBoxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxYearActionPerformed

    private void comboBoxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxMonthActionPerformed

    private void comboBoxDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDayActionPerformed

    private void txtFieldStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldStateActionPerformed

    private void txtFieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCityActionPerformed

    private void txtFieldNeighbourhoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNeighbourhoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNeighbourhoodActionPerformed

    private void txtFieldStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldStreetActionPerformed

    private void txtFieldNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNumberActionPerformed

    private void txtFieldZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldZipCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private my_components.MyButton1 btnRegisterClient;
    private javax.swing.JComboBox<String> comboBoxDay;
    private javax.swing.JComboBox<String> comboBoxGender;
    private javax.swing.JComboBox<String> comboBoxMonth;
    private javax.swing.JComboBox<String> comboBoxYear;
    private my_components.MyScrollPane1 dialogScrollPane;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private my_components.MyTextField1 txtFieldCity;
    private my_components.MyTextField1 txtFieldClientName;
    private my_components.MyTextField1 txtFieldCpf;
    private my_components.MyTextField1 txtFieldEmail;
    private my_components.MyTextField1 txtFieldNeighbourhood;
    private my_components.MyTextField1 txtFieldNumber;
    private my_components.MyTextField1 txtFieldPhoneNumber;
    private my_components.MyTextField1 txtFieldState;
    private my_components.MyTextField1 txtFieldStreet;
    private my_components.MyTextField1 txtFieldZipCode;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtFieldClientName.setText("");
//        txtFieldCostPrice.setText("");
//        txtFieldSellingPrice.setText("");
    }
}
