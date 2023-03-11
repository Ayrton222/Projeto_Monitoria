/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.view;

import backenddm20231m.controller.ControllerPessoaJuridica;
import backenddm20231m.model.bean.PessoaJuridica;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lab04aluno
 */
public class ManterPessoaJuridica {
 
    public static void menu() {
       
        String msg = " 1 - Inserir \n 2 - Alterar \n 3 - buscar \n 4 - excluir \n 5 - Listar " ;
        int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
        switch (num) {
            case 1:
                inserir();
                break;
            case 2:
                alterar();
                break;
            case 3:
                buscar();
                break;
            case 4:
                excluir();
                break;
            case 5:
                listar();
                break;
            default:
                System.out.println("Opcao inválida");
        }
    }


     public static void inserir() {
        String nome = JOptionPane.showInputDialog("NOME");
        String cnpj = JOptionPane.showInputDialog("CNPJ");
        String nomeFantasia = JOptionPane.showInputDialog("NomeFantasia");
        PessoaJuridica PJentrada = new PessoaJuridica(nome,cnpj,nomeFantasia);
        ControllerPessoaJuridica contPj = new ControllerPessoaJuridica();
        PessoaJuridica PJsaida = contPj.inserir(PJentrada);
        JOptionPane.showMessageDialog(null,PJsaida.toString());
    }

    public static void alterar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String nome = JOptionPane.showInputDialog("NOME");
        String cnpj = JOptionPane.showInputDialog("CNPJ");
        String nomeFantasia = JOptionPane.showInputDialog("NomeFantasia");
        PessoaJuridica PJentrada = new PessoaJuridica(nome,cnpj,nomeFantasia);
        ControllerPessoaJuridica contPj = new ControllerPessoaJuridica();
        PessoaJuridica PJsaida = contPj.alterar(PJentrada);
        JOptionPane.showMessageDialog(null,PJsaida.toString());

    }
    public static void buscar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        PessoaJuridica PJentrada = new PessoaJuridica(id);
        ControllerPessoaJuridica contPj = new ControllerPessoaJuridica();
        PessoaJuridica PJsaida = contPj.buscar(PJentrada);
        JOptionPane.showMessageDialog(null,PJsaida.toString());
    }
    public static void excluir() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        PessoaJuridica PJentrada = new PessoaJuridica(id);
        ControllerPessoaJuridica contPj = new ControllerPessoaJuridica();
        PessoaJuridica PJsaida = contPj.excluir(PJentrada);
        JOptionPane.showMessageDialog(null,PJsaida.toString());
    }
    public static void listar() {
        String nome = JOptionPane.showInputDialog("Nome");
        PessoaJuridica PJentrada = new PessoaJuridica(nome);
        ControllerPessoaJuridica contPj = new ControllerPessoaJuridica();
        List<PessoaJuridica> listaPj = contPj.listar(PJentrada);
        for(PessoaJuridica PJsaida : listaPj) 
            JOptionPane.showMessageDialog(null,PJentrada.toString());
        }
    
}

