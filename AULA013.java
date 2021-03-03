// Operadores logicos 
package aulas;

import java.util.Scanner;


public class AULA013 {
    public static void main (String[]args){
    Scanner input = new Scanner (System.in);
    
    System.out.println("Insira um numero inteiro:");
    int numero = input.nextInt();
    
    if(numero % 2 == 0){
    System.out.println("O numero digitado é PAR.");
    
    }else if(numero % 2 != 0){
    System.out.println("O numero digitado é IMPAR.");
  }
 }
}
