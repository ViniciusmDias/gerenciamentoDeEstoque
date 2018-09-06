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
abstract class Funcionario {
    public long Cpf;
    public String Nome;
    public String Cargo;   
    public long Rg;
    public String DataNasc;
    public long Telefone;
    public String Endereco;
    public String Login;
    public String Senha;
    public long Salario;
    
    public abstract void getCpf();
    public abstract void setCpf();
    public abstract void getNome();
    public abstract void setNome();
    public abstract void getCargo();
    public abstract void setCargo();
    public abstract void getRg();
    public abstract void setRg();
    public abstract void getDataNasc();
    public abstract void setDataNasc();
    public abstract void getTelefone();
    public abstract void setTelefone();
    public abstract void getEndereco();
    public abstract void setEndereco();
    public abstract void getLogin();
    public abstract void setLogin();
    public abstract void getSenha();
    public abstract void setSenha();
    public abstract void getSalario();
    public abstract void setSalario();

}