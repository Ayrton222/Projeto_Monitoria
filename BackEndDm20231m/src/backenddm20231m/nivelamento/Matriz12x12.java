/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backenddm20231m.nivelamento;

import java.util.Random;

/**
 *
 * @author User
 */
public class Matriz12x12 {
    
    static Random random = new Random();
    static int[][] idades = new int[12][12];
    static int menor18;
    static int entre18e59;
    static int maior59;
    static int totalElementos;
    
    public static void main (String args[]) {
        for (int linha = 0; linha < 12; linha++) {
            for (int coluna = 0; coluna < 12; coluna++) {
                idades[linha][coluna] = random.nextInt(100);
                System.out.println(idades[linha][coluna]);
                totalElementos++;
            }
        }
        for (int linha = 0; linha < 12; linha++) {
            for (int coluna = 0; coluna < 12; coluna++) {
                if(idades[linha][coluna] < 18) {
                    menor18++;
                } else if((idades[linha][coluna] >= 18) && (idades[linha][coluna] <=59)) {
                    entre18e59++;            
                } else {
                    maior59++;   
                }    
            }
        }
        
        System.out.println("Total menor18 = " + menor18);
        System.out.println("Total entre18e59 = " + entre18e59);
        System.out.println("Total maior59 = " + maior59);
        System.out.println("Total de Elementos = " + totalElementos);

    }
}
