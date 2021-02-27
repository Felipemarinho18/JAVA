// Variavel constante e calculando area de um circulo
package aulas;

import java.util.Scanner;


public class AULA008 {
    public static void main(String[]args){
    
    final double PI = 3.1415;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Calculando a area de um Circulo\n\n");
    System.out.println("Informe o valor do raio: ");
    double raio = input.nextDouble();
    
    double area = raio * raio * PI;
    
    
    System.out.println("O valor da area é: "+ area );
    
    
    
    }
    
}
