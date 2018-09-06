/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Administrador;

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
    
}
