package Exercicio7;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero e direi se ele e par ou impar : ");
        int numero = sc.nextInt();

        if ( numero%2 == 0) {
            System.out.println("Seu numero e par");
        } else {
            System.out.println("Seu numero e impar");
        }


        sc.close();
    }
}
