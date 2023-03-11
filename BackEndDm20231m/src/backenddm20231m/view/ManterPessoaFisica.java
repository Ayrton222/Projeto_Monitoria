/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.view;

import backenddm20231m.controller.ControllerPessoaFisica;
import backenddm20231m.model.bean.PessoaFisica;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lab04aluno
 */
public class ManterPessoaFisica {
    
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
        String email = JOptionPane.showInputDialog("EMAIL");
        String cpf = JOptionPane.showInputDialog("CPF");
        String rg = JOptionPane.showInputDialog("RG");
        PessoaFisica PFentrada = new PessoaFisica(nome,email,cpf,rg);
        ControllerPessoaFisica contPf = new ControllerPessoaFisica();
        PessoaFisica PFsaida = contPf.inserir(PFentrada);
        JOptionPane.showMessageDialog(null,PFsaida.toString());
    }

    public static void alterar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String nome = JOptionPane.showInputDialog("NOME");
        String email = JOptionPane.showInputDialog("EMAIL");
        String cpf = JOptionPane.showInputDialog("CPF");
        String rg = JOptionPane.showInputDialog("RG");
        PessoaFisica PFentrada = new PessoaFisica(nome,email,cpf,rg);
        ControllerPessoaFisica contPf = new ControllerPessoaFisica();
        PessoaFisica PFsaida = contPf.inserir(PFentrada);
        JOptionPane.showMessageDialog(null,PFsaida.toString());

    }
    public static void buscar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        PessoaFisica PFentrada = new PessoaFisica(id);
        ControllerPessoaFisica contPf = new ControllerPessoaFisica();
        PessoaFisica PFsaida = contPf.buscar(PFentrada);
        JOptionPane.showMessageDialog(null,PFsaida.toString());
    }
    public static void excluir() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        PessoaFisica PFentrada = new PessoaFisica(id);
        ControllerPessoaFisica contPf = new ControllerPessoaFisica();
        PessoaFisica PFsaida = contPf.excluir(PFentrada);
        JOptionPane.showMessageDialog(null,PFsaida.toString());
    }
    public static void listar() {
        String nome = JOptionPane.showInputDialog("Nome");
        PessoaFisica PFentrada = new PessoaFisica(nome);
        ControllerPessoaFisica contPf = new ControllerPessoaFisica();
        List<PessoaFisica> listaPf = contPf.listar(PFentrada);
        for(PessoaFisica PFsaida : listaPf) 
            JOptionPane.showMessageDialog(null,PFentrada.toString());
        }
     
}
