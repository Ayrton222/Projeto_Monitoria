/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.model.dao;

import backenddm20231m.model.bean.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lab04aluno
 */
public class DaoPessoaJuridica {

    public PessoaJuridica inserir(PessoaJuridica PJentrada) {
        return PJentrada;    
    }

    public PessoaJuridica alterar(PessoaJuridica PJentrada) {
        return PJentrada;
    }

    public PessoaJuridica buscar(PessoaJuridica PJentrada) {
        return PJentrada;
    }

    public PessoaJuridica excluir(PessoaJuridica PJentrada) {
        return PJentrada;
    }

    public List<PessoaJuridica> listar(PessoaJuridica PJentrada) {
      List<PessoaJuridica> listaPes = new ArrayList<>();
      listaPes.add(PJentrada);
      return listaPes;
    }
    
}
