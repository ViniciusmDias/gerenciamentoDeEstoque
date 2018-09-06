/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author viniciusdias
 */
public class Produto {
    
    String Nome;
    int Quantidade;
    
    public Produto() {
    }
    
    public Produto(String Nome, int Quantidade) {
        this.Nome = Nome;
        this.Quantidade = Quantidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    
}
