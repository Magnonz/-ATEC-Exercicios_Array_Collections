/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author Magnon
 */
public class Exer22 {
    
    ArrayList<Aluno> aluno =new ArrayList<Aluno> ();
    Stack<Aluno> saluno=new Stack<Aluno>();
    
    
    public Exer22(){
        Aluno quim=new Aluno("Quim",11,"951951955");
        Aluno jaquim=new Aluno("Jaquim",12,"931951955");
        Aluno alfredo=new Aluno("Alfredo",14,"961951955");
        Aluno natacha=new Aluno("Natacha",18,"981951955");
        Aluno maria=new Aluno("Maria",10,"96751955");
                
        aluno.add(quim);
        aluno.add(jaquim);
        aluno.add(alfredo);
        aluno.add(natacha);
        aluno.add(maria);            
        
               
        orderAluno();  
        
        for(int i = 4; i >= 0; i--){
        System.out.println("Nome - " + saluno.get(i).getName());
        System.out.println("Rate - " + saluno.get(i).getRate());
        System.out.println("Contact - " + saluno.get(i).getContact());
        
	}
        
     
        
    }   
    
    public void orderAluno(){
     
        saluno.addAll(aluno);
        Collections.sort(saluno,  new Comparator<Aluno>(){
            
        public int compare (Aluno aluno1, Aluno aluno2){
                return aluno1.getRate() - aluno2.getRate();
            }
	});
        
        
 

        
    }
    
}
