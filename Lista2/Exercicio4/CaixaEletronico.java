package Exercicio4;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double saque = scanner.nextDouble();
        
        if ( saque > saldo) {
            System.out.println("Erro, saldo indisponivel para saque");
        } else {
            System.out.println("Saque realizado!!");
            System.out.println("Saldo Restante: "+ (saldo-saque));
            
        }

        System.out.print("Digite o valor do deposito: ");
        double deposito = scanner.nextDouble();

        System.out.println("O valor do saldo restante no caixa apos o deposito é: "+ (deposito + (saldo - saque)));

        scanner.close();

    }
}
