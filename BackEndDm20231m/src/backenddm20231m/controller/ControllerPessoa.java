/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.controller;

import backenddm20231m.model.bean.Pessoa;
import backenddm20231m.model.dao.DaoPessoa;
import java.util.List;

/**
 *
 * @author User
 */
public class ControllerPessoa {

    DaoPessoa daoPes;
    public Pessoa inserir(Pessoa pesEntrada) {
       daoPes = new DaoPessoa();
       return daoPes.inserir(pesEntrada);
    }

    public Pessoa alterar(Pessoa pesEntrada) {
        daoPes = new DaoPessoa();
       return daoPes.alterar(pesEntrada);
    }

    public List<Pessoa> listar(Pessoa pesEntrada) {
         daoPes = new DaoPessoa();
        return daoPes.listar(pesEntrada);
    }

    public Pessoa buscar(Pessoa pesEntrada) {
         daoPes = new DaoPessoa();
        return daoPes.buscar(pesEntrada);
    }

    public Pessoa excluir(Pessoa pesEntrada) {
       daoPes = new DaoPessoa();
        return daoPes.excluir(pesEntrada);
    }


    
}
