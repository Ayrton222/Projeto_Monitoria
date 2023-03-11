/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.model.bean;

/**
 *
 * @author User
 */
public class Pessoa {
    
    private int id;
    private String nome;
    //private String cpf;
    private String tipo;
    //private String email;

    public Pessoa(int id) {
        this.id = id;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Pessoa(int id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    
    /*
    // Criação do construct de Pessoa
    public Pessoa(String nome, String cpf, String tipo, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = tipo;
        this.email = email;
    }

    public Pessoa(int id, String nome, String cpf, String tipo, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = tipo;
        this.email = email;
    }
    */
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
*/
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /*
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    */
    
@Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + '}';
    }

 
    
}
