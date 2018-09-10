package view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cliente;
import model.bean.Administrador;
import model.bean.Produto;
import model.dao.AdministradorDao;

/**
 * @author viniciusdias
 */
public class listarFuncView extends javax.swing.JFrame {
    String modoAdm; 
    
    public listarFuncView() {
        initComponents();
        setLocationRelativeTo(null);
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
                btn_adm_editar.setEnabled(false);
                btn_adm_excluir.setEnabled(false);
                break;
            
            case "Novo":
               
                btn_adm_editar.setEnabled(false);
                btn_adm_excluir.setEnabled(false);
                break;
                
            case "Editar":
                btn_adm_editar.setEnabled(false);
                btn_adm_excluir.setEnabled(false);
                break;
                
            case "Excluir":
                btn_adm_editar.setEnabled(false);
                btn_adm_excluir.setEnabled(false);
                break;
                
            case "Selecao":
                btn_adm_editar.setEnabled(true);
                btn_adm_excluir.setEnabled(true);
                break;
            default: System.out.println("Modo inválido");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btn_adm_editar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_adm_adms = new javax.swing.JTable();
        btn_adm_excluir = new javax.swing.JButton();
        btn_adm_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 68, 106));

        jTabbedPane1.setBackground(new java.awt.Color(92, 101, 112));
        jTabbedPane1.setForeground(new java.awt.Color(222, 115, 60));

        btn_adm_editar.setText("Editar");
        btn_adm_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_editarActionPerformed(evt);
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
        jScrollPane2.setViewportView(tbl_adm_adms);
        if (tbl_adm_adms.getColumnModel().getColumnCount() > 0) {
            tbl_adm_adms.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        btn_adm_excluir.setText("Excluir");
        btn_adm_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_excluirActionPerformed(evt);
            }
        });

        btn_adm_voltar.setText("Voltar");
        btn_adm_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btn_adm_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_adm_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_adm_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adm_editar)
                    .addComponent(btn_adm_excluir)
                    .addComponent(btn_adm_voltar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionários", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_adm_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_editarActionPerformed
        modoAdm = "Editar";
        ManipulaInterfaceAdm();
    }//GEN-LAST:event_btn_adm_editarActionPerformed

    private void btn_adm_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_voltarActionPerformed
        new administradorView().setVisible(true);
        this.dispose();
         // TODO add your handling code here:
    }//GEN-LAST:event_btn_adm_voltarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(listarFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listarFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listarFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listarFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listarFuncView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adm_editar;
    private javax.swing.JButton btn_adm_excluir;
    private javax.swing.JButton btn_adm_voltar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_adm_adms;
    // End of variables declaration//GEN-END:variables
}



