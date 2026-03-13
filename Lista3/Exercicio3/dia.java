package Exercicio3;

import java.util.Scanner;

public class dia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 7 : ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Dia correspondente: Domingo");
                break;
            case 2:
                System.out.println("Dia correspondente: Segunda-Feira");
                break;
            case 3:
                System.out.println("Dia correspondente: Terca-Feira");
                break;
            case 4:
                System.out.println("Dia correspondente: Quarta-Feira");
                break;
            case 5:
                System.out.println("Dia correspondente: Quinta-Feira");
                break;
            case 6:
                System.out.println("Dia correspondente: Sexta-Feira");
                break;
            case 7:
                System.out.println("Dia correspondente: Sabado");
                break;
            default:
                System.out.println("Numero Invalido !!");
                break;
        }

        sc.close();
    }
}
