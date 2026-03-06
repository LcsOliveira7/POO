package Exercicio3;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da nota 1: ");
        int nota1 = sc.nextInt();
        System.out.print("Digite o valor da nota 2: ");
        int nota2 = sc.nextInt();
        System.out.print("Digite o valor da nota 3: ");
        int nota3 = sc.nextInt();

        double media = (double) ((nota1 + nota2 + nota3)/ 3);

        System.out.println("Media: "+ media);

        sc.close();
    }
    
}
