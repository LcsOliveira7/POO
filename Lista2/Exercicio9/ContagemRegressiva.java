package Exercicio9;

import java.util.Scanner;
public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do contador: ");
        int contador = sc.nextInt();

        while (contador > 4) {
            System.out.println("Contador: "+ contador);
            contador--;
        }

        sc.close();
    }
}
