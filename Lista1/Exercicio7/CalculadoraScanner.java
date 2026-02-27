package Exercicio7;

import java.util.Scanner;

public class CalculadoraScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva dois numeros inteiros abaixo : ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int soma = num1 + num2 ;
        int subtracao = num1 - num2 ;
        int divisao = num1/num2;
        int resto = num1%num2;
        int incremento = ++num1;
        int decremento = --num1;

        System.out.println("Soma: "+ soma);
        System.out.println("subtracao: "+ subtracao);
        System.out.println("divisao: "+ divisao);
        System.out.println("resto: "+ resto);
        System.out.println("incremento(num1): "+ incremento);
        System.out.println("decremento(num1): "+ decremento);

        scanner.close();
    }
}
