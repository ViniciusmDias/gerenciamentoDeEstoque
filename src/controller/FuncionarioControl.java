/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.table.DefaultTableModel;
import model.bean.Funcionario;
import model.dao.FuncionarioDao;

/**
 *
 * @author viniciusdias
 */
public class FuncionarioControl {
    
    
    public static void salvarFuncionario(String Cpf, String Nome, String Cargo, long Rg, String DataNasc,
                        long Telefone, String Endereco, String Login, String Senha, long Salario) {
        
        Funcionario f = new Funcionario(Cpf, Nome, Cargo, Rg, DataNasc, Telefone, Endereco, Login, Senha, Salario);
        FuncionarioDao dao = new FuncionarioDao();
        f.setCpf(Cpf);
        f.setNome(Nome);
        f.setCargo(Cargo);
        f.setRg(Rg);
        f.setDataNasc(DataNasc);
        f.setTelefone(Telefone);
        f.setEndereco(Endereco);
        f.setLogin(Login);
        f.setSenha(Senha);
        f.setSalario(Salario);
        
        dao.create(f);  
    }
    
    public static void getFuncionario(DefaultTableModel dtm) {
        DefaultTableModel modelo = (DefaultTableModel) dtm;
        modelo.setNumRows(0);
        FuncionarioDao pdao = new FuncionarioDao();

        for(Funcionario f: pdao.read()){

            modelo.addRow(new Object[]{

                f.getCpf(),
                f.getNome(),
                f.getCargo(),
                f.getRg(),
                f.getDataNasc(),
                f.getTelefone(),
                f.getEndereco(),
                f.getLogin(),
                f.getSenha(),
                f.getSalario()

            });
        }    
    }
    
    public static void updateFuncionario(String Cpf, String Nome, String Cargo, long Rg, String DataNasc,
                        long Telefone, String Endereco, String Login, String Senha, long Salario) {
        
        Funcionario f = new Funcionario(Cpf, Nome, Cargo, Rg, DataNasc, Telefone, Endereco, Login, Senha, Salario);
        FuncionarioDao dao = new FuncionarioDao();
        f.setCpf(Cpf);
        f.setNome(Nome);
        f.setCargo(Cargo);
        f.setRg(Rg);
        f.setDataNasc(DataNasc);
        f.setTelefone(Telefone);
        f.setEndereco(Endereco);
        f.setLogin(Login);
        f.setSenha(Senha);
        f.setSalario(Salario);
        
        dao.update(f);  
    }
    
    public static void deletarFuncionario(String dtm) {
        
        Funcionario f = new Funcionario();
        FuncionarioDao dao = new FuncionarioDao();

        f.setNome(dtm);

        dao.delete(f);
    }
    
}
