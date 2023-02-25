/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.view;

import backenddm20231m.controller.ControllerUsuario;
import backenddm20231m.model.bean.Pessoa;
import backenddm20231m.model.bean.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ManterUsuario {
    
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

    public static boolean validar() {
        String login = JOptionPane.showInputDialog("LOGIN");
        String senha = JOptionPane.showInputDialog("SENHA");
        Usuario usuEnt = new Usuario(login, senha);
        ControllerUsuario contUsu = new ControllerUsuario();
        return contUsu.validar(usuEnt);
    }


    public static void inserir() {
        String login = JOptionPane.showInputDialog("LOGIN");
        String senha = JOptionPane.showInputDialog("SENHA");
        String status = JOptionPane.showInputDialog("STATUS");
        String tipo = JOptionPane.showInputDialog("TIPO");
        Usuario usuEntrada = new Usuario(login, senha, status, tipo);
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSaida = contUsu.inserir(usuEntrada);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
    }

    public static void alterar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String login = JOptionPane.showInputDialog("LOGIN");
        String senha = JOptionPane.showInputDialog("SENHA");
        String status = JOptionPane.showInputDialog("STATUS");
        String tipo = JOptionPane.showInputDialog("TIPO");
        Usuario usuEntrada = new Usuario(id,login, senha, status, tipo);
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSaida = contUsu.alterar(usuEntrada);
        JOptionPane.showMessageDialog(null,usuSaida.toString());

    }
    public static void buscar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario usuEntrada = new Usuario(id);
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSaida = contUsu.buscar(usuEntrada);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
    }
    public static void excluir() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario usuEntrada = new Usuario(id);
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSaida = contUsu.excluir(usuEntrada);
        JOptionPane.showMessageDialog(null,usuSaida.toString());
    }
    public static void listar() {
        String login = JOptionPane.showInputDialog("LOGIN");
        Usuario usuEntrada = new Usuario(login);
        ControllerUsuario contUsu = new ControllerUsuario();
        List<Usuario> listaUsu = contUsu.listar(usuEntrada);
        for(Usuario usuSaida : listaUsu) 
            JOptionPane.showMessageDialog(null,usuSaida.toString());
        }
    }

