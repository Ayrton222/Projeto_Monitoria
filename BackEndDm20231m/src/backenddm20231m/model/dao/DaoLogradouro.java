/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.model.dao;

import backenddm20231m.model.bean.Logradouro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuário
 */

public class DaoLogradouro {

    public Logradouro inserir(Logradouro logEntrada) {
         return logEntrada;
    }

    public List<Logradouro> listar(Logradouro logEntrada) {
      List<Logradouro> listaPes = new ArrayList<>();
      listaPes.add(logEntrada);
      return listaPes;
    }

    public Logradouro alterar(Logradouro logEntrada) {
        return logEntrada;
    }

    public Logradouro buscar(Logradouro logEntrada) {
       return logEntrada;
    }

    public Logradouro excluir(Logradouro logEntrada) {
        return logEntrada;
    }
    
    
}
