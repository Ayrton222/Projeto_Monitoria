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
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(int id) {
        super(id);
    }

    public PessoaJuridica(String nome) {
        super(nome);
    }

    public PessoaJuridica(String nome,String cnpj, String nomeFantasia) {
        super(nome);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }
    
     public PessoaJuridica(int id,String nome,String cnpj, String nomeFantasia) {
        super(id,nome);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String noemFantasia) {
        this.nomeFantasia = noemFantasia;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + ", noemFantasia=" + nomeFantasia + '}';
    }
    
    
}
