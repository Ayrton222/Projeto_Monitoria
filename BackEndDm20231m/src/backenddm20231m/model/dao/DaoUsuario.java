/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.model.dao;

import backenddm20231m.model.bean.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class DaoUsuario {

    public Usuario inserir(Usuario usuEntrada) {
       return usuEntrada;
    }

    public Usuario validar(Usuario usuEnt) {
        Usuario usuSaida = new Usuario("BITTENCOURT","ABFABF");
        return usuSaida;
    }

    public Usuario alterar(Usuario usuEntrada) {
        return usuEntrada;
    }

    public Usuario buscar(Usuario usuEntrada) {
       return usuEntrada;
    }

    public Usuario excluir(Usuario usuEntrada) {
        return usuEntrada;
    }

    public List<Usuario> listar(Usuario usuEntrada) {
        List<Usuario> listaUsu = new ArrayList<>();
        listaUsu.add(usuEntrada);
        return listaUsu;
    }
    
}
