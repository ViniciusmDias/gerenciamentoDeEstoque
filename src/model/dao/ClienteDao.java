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
import model.bean.Cliente;

/**
 *
 * @author viniciusdias
 */
public class ClienteDao {
    
    public void create(Cliente c) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Clientes (Cpf, Nome, Email)VALUES(?, ?, ?)");
            stmt.setLong(1, c.getCpf());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getEmail());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar "+ex);
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);   
        }
    }
    
    public List<Cliente> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Clientes");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Cliente cliente = new Cliente();
                
                cliente.setCpf(rs.getLong("Cpf"));
                cliente.setNome(rs.getString("Nome"));
                cliente.setEmail(rs.getString("Email"));
                
                clientes.add(cliente);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar os clientes"+ex);
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);   
        }
        return clientes;
        
    }
        public void update(Cliente c) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Clientes SET Cpf = ?, Nome = ?, Email = ? WHERE Nome = ?");
            stmt.setLong(1, c.getCpf());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getEmail());
            
            stmt.setString(4, c.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+ex);
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);   
        }
    }
}

