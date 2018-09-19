/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Produto;
import model.dao.ProdutoDao;

/**
 *
 * @author viniciusdias
 */
public class ProdutoControl {
    
    
    public static void salvarProduto(String Nome, int Quantidade) {
        
        Produto p = new Produto(Nome, Quantidade);
        ProdutoDao dao = new ProdutoDao();
        p.setNome(Nome);
        p.setQuantidade(Quantidade);
        
        dao.create(p);
        
        
    }
    public static void getProduto(DefaultTableModel dtm) {
    DefaultTableModel modelo = (DefaultTableModel) dtm;
    modelo.setNumRows(0);
    ProdutoDao pdao = new ProdutoDao();

        for(Produto p: pdao.read()){

            modelo.addRow(new Object[]{

                p.getQuantidade(),
                p.getNome()
            });
        }    
    
    }
    
    public static void updateProduto(String Nome, int Quantidade) {
        
        Produto p = new Produto(Nome, Quantidade);
        ProdutoDao dao = new ProdutoDao();
        p.setNome(Nome);
        p.setQuantidade(Quantidade);
        
        dao.update(p);
        
        
    }
    public static void deletarProduto(String dtm) {
        
        Produto p = new Produto();
        ProdutoDao dao = new ProdutoDao();

        p.setNome(dtm);

        dao.delete(p);

        
    }
    
}
