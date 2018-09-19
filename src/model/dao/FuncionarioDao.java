/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Funcionario;

/**
 *
 * @author viniciusdias
 */
public class FuncionarioDao {
    
    public void create(Funcionario a) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO Funcionario (Cpf, Nome, Cargo, Rg, DataNasc,"
                    + "Telefone, Endereco, Login, Senha, Salario)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, a.getCpf());
            stmt.setString(2, a.getNome());
            stmt.setString(3, a.getCargo());
            stmt.setString(4, a.getRg());
            stmt.setString(5, a.getDataNasc());
            stmt.setString(6, a.getTelefone());
            stmt.setString(7, a.getEndereco());
            stmt.setString(8, a.getLogin());
            stmt.setString(9, a.getSenha());
            stmt.setFloat(10, a.getSalario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar "+ex);
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }

    public List<Funcionario> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> funcs = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Funcionario");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Funcionario func = new Funcionario();
                func.setCpf(rs.getString("Cpf"));
                func.setNome(rs.getString("Nome"));
                func.setCargo(rs.getString("Cargo"));
                func.setRg(rs.getString("Rg"));
                func.setDataNasc(rs.getString("DataNasc"));
                func.setTelefone(rs.getString("Telefone"));
                func.setEndereco(rs.getString("Endereco"));
                func.setLogin(rs.getString("Login"));
                func.setSenha(rs.getString("Senha"));
                func.setSalario(rs.getLong("Salario"));
                
                funcs.add(func);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar os clientes"+ex);
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);   
        }
        return funcs;
        
    }
    public void update(Funcionario a) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Clientes SET Cpf = ?, Nome = ?, Cargo = ?, Rg = ?, "
                    + "DataNasc = ?, Telefone = ?, Endereco = ?, Login = ?, Senha = ?, Salario = ?, WHERE Nome = ?");
            stmt.setString(1, a.getCpf());
            stmt.setString(2, a.getNome());
            stmt.setString(3, a.getCargo());
            stmt.setString(4, a.getRg());
            stmt.setString(5, a.getDataNasc());
            stmt.setString(6, a.getTelefone());
            stmt.setString(7, a.getEndereco());
            stmt.setString(8, a.getLogin());
            stmt.setString(9, a.getSenha());
            stmt.setLong(10, a.getSalario());
            
            stmt.setString(11, a.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+ex);
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);   
        }
    }
    public void delete(Funcionario a) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM Funcionario WHERE Nome = ?");
            stmt.setString(1, a.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir "+ex);
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);   
        }
    }

    public boolean checkLogin(String Login, String Senha) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT cargo FROM Funcionario WHERE Login = ? and Senha = ?");
           
            stmt.setString(1, Login);
            stmt.setString(2, Senha);
            
            rs = stmt.executeQuery();
           
            
            if(rs.next()) {
                check = true;
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario ou Senha incorretos "+ex);
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);   
        }
        
        return check;
        
    }
    public String checkAdm(String Login, String Senha) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean administrador = false;
        String cargo = "";
        
        try {
            stmt = con.prepareStatement("SELECT cargo FROM Funcionario WHERE Login = ? and Senha = ?");
           
            stmt.setString(1, Login);
            stmt.setString(2, Senha);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {

                cargo = rs.getString("Cargo");
                
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario ou Senha incorretos "+ex);
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);   
        }
        
        return cargo;
                
        
    }
    
}
