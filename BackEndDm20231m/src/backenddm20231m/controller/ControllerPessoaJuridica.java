/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.controller;
import backenddm20231m.model.bean.PessoaJuridica;
import backenddm20231m.model.dao.DaoPessoaJuridica;
import java.util.List;

/**
 *
 * @author lab04aluno
 */
public class ControllerPessoaJuridica {
    
      DaoPessoaJuridica daoPj;
    public PessoaJuridica inserir(PessoaJuridica PJentrada) {
        daoPj = new DaoPessoaJuridica();
       return daoPj.inserir(PJentrada);    
    }

    public PessoaJuridica alterar(PessoaJuridica PJentrada) {
        daoPj = new DaoPessoaJuridica();
       return daoPj.alterar(PJentrada);
    }

    public PessoaJuridica buscar(PessoaJuridica PJentrada) {
        daoPj = new DaoPessoaJuridica();
       return daoPj.buscar(PJentrada);
    }

    public PessoaJuridica excluir(PessoaJuridica PJentrada) {
        daoPj = new DaoPessoaJuridica();
       return daoPj.excluir(PJentrada);
    }

    public List<PessoaJuridica> listar(PessoaJuridica PJentrada) {
        daoPj = new DaoPessoaJuridica();
       return daoPj.listar(PJentrada);    
    }
    
}
