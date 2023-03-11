/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.view;

import backenddm20231m.controller.ControllerPessoa;
import backenddm20231m.model.bean.Pessoa;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ManterPessoa {
    
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
        //String cpf = JOptionPane.showInputDialog("Cpf");
        String tipo = JOptionPane.showInputDialog("Tipo");
        //String email = JOptionPane.showInputDialog("Email");
        Pessoa pesEntrada = new Pessoa(nome,tipo);
        ControllerPessoa contpes = new ControllerPessoa();
        Pessoa pesSaida = contpes.inserir(pesEntrada);
        JOptionPane.showMessageDialog(null,pesSaida.toString());
    }

    public static void alterar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String nome = JOptionPane.showInputDialog("NOME");
        //String cpf = JOptionPane.showInputDialog("Cpf");
        String tipo = JOptionPane.showInputDialog("Tipo");
        //String email = JOptionPane.showInputDialog("Email");
        Pessoa pesEntrada = new Pessoa(id,nome,tipo);
        ControllerPessoa contpes = new ControllerPessoa();
        Pessoa pesSaida = contpes.alterar(pesEntrada);
        JOptionPane.showMessageDialog(null,pesSaida.toString());
    }
    public static void buscar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Pessoa pesEntrada = new Pessoa(id);
        ControllerPessoa contpes = new ControllerPessoa();
        Pessoa pesSaida = contpes.buscar(pesEntrada);
        JOptionPane.showMessageDialog(null,pesSaida.toString());
    }
    public static void excluir() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
         Pessoa pesEntrada = new Pessoa(id);
        ControllerPessoa contpes = new ControllerPessoa();
        Pessoa pesSaida = contpes.excluir(pesEntrada);
        JOptionPane.showMessageDialog(null,pesSaida.toString());
    }
    public static void listar() {
        String nome = JOptionPane.showInputDialog("NOME");
        Pessoa pesEntrada = new Pessoa(nome);
        
        ControllerPessoa contpes = new ControllerPessoa();
        List<Pessoa> listaPes = contpes.listar(pesEntrada);
         for(Pessoa pesSaida : listaPes) {
            JOptionPane.showMessageDialog(null, pesSaida.toString());
        }
        
        //JOptionPane.showMessageDialog(null,pes.toString());
       
       
    }

    
}
