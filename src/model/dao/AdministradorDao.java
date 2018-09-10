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
import model.bean.Administrador;
import model.bean.Cliente;

/**
 *
 * @author viniciusdias
 */
public class AdministradorDao {
    
    public void create(Administrador a) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO Administrador (Cpf, Nome, Cargo, Rg, DataNasc,"
                    + "Telefone, Endereco, Login, Senha, Salario)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setLong(1, a.getCpf());
            stmt.setString(2, a.getNome());
            stmt.setString(3, a.getCargo());
            stmt.setLong(4, a.getRg());
            stmt.setString(5, a.getDataNasc());
            stmt.setLong(6, a.getTelefone());
            stmt.setString(7, a.getEndereco());
            stmt.setString(8, a.getLogin());
            stmt.setString(9, a.getSenha());
            stmt.setFloat(10, a.getSalario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar "+ex);
            Logger.getLogger(AdministradorDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }

    public List<Administrador> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Administrador> adms = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Administrador");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Administrador adm = new Administrador();
                
                adm.setNome(rs.getString("Nome"));
                adm.setCargo(rs.getString("Cargo"));
                adm.setRg(rs.getLong("Rg"));
                adm.setDataNasc(rs.getString("DataNasc"));
                adm.setTelefone(rs.getLong("Telefone"));
                adm.setEndereco(rs.getString("Endereco"));
                adm.setLogin(rs.getString("Login"));
                adm.setSenha(rs.getString("Senha"));
                adm.setSalario(rs.getLong("Salario"));
                
                adms.add(adm);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar os clientes"+ex);
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);   
        }
        return adms;
        
    }
    public void update(Administrador a) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Clientes SET Cpf = ?, Nome = ?, Cargo = ?, Rg = ?, "
                    + "DataNasc = ?, Telefone = ?, Endereco = ?, Login = ?, Senha = ?, Salario = ?, WHERE Nome = ?");
            stmt.setLong(1, a.getCpf());
            stmt.setString(2, a.getNome());
            stmt.setString(3, a.getCargo());
            stmt.setLong(4, a.getRg());
            stmt.setString(5, a.getDataNasc());
            stmt.setLong(6, a.getTelefone());
            stmt.setString(7, a.getEndereco());
            stmt.setString(8, a.getLogin());
            stmt.setString(9, a.getSenha());
            stmt.setFloat(10, a.getSalario());
            
            stmt.setString(11, a.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+ex);
            Logger.getLogger(AdministradorDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);   
        }
    }
    public void delete(Administrador a) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM Administrador WHERE Nome = ?");
            stmt.setString(1, a.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir "+ex);
            Logger.getLogger(AdministradorDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);   
        }
    }

    public boolean checkLogin(String Login, String Senha) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        boolean administrador = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Administrador WHERE Login = ? and Senha = ?");
           
            stmt.setString(1, Login);
            stmt.setString(2, Senha);
            
            rs = stmt.executeQuery();
           
            
            if(rs.next()) {
                check = true;
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Senha incorreta "+ex);
            Logger.getLogger(AdministradorDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);   
        }
        
        return check;
        
    }
    
}
