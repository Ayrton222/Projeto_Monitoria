/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.model.dao;

import backenddm20231m.model.bean.PessoaFisica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lab04aluno
 */
public class DaoPessoaFisica {

    public PessoaFisica inserir(PessoaFisica PFentrada) {
        return PFentrada;
    }

    public PessoaFisica buscar(PessoaFisica PFentrada) {
       return PFentrada;
    }

    public PessoaFisica excluir(PessoaFisica PFentrada) {
        return PFentrada;  
    }

    public List<PessoaFisica> listar(PessoaFisica PFentrada) {
      List<PessoaFisica> listaPes = new ArrayList<>();
      listaPes.add(PFentrada);
      return listaPes;
    }
    
}
