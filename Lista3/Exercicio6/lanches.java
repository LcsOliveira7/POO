package Exercicio6;

import java.util.Scanner;

public class lanches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");

        System.out.println("--------------------Cardapio--------------------");

        System.out.println("100 - Hamburguer");
        System.out.println("101 - Cachorro-quente");
        System.out.println("102 - Pizza");
        System.out.println("103 - Salada");
        System.out.println("104 - Refrigerante");
        System.out.print("Digite o codigo do seu pedido: ");
        int codigoPedido = sc.nextInt();

        switch (codigoPedido) {
            case 100:
                System.out.println("Voce escolheu: Hamburguer");
                break;
            case 101:
                System.out.println("Voce escolheu: Cachorro - Quente");
                break;
            case 102:
                System.out.println("Voce escolheu: Pizza");
                break;
            case 103:
                System.out.println("Voce escolheu: Salada");
                break;
            case 104:
                System.out.println("Voce escolheu: Refrigerante");
                break;
            default:
                System.out.println("Codigo do pedido invalido");
        }

        sc.close();
    }
}
