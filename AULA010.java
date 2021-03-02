//Criando im programa que calcula o IMC

package aulas;

import java.util.Scanner;


public class AULA010 {
    
    public static void main(String[]args){
     Scanner input = new Scanner (System.in);
     
     System.out.println("   IMC\n");
    
     System.out.println("Informe sua altura: ");
     double altura = input.nextDouble();
      
     System.out.println("Informe seu peso: ");
     double peso = input.nextDouble();
     
     double imc = peso /( altura * altura);
     
     System.out.print("Seu IMC é: " + imc + "\n");
     
     
     
    
    
    
    
    } 
    
}
