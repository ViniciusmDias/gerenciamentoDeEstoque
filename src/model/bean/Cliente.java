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
public class Cliente {
    
    Long Cpf;
    String Nome;
    String Email;

    public Cliente() {
    }

    public Cliente(String Nome, String Email, Long Cpf) {
        this.Nome = Nome;
        this.Email = Email;
        this.Cpf = Cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Long getCpf() {
        return Cpf;
    }

    public void setCpf(Long Cpf) {
        this.Cpf = Cpf;
    }
    
    
}
