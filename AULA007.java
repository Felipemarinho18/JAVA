//usuario inserindo valores na variavel 
package aulas;

import java.util.Scanner;

public class AULA007 {
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    double  base, altura, area_retangulo;
    
    System.out.println("Calculando o valor da area\n");
    System.out.println("Informe o valor da base: ");
    base = input.nextDouble();
    System.out.println("Informe o valor da altura: ");
    altura = input.nextDouble();
    area_retangulo = base * altura;
    
    System.out.println("\nA area de retangulo de base "+base+" e altura "+altura);
    System.out.println("é igual a: "+area_retangulo);
    
    
    
    }
}
