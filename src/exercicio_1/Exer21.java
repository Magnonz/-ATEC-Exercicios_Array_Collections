/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;


import java.util.*;

/**
 *
 * @author Magnon
 */
public class Exer21 {
   
    
    ArrayList<String> arrayL =new ArrayList<String> ();
    
    public Exer21(){
    
    arrayL.add("b");
    arrayL.add("3");
    arrayL.add("Carruagens");
    arrayL.add("8.56");
    arrayL.add("caixas de armazenamento");
    
    
    int opt=0;
    do{
        
        System.out.println("1-Mostrar");
        System.out.println("2-Adicionar na ArrayList");
        opt=new Scanner(System.in).nextInt();
        
        switch(opt){
            
            case 1:
                showAll();
                break;
            case 2:
                addOnArray();
                break;
            case 0:
                System.out.println("Encerrando Exercicio 1");
                break;
            default:
                System.out.println("Valor Invalido");
        }
        
        
        
    }while(opt!=0);
    
    
    
    }

    public void showAll(){
        
       for(int i=0;i<arrayL.size();i++){
           
           System.out.println(arrayL.get(i));
       } 
        
    }
    
    public void addOnArray(){
        
        System.out.println("Introduza um valor");
        arrayL.add(new Scanner(System.in).nextLine());
        
        
        
    }
}
