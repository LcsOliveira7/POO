package Exercicio10;

import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Numero 1: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o Numero 2: ");
        int numero2 = sc.nextInt();

        System.out.println("Numero 1: "+ numero1);
        System.out.println("Numero 2: "+ numero2);

        int auxiliar = numero1;
        numero1 = numero2;
        numero2 = auxiliar;

        System.out.println("Numero 1 (Apos a troca): "+ numero1);
        System.out.println("Numero 2 (Apos a troca): "+ numero2);

        sc.close();
    }
}
