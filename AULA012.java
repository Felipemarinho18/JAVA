// Introdução à If e Else
package aulas;

import java.util.Scanner;


public class AULA012 {
    public static void main(String[]args){
    
      Scanner input = new Scanner (System.in);
      
      System.out.println("Qual o seu nome?");
      String nome = input.nextLine();
      
      System.out.println("Qual sua idade?");
      int idade = input.nextInt();
      
      
      if(idade<1){
      System.out.println("Idade informada não é válida.");
     
      }else if(idade < 18){
      System.out.println(nome+" menor de idade.");
      
      }else{
      System.out.println(nome+" acesso liberado");
    } 
  }
}
