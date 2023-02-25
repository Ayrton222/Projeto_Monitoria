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

/*
create table fateczs20231m.usuarios (
  id BIGINT NOT NULL AUTO_INCREMENT,
  login VARCHAR(255),
  senha VARCHAR(255),
  status VARCHAR(255),
  tipo VARCHAR(255),
  primary key (id));
*/

public class Usuario {
    
    private int id;
    private String login;
    private String senha;
    private String status;
    private String tipo;
    
    // crud;
    // inserir (login,senha,status,tipo)
    // alterar (id,login,senha,status,tipo)
    // excluir/buscar (id)
    // listar (login)
    // validar (login,senha)

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String login) {
        this.login = login;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String login, String senha, String status, String tipo) {
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
    }

    public Usuario(int id, String login, String senha, String status, String tipo) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", login=" + login + ", senha=" + senha + ", status=" + status + ", tipo=" + tipo + '}';
    }
    
}
