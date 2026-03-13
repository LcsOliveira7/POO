package Exercicio7;

import java.util.Scanner;

public class ano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano%400 == 0 || (ano%4 == 0 && ano%100 != 0) ) {
            System.out.println(ano +" e ano bisexto");
        } else {
            System.out.println(ano +" e ano nao bissexto");
        }

        sc.close();
    }
}
