package view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.bean.Cliente;
import model.bean.Administrador;
import model.bean.Produto;
import model.dao.AdministradorDao;

/**
 * @author Gilberto Toledo
 */
public class AdministradorView extends javax.swing.JFrame {
    ArrayList<Administrador> ListaAdm;
    String modoAdm;
    ArrayList<Produto> ListaProd;
    String modoProd;
    ArrayList<Cliente> ListaCli;
    String modoCli;
    
    
    public void LoadTableAdm(){
        DefaultTableModel modeloAdm = new DefaultTableModel(new Object[]{"Cpf","Nome",
                                        "Cargo", "Rg","DataNasc","Telefone",
                                        "Endereco", "Login", "Senha", "Salario"},0);
            
        for(int i=0;i<ListaAdm.size();i++){
            Object linha[] = new Object[]{ListaAdm.get(i).getCpf(),
                                          ListaAdm.get(i).getNome(),
                                          ListaAdm.get(i).getCargo(),
                                          ListaAdm.get(i).getRg(),
                                          ListaAdm.get(i).getDataNasc(),
                                          ListaAdm.get(i).getTelefone(),
                                          ListaAdm.get(i).getEndereco(),
                                          ListaAdm.get(i).getLogin(),
                                          ListaAdm.get(i).getSenha(),
                                          ListaAdm.get(i).getSalario()};
            modeloAdm.addRow(linha);
        }
        
        tbl_adm_adms.setModel(modeloAdm);
    }
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
    public AdministradorView() {
        initComponents();
        setLocationRelativeTo(null);
        ListaAdm = new ArrayList();
        ListaProd = new ArrayList();
        ListaCli = new ArrayList();
        modoAdm = "Navegar";
        modoProd = "Navegar";
        modoCli = "Navegar";
        ManipulaInterfaceAdm();
        ManipulaInterfaceProd();
        ManipulaInterfaceCli();
    }
    
    public void ManipulaInterfaceAdm(){
        switch(modoAdm){
            case "Navegar":
                btn_adm_salvar.setEnabled(false);
                btn_adm_cancelar.setEnabled(false);
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
                btn_adm_editar.setEnabled(false);
                btn_adm_excluir.setEnabled(false);
                c_adm_cargo.setEnabled(false);
                break;
            
            case "Novo":
                btn_adm_salvar.setEnabled(true);
                btn_adm_cancelar.setEnabled(true);
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
                btn_adm_editar.setEnabled(false);
                btn_adm_excluir.setEnabled(false);
                break;
                
            case "Editar":
                btn_adm_salvar.setEnabled(true);
                btn_adm_cancelar.setEnabled(true);
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
                btn_adm_editar.setEnabled(false);
                btn_adm_excluir.setEnabled(false);
                break;
                
            case "Excluir":
                btn_adm_salvar.setEnabled(false);
                btn_adm_cancelar.setEnabled(false);
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
                btn_adm_editar.setEnabled(false);
                btn_adm_excluir.setEnabled(false);
                break;
                
            case "Selecao":
                btn_adm_salvar.setEnabled(false);
                btn_adm_cancelar.setEnabled(false);
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
                btn_adm_editar.setEnabled(true);
                btn_adm_excluir.setEnabled(true);
                break;
            default: System.out.println("Modo inválido");
        }
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
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        c_adm_cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_adm_nome = new javax.swing.JTextField();
        btn_adm_salvar = new javax.swing.JButton();
        btn_adm_cancelar = new javax.swing.JButton();
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
        jPanel2 = new javax.swing.JPanel();
        btn_adm_editar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_adm_adms = new javax.swing.JTable();
        btn_adm_excluir = new javax.swing.JButton();
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

        jPanel1.setBackground(new java.awt.Color(13, 62, 118));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Funcionário"));

        jLabel3.setText("CPF:");

        jLabel4.setText("Nome:");

        btn_adm_salvar.setText("Salvar");
        btn_adm_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_salvarActionPerformed(evt);
            }
        });

        btn_adm_cancelar.setText("Cancelar");
        btn_adm_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_cancelarActionPerformed(evt);
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
                                .addGap(0, 219, Short.MAX_VALUE)
                                .addComponent(btn_adm_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btn_adm_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_adm_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(btn_adm_cancelar)
                    .addComponent(btn_adm_novo))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Funcionário", jPanel1);

        jPanel2.setBackground(new java.awt.Color(13, 62, 118));

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
                "Cpf", "Nome", "Cargo", "Rg", "Data Nasc", "Telefone", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_adm_adms);
        if (tbl_adm_adms.getColumnModel().getColumnCount() > 0) {
            tbl_adm_adms.getColumnModel().getColumn(0).setResizable(false);
            tbl_adm_adms.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_adm_adms.getColumnModel().getColumn(1).setResizable(false);
            tbl_adm_adms.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbl_adm_adms.getColumnModel().getColumn(2).setResizable(false);
            tbl_adm_adms.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbl_adm_adms.getColumnModel().getColumn(3).setResizable(false);
            tbl_adm_adms.getColumnModel().getColumn(4).setResizable(false);
            tbl_adm_adms.getColumnModel().getColumn(5).setResizable(false);
            tbl_adm_adms.getColumnModel().getColumn(6).setResizable(false);
        }

        btn_adm_excluir.setText("Excluir");
        btn_adm_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adm_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btn_adm_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_adm_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adm_editar)
                    .addComponent(btn_adm_excluir))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionários", jPanel2);

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

    private void btn_adm_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_excluirActionPerformed
        modoAdm = "Navegar";
        ManipulaInterfaceAdm();
    }//GEN-LAST:event_btn_adm_excluirActionPerformed

    private void btn_adm_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_editarActionPerformed
        modoAdm = "Editar";
        ManipulaInterfaceAdm();
    }//GEN-LAST:event_btn_adm_editarActionPerformed

    private void btn_adm_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_novoActionPerformed
        modoAdm = "Novo";
        ManipulaInterfaceAdm();
    }//GEN-LAST:event_btn_adm_novoActionPerformed

    private void btn_adm_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adm_cancelarActionPerformed
        modoAdm = "Navegar";
        ManipulaInterfaceAdm();
    }//GEN-LAST:event_btn_adm_cancelarActionPerformed

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
        a.setLogin(c_adm_nasc.getText());
        a.setSenha(c_adm_tel.getText());
        a.setSalario(Long.parseLong(c_adm_sal.getText()));
        
        dao.create(a);
        
        modoAdm = "Navegar";
        ManipulaInterfaceAdm();
        limpaTextoAdm();
        
        
//        Administrador F = new Administrador();
//        F.setCpf(Long.parseLong(c_adm_cpf.getText()));
//        F.setNome(c_adm_nome.getText());
//        F.setCargo(c_adm_cargo.getText());
//        F.setRg(Long.parseLong(c_adm_rg.getText()));
//        F.setDataNasc(c_adm_nasc.getText());
//        F.setTelefone(Long.parseLong(c_adm_tel.getText()));
//        F.setEndereco(c_adm_ende.getText());
//        F.setLogin(c_adm_nasc.getText());
//        F.setSenha(c_adm_tel.getText());
//        F.setSalario(Long.parseLong(c_adm_sal.getText()));
//
//        ListaAdm.add(F);
//        LoadTableAdm();
//        modoAdm = "Navegar";
//        ManipulaInterfaceAdm();
//        limpaTextoAdm();
    }//GEN-LAST:event_btn_adm_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adm_cancelar;
    private javax.swing.JButton btn_adm_editar;
    private javax.swing.JButton btn_adm_excluir;
    private javax.swing.JButton btn_adm_novo;
    private javax.swing.JButton btn_adm_salvar;
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
    private javax.swing.JTextField c_cli_cpf;
    private javax.swing.JTextField c_cli_email;
    private javax.swing.JTextField c_cli_nome;
    private javax.swing.JTextField c_prod_nome;
    private javax.swing.JTextField c_prod_qtd;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_adm_adms;
    private javax.swing.JTable tbl_cli_clis;
    private javax.swing.JTable tbl_prod_prods;
    // End of variables declaration//GEN-END:variables
}



