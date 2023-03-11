/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.model.bean;

/**
 *
 * @author lab04aluno
 */
public class PessoaFisica extends Pessoa {
    
    private String email;
    private String cpf;
    private String rg;

    public PessoaFisica(int id) {
        super(id);
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(int id, String nome) {
        super(id, nome);
    }

    public PessoaFisica(int id, String nome, String email, String cpf, String rg) {
        super(id,nome);
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
    }

    public PessoaFisica(String nome, String email, String cpf, String rg) {
        super(nome);
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "email=" + email + ", cpf=" + cpf + ", rg=" + rg + '}';
    }

    
    
}
