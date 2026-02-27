package Exercicio2;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a Temperatura em graus Celsius: ");

        double celsius = sc.nextDouble();

        double fahrenheit = ((celsius * 9)/5) + 32;
        
        System.out.println("Temperatura em graus celsius: "+ celsius);
        System.out.println("Temperatura em graus fahrenheit: "+ fahrenheit);
        sc.close();
    }
}
