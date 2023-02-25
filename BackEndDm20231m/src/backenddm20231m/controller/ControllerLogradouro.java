/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.controller;

import backenddm20231m.model.bean.Logradouro;
import backenddm20231m.model.dao.DaoLogradouro;
import java.util.List;
/**
 *
 * @author Usuário
 */
public class ControllerLogradouro {
    
    DaoLogradouro daoLog;

    public Logradouro inserir(Logradouro logEntrada) {
        daoLog = new DaoLogradouro();
        return daoLog.inserir(logEntrada);
    }

    public List<Logradouro> listar(Logradouro logEntrada) {
        daoLog = new DaoLogradouro();
        return daoLog.listar(logEntrada);
    }

    public Logradouro alterar(Logradouro logEntrada) {
       daoLog = new DaoLogradouro();
        return daoLog.alterar(logEntrada);
    }

    public Logradouro buscar(Logradouro logEntrada) {
        daoLog = new DaoLogradouro();
        return daoLog.buscar(logEntrada);
    }

    public Logradouro excluir(Logradouro logEntrada) {
        daoLog = new DaoLogradouro();
        return daoLog.excluir(logEntrada);
    }
}
