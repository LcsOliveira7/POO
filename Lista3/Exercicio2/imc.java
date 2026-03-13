package Exercicio2;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextFloat();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextFloat();

        double imc = (peso/ (altura*altura));   

        if ( imc < 18.6) {
            System.out.printf("Seu IMC e: %.2f - Abaixo do Peso", imc);
        } else if (imc > 18.6 && imc < 25.0) {
            System.out.printf("Seu IMC e: %.2f - Peso Normal", imc);
        } else if (imc > 25 && imc < 30.0) {
            System.out.printf("Seu IMC e: %.2f - Sobrepeso", imc);
        } else if (imc > 29.9 && imc < 35.0) {
            System.out.printf("Seu IMC e: %.2f - Obesidade grau I", imc);
        } else if (imc > 35.0 && imc < 40.0) {
            System.out.printf("Seu IMC e: %.2f - Obesidade grau II", imc);
        } else {
            System.out.printf("Seu IMC e: %.2f - Obesidade grau III", imc);
        }

        sc.close();
    }
}