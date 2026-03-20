package Exercicio2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero positivo ( se digitar negativo, o programa parara de rodar) : ");
        int n = sc.nextInt();
        int Quantidade = 0;

        while (n >= 1 ) { 
            Quantidade++;

            System.out.print("Digite um numero positivo ( se digitar negativo, o programa parara de rodar) : ");
            n = sc.nextInt();
        }

        System.out.println("Foram Digitados "+ Quantidade +" Numeros positivos");
        
        System.out.println("---- Fim do Programa ----");
    
        sc.close();
    }
}
