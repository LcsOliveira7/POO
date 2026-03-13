package Exercicio1;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do usuario: ");
        int idade = sc.nextInt();

        if (idade > -1 && idade < 13) {
            System.out.println("Classificação: crianca");
        } else if ( idade > -1 && idade > 12 && idade < 18 ) {
            System.out.println("Classificação: Adolescente");
        }  else if ( idade > -1 && idade > 17 && idade < 60 ) {
            System.out.println("Classificação: Adulto");
        } else if ( idade > -1 && idade > 59 ) {
            System.out.println("Classificação: Idoso");
        } else {
            System.out.println("Digite uma idade com um valor positivo");
        }


        sc.close();
    }
}
