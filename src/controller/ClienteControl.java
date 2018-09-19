/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.table.DefaultTableModel;
import model.bean.Cliente;
import model.dao.ClienteDao;

/**
 *
 * @author viniciusdias
 */
public class ClienteControl {
    
    
    public static void salvarCliente(String Nome, String Email, String Cpf) {
        
        Cliente c = new Cliente(Nome, Email, Cpf);
        ClienteDao dao = new ClienteDao();
        c.setNome(Nome);
        c.setEmail(Email);
        c.setCpf(Cpf);
        
        dao.create(c);  
    }
    
    public static void getCliente(DefaultTableModel dtm) {
        DefaultTableModel modelo = (DefaultTableModel) dtm;
        modelo.setNumRows(0);
        ClienteDao pdao = new ClienteDao();

        for(Cliente c: pdao.read()){

            modelo.addRow(new Object[]{

                c.getCpf(),
                c.getNome(),
                c.getEmail()


            });
        }    
    }
    
    public static void updateCliente(String Nome, String Email, String Cpf) {
        
        Cliente c = new Cliente(Nome, Email, Cpf);
        ClienteDao dao = new ClienteDao();
        c.setNome(Nome);
        c.setEmail(Email);
        c.setCpf(Cpf);
        
        dao.update(c); 
        
    }
    public static void deletarCliente(String dtm) {
        
        Cliente c = new Cliente();
        ClienteDao dao = new ClienteDao();

        c.setNome(dtm);

        dao.delete(c);
    }
    
}
