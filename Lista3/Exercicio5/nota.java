package Exercicio5;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota (0 a 10): ");
        int nota = sc.nextInt();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota Invalida");
        } else if (nota >= 9 ){
            System.out.println("Conceito: A");
        } else if (nota >= 7 && nota <= 8.9){
            System.out.println("Conceito: B");
        } else if (nota >= 5 && nota <= 6.9 ){
            System.out.println("Conceito: C");
        } else if (nota >= 3 && nota <= 4.9 ){
            System.out.println("Conceito: D");
        } else if (nota < 3 ){
            System.out.println("Conceito: F");
        }

        sc.close();
    }
}
