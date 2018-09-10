/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.bean.Administrador;
import model.bean.Cliente;
import model.bean.Produto;
import model.dao.AdministradorDao;

/**
 *
 * @author viniciusdias
 */
public class addFuncView extends javax.swing.JFrame {
    String modoAdm;
    
    /**
     * Creates new form Principal
     */
    public addFuncView() {
        initComponents();
        setLocationRelativeTo(null);
        modoAdm = "Navegar";
        ManipulaInterfaceAdm();
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
        jLabel8 = new javax.swing.JLabel();
        c_adm_rg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        c_adm_tel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        c_adm_senha = new javax.swing.JTextField();
        c_adm_login = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        c_adm_sal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Adicionar Funcionário"));

        jLabel3.setText("CPF:");

        jLabel4.setText("Nome:");

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

        btn_adm_novo.setText("Novo");
        btn_adm_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_novoActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço:");

        jLabel7.setText("Data Nasc:");

        jLabel8.setText("RG:");

        jLabel9.setText("Telefone:");

        jLabel10.setText("Senha:");

        c_adm_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_adm_loginActionPerformed(evt);
            }
        });

        jLabel11.setText("Login: ");

        jLabel12.setText("Salario: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(c_adm_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c_adm_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 267, Short.MAX_VALUE)
                                .addComponent(btn_adm_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btn_adm_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_adm_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(c_adm_sal))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(c_adm_login, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(c_adm_tel)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_adm_ende))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_adm_cargo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(c_adm_nome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(c_adm_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_adm_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_adm_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_adm_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(c_adm_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(c_adm_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(c_adm_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_adm_ende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_adm_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(c_adm_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(c_adm_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_adm_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adm_salvar)
                    .addComponent(btn_adm_voltar)
                    .addComponent(btn_adm_novo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(addFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addFuncView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
