/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Administrador;
import model.bean.Cliente;
import model.bean.Produto;
import model.dao.AdministradorDao;

/**
 *
 * @author viniciusdias
 */
public class FuncView extends javax.swing.JFrame {
    String modoAdm;
    
    /**
     * Creates new form Principal
     */
    public FuncView() {
        initComponents();
        setLocationRelativeTo(null);
        modoAdm = "Navegar";
        ManipulaInterfaceAdm();
        
        DefaultTableModel modelo = (DefaultTableModel) tbl_adm_adms.getModel();
        tbl_adm_adms.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_adm_adms.getModel();
        modelo.setNumRows(0);
        AdministradorDao adao = new AdministradorDao();
        
        for(Administrador a: adao.read()){
            
            modelo.addRow(new Object[]{
                
                a.getCpf(),
                a.getNome(),
                a.getCargo(),
                a.getRg(),
                a.getDataNasc(),
                a.getTelefone(),
                a.getEndereco(),
                a.getLogin(),
                a.getSenha(),
                a.getSalario()
                
                
            });
            
        }
        
    }
    public void ManipulaInterfaceAdm(){
        switch(modoAdm){
            case "Navegar":
                btn_adm_salvar.setEnabled(false);
                btn_adm_voltar.setEnabled(true);
                c_adm_cpf.setEnabled(false);
                c_adm_nome.setEnabled(false);
                c_adm_cargo.setEnabled(false);
                c_adm_rg.setEnabled(false);
                c_adm_nasc.setEnabled(false);
                c_adm_tel.setEnabled(false);
                c_adm_ende.setEnabled(false);
                c_adm_login.setEnabled(false);
                c_adm_senha.setEnabled(false);
                c_adm_sal.setEnabled(false);
                btn_adm_novo.setEnabled(true);
                c_adm_cargo.setEnabled(false);
                btn_adm_atualizar.setEnabled(false);
                btn_adm_excluir.setEnabled(true);
                break;
            
            case "Novo":
                btn_adm_salvar.setEnabled(true);
                btn_adm_voltar.setEnabled(true);
                c_adm_cpf.setEnabled(true);
                c_adm_nome.setEnabled(true);
                c_adm_cargo.setEnabled(true);
                c_adm_rg.setEnabled(true);
                c_adm_nasc.setEnabled(true);
                c_adm_tel.setEnabled(true);
                c_adm_ende.setEnabled(true);
                c_adm_login.setEnabled(true);
                c_adm_senha.setEnabled(true);
                c_adm_sal.setEnabled(true);
                btn_adm_novo.setEnabled(false);
                btn_adm_atualizar.setEnabled(false);
                btn_adm_excluir.setEnabled(false);
                break;
                
            case "Editar":
                btn_adm_salvar.setEnabled(true);
                btn_adm_voltar.setEnabled(true);
                c_adm_cpf.setEnabled(true);
                c_adm_nome.setEnabled(true);
                c_adm_cargo.setEnabled(true);
                c_adm_rg.setEnabled(true);
                c_adm_nasc.setEnabled(true);
                c_adm_tel.setEnabled(true);
                c_adm_ende.setEnabled(true);
                c_adm_login.setEnabled(true);
                c_adm_senha.setEnabled(true);
                c_adm_sal.setEnabled(true);
                btn_adm_novo.setEnabled(true);
                btn_adm_atualizar.setEnabled(true);
                btn_adm_excluir.setEnabled(false);
                break;
                
            case "Excluir":
                btn_adm_salvar.setEnabled(false);
                btn_adm_voltar.setEnabled(false);
                c_adm_cpf.setEnabled(false);
                c_adm_nome.setEnabled(false);
                c_adm_cargo.setEnabled(false);
                c_adm_rg.setEnabled(false);
                c_adm_nasc.setEnabled(false);
                c_adm_tel.setEnabled(false);
                c_adm_ende.setEnabled(false);
                c_adm_login.setEnabled(false);
                c_adm_senha.setEnabled(false);
                c_adm_sal.setEnabled(false);
                btn_adm_novo.setEnabled(true);
                btn_adm_atualizar.setEnabled(false);
                btn_adm_excluir.setEnabled(false);
                break;
                
            case "Selecao":
                btn_adm_salvar.setEnabled(false);
                btn_adm_voltar.setEnabled(false);
                c_adm_cpf.setEnabled(false);
                c_adm_nome.setEnabled(false);
                c_adm_cargo.setEnabled(false);
                c_adm_rg.setEnabled(false);
                c_adm_nasc.setEnabled(false);
                c_adm_tel.setEnabled(false);
                c_adm_ende.setEnabled(false);
                c_adm_login.setEnabled(false);
                c_adm_senha.setEnabled(false);
                c_adm_sal.setEnabled(false);
                btn_adm_novo.setEnabled(true);
                btn_adm_atualizar.setEnabled(true);
                btn_adm_excluir.setEnabled(true);
                break;
            default: System.out.println("Modo inválido");
        }
    }
    
    private void limpaTextoAdm () {
        c_adm_cpf.setText("");
        c_adm_nome.setText("");
        c_adm_cargo.setText("");
        c_adm_rg.setText("");
        c_adm_nasc.setText("");
        c_adm_tel.setText("");
        c_adm_ende.setText("");
        c_adm_login.setText("");
        c_adm_senha.setText("");
        c_adm_sal.setText("");
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
        c_adm_cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_adm_nome = new javax.swing.JTextField();
        btn_adm_salvar = new javax.swing.JButton();
        btn_adm_voltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        c_adm_cargo = new javax.swing.JTextField();
        btn_adm_novo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        c_adm_ende = new javax.swing.JTextField();
        c_adm_nasc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        c_adm_tel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        c_adm_senha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        c_adm_sal = new javax.swing.JTextField();
        c_adm_login = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_adm_adms = new javax.swing.JTable();
        btn_adm_excluir = new javax.swing.JButton();
        btn_adm_atualizar = new javax.swing.JButton();
        c_adm_rg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Adicionar Funcionário"));

        jLabel3.setText("CPF:");

        c_adm_cpf.setText("0905811194666");

        jLabel4.setText("Nome:");

        c_adm_nome.setText("Vinicius Monteiro Dias Filho");
        c_adm_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_adm_nomeActionPerformed(evt);
            }
        });

        btn_adm_salvar.setText("Salvar");
        btn_adm_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_salvarActionPerformed(evt);
            }
        });

        btn_adm_voltar.setText("Voltar");
        btn_adm_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_voltarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cargo:");

        c_adm_cargo.setText("Administrador");

        btn_adm_novo.setText("Novo");
        btn_adm_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_novoActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço:");

        c_adm_ende.setText("Rua Getulio Vargas, N186");

        c_adm_nasc.setText("2015-11-11");

        jLabel7.setText("Data Nasc:");

        jLabel9.setText("Telefone:");

        c_adm_tel.setText("483247139666");

        jLabel10.setText("Senha:");

        c_adm_senha.setText("viniciusdias10");

        jLabel11.setText("Login: ");

        jLabel12.setText("Salario: ");

        c_adm_sal.setText("104000400400400");

        c_adm_login.setText("ViniciusDias");
        c_adm_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_adm_loginActionPerformed(evt);
            }
        });

        tbl_adm_adms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cpf", "Nome", "Cargo", "Rg", "Data Nasc", "Telefone", "Endereço", "Login", "Senha", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_adm_adms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_adm_admsMouseClicked(evt);
            }
        });
        tbl_adm_adms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_adm_admsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_adm_adms);

        btn_adm_excluir.setText("Excluir");
        btn_adm_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_excluirActionPerformed(evt);
            }
        });

        btn_adm_atualizar.setText("Atualizar");
        btn_adm_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_atualizarActionPerformed(evt);
            }
        });

        c_adm_rg.setText("48212709");
        c_adm_rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_adm_rgActionPerformed(evt);
            }
        });

        jLabel8.setText("RG:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_adm_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_adm_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_adm_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_adm_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_adm_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(c_adm_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(c_adm_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(c_adm_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(c_adm_ende))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(59, 59, 59)
                                    .addComponent(jLabel10)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(c_adm_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(c_adm_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(c_adm_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(c_adm_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(c_adm_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(c_adm_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(61, 61, 61)
                                    .addComponent(jLabel7))))))
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
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_adm_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_adm_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_adm_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_adm_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_adm_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_adm_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_adm_ende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_adm_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_adm_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_adm_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adm_novo)
                    .addComponent(btn_adm_voltar)
                    .addComponent(btn_adm_salvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adm_atualizar)
                    .addComponent(btn_adm_excluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adm_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_salvarActionPerformed

        Administrador a = new Administrador();
        AdministradorDao dao = new AdministradorDao();
        a.setCpf(Long.parseLong(c_adm_cpf.getText()));
        a.setNome(c_adm_nome.getText());
        a.setCargo(c_adm_cargo.getText());
        a.setRg(Long.parseLong(c_adm_rg.getText()));
        a.setDataNasc(c_adm_nasc.getText());
        a.setTelefone(Long.parseLong(c_adm_tel.getText()));
        a.setEndereco(c_adm_ende.getText());
        a.setLogin(c_adm_login.getText());
        a.setSenha(c_adm_senha.getText());
        a.setSalario(Long.parseLong(c_adm_sal.getText()));

        dao.create(a);

        modoAdm = "Navegar";
        ManipulaInterfaceAdm();
        limpaTextoAdm();

        readJTable();
    }//GEN-LAST:event_btn_adm_salvarActionPerformed

    private void btn_adm_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_voltarActionPerformed
        new administradorView().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_adm_voltarActionPerformed

    private void btn_adm_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_novoActionPerformed
        modoAdm = "Novo";
        ManipulaInterfaceAdm();
    }//GEN-LAST:event_btn_adm_novoActionPerformed

    private void c_adm_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_adm_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_adm_loginActionPerformed

    private void btn_adm_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_atualizarActionPerformed
        if(tbl_adm_adms.getSelectedRow() != -1) {
            
      
            tbl_adm_adms.setValueAt(c_adm_cpf.getText(), tbl_adm_adms.getSelectedRow(), 0);
            tbl_adm_adms.setValueAt(c_adm_nome.getText(), tbl_adm_adms.getSelectedRow(), 1);
            tbl_adm_adms.setValueAt(c_adm_cargo.getText(), tbl_adm_adms.getSelectedRow(), 2);
            tbl_adm_adms.setValueAt(c_adm_rg.getText(), tbl_adm_adms.getSelectedRow(), 3);
            tbl_adm_adms.setValueAt(c_adm_ende.getText(), tbl_adm_adms.getSelectedRow(), 4);
            tbl_adm_adms.setValueAt(c_adm_tel.getText(), tbl_adm_adms.getSelectedRow(), 5);
            tbl_adm_adms.setValueAt(c_adm_nasc.getText(), tbl_adm_adms.getSelectedRow(), 6);
            tbl_adm_adms.setValueAt(c_adm_login.getText(), tbl_adm_adms.getSelectedRow(), 7);
            tbl_adm_adms.setValueAt(c_adm_senha.getText(), tbl_adm_adms.getSelectedRow(), 8);
            tbl_adm_adms.setValueAt(c_adm_sal.getText(), tbl_adm_adms.getSelectedRow(), 9);
            
        }

        modoAdm = "Editar";
        ManipulaInterfaceAdm();
    }//GEN-LAST:event_btn_adm_atualizarActionPerformed

    private void btn_adm_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_excluirActionPerformed
        if(tbl_adm_adms.getSelectedRow() != -1) {

            Administrador a = new Administrador();
            AdministradorDao dao = new AdministradorDao();

            a.setNome((String) tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 1));

            dao.delete(a);

            readJTable();

        }

        modoAdm = "Navegar";
        ManipulaInterfaceAdm();
    }//GEN-LAST:event_btn_adm_excluirActionPerformed

    private void tbl_adm_admsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_adm_admsMouseClicked

        if(tbl_adm_adms.getSelectedRow() != -1) {
            
            c_adm_cpf.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 0).toString());
            c_adm_nome.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 1).toString());
            c_adm_cargo.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 2).toString());
            c_adm_rg.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 3).toString());
            c_adm_ende.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 4).toString());
            c_adm_tel.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 5).toString());
            c_adm_nasc.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 6).toString());
            c_adm_login.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 7).toString());
            c_adm_senha.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 8).toString());
            c_adm_sal.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 9).toString());  
            
        }
        modoAdm = "Editar";
        ManipulaInterfaceAdm();
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_adm_admsMouseClicked

    private void tbl_adm_admsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_adm_admsKeyReleased
        if(tbl_adm_adms.getSelectedRow() != -1) {
            
            c_adm_cpf.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 0).toString());
            c_adm_nome.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 1).toString());
            c_adm_cargo.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 2).toString());
            c_adm_rg.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 3).toString());
            c_adm_ende.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 4).toString());
            c_adm_tel.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 5).toString());
            c_adm_nasc.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 6).toString());
            c_adm_login.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 7).toString());
            c_adm_senha.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 8).toString());
            c_adm_sal.setText(tbl_adm_adms.getValueAt(tbl_adm_adms.getSelectedRow(), 9).toString());  
            
        }

// TODO add your handling code here:
    }//GEN-LAST:event_tbl_adm_admsKeyReleased

    private void c_adm_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_adm_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_adm_nomeActionPerformed

    private void c_adm_rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_adm_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_adm_rgActionPerformed

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
            java.util.logging.Logger.getLogger(FuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adm_atualizar;
    private javax.swing.JButton btn_adm_excluir;
    private javax.swing.JButton btn_adm_novo;
    private javax.swing.JButton btn_adm_salvar;
    private javax.swing.JButton btn_adm_voltar;
    private javax.swing.JTextField c_adm_cargo;
    private javax.swing.JTextField c_adm_cpf;
    private javax.swing.JTextField c_adm_ende;
    private javax.swing.JTextField c_adm_login;
    private javax.swing.JTextField c_adm_nasc;
    private javax.swing.JTextField c_adm_nome;
    private javax.swing.JTextField c_adm_rg;
    private javax.swing.JTextField c_adm_sal;
    private javax.swing.JTextField c_adm_senha;
    private javax.swing.JTextField c_adm_tel;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_adm_adms;
    // End of variables declaration//GEN-END:variables
}
