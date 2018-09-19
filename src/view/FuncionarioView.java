/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.FuncionarioControl;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author viniciusdias
 */
public class FuncionarioView extends javax.swing.JFrame {
    String modoFuncionario;
    
    /**
     * Creates new form Principal
     */
    public FuncionarioView() {
        initComponents();
        setLocationRelativeTo(null);
        modoFuncionario = "Navegar";
        ManipulaInterfaceFuncionario();
        
        DefaultTableModel modelo = (DefaultTableModel) tbl_func_funcs.getModel();
        tbl_func_funcs.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    public void readJTable() {
        FuncionarioControl.getFuncionario((DefaultTableModel) tbl_func_funcs.getModel());
        
    }
    public void ManipulaInterfaceFuncionario(){
        switch(modoFuncionario){
            case "Navegar":
                btn_func_salvar.setEnabled(false);
                btn_func_voltar.setEnabled(true);
                c_func_cpf.setEnabled(false);
                c_func_nome.setEnabled(false);
                c_func_cargo.setEnabled(false);
                c_func_rg.setEnabled(false);
                c_func_nasc.setEnabled(false);
                c_func_tel.setEnabled(false);
                c_func_ende.setEnabled(false);
                c_func_login.setEnabled(false);
                c_func_senha.setEnabled(false);
                c_func_sal.setEnabled(false);
                btn_func_novo.setEnabled(true);
                c_func_cargo.setEnabled(false);
                btn_func_atualizar.setEnabled(false);
                btn_func_excluir.setEnabled(true);
                break;
            
            case "Novo":
                btn_func_salvar.setEnabled(true);
                btn_func_voltar.setEnabled(true);
                c_func_cpf.setEnabled(true);
                c_func_nome.setEnabled(true);
                c_func_cargo.setEnabled(true);
                c_func_rg.setEnabled(true);
                c_func_nasc.setEnabled(true);
                c_func_tel.setEnabled(true);
                c_func_ende.setEnabled(true);
                c_func_login.setEnabled(true);
                c_func_senha.setEnabled(true);
                c_func_sal.setEnabled(true);
                btn_func_novo.setEnabled(false);
                btn_func_atualizar.setEnabled(false);
                btn_func_excluir.setEnabled(false);
                break;
                
            case "Editar":
                btn_func_salvar.setEnabled(false);
                btn_func_voltar.setEnabled(true);
                c_func_cpf.setEnabled(true);
                c_func_nome.setEnabled(true);
                c_func_cargo.setEnabled(true);
                c_func_rg.setEnabled(true);
                c_func_nasc.setEnabled(true);
                c_func_tel.setEnabled(true);
                c_func_ende.setEnabled(true);
                c_func_login.setEnabled(true);
                c_func_senha.setEnabled(true);
                c_func_sal.setEnabled(true);
                btn_func_novo.setEnabled(false);
                btn_func_atualizar.setEnabled(true);
                btn_func_excluir.setEnabled(true);
                break;
                
            case "Excluir":
                btn_func_salvar.setEnabled(false);
                btn_func_voltar.setEnabled(false);
                c_func_cpf.setEnabled(false);
                c_func_nome.setEnabled(false);
                c_func_cargo.setEnabled(false);
                c_func_rg.setEnabled(false);
                c_func_nasc.setEnabled(false);
                c_func_tel.setEnabled(false);
                c_func_ende.setEnabled(false);
                c_func_login.setEnabled(false);
                c_func_senha.setEnabled(false);
                c_func_sal.setEnabled(false);
                btn_func_novo.setEnabled(true);
                btn_func_atualizar.setEnabled(false);
                btn_func_excluir.setEnabled(false);
                break;
                
            case "Selecao":
                btn_func_salvar.setEnabled(false);
                btn_func_voltar.setEnabled(false);
                c_func_cpf.setEnabled(false);
                c_func_nome.setEnabled(false);
                c_func_cargo.setEnabled(false);
                c_func_rg.setEnabled(false);
                c_func_nasc.setEnabled(false);
                c_func_tel.setEnabled(false);
                c_func_ende.setEnabled(false);
                c_func_login.setEnabled(false);
                c_func_senha.setEnabled(false);
                c_func_sal.setEnabled(false);
                btn_func_novo.setEnabled(true);
                btn_func_atualizar.setEnabled(true);
                btn_func_excluir.setEnabled(true);
                break;
            default: System.out.println("Modo inválido");
        }
    }
    
    private void limpaTextoFuncionario () {
        c_func_cpf.setText("");
        c_func_nome.setText("");
        c_func_cargo.setSelectedItem("");
        c_func_rg.setText("");
        c_func_nasc.setText("");
        c_func_tel.setText("");
        c_func_ende.setText("");
        c_func_login.setText("");
        c_func_senha.setText("");
        c_func_sal.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_func_nome = new javax.swing.JTextField();
        btn_func_salvar = new javax.swing.JButton();
        btn_func_voltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_func_novo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        c_func_ende = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        c_func_sal = new javax.swing.JTextField();
        c_func_login = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_func_funcs = new javax.swing.JTable();
        btn_func_excluir = new javax.swing.JButton();
        btn_func_atualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        c_func_cargo = new javax.swing.JComboBox<>();
        c_func_nasc = new javax.swing.JFormattedTextField();
        c_func_cpf = new javax.swing.JFormattedTextField();
        c_func_tel = new javax.swing.JFormattedTextField();
        c_func_rg = new javax.swing.JFormattedTextField();
        c_func_senha = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Adicionar Funcionário"));

        jLabel3.setText("CPF:");

        jLabel4.setText("Nome:");

        c_func_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_func_nomeActionPerformed(evt);
            }
        });

        btn_func_salvar.setText("Salvar");
        btn_func_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_salvarActionPerformed(evt);
            }
        });

        btn_func_voltar.setText("Voltar");
        btn_func_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_voltarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cargo:");

        btn_func_novo.setText("Novo");
        btn_func_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_novoActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço:");

        jLabel7.setText("Data Nasc:");

        jLabel9.setText("Telefone:");

        jLabel10.setText("Senha:");

        jLabel11.setText("Login: ");

        jLabel12.setText("Salario: ");

        c_func_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_func_loginActionPerformed(evt);
            }
        });

        tbl_func_funcs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cpf", "Nome", "Cargo", "Rg", "Data Nasc", "Telefone", "Login", "Senha", "Salario", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_func_funcs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_func_funcsMouseClicked(evt);
            }
        });
        tbl_func_funcs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_func_funcsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_func_funcs);

        btn_func_excluir.setText("Excluir");
        btn_func_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_excluirActionPerformed(evt);
            }
        });

        btn_func_atualizar.setText("Atualizar");
        btn_func_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_atualizarActionPerformed(evt);
            }
        });

        jLabel8.setText("RG:");

        c_func_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Atendente" }));

        try {
            c_func_nasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            c_func_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        c_func_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_func_cpfActionPerformed(evt);
            }
        });

        try {
            c_func_tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            c_func_rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(c_func_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(c_func_login, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(c_func_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(c_func_sal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(c_func_ende)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(c_func_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(c_func_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_func_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_func_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_func_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_func_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_func_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btn_func_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_func_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_func_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_func_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_func_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_func_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_func_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_func_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_func_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_func_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_func_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_func_ende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_func_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_func_novo)
                    .addComponent(btn_func_salvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_func_atualizar)
                    .addComponent(btn_func_excluir)
                    .addComponent(btn_func_voltar))
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/monitor.png"))); // NOI18N
        jMenu1.setText("Arquivo");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        jMenu3.setText("Sair");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        jMenu2.setText("Sobre");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_func_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_func_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_func_cpfActionPerformed

    private void btn_func_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_atualizarActionPerformed
        if(tbl_func_funcs.getSelectedRow() != -1) {
            String cargo = (String) c_func_cargo.getSelectedItem();
            FuncionarioControl.updateFuncionario(c_func_cpf.getText(), c_func_nome.getText(), c_func_cargo.getSelectedItem().toString(), c_func_rg.getText(), 
                    c_func_nasc.getText(), c_func_tel.getText(), c_func_ende.getText(), c_func_login.getText(), new String(c_func_senha.getPassword()), Long.parseLong(c_func_sal.getText()));
            modoFuncionario = "Navegar";
            ManipulaInterfaceFuncionario();
            limpaTextoFuncionario();
            readJTable();
        }

        modoFuncionario = "Editar";
        ManipulaInterfaceFuncionario();
    }//GEN-LAST:event_btn_func_atualizarActionPerformed

    private void btn_func_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_excluirActionPerformed
        if(tbl_func_funcs.getSelectedRow() != -1) {
            FuncionarioControl.deletarFuncionario(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 1).toString());
            readJTable();
        }
        modoFuncionario = "Navegar";
        ManipulaInterfaceFuncionario();
    }//GEN-LAST:event_btn_func_excluirActionPerformed

    private void tbl_func_funcsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_func_funcsKeyReleased
        if(tbl_func_funcs.getSelectedRow() != -1) {

            c_func_cpf.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 0).toString());
            c_func_nome.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 1).toString());
            c_func_cargo.setSelectedItem(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 2).toString());
            c_func_rg.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 3).toString());
            c_func_ende.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 4).toString());
            c_func_tel.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 5).toString());
            c_func_nasc.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 6).toString());
            c_func_login.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 7).toString());
            c_func_senha.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 8).toString());
            c_func_sal.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 9).toString());

        }
    }//GEN-LAST:event_tbl_func_funcsKeyReleased

    private void tbl_func_funcsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_func_funcsMouseClicked

        if(tbl_func_funcs.getSelectedRow() != -1) {

            c_func_cpf.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 0).toString());
            c_func_nome.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 1).toString());
            c_func_cargo.setSelectedItem(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 2).toString());
            c_func_rg.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 3).toString());
            c_func_ende.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 4).toString());
            c_func_tel.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 5).toString());
            c_func_nasc.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 6).toString());
            c_func_login.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 7).toString());
            c_func_senha.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 8).toString());
            c_func_sal.setText(tbl_func_funcs.getValueAt(tbl_func_funcs.getSelectedRow(), 9).toString());

        }
        modoFuncionario = "Selecao";
        ManipulaInterfaceFuncionario();
    }//GEN-LAST:event_tbl_func_funcsMouseClicked

    private void c_func_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_func_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_func_loginActionPerformed

    private void btn_func_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_novoActionPerformed
        modoFuncionario = "Novo";
        ManipulaInterfaceFuncionario();
        limpaTextoFuncionario();
    }//GEN-LAST:event_btn_func_novoActionPerformed

    private void btn_func_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_voltarActionPerformed
        new administradorView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_func_voltarActionPerformed

    private void btn_func_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_salvarActionPerformed
        FuncionarioControl.salvarFuncionario(c_func_cpf.getText(), c_func_nome.getText(), c_func_cargo.getSelectedItem().toString(), c_func_rg.getText(), 
                    c_func_nasc.getText(), c_func_tel.getText(), c_func_ende.getText(), c_func_login.getText(), new String(c_func_senha.getPassword()), Long.parseLong(c_func_sal.getText()));     
        modoFuncionario = "Navegar";
        ManipulaInterfaceFuncionario();
        limpaTextoFuncionario();
        readJTable();
    }//GEN-LAST:event_btn_func_salvarActionPerformed

    private void c_func_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_func_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_func_nomeActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_func_atualizar;
    private javax.swing.JButton btn_func_excluir;
    private javax.swing.JButton btn_func_novo;
    private javax.swing.JButton btn_func_salvar;
    private javax.swing.JButton btn_func_voltar;
    private javax.swing.JComboBox<String> c_func_cargo;
    private javax.swing.JFormattedTextField c_func_cpf;
    private javax.swing.JTextField c_func_ende;
    private javax.swing.JTextField c_func_login;
    private javax.swing.JFormattedTextField c_func_nasc;
    private javax.swing.JTextField c_func_nome;
    private javax.swing.JFormattedTextField c_func_rg;
    private javax.swing.JTextField c_func_sal;
    private javax.swing.JPasswordField c_func_senha;
    private javax.swing.JFormattedTextField c_func_tel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_func_funcs;
    // End of variables declaration//GEN-END:variables
}
