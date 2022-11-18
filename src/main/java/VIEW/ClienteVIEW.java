package VIEW;


import DAO.ClienteDAO;
import DAO.EnderecoDAO;
import DTO.ClienteDTO;
import DTO.EnderecoDTO;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class ClienteVIEW extends javax.swing.JFrame {

    public ClienteVIEW() {
        initComponents();
        consultarClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAdicionarCliente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClienteEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtClienteCPF = new javax.swing.JTextField();
        txtClienteTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEnderecoRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEnderecoBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEnderecoEstado = new javax.swing.JTextField();
        txtEnderecoCidade = new javax.swing.JTextField();
        txtEnderecoNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnFecharJanelaClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1470, 660));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(150, 222, 100));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("CADASTRO DE CLIENTES");

        btnAdicionarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnAdicionarCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAdicionarCliente.setForeground(new java.awt.Color(255, 255, 0));
        btnAdicionarCliente.setText("Adicionar Cliente");
        btnAdicionarCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        btnAdicionarCliente.setContentAreaFilled(false);
        btnAdicionarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarClienteActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Nome");

        txtClienteNome.setBackground(new java.awt.Color(0, 0, 0));
        txtClienteNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtClienteNome.setForeground(new java.awt.Color(170, 170, 170));
        txtClienteNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Email");

        txtClienteEmail.setBackground(new java.awt.Color(0, 0, 0));
        txtClienteEmail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtClienteEmail.setForeground(new java.awt.Color(170, 170, 170));
        txtClienteEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtClienteEmail.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("CPF");

        txtClienteCPF.setBackground(new java.awt.Color(0, 0, 0));
        txtClienteCPF.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtClienteCPF.setForeground(new java.awt.Color(170, 170, 170));
        txtClienteCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtClienteCPF.setCaretColor(new java.awt.Color(255, 255, 255));

        txtClienteTelefone.setBackground(new java.awt.Color(0, 0, 0));
        txtClienteTelefone.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtClienteTelefone.setForeground(new java.awt.Color(170, 170, 170));
        txtClienteTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtClienteTelefone.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Telefone");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(txtClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtClienteCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtClienteTelefone))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("ENDEREÇO");

        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Rua");

        txtEnderecoRua.setBackground(new java.awt.Color(0, 0, 0));
        txtEnderecoRua.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEnderecoRua.setForeground(new java.awt.Color(170, 170, 170));
        txtEnderecoRua.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtEnderecoRua.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Bairro");

        txtEnderecoBairro.setBackground(new java.awt.Color(0, 0, 0));
        txtEnderecoBairro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEnderecoBairro.setForeground(new java.awt.Color(170, 170, 170));
        txtEnderecoBairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtEnderecoBairro.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Estado");

        txtEnderecoEstado.setBackground(new java.awt.Color(0, 0, 0));
        txtEnderecoEstado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEnderecoEstado.setForeground(new java.awt.Color(170, 170, 170));
        txtEnderecoEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtEnderecoEstado.setCaretColor(new java.awt.Color(255, 255, 255));

        txtEnderecoCidade.setBackground(new java.awt.Color(0, 0, 0));
        txtEnderecoCidade.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEnderecoCidade.setForeground(new java.awt.Color(170, 170, 170));
        txtEnderecoCidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtEnderecoCidade.setCaretColor(new java.awt.Color(255, 255, 255));

        txtEnderecoNumero.setBackground(new java.awt.Color(0, 0, 0));
        txtEnderecoNumero.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEnderecoNumero.setForeground(new java.awt.Color(170, 170, 170));
        txtEnderecoNumero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtEnderecoNumero.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Nº");

        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Cidade");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEnderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEnderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEnderecoCidade)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(txtEnderecoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185)))
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(txtEnderecoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        tblClientes.setBackground(new java.awt.Color(0, 0, 0));
        tblClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tblClientes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tblClientes.setForeground(new java.awt.Color(204, 204, 204));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "Email", "CPF", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setColumnSelectionAllowed(true);
        tblClientes.setFillsViewportHeight(true);
        tblClientes.setGridColor(new java.awt.Color(204, 204, 204));
        tblClientes.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblClientes.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tblClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblClientes.setShowGrid(false);
        tblClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblClientes);
        tblClientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(130);
            tblClientes.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblClientes.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        tblClientes.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                int cliente_id = Integer.parseInt(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0).toString());
                botoesAlterarRemover(cliente_id);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btnFecharJanelaClientes.setBackground(new java.awt.Color(0, 0, 0));
        btnFecharJanelaClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFecharJanelaClientes.setForeground(new java.awt.Color(255, 255, 0));
        btnFecharJanelaClientes.setText("FECHAR");
        btnFecharJanelaClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        btnFecharJanelaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharJanelaClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFecharJanelaClientes)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnFecharJanelaClientes)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
  
    // BOTÃO PARA ADICIONAR CLIENTE NO SISTEMA
    private void btnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarClienteActionPerformed
        //ArrayList<JTextField> 
        adicionarCliente();
        consultarClientes();
    }//GEN-LAST:event_btnAdicionarClienteActionPerformed

    private void btnFecharJanelaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharJanelaClientesActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharJanelaClientesActionPerformed

    public static void viewCliente() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnFecharJanelaClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteEmail;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtClienteTelefone;
    private javax.swing.JTextField txtEnderecoBairro;
    private javax.swing.JTextField txtEnderecoCidade;
    private javax.swing.JTextField txtEnderecoEstado;
    private javax.swing.JTextField txtEnderecoNumero;
    private javax.swing.JTextField txtEnderecoRua;
    // End of variables declaration//GEN-END:variables




    // CADASTRANDO CLIENTE NO SISTEMA 
    private void adicionarCliente(){
        ClienteDAO clientedao = new ClienteDAO();

        //Passando dados para classe DTO
        String nome, telefone, email, cpf;
        nome = txtClienteNome.getText();
        telefone = txtClienteTelefone.getText();
        email = txtClienteEmail.getText();
        cpf = txtClienteCPF.getText();
        
        //Instanciando cliente
        ClienteDTO clientedto = new ClienteDTO(nome, telefone, email, cpf);
        clientedao.cadastrarCliente(clientedto);
        
        cadastrarEndereco();
        
        limparCamposCadastroCliente();
    }
    
    
    // CADASTRANDO ENDERECO DO CLIENTE NO SISTEMA
    private void cadastrarEndereco(){
        ClienteDAO clientedao = new ClienteDAO();
        EnderecoDAO enderecodao = new EnderecoDAO();

        //Passando endereco do cliente para classe DTO
        String estado, cidade, bairro, rua;
        int numero, cliente_id;
        
        estado = txtEnderecoEstado.getText();
        cidade = txtEnderecoCidade.getText();
        bairro = txtEnderecoBairro.getText();
        rua = txtEnderecoRua.getText();
        numero = Integer.parseInt(txtEnderecoNumero.getText());
        cliente_id = clientedao.idCliente();
        
        EnderecoDTO enderecodto = new EnderecoDTO(estado, cidade, bairro, rua, numero, cliente_id);
        enderecodao.cadastrarEndereco(enderecodto);
    }
    
    
    // LIMPANDO CAMPOS DE TEXTO DE CADASTRO DO CLIENTE
    private void limparCamposCadastroCliente(){
        txtClienteNome.setText("");
        txtClienteTelefone.setText("");
        txtClienteEmail.setText("");
        txtClienteCPF.setText("");
        
        txtEnderecoEstado.setText(""); 
        txtEnderecoCidade.setText(""); 
        txtEnderecoBairro.setText(""); 
        txtEnderecoRua.setText(""); 
        txtEnderecoNumero.setText("");
    }
    
    
    // CONSULTANDO CLIENTES CADASTRADOS NO BANCO
    private void consultarClientes(){
        try{
            EnderecoDAO enderecodao = new EnderecoDAO();
            ClienteDAO clientedao = new ClienteDAO();
            DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
            modelo.setNumRows(0);
            
            ArrayList<ClienteDTO> listaClientes = clientedao.consultarClientes("");
            
            for(ClienteDTO objTemp: listaClientes){
                modelo.addRow( new Object[] {
                    objTemp.getCliente_id(),
                    objTemp.getCliente_nome(),
                    objTemp.getCliente_telefone(),
                    objTemp.getCliente_email(),
                    objTemp.getCliente_cpf(),
                    enderecodao.pegarEnderecoCliente(objTemp.getCliente_id())
                });
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ClienteVIEW -> consultarClientes: " + ex.getMessage());
        }
    }
    
    // CRIANDO BOTÕES PARA ALTERAR E REMOVER
    private void botoesAlterarRemover(int cliente_id){
        JPanel panel = new JPanel();
        
        JButton btnAlterar = new JButton("");
        btnAlterar.setSize(100,20);
        JButton btnRemover = new JButton("");
        btnRemover.setSize(100,20);
        
        panel.add(btnAlterar, btnRemover);
        panel.setVisible(true);
    }
    
    
    
}