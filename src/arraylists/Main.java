/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists;

import exercicio_1.Exer21;
import exercicio_2.Exer22;
import java.util.Scanner;

/**
 *
 * @author Magnon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opt=0;
        
        System.out.println("Escolha o exercicio");
        System.out.println("Exercicio 1");
        System.out.println("Exercicio 2");
        System.out.print("Escolha: ");
        opt=new Scanner(System.in).nextInt();    
        switch(opt){
            
            case 1:
            new Exer21();
            break;
            
            case 2:
            new Exer22();
            break;
            
        }
        
        
        

          
    }
    
}
