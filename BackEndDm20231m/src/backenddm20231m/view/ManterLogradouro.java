/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.view;

import backenddm20231m.controller.ControllerLogradouro;
import backenddm20231m.model.bean.Logradouro;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuário
 */
public class ManterLogradouro {
    public static void inserir(){
        String cep = JOptionPane.showInputDialog("Cep");
        String End = JOptionPane.showInputDialog("End");
        String Num = JOptionPane.showInputDialog("Num");
        String Comp = JOptionPane.showInputDialog("Comp");
        Logradouro logEntrada = new Logradouro(End,cep, Num, Comp);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSaida = contLog.inserir(logEntrada);
        JOptionPane.showMessageDialog(null, logSaida.toString());
    }
    
    public static void listar() {
        String End = JOptionPane.showInputDialog("End");
        Logradouro logEntrada = new Logradouro(End);
        ControllerLogradouro contLog = new ControllerLogradouro();
        List<Logradouro> listalogSaida = contLog.listar(logEntrada);
        for(Logradouro log : listalogSaida) {
            JOptionPane.showMessageDialog(null, log.toString());
        }
   }
    
     public static void alterar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String cep = JOptionPane.showInputDialog("Cep");
        String End = JOptionPane.showInputDialog("End");
        String Num = JOptionPane.showInputDialog("Num");
        String Comp = JOptionPane.showInputDialog("Comp");
        Logradouro logEntrada = new Logradouro(id,End,cep , Num, Comp);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSaida = contLog.alterar(logEntrada);
        JOptionPane.showMessageDialog(null, logSaida.toString());
    }
     
      public static void buscar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Logradouro logEntrada = new Logradouro(id);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSaida = contLog.buscar(logEntrada);
        JOptionPane.showMessageDialog(null, logSaida.toString());
    }
      
      public static void excluir() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Logradouro logEntrada = new Logradouro(id);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSaida = contLog.excluir(logEntrada);
        JOptionPane.showMessageDialog(null, logSaida.toString());
    }
         
     public static void menu() {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("0 - Sair \n 1 - Inserir \n 2 - Alterar \n 3 - Excluir \n 4 - Buscar \n 5 - Listar"));
        switch (operacao) {
            case 0:
               int sair = JOptionPane.showConfirmDialog(null,"Deseja Sair");
               System.out.println("Valor de Sair = " + sair);
               if(sair > 0) menu();
               break;
            case 1:
               inserir();
               break;
           case 2:
               alterar();
               break;
           case 3:
               excluir();
               break;
           case 4:
               buscar();
               break;
           case 5:
               listar();
               break;
           default:
               JOptionPane.showMessageDialog(null,"Erro opcao invalida");
               menu();
               break;
        }
    }    
}
