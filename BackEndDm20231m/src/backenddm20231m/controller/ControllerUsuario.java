/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.controller;

import backenddm20231m.model.bean.Pessoa;
import backenddm20231m.model.bean.Usuario;
import backenddm20231m.model.dao.DaoUsuario;
import java.util.List;

/**
 *
 * @author User
 */
public class ControllerUsuario {

    DaoUsuario daoUsu;

    public Usuario inserir(Usuario usuEntrada) {
        daoUsu = new DaoUsuario();
        return daoUsu.inserir(usuEntrada);
    }

    public boolean validar(Usuario usuEnt) {
        boolean retorno = false;
        daoUsu = new DaoUsuario();
        Usuario usuSaida = daoUsu.validar(usuEnt);
        if(usuEnt.getLogin().equals(usuSaida.getLogin())) {
            if(usuEnt.getSenha().equals(usuSaida.getSenha())) {
                retorno = true;
            }
        }
        
        return retorno;
    }

    public Usuario alterar(Usuario usuEntrada) {
        daoUsu = new DaoUsuario();
        return daoUsu.alterar(usuEntrada);
    }

    public Usuario buscar(Usuario usuEntrada) {
        daoUsu = new DaoUsuario();
        return daoUsu.buscar(usuEntrada);
    }

    public Usuario excluir(Usuario usuEntrada) {
        daoUsu = new DaoUsuario();
        return daoUsu.excluir(usuEntrada);
    }

    public List<Usuario> listar(Usuario usuEntrada) {
       daoUsu = new DaoUsuario();
       return daoUsu.listar(usuEntrada);
    }
    
}
