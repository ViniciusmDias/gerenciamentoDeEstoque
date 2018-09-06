package view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.bean.Cliente;
import model.bean.Produto;

/**
 * @author Gilberto Toledo
 */
public class AtendendeView extends javax.swing.JFrame {
    ArrayList<Produto> ListaProd;
    String modoProd;
    ArrayList<Cliente> ListaCli;
    String modoCli;
    
   
    public void LoadTableProd(){
        DefaultTableModel modeloProd = new DefaultTableModel(new Object[]{"Quantidade","Nome"},0);
            
        for(int i=0;i<ListaProd.size();i++){
            Object linha[] = new Object[]{ListaProd.get(i).getQuantidade(),
                                          ListaProd.get(i).getNome()};
            modeloProd.addRow(linha);
        }
        
        tbl_prod_prods.setModel(modeloProd);
    }
    public void LoadTableCli(){
        DefaultTableModel modeloCli = new DefaultTableModel(new Object[]{"CPF","Nome","Email"},0);
            
        for(int i=0;i<ListaCli.size();i++){
            Object linha[] = new Object[]{ListaCli.get(i).getCpf(),
                                          ListaCli.get(i).getNome(),
                                          ListaCli.get(i).getEmail()};
            modeloCli.addRow(linha);
        }
        
        tbl_cli_clis.setModel(modeloCli);
    }
   
    /**
     * Creates new form Principal
     */
    public AtendendeView() {
        initComponents();
        setLocationRelativeTo(null);
        ListaProd = new ArrayList();
        ListaCli = new ArrayList();
        modoProd = "Navegar";
        modoCli = "Navegar";
        ManipulaInterfaceProd();
        ManipulaInterfaceCli();
    }
    
    public void ManipulaInterfaceProd(){
        switch(modoProd){
            case "Navegar":
                btn_prod_salvar.setEnabled(false);
                btn_prod_cancelar.setEnabled(false);
                c_prod_qtd.setEnabled(false);
                c_prod_nome.setEnabled(false);
                btn_prod_novo.setEnabled(true);
                btn_prod_editar.setEnabled(false);
                btn_prod_excluir.setEnabled(false);
                break;
            
            case "Novo":
                btn_prod_salvar.setEnabled(true);
                btn_prod_cancelar.setEnabled(true);
                c_prod_qtd.setEnabled(true);
                c_prod_nome.setEnabled(true);
                btn_prod_novo.setEnabled(false);
                btn_prod_editar.setEnabled(false);
                btn_prod_excluir.setEnabled(false);
                break;
                
            case "Editar":
                btn_prod_salvar.setEnabled(true);
                btn_prod_cancelar.setEnabled(true);
                c_prod_qtd.setEnabled(true);
                c_prod_nome.setEnabled(true);
                btn_prod_novo.setEnabled(true);
                btn_prod_editar.setEnabled(false);
                btn_prod_excluir.setEnabled(false);
                break;
                
            case "Excluir":
                btn_prod_salvar.setEnabled(false);
                btn_prod_cancelar.setEnabled(false);
                c_prod_qtd.setEnabled(false);
                c_prod_nome.setEnabled(false);
                btn_prod_novo.setEnabled(true);
                btn_prod_editar.setEnabled(false);
                btn_prod_excluir.setEnabled(false);
                break;
                
            case "Selecao":
                btn_prod_salvar.setEnabled(false);
                btn_prod_cancelar.setEnabled(false);
                c_prod_qtd.setEnabled(false);
                c_prod_nome.setEnabled(false);
                btn_prod_novo.setEnabled(true);
                btn_prod_editar.setEnabled(true);
                btn_prod_excluir.setEnabled(true);                
                break;
            default: System.out.println("Modo inválido");
        }
    }
    public void ManipulaInterfaceCli(){
        switch(modoCli){
            case "Navegar":
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_cpf.setEnabled(false);
                c_cli_nome.setEnabled(false);
                c_cli_email.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false);
                break;
            
            case "Novo":
                btn_cli_salvar.setEnabled(true);
                btn_cli_cancelar.setEnabled(true);
                c_cli_cpf.setEnabled(true);
                c_cli_nome.setEnabled(true);
                c_cli_email.setEnabled(true);
                btn_cli_novo.setEnabled(false);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false);
                break;
                
            case "Editar":
                btn_cli_salvar.setEnabled(true);
                btn_cli_cancelar.setEnabled(true);
                c_cli_cpf.setEnabled(true);
                c_cli_nome.setEnabled(true);
                c_cli_email.setEnabled(true);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false);
                break;
                
            case "Excluir":
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_cpf.setEnabled(false);
                c_cli_nome.setEnabled(false);
                c_cli_email.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false);
                break;
                
            case "Selecao":
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_cpf.setEnabled(false);
                c_cli_nome.setEnabled(false);
                c_cli_email.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(true);
                btn_cli_excluir.setEnabled(true);              
                break;
            default: System.out.println("Modo inválido");
        }
    }    
    
    private void limpaTextoProd () {
        c_prod_qtd.setText("");
        c_prod_nome.setText("");
    }    
    private void limpaTextoCli () {
        c_cli_cpf.setText("");
        c_cli_nome.setText("");
        c_cli_email.setText("");
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        c_prod_qtd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        c_prod_nome = new javax.swing.JTextField();
        btn_prod_salvar = new javax.swing.JButton();
        btn_prod_cancelar = new javax.swing.JButton();
        btn_prod_novo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_prod_editar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_prod_prods = new javax.swing.JTable();
        btn_prod_excluir = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        c_cli_cpf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        c_cli_nome = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        c_cli_email = new javax.swing.JTextField();
        btn_cli_salvar = new javax.swing.JButton();
        btn_cli_cancelar = new javax.swing.JButton();
        btn_cli_novo = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btn_cli_editar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_cli_clis = new javax.swing.JTable();
        btn_cli_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 68, 106));

        jPanel3.setBackground(new java.awt.Color(92, 101, 112));

        jTabbedPane1.setBackground(new java.awt.Color(92, 101, 112));
        jTabbedPane1.setForeground(new java.awt.Color(222, 115, 60));

        jPanel5.setBackground(new java.awt.Color(13, 62, 118));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Produto"));

        jLabel13.setText("Quantidade:");

        jLabel14.setText("Nome:");

        btn_prod_salvar.setText("Salvar");
        btn_prod_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_salvarActionPerformed(evt);
            }
        });

        btn_prod_cancelar.setText("Cancelar");
        btn_prod_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_cancelarActionPerformed(evt);
            }
        });

        btn_prod_novo.setText("Novo");
        btn_prod_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(231, Short.MAX_VALUE)
                        .addComponent(btn_prod_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_prod_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_prod_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_prod_nome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(c_prod_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_prod_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(c_prod_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prod_salvar)
                    .addComponent(btn_prod_cancelar)
                    .addComponent(btn_prod_novo))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Produto", jPanel5);

        jPanel7.setBackground(new java.awt.Color(13, 62, 118));

        btn_prod_editar.setText("Editar");
        btn_prod_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_editarActionPerformed(evt);
            }
        });

        tbl_prod_prods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantidade", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_prod_prods);
        if (tbl_prod_prods.getColumnModel().getColumnCount() > 0) {
            tbl_prod_prods.getColumnModel().getColumn(0).setResizable(false);
            tbl_prod_prods.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_prod_prods.getColumnModel().getColumn(1).setResizable(false);
            tbl_prod_prods.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        btn_prod_excluir.setText("Excluir");
        btn_prod_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prod_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btn_prod_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_prod_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prod_editar)
                    .addComponent(btn_prod_excluir))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Produtos", jPanel7);

        jPanel8.setBackground(new java.awt.Color(13, 62, 118));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cliente"));

        jLabel15.setText("Cpf:");

        jLabel16.setText("Nome:");

        jLabel17.setText("Email:");

        btn_cli_salvar.setText("Salvar");
        btn_cli_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_salvarActionPerformed(evt);
            }
        });

        btn_cli_cancelar.setText("Cancelar");
        btn_cli_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_cancelarActionPerformed(evt);
            }
        });

        btn_cli_novo.setText("Novo");
        btn_cli_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap(225, Short.MAX_VALUE)
                        .addComponent(btn_cli_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btn_cli_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cli_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(c_cli_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(c_cli_nome)
                            .addComponent(c_cli_email))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_cli_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(c_cli_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(c_cli_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cli_salvar)
                    .addComponent(btn_cli_cancelar)
                    .addComponent(btn_cli_novo))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Cliente", jPanel8);

        jPanel10.setBackground(new java.awt.Color(13, 62, 118));

        btn_cli_editar.setText("Editar");
        btn_cli_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_editarActionPerformed(evt);
            }
        });

        tbl_cli_clis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbl_cli_clis);
        if (tbl_cli_clis.getColumnModel().getColumnCount() > 0) {
            tbl_cli_clis.getColumnModel().getColumn(0).setResizable(false);
            tbl_cli_clis.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_cli_clis.getColumnModel().getColumn(1).setResizable(false);
            tbl_cli_clis.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbl_cli_clis.getColumnModel().getColumn(2).setResizable(false);
        }

        btn_cli_excluir.setText("Excluir");
        btn_cli_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btn_cli_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cli_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cli_editar)
                    .addComponent(btn_cli_excluir))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", jPanel10);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_prod_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_cancelarActionPerformed
        modoProd = "Navegar";
        ManipulaInterfaceProd();
    }//GEN-LAST:event_btn_prod_cancelarActionPerformed

    private void btn_prod_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_salvarActionPerformed

        Produto P = new Produto();
        P.setQuantidade(Integer.parseInt(c_prod_qtd.getText()));
        P.setNome(c_prod_nome.getText());

        ListaProd.add(P);
        LoadTableProd();
        modoProd = "Navegar";
        ManipulaInterfaceProd();
        limpaTextoProd();
    }//GEN-LAST:event_btn_prod_salvarActionPerformed

    private void btn_prod_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_novoActionPerformed
        modoProd = "Novo";
        ManipulaInterfaceProd();
    }//GEN-LAST:event_btn_prod_novoActionPerformed

    private void btn_prod_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_editarActionPerformed
        modoProd = "Editar";
        ManipulaInterfaceProd();
    }//GEN-LAST:event_btn_prod_editarActionPerformed

    private void btn_prod_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prod_excluirActionPerformed
        modoProd = "Navegar";
        ManipulaInterfaceProd();
    }//GEN-LAST:event_btn_prod_excluirActionPerformed

    private void btn_cli_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_editarActionPerformed
        modoCli = "Editar";
        ManipulaInterfaceCli();
    }//GEN-LAST:event_btn_cli_editarActionPerformed

    private void btn_cli_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_excluirActionPerformed
        modoCli = "Navegar";
        ManipulaInterfaceCli();
    }//GEN-LAST:event_btn_cli_excluirActionPerformed

    private void btn_cli_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_novoActionPerformed
        modoCli = "Novo";
        ManipulaInterfaceCli();
    }//GEN-LAST:event_btn_cli_novoActionPerformed

    private void btn_cli_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_cancelarActionPerformed
        modoCli = "Navegar";
        ManipulaInterfaceCli();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cli_cancelarActionPerformed

    private void btn_cli_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_salvarActionPerformed
        Cliente C = new Cliente();
        C.setCpf(Long.parseLong(c_cli_cpf.getText()));
        C.setNome(c_cli_nome.getText());
        C.setEmail(c_cli_email.getText());

        ListaCli.add(C);
        LoadTableCli();
        modoCli = "Navegar";
        ManipulaInterfaceCli();
        limpaTextoCli();
    }//GEN-LAST:event_btn_cli_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(AtendendeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtendendeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtendendeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtendendeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtendendeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cli_cancelar;
    private javax.swing.JButton btn_cli_editar;
    private javax.swing.JButton btn_cli_excluir;
    private javax.swing.JButton btn_cli_novo;
    private javax.swing.JButton btn_cli_salvar;
    private javax.swing.JButton btn_prod_cancelar;
    private javax.swing.JButton btn_prod_editar;
    private javax.swing.JButton btn_prod_excluir;
    private javax.swing.JButton btn_prod_novo;
    private javax.swing.JButton btn_prod_salvar;
    private javax.swing.JTextField c_cli_cpf;
    private javax.swing.JTextField c_cli_email;
    private javax.swing.JTextField c_cli_nome;
    private javax.swing.JTextField c_prod_nome;
    private javax.swing.JTextField c_prod_qtd;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_cli_clis;
    private javax.swing.JTable tbl_prod_prods;
    // End of variables declaration//GEN-END:variables
}



