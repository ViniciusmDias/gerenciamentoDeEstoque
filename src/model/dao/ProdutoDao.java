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
import model.bean.Produto;
import model.bean.Produto;

/**
 *
 * @author viniciusdias
 */
public class ProdutoDao {
    
    public void create(Produto p) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO Produto (Nome, Quantidade)VALUES(?, ?)");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQuantidade());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar "+ex);
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    public List<Produto> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> prods = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Produto");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Produto prod = new Produto();
                
                prod.setQuantidade(rs.getInt("Quantidade"));
                prod.setNome(rs.getString("Nome"));
                
                prods.add(prod);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar os produtos"+ex);
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);   
        }
        return prods;
        
    }
    public void update(Produto p) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Produto SET Nome = ?, Quantidade = ?, WHERE Nome = ?");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQuantidade());
            
            stmt.setString(3, p.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+ex);
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);   
        }
    }
    
}

