/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m;

import backenddm20231m.view.ManterLogradouro;
import backenddm20231m.view.ManterPessoa;
import backenddm20231m.view.ManterPessoaFisica;
import backenddm20231m.view.ManterPessoaJuridica;
import backenddm20231m.view.ManterUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class BackEndDm20231m {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        if(ManterUsuario.validar()) {
            menu();
        } else {
            JOptionPane.showMessageDialog(null,"Usuario Inválido");            
        }
    }

    public static void menu() throws SQLException, ClassNotFoundException {
        String msg = " 0 - Sair \n 1 - Usuario \n 2 - Pessoa \n 3 - Pessoa Fisica \n 4 - Pesosa Juridica  \n 5 - Logradouro \n";
        int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
        switch (num) {
            case 0:
                int sair = JOptionPane.showConfirmDialog(null,"Deseja Sair");
                if (sair > 0) menu();
                break;
            case 1:
                ManterUsuario.menu();
                break;
            case 2:
                ManterPessoa.menu();
                break;
            case 3:
                 ManterPessoaFisica.menu();
                break;
            case 4:
              ManterPessoaJuridica.menu();
                break;
            case 5:
                ManterLogradouro.menu();
                break;
            default:
                System.out.println("Opção inválido");
        }
    }
    
}
