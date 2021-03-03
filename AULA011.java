// Introdução à Strings
package aulas;

import java.util.Scanner;

public class AULA011 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual seu primeiro nome?");
        String primeiro_nome = input.next();
        
        System.out.println("Qual seu ultimo nome?");
        String ultimo_nome = input.next();
        
        System.out.println("Qual sua idade?");
        int idade = input.nextInt();
        
        
        System.out.println("Olá "+ primeiro_nome +" "+ultimo_nome + " de "
                +idade+" anos de idade.");
    
    }
    
}
