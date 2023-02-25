/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.model.bean;

/**
 *
 * @author Usuário
 */
public class Logradouro {
    private int id;
    private String endereco;
    private String cep;
    private String num;
    private String compl;

    public Logradouro(int id) {
        this.id = id;
    }

    public Logradouro(String endereco) {
        this.endereco = endereco;
    }

    public Logradouro(int id, String endereco, String cep, String num, String compl) {
        this.id = id;
        this.endereco = endereco;
        this.cep = cep;
        this.num = num;
        this.compl = compl;
    }

    public Logradouro(String endereco, String cep, String num, String compl) {
        this.endereco = endereco;
        this.cep = cep;
        this.num = num;
        this.compl = compl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }
    
     @Override
    public String toString() {
        return "Logradouro{" + "id=" + id + ", cep=" + cep + ", endereco=" + endereco + ", num=" + num + ", compl=" + compl + '}';
    }
    
}
