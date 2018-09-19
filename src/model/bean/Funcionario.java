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


public class Funcionario  {
    private String Cpf;
    private String Nome;
    private String Cargo;   
    private long Rg;
    private String DataNasc;
    private long Telefone;
    private String Endereco;
    private String Login;
    private String Senha;
    private long Salario;

    public Funcionario() {
    }

    public Funcionario(String Cpf, String Nome, String Cargo, long Rg, String DataNasc,
                        long Telefone, String Endereco, String Login, String Senha, long Salario) {
        this.Cpf = Cpf;
        this.Nome = Nome;
        this.Cargo = Cargo;
        this.Rg = Rg;
        this.DataNasc = DataNasc;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Login = Login;
        this.Senha = Senha;
        this.Salario = Salario;
    }

    

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public long getRg() {
        return Rg;
    }

    public void setRg(long Rg) {
        this.Rg = Rg;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public long getTelefone() {
        return Telefone;
    }

    public void setTelefone(long Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public long getSalario() {
        return Salario;
    }

    public void setSalario(long Salario) {
        this.Salario = Salario;
    }
    
    
}