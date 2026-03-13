package Exercicio4;

import java.util.Scanner;

public class operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite um segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.println("Escola uma Operacao abaixo: ");
        System.out.println("1 - Adicao");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Opcao: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Resultado: "+numero1+" + "+numero2+" = "+ (numero1+numero2));
                break;
            case 2:
                System.out.print("Resultado: "+numero1+" - "+numero2+" = "+ (numero1-numero2));
                break;
            case 3:
                System.out.print("Resultado: "+numero1+" * "+numero2+" = "+ (numero1*numero2));
                break;
            case 4:
                System.out.print("Resultado: "+numero1+" / "+numero2+" = "+ (numero1/numero2));
                break;
            default:
                System.out.println("Opcao Invalida");
        }
    }
}
