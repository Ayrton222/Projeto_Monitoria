/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.model.dao;
import backenddm20231m.model.bean.Pessoa;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class DaoPessoa {

    public Pessoa inserir(Pessoa pesEntrada) {
       return pesEntrada;
    }

    public Pessoa buscar(Pessoa pesEntrada) {
        return pesEntrada;
    }

    public Pessoa excluir(Pessoa pesEntrada) {
        return pesEntrada;
    }

    public Pessoa alterar(Pessoa pesEntrada) {
       return pesEntrada;
    }
    
    public List<Pessoa> listar(Pessoa pesEntrada) {
      List<Pessoa> listaPes = new ArrayList<>();
      listaPes.add(pesEntrada);
      return listaPes;
    } 
}
