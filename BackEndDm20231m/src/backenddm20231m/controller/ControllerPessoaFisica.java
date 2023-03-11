/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.controller;

import backenddm20231m.model.bean.PessoaFisica;
import backenddm20231m.model.dao.DaoPessoaFisica;
import java.util.List;

/**
 *
 * @author lab04aluno
 */
public class ControllerPessoaFisica {

    DaoPessoaFisica daoPf;
    public PessoaFisica inserir(PessoaFisica PFentrada) {
        daoPf = new DaoPessoaFisica();
       return daoPf.inserir(PFentrada);
    }

    public PessoaFisica buscar(PessoaFisica PFentrada) {
        daoPf = new DaoPessoaFisica();
       return daoPf.buscar(PFentrada);
    }

    public PessoaFisica excluir(PessoaFisica PFentrada) {
        daoPf = new DaoPessoaFisica();
       return daoPf.excluir(PFentrada);
    }

    public List<PessoaFisica> listar(PessoaFisica PFentrada) {
        daoPf = new DaoPessoaFisica();
       return daoPf.listar(PFentrada);
    }
    
}
